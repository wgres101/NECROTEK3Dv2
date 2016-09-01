package GameMap;

import java.util.ArrayList;

import SceneGraph.GraphNodeInstance;

public class Octreecube {

	Octree octree; //option to further subdivide the octree cube
					//using recursion
	
	
	float origin_position_x, origin_position_y, origin_position_z;
	
	class NodeObject
	{
		GraphNodeInstance instance;
		float pos_x;
		float pos_y;
		float pos_z;
		
	}
	
	
	
	ArrayList<NodeObject> graphNodeList = new ArrayList<NodeObject>();
	
	public void register(GraphNodeInstance instance, float new_pos_x, float new_pos_y, float new_pos_z)
	{
		NodeObject nodeObject = new NodeObject();
		nodeObject.pos_x = new_pos_x;
		nodeObject.pos_y = new_pos_y;
		nodeObject.pos_z = new_pos_z;
		
		graphNodeList.add(nodeObject);
		
	}
	
	public void unregister(GraphNodeInstance instance)
	{
		graphNodeList.remove(instance);
	}
}
