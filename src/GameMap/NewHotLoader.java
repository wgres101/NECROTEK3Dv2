package GameMap;

import Factory.WebServiceFactory;
import SceneGraph.SceneGraphManager;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

public class NewHotLoader {
	
	//player coordinates
	static int old_player_x;
	static int old_player_y;
	static int old_player_z;
	public static int new_player_x;
	public static int new_player_y;
	
	public static void InitHotLoader() {
		//get the player
		WSFirstPersonPlayerCharacter player = WebServiceFactory.retrieveFirstPersonCharacterInstance();
		//default coordinates
		
		
		player.playerx = 0;
		player.playery = 0;
		player.playerz = 0;
		
		WebServiceFactory.StoreFirstPersonCharacterInstance(player);
		
		//load an initial hexagon from the xml 
		CHexagonCoordinates hexagon = new CHexagonCoordinates();
		SceneGraphManager.add(hexagon, SceneGraphManager.root);
	}
	
	public static void TriggerHotLoader()
	{
		//this function triggers the hot loader
	}
	
	public static void MpveTo(int x, int y, int z) { 

		WSFirstPersonPlayerCharacter player = WebServiceFactory.retrieveFirstPersonCharacterInstance();

		old_player_x = player.playerx;
		old_player_y = player.playery;
		old_player_z = player.playerz;

		player.playerx = x;
		player.playery = y;
		player.playerz = z;

		WebServiceFactory.StoreFirstPersonCharacterInstance(player);
	}
	
	public static void HotLoader() { }
	
	public static void TraverseGraph() { }
	
	public static void hexagon_move_to( int x, int y, int z)
	{
		//traversegraph looking for hexagon boundaries
		//remove old player in hexagon
		//add new player in new hexagon
	}
	
	public static void sector_move_to() { }
	
	public static void portal_room_move_to() { }
	
	public static void octree_move_to() { }
	
	public static void dynamic_bsp_move_to() {}
	
	
}
