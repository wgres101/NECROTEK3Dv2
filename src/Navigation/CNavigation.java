package Navigation;

//Book 5 Section 3.1

public class CNavigation {

	//uses an octree

	//subdivide the map into four cubes
	//iterate over each cube
		//for each cube look for a portal where a portal is an opening from one cube 
		//one cube to another
		//if a portal exists: mark the cube as adjoined and subdivide the cube again
			//for each of the new cubes look for a portal
				//if a portal exists, subdivide that cube and mark that cube as adjoined
				//continue on recursively until iterating over all cubes
				//produce a cube. Mark the cube as having a portal 
				//back out and process next cube
	
	
	
	//take start vertex
	//do search
	//iterate through possible adjacent cubes
	//continue (searching) iterating through possibnle adjacent cubes
	//when you find a complete path, mark down the cost of the path
	//continue searching until all routes are exhausted
	//use path of least cost
	
	
	//use A* in this manner
	//when performing searching through vertices add an AIMING and RISK component
	//based off of the location of the enemy. f(x) = g(x) + h(x) + r(x)
	//where r(x) is the risk component (or aiming component)
	
	//so search is instead of iterating over nodes we iterate over
	//cubes in the octree.
	
	//navmesh:create 1 layer thick surface that covers the terrain.
	//We use this in this navigation algorithm as follows:
	//First off, the artist has to draw the nav mesh onto the terrain
	//and possibly flag it for who it is being used for.
	//
	//bit field per triangle: WALKABLE, STANDING COVER, CROUCHING_COVER, NON_WALKABLE 
	
	//Step two: The squares calculated at the very top of this page
	//are triangulated. The triangles (once squares) are matched up
	//with the nav mesh. If they agree, then it is an open path
	
	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	///TESZTING FOR COVER
	//Test for a straight line path from center of triangle to center of destination triangle
	//IF  the triangle does not have a straight path to the target point, find t he edge that is between the
	//center of this triangle and the target. If that l ink was flagged in our preprocessing step
	//as crouching or standing cover, this triangle can be considered to be in cover from the target
	//If we know the exact element that meets  our goal, its a closed goal search
	//We want a open goal search where simply looking for an element that meets the given conditions
	//without knowing exactly what the element is
	
	//We need to parameterise our search on two categories to achieve this (open goal)
	//The heuristic: A test that A-star algorithm uses to weight  each node
	//The goal test: Defines if a given node meets the goal parameters for the search
	
	//**Searching for a cover position
	//The two main parametesr are the agents positiion (the start of the search)
	//adn the targets position (the point we are to ensure cover)
	
	//In addition, a given direction and acceptable angle within that direction allow us to weight nodes
	//in the direction the NPC is already intending to move. A maximum distance allows us to limit the search to reasonable cover positions
	//since the NPC would only consider the area nearby in the middle of heated combat.
	
	//if a node qualifies as cover, we've found an acceptabl e4nd to our search.
	//
	//there are two additional rules to its method of weighting cells:
	//cells that lie beyond the target point, are weighted much higher
	//This helps to prevent the undesirable behavior of NPCs running past the player
	//to get cover.
	
	//Cells that lie in our given direction, within the given angle, are weighted as a third
	///of their normal value. This ensures the search will move in the direction the NPC desires to move
	//Once our search is over and we've found our cover point, we're close but not quite finished
	////Since our cover test uses the center of each triangle, we need to calculate the most desirable position on the 
	//triangle to cover.
	
	//If we know the path-requesting agent's width, we can simply take the edge of the triangle that is providing us cover and offset the cover point
	//from the vertex of the edge that is closest to the target point
	//
	//Now we have point offset from that wall by the agent's width and we know the direction the agent needs
	//to move along the wall to pop out of cover. Based on  the flag of the cover edge  (standing or crouching)
	//we can adjust the cover point to be at the correct height, telling an agent if it needs to croutch to stay in cover here
	//
	//Now that we can find cover points, we can also generate paths between two points that attempt to stay in cover
	//We do a normal search from one point to another, but if we come across a node that is acceptable cover
	//we weight it much lower (so the search will consdier it over other, closer nodes)
	
	//
	
}
