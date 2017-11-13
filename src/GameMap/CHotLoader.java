package GameMap;

import java.awt.Polygon;

import Debugger.DebugManager;
import Factory.WebServiceFactory;
import Journaling.CJournal;
import Sampler.Main;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;
import Services.ActorServices.CreateFirstPersonPlayerCharacterService;
import WSObjects.WSObject;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

//Run every cycle. Loads map elements that are on the fringe

//the fringe is the six hexagons surrounding the current hexagon

public class CHotLoader {

	
	static CHexagonCoordinates coordsOfCurrentMap = new CHexagonCoordinates();	
	static CHexagonCoordinates current_player_hexagon = new CHexagonCoordinates();
	static int player_x, player_y;
	static int player_new_x, player_new_y;
	
	static public void HotLoad()
	{
		
		//load xml file
		Main.xmlAdapter.adapt("demo.xml");	
		
		CreateFirstPersonPlayerCharacterService playerService = Main.webServiceFactory.retrieveFirstPersonCharacterService();
		WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();
		
		if (playerService == null)
		{
			DebugManager.Debug(CHotLoader.class, "Null pointer retrieving character service");
		}
		
		if (player == null)
		{
			DebugManager.Debug(CHotLoader.class, "Null pointer retrieving character instance");
		}
		
		coordsOfCurrentMap = current_player_hexagon;
		current_player_hexagon = player.hexagon;
		
		
		player_x = player_new_x;
		player_y = player_new_y;
		
		player_new_x = player.x;
		player_new_y = player.y;
		
		
		OutputHexagon(current_player_hexagon);
		OutputPlayerCoords();
		
		
		//check to see if current position is in hexagon
		
		boolean inhex = IsInCurrentHexagon(coordsOfCurrentMap, player_new_x, player_new_y);
		if (inhex == true)
		{
			CJournal.Journal(CHotLoader.class, "Player is in Hexagon");
		}
		else
		{
			CJournal.Journal(CHotLoader.class,  "Player is not in hexagon");
		}
		
		
		
	}
	
	public static void checkPlayerPosition(CHexagonCoordinates hex)
	{
		//if player position is out of the current coordsOfCurrentMap we need to reload the hexagons
		//so, first check player position
		//calculate if it is out of bounds
		//if so, change player coordsOfCurrentMap to new player coordinates and
		//run loadMap
		
		
	}
	
	public static void loadNMap()
	{
		//look at current coordinates
		//top left coordinates are the bottom left coordinates of the new map
		
		
	}
	
	public static void loadNWMap()
	{
		//look at current coordinates
		//the leftmost coordinates are the bottom right coordinates of the new map
		
	}
	
	public static void loadSWMap()
	{
		//look at current coordinates
		//the leftmoste coorduinates are the upper right coordinates of the new map
	}
	
	public static void loadSMap()
	{
		//look at coordinates
		//the bottom left coordinates are the middle rightmost of the new map
	}
	
	public static void loadSEMap()
	{
		//look at coordinates
		//the bottom right coordinates are the upper left coordinates of the new map
	}
	
	
	public static void loadNEMap()	
	{
		//look at coordinates
		//upper right coordinates are the middle left most coordinates of the new map
		
	}
	
	public static void OutputHexagon(CHexagonCoordinates hex)
	{
		CJournal.Journal(CHotLoader.class, "Current Hexagon");
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
	
	public static void OutputPlayerCoords()
	{
		CJournal.Journal(CHotLoader.class, "Current Player X Coordinates X " + player_new_x);
		CJournal.Journal(CHotLoader.class, "Current Player Y Coordinates Y " + player_new_y);
		CJournal.Journal(CHotLoader.class, "Old Player X Coordinates X " + player_x);
		CJournal.Journal(CHotLoader.class, "Old Player Y Coordinates Y " + player_y); 
	}


	public static boolean IsInCurrentHexagon(CHexagonCoordinates hex, int x, int y)
	{
		if (hex == null)
		{
			DebugManager.Debug(CHotLoader.class, "IsInCurrentHexagon() hexagon is null");
		}
		int [] xpoints = { hex.upper_left_x, hex.lower_right_x, hex.midleft_x, hex.midright_x, hex.upper_right_x, hex.lower_left_x };
		int [] ypoints = { hex.upper_left_y, hex.lower_right_y, hex.midleft_y, hex.midright_y, hex.upper_right_y, hex.lower_left_y };
		Polygon polygon = new Polygon(xpoints, ypoints, 6);
		
		CJournal.Journal(CHotLoader.class, "Checking to see if player is in current hexagon");
		
		if (polygon.contains(x, y))
		{
			return true;
		}
		
		else
			return false;
	}


}


