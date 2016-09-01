package GameMap;

import java.util.HashMap;

public class Octree {

	
	//octree data structure
	HashMap<HashMap<Octreecube, Octreecube>, Octreecube> tree = new HashMap<HashMap<Octreecube, Octreecube>, Octreecube>();
	
	float origin_x, origin_y, origin_z;
	float size_x, size_y, size_z;
	
}
