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
	
	
			
	
	
}
