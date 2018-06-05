package GameMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import Journaling.CJournal;

//this class handles the octree, portals, and hexagonal
//components of the game map, as well as registering and
//unregistering objects in the game with these components


/*
 * NECROTEK Map Format

NECROTEK’s map format is based off of the Verge 2 File Format. 

1.	The main theory behind the Verge Map is that the world in its entirety is divided into regions, which are broken up into smaller regions. Also, instead of having load time between regions in the world, the maps are loaded on the fly, as you approach one direction, the region you are headed towards’ region map startse to load.

2.	Each region is the extant of a viewport. That is, if you stand on one end of the region the other end of the region is barely visible.  The way NECROTEK handles Verge Format allows for a huge world that is seamless and realistic. Each region, for efficiency purposes, is in the shape of a hexagon.

3.	After the region’s with their FOV are loaded, the sectors are loaded. Sectors are subdivisions of the regions, with portals connecting the sectors together. This is primarily for indoor levels, although the format maintains the sector states for open terrain. 

4.	The Sector is broken down into Sector Objects. The Level of Detail is calculated with each Sector Object (via a hierarchical vertex tree) and the object is simplified as necessary.The resulting triangles deemed visible will then be flagged in the bsp tree. The bsp tree they are present in will also be flagged.

5.	BSP Tree Processing occurs as the third step. Availabe leaves are determined using FOV calcualtions. Triangles deemed unusable  by step #2  (object simplification) within these leaves will be sent to the Sorting Buffer.

6.	The Sorting Buffer uses a ray tracing system to break down triangles into triangles which do not overlap. They are then sent to the Painter’s Algorthm then to Final Rendering Buffer. This completes the algorithm.


Map Features
NECROTEK MAP FORMAT


Non-linear changeable level format.
Some buildings include run-down barns and mansions. Variety of houses.
Able to pick up or use just about any object like Ultima
Lots of details in levels. Cobwebs (that react like physics), Cracks and vines and slilme on walls. Shadowy corners, dew collected on the walls and on the grass in the morning. 


NECROTEK Terrain Engine

Height Map Terrain Generation
Fractal Terrain Generation
MegaTesxture is used to generate the terrain floor. According to the terrain countour map image, a megatexture is used to create sandy beaches, rocky ground, foothills, and mountains  and peaks). The same method was used for Populous.(the newer one).


Appropriate characters can be set to spawn depending on location. For example, a desert town might spawn camels, sand, and tents.

A high lands town might have stone walls with cracks and vines and or broken down walls and mists.



 */


public class GameMapManager {

	
	//traverse graph
	//check each hexdagon for "IsInMap"
	//each hexagon has an id, used below to load t he hexagon from the map
	
	
	
	
	
	
	
	
	
	
	
	
	
	//for the hotloader
	
	//indices represent maps to be loaded
	//static HashMap<Integer, CHexagonCoordinates> mapIndex = new HashMap<Integer, CHexagonCoordinates>();
	
	
	//indices represent maps to be loaded
	static String [] filenames = new String[] { "demo.xml", "demo2.xml" };
	
	//Hexagon->Sector->Portal Room->Octree->Portal=>DynamicBSP
	
		
	
	
	
