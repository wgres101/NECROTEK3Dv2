package GameMap;

import java.awt.Polygon;

import Debugger.DebugManager;
import Factory.WebServiceFactory;
import Journaling.CJournal;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;
import WSObjects.WSObject;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

public class CHexagonCoordinates extends WSObject {

	public int hexagon_id;
	
	public int upper_left_x;
	public int upper_left_y;
	public int lower_right_x;
	public int lower_right_y;
	public int midleft_x;
	public int midleft_y;
	public int midright_x;
	public int midright_y;
	public int upper_right_x;
	public int upper_right_y;
	public int lower_left_x;
	public int lower_left_y;
	public int width;
	public int height;
	
	public CHexagonCoordinates()
	{
		return;
	}
	
	public CHexagonCoordinates(int ulx, int uly, int lrx, int lry, int mlx, int mly, int mrx, int mry, int urx, int ury, int llx, int lly, int width, int height)
	{
		upper_left_x = ulx;
		upper_left_y = uly;
		lower_right_x = lrx;
		lower_right_y = lry;
		midleft_x = mlx;
		midleft_y = mly;
		midright_x = mrx;
		midright_y = mry;
		upper_right_x = urx;
		upper_right_y = ury;
		lower_left_x = llx;
		lower_left_y = llx;
		this.width = width;
		this.height = height;
		CJournal.Journal(CHexagonCoordinates.class, "Creating hexagon coordinates object");
		
	}
	
	public void PlayerMoveTo(int x, int y, int z)
	{
		//check to see if outside boundariers
		if (!IsInCurrentHexagon(x,y))
		{
			for (SceneGraphNode node: SceneGraphManager.root.children)
			{
				if (node.getClass() == CHexagonCoordinates.class)
				{
					//found a hexagon
					if (IsInCurrentHexagon(x,y))
					{
						WSFirstPersonPlayerCharacter player = WebServiceFactory.retrieveFirstPersonCharacterInstance();
						player.playerx= x;
						player.playery = y;
						player.hexagon = (CHexagonCoordinates)node;
						WebServiceFactory.StoreFirstPersonCharacterInstance(player);

					}
				}
				else
				{
					searchSceneGraphForHexagons(node, x, y);
				}
			}
		}
		
	}	
		
	CHexagonCoordinates searchSceneGraphForHexagons(SceneGraphNode node, int x, int y)
	{
		
	
		
		for (SceneGraphNode n : node.children)
		{
			if (n == null)
			{
				return null;
			}
			
			if (n.getClass() == CHexagonCoordinates.class)
			{
				if (IsInCurrentHexagon(x, y))
				{
					WSFirstPersonPlayerCharacter player = WebServiceFactory.retrieveFirstPersonCharacterInstance();
					player.playerx = x;
					player.playery = y;
					player.hexagon = (CHexagonCoordinates)n;
					WebServiceFactory.StoreFirstPersonCharacterInstance(player);
					return player.hexagon;
				}
			}
			
			
			searchSceneGraphForHexagons(n,x, y);
		
			
		}
		
		return null;
		//traverse graph
		//if outside boundaries, load new hexagon
		//if no new xml map, create one
	
			
	}
	
	public  boolean IsInCurrentHexagon(int x, int y) {
		

		int[] xpoints = { upper_left_x, upper_right_x, midright_x, lower_right_x, lower_left_x,
				midleft_x };
		int[] ypoints = { upper_left_y, upper_right_y, midright_y, lower_right_y, lower_left_y,
				midleft_y };
		Polygon polygon = new Polygon(xpoints, ypoints, 6);

		CJournal.Journal(CHotLoader.class, "Checking to see if player is still in current hexagon");
		CJournal.Journal(CHotLoader.class, "Player X Coord: " + x + " Player Y Coord: " + y);
		if (polygon.contains(x, y)) {
			//System.out.println("Is in current player hexagon");
			return true;
		}

		else {
			System.out.println("Is not in current player hexagon");
			return false;
		}
	}

	
}
