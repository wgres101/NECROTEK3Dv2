package GameMap;

import java.util.HashMap;

//octrees are used for rendering as well as collision detection

public class Octree {

	
	//octree data structure
	HashMap<HashMap<Octreecube, Octreecube>, Octreecube> tree = new HashMap<HashMap<Octreecube, Octreecube>, Octreecube>();
	
	float origin_x, origin_y, origin_z;
	float size_x, size_y, size_z;
	
	public void add(Octreecube a, Octreecube b, Octreecube c)
	{
		HashMap<Octreecube, Octreecube> map = new HashMap<Octreecube, Octreecube>();
		map.put(a,b);
		tree.put(map, c);
	}
	
}
