package GameMap;

import java.awt.Polygon;
import java.util.ArrayList;

import DTI.DTIClass;
import Debugger.DebugManager;
import Factory.WebServiceFactory;
import Journaling.CJournal;
import Journaling.JournalManager;
import Sampler.Main;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;

import Services.ActorServices.FirstPersonPlayerCharacterService;
import WSObjects.WSObject;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

//Run every cycle. Loads map elements that are on the fringe

//the fringe is the six hexagons surrounding the current hexagon

public class CHotLoader {
/*
	DTIClass dtiClass = new DTIClass("CHotLoader", null);

	public static CHexagonCoordinates coordsOfCurrentMap = new CHexagonCoordinates();
	public static CHexagonCoordinates current_player_hexagon = new CHexagonCoordinates();

	static int old_player_x;
	static int old_player_y;
	public static int new_player_x;
	public static int new_player_y;

	static public void moveto(int x, int y) {
		old_player_x = new_player_x;
		old_player_y = new_player_y;
		new_player_x = x;
		new_player_y = y;
	}

	static public void InitHotLoader() {
		// load starting xml file
		Main.xmlAdapter.adapt("demo.xml");
		try {
			JournalManager.JournalEntry(CHotLoader.class, "InitHotLoader", "Beginning initialization of hotloader");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		InitFirstHexagon();

		WSFirstPersonPlayerCharacter player = WebServiceFactory.retrieveFirstPersonCharacterInstance();

		// current_player_hexagon = player.hexagon;
		new_player_x = player.x;
		new_player_y = player.y;
		Main.webServiceFactory.StoreFirstPersonCharacterInstance(player);
	}

	static public void InitFirstHexagon() {
		current_player_hexagon = new CHexagonCoordinates();
		current_player_hexagon.lower_left_x = 100;
		current_player_hexagon.lower_right_x = 0;
		current_player_hexagon.lower_right_x = 200;
		current_player_hexagon.lower_right_y = 0;
		current_player_hexagon.midright_x = 300;
		current_player_hexagon.midright_y = 150;
		current_player_hexagon.upper_right_x = 200;
		current_player_hexagon.upper_right_y = 300;
		current_player_hexagon.upper_left_x = 100;
		current_player_hexagon.upper_left_y = 300;
		current_player_hexagon.midleft_x = 0;
		current_player_hexagon.midleft_y = 160;

	}

	static public void HotLoad() {

		FirstPersonPlayerCharacterService playerService = (FirstPersonPlayerCharacterService) Main.webServiceFactory
				.retrieveFirstPersonPlayerCharacterService();
		WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();

		if (playerService == null) {
			DebugManager.Debug(CHotLoader.class, "Null pointer retrieving character service");
		}

		if (player == null) {
			DebugManager.Debug(CHotLoader.class, "Null pointer retrieving character instance");
		}

		coordsOfCurrentMap = current_player_hexagon;
		current_player_hexagon = player.hexagon;

		//OutputHexagon(coordsOfCurrentMap, "Coordinates of Current Map");
		//OutputHexagon(current_player_hexagon, "Coordinates of Current Player");

		//OutputPlayerCoords();

		// check to see if current position is in hexagon

		boolean inhex = IsInCurrentHexagon(current_player_hexagon, new_player_x, new_player_y);
		if (inhex == true) {
			CJournal.Journal(CHotLoader.class, "Player is in Hexagon");
		} else {
			CJournal.Journal(CHotLoader.class, "Player is not in hexagon");
		}

		checkPlayerPosition(coordsOfCurrentMap);
		loadMap();

	}

	public static void checkPlayerPosition(CHexagonCoordinates hex) {
		// if player position is out of the current coordsOfCurrentMap we need to reload
		// the hexagons
		// so, first check player position
		// calculate if it is out of bounds
		boolean inhex = IsInCurrentHexagon(current_player_hexagon, new_player_x, new_player_y);
		if (inhex == true) {
			CJournal.Journal(CHotLoader.class, "Player is in Hexagon");
		} else {
			CJournal.Journal(CHotLoader.class, "Player is not in hexagon");

			// if so, change player coordsOfCurrentMap to new player coordinates and
			// run loadMap
		}

	}

	public static void loadMap() {
		// load each adjoining facet of the map the player is currently in,
		// as well as the map the player is in

		loadCenterMap();
		// loadNMap();
		// loadNWMap();
		// loadSWMap();
		// loadSMap();
		loadSEMap();
		// loadNEMap();

	}

	public static void loadCenterMap() {

	}

	/*** check to see if map is already generated */
	/*** if not, procedurally generate one */
/*
	public static void loadNMap() {

		Serialize(); // store current hexagon data in xml format

		// look at current coordinates
		// top left coordinates are the bottom left coordinates of the new map
		// iterate over hashmap in gamemapmanager for a match
		// if no match create a new hexagon and put it in the hashmap
		// call createHexagonProcedural
		coordsOfCurrentMap.lower_left_x = coordsOfCurrentMap.upper_left_x;
		coordsOfCurrentMap.lower_left_y = coordsOfCurrentMap.upper_left_y;

		if (GameMapManager.retrieveNMap(coordsOfCurrentMap.lower_left_x, coordsOfCurrentMap.lower_left_y) != null) {
			CProcedurallyGenerateMap.GenerateNewHexagon(current_player_hexagon);
		}

	}

	public static void loadNWMap() {
		Serialize(); // store current hexagon data in xml format

		// look at current coordinates
		// the leftmost coordinates are the bottom right coordinates of the new map
		// iterate over hashmap in gamemapmanager for a match
		// if no match create a new hexagon and put it in the hashmap
		// call createHexagonProcedural
		coordsOfCurrentMap.lower_right_x = coordsOfCurrentMap.midleft_x;
		coordsOfCurrentMap.lower_right_y = coordsOfCurrentMap.midleft_y;

		if (GameMapManager.retrieveNWMap(coordsOfCurrentMap.lower_right_x, coordsOfCurrentMap.lower_right_y) != null) {
			CProcedurallyGenerateMap.GenerateNewHexagon(current_player_hexagon);
		}

	}

	public static void loadSWMap() {
		Serialize(); // store current hexagon data in xml format

		// look at current coordinates
		// the leftmoste coorduinates are the upper right coordinates of the new map
		// iterate over hashmap in gamemapmanager for a match
		// if no match create a new hexagon and put it in the hashmap
		// call createHexagonProcedural
		coordsOfCurrentMap.upper_right_x = coordsOfCurrentMap.midleft_x;
		coordsOfCurrentMap.upper_right_y = coordsOfCurrentMap.midleft_y;
		if (GameMapManager.retrieveSWMap(coordsOfCurrentMap.upper_right_x, coordsOfCurrentMap.upper_right_y) != null) {
			CProcedurallyGenerateMap.GenerateNewHexagon(current_player_hexagon);
		}

	}

	public static void loadSMap() {
		Serialize(); // store current hexagon data in xml format

		// look at coordinates
		// the bottom left coordinates are the middle rightmost of the new map
		// iterate over hashmap in gamemapmanager for a match
		// if no match create a new hexagon and put it in the hashmap
		// call createHexagonProcedural
		coordsOfCurrentMap.upper_left_x = coordsOfCurrentMap.lower_left_x;
		coordsOfCurrentMap.upper_left_y = coordsOfCurrentMap.lower_left_y;
		if (GameMapManager.retrieveSMap(coordsOfCurrentMap.upper_left_x, coordsOfCurrentMap.upper_left_y) != null) {
			CProcedurallyGenerateMap.GenerateNewHexagon(current_player_hexagon);
		}

	}

	public static void loadSEMap() {
		Serialize(); // store current hexagon data in xml format

		// look at coordinates
		// the bottom right coordinates are the upper left coordinates of the new map
		// iterate over hashmap in gamemapmanager for a match
		// if no match create a new hexagon and put it in the hashmap
		// call createHexagonProcedural
		coordsOfCurrentMap.upper_left_x = coordsOfCurrentMap.midleft_x;
		coordsOfCurrentMap.upper_left_y = coordsOfCurrentMap.midleft_y;

		if (GameMapManager.retrieveSEMap(coordsOfCurrentMap.midleft_x, coordsOfCurrentMap.midleft_y) != null) {
			CProcedurallyGenerateMap.GenerateNewHexagon(current_player_hexagon);
		}

	}

	public static void loadNEMap() {
		Serialize(); // store current hexagon data in xml format

		// look at coordinates
		// upper right coordinates are the middle left most coordinates of the new map
		// iterate over hashmap in gamemapmanager for a match
		// if no match create a new hexagon and put it in the hashmap
		// call createHexagonProcedural
		coordsOfCurrentMap.midleft_x = coordsOfCurrentMap.upper_right_x;
		coordsOfCurrentMap.midleft_y = coordsOfCurrentMap.upper_right_y;

		if (GameMapManager.retrieveNEMap(coordsOfCurrentMap.midleft_x, coordsOfCurrentMap.midleft_y) != null) {
			CProcedurallyGenerateMap.GenerateNewHexagon(current_player_hexagon);
		}

	}

	public static void Serialize() {
		Main.xmlAdapter.Serialize();
	}

	public static void OutputHexagon(CHexagonCoordinates hex, String msg) {
		CJournal.Journal(CHotLoader.class, msg);
		CJournal.Journal(CHotLoader.class, "Upper_Left_X" + hex.upper_left_x);
		CJournal.Journal(CHotLoader.class, "Upper Left Y" + hex.upper_left_y);
		CJournal.Journal(CHotLoader.class, "Lower Right X" + hex.lower_right_x);
		CJournal.Journal(CHotLoader.class, "Lower Right Y" + hex.lower_right_y);
		CJournal.Journal(CHotLoader.class, "Mid Left X" + hex.midleft_x);
		CJournal.Journal(CHotLoader.class, "Mid Left Y" + hex.midleft_y);
		CJournal.Journal(CHotLoader.class, "Mid Right X" + hex.midright_x);
		CJournal.Journal(CHotLoader.class, "Mid Right Y" + hex.midright_y);
		CJournal.Journal(CHotLoader.class, "Upper Right X" + hex.upper_right_x);
		CJournal.Journal(CHotLoader.class, "Upper Right Y" + hex.upper_right_y);
		CJournal.Journal(CHotLoader.class, "Lower Left X" + hex.lower_left_x);
		CJournal.Journal(CHotLoader.class, "Lower Left Y" + hex.lower_left_y);

		CJournal.Journal(CHotLoader.class, "Width" + hex.width);
		CJournal.Journal(CHotLoader.class, "Height" + hex.height);
	}

	public static void OutputPlayerCoords() {
		CJournal.Journal(CHotLoader.class, "New/hotCurrent Player X Coordinates X " + new_player_x);
		CJournal.Journal(CHotLoader.class, "New/Current Player Y Coordinates Y " + new_player_y);
		CJournal.Journal(CHotLoader.class, "Old Player X Coordinates X " + old_player_x);
		CJournal.Journal(CHotLoader.class, "Old Player Y Coordinates Y " + old_player_y);

	}

	public static void FactoryPlayerCoords() {
		WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();

		CJournal.Journal(CHotLoader.class, "Factory Player X Coordinates: " + player.x);
		CJournal.Journal(CHotLoader.class, "Factory Player Y Coordinates: " + player.y);
	}

	public static boolean IsInCurrentHexagon(CHexagonCoordinates hex, int x, int y) {
		if (hex == null) {
			DebugManager.Debug(CHotLoader.class, "IsInCurrentHexagon() hexagon is null");
		}

		int[] xpoints = { hex.upper_left_x, hex.upper_right_x, hex.midright_x, hex.lower_right_x, hex.lower_left_x,
				hex.midleft_x };
		int[] ypoints = { hex.upper_left_y, hex.upper_right_y, hex.midright_y, hex.lower_right_y, hex.lower_left_y,
				hex.midleft_y };
		Polygon polygon = new Polygon(xpoints, ypoints, 6);

		CJournal.Journal(CHotLoader.class, "Checking to see if player is in current hexagon");
		CJournal.Journal(CHotLoader.class, "Player X Coord: " + x + " Player Y Coord: " + y);
		if (polygon.contains(x, y)) {
			//System.out.println("Is in current player hexagon");
			return true;
		}

		else {
			//System.out.println("Is not in current player hexagon");
			return false;
		}
	}
*/
}
