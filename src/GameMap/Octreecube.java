package GameMap;

import java.util.ArrayList;

import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphNode;


/*  "Octree Cells" can be used along with cellular automata as described under cellularautomataphysicalmodeling
 * 	
 */

public class Octreecube extends SceneGraphNode {

	Octree octree; //option to further subdivide the octree cube
					//using recursion
	
	
	float origin_position_x, origin_position_y, origin_position_z;
	float size_x, size_y, size_z;
	
	class NodeObject
	{
		SceneGraphNode instance;
		float pos_x;
		float pos_y;
		float pos_z;
		
	}
	
	
	
	ArrayList<NodeObject> graphNodeList = new ArrayList<NodeObject>();
	
	public void register(SceneGraphNode instance, float new_pos_x, float new_pos_y, float new_pos_z)
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
