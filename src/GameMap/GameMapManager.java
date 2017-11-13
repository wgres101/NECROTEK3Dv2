package GameMap;

import java.util.HashMap;

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

	
	//for the hotloader
	
	//indices represent maps to be loaded
	static HashMap<Integer, CHexagonCoordinates> mapIndex = new HashMap<Integer, CHexagonCoordinates>();
	
	
	//indices represent maps to be loaded
	static String [] filenames = new String[] { "demo.xml", "demo2.xml" };
	
	public static void LoadIndices()
	{
		
		CJournal.Journal(GameMapManager.class, "Loading map indices into hashmap for hotloader");
		
		
		mapIndex.put(0, new CHexagonCoordinates(100, 200, 200, 0, 0, 100, 300, 100, 200, 200, 100, 0, 300, 200 ));
		
		return;
	}
		
		
		
		
		
		
	
	
}
