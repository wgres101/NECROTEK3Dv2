package GameMap.Navigation.SpaceFillingVolume;


//instead of using a triangular mesh uses 
//a growth-based technique that first seeds empty areas of the
//game world and then expands the objects in every direction until they
//hit an obstruction. The quads and the connetions between them
//define the navigation mesh

//uses a modified version of PASV?

public class CSpaceFillingVolume {

	/* First part is initial seeding state
	 * the world is seeded with a user defined grid at specific intervals
	 * of negative space. User should define them above the terrain and
	 * let gravity drop them down onto the terrain
	 * Move an edge outward (For each cube) and test
	 * to see if there was a collision. If not, continue growing.
	 * If there is a collision, subdivide the quad and test the new quad
	 * over again. If there is a collision, repeat several times to
	 * a certain threshold. 
	*/
}