	/*
	
	//this retrieves a map from the map index 
	public static CHexagonCoordinates retrieveNMap(int top_left_x, int top_left_y)
	{
		//parameters are coordinates of current map
		//map values are coordinate stored in the map
		
		//iterating over all the maps is iterating over all the hexagons
		//retrieving north map from this hexagon
		
		
		for (Entry<Integer, CHexagonCoordinates> entry : mapIndex.entrySet()) {
		    Integer key = entry.getKey();
		    CHexagonCoordinates value = entry.getValue();
		    
		    int bottom_left_x = value.lower_left_x;
		    int bottom_left_y = value.lower_left_y;
		    
		    //is map coordinates north of current coordinates
		    if (bottom_left_x > top_left_x && bottom_left_y > top_left_y)
		    {
		    	//return new hexagon
		    	CHexagonCoordinates hex = value;
		    	hex.lower_left_x = bottom_left_x;
		    	hex.lower_left_y = bottom_left_y;
		    	
		    	return hex;
		    }  
		    
		}
		
		
		
		return null;

	}
	
	
	//this retrieves a map from the map index 
	public static CHexagonCoordinates retrieveNWMap(int upper_left_x, int upper_left_y)
	{
		//parameters are coordinates of current map
		//map values are coordinate stored in the map
		
		//iterating over all the maps is iterating over all the hexagons
		//retrieving north map from this hexagon
		
		
		for (Entry<Integer, CHexagonCoordinates> entry : mapIndex.entrySet()) {
		    Integer key = entry.getKey();
		    CHexagonCoordinates value = entry.getValue();
		    
		    int bottom_right_x = value.lower_right_x;
		    int bottom_right_y = value.lower_right_y;
		    
		    //is map coordinates north west of current coordinates
		    if (bottom_right_x <= upper_left_x  &&  bottom_right_y >= upper_left_y)
		    {
		    	//return new hexagon
		    	CHexagonCoordinates hex = value;
		    	hex.lower_left_x = bottom_right_x;
		    	hex.lower_left_y = bottom_right_y;
		    	
		    	return hex;
		    }  
		    
		}
		
		
		
		return null;

	}
	
	//this retrieves a map from the map index 
		public static CHexagonCoordinates retrieveSWMap(int upper_right_x, int upper_right_y)
		{
			//parameters are coordinates of current map
			//map values are coordinate stored in the map
			
			//iterating over all the maps is iterating over all the hexagons
			//retrieving north map from this hexagon
			
			
			for (Entry<Integer, CHexagonCoordinates> entry : mapIndex.entrySet()) {
			    Integer key = entry.getKey();
			    CHexagonCoordinates value = entry.getValue();
			    
			    int top_right_x = value.upper_right_x;
			    int top_right_y = value.upper_right_y;
			    
			    //is map coordinates north west of current coordinates
			    if (top_right_x <= upper_right_x  &&  top_right_y <= upper_right_y)
			    {
			    	//return new hexagon
			    	CHexagonCoordinates hex = value;
			    	hex.upper_right_x = top_right_x;
			    	hex.upper_right_y = top_right_y;
			    	
			    	return hex;
			    }  
			    
			}
			
			
			
			return null;

		}
		
		

		//this retrieves a map from the map index 
			public static CHexagonCoordinates retrieveSMap(int upper_left_x, int upper_left_y)
			{
				//parameters are coordinates of current map
				//map values are coordinate stored in the map
				
				//iterating over all the maps is iterating over all the hexagons
				//retrieving north map from this hexagon
				
				
				for (Entry<Integer, CHexagonCoordinates> entry : mapIndex.entrySet()) {
				    Integer key = entry.getKey();
				    CHexagonCoordinates value = entry.getValue();
				    
				    int top_left_x = value.upper_left_x;
				    int top_left_y = value.upper_left_y;
				    
				    int top_right_x = value.upper_right_x;
				    int top_right_y = value.upper_right_x;
				    
				    
				    //is map coordinates north west of current coordinates
				    if (top_right_x <= upper_left_x &&  top_right_y <= upper_left_y)
				    {
				    	//return new hexagon
				    	CHexagonCoordinates hex = value;
				    	hex.upper_right_x = top_right_x;
				    	hex.upper_right_y = top_right_y;
				    	
				    	return hex;
				    }  
				    
				}
				
				
				
				return null;

			}
			
				
			public static CHexagonCoordinates retrieveSEMap(int midleftx, int  midlefty)
			{
				//parameters are coordinates of current map
				//map values are coordinate stored in the map
				
				//iterating over all the maps is iterating over all the hexagons
				//retrieving north map from this hexagon
				
				
				for (Entry<Integer, CHexagonCoordinates> entry : mapIndex.entrySet()) {
				    Integer key = entry.getKey();
				    CHexagonCoordinates value = entry.getValue();
				    
				    int midleft_x = value.midleft_x;
				    int midleft_y = value.midleft_y;
				    
				    int midright_x = value.midright_x;
				    int midright_y = value.midright_y;
				    
				    //is map coordinates north west of current coordinates/
				    //OVEFLOW
				    if (midleftx >= midleft_x && midlefty <= midleft_x)
				    	
				    {
				    	//return new hexagon
				    	CHexagonCoordinates hex = value;
				    	hex.midleft_x = midleft_x;
				    	hex.midleft_y = midleft_y;
				    	
				    	return hex;
				    }  
				    
				}
				
				
				
				return null;

			}
			
			public static CHexagonCoordinates retrieveNEMap(int midleftx, int midlefty)
			{
				//parameters are coordinates of current map
				//map values are coordinate stored in the map
				
				//iterating over all the maps is iterating over all the hexagons
				//retrieving north map from this hexagon
				
				
				for (Entry<Integer, CHexagonCoordinates> entry : mapIndex.entrySet()) {
				    Integer key = entry.getKey();
				    CHexagonCoordinates value = entry.getValue();
				    
				    int mid_left_x = value.midleft_x;
				    int mid_left_y = value.midleft_y;
				    
				    int mid_right_x = value.midright_x;
				    int mid_right_y = value.midright_y;
				    
				    //is map coordinates north west of current coordinates/
				    //OVEFLOW
				    if (midleftx >= mid_left_x)
				    	
				    {
				    	//return new hexagon
				    	CHexagonCoordinates hex = value;
				    	hex.midleft_x = mid_left_x;
				    	hex.midleft_y = mid_left_y;
				    	
				    	return hex;
				    }  
				    
				}
				
				
				
				return null;

			}
					
		
		*/
		
	
	
}
