package Navigation;

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
	//Step two: The squares calculated at the very top of this page
	//are triangulated. The triangles (once squares) are matched up
	//with the nav mesh. If they agree, then it is an open path
	
	
	
}
