package IDE;

import java.util.ArrayList;

import SceneGraph.GraphNodeInstance;

public class Inspector {

	//a list of inspectorse for all the objects of the scenegraph
	
	ArrayList<InspectorObject> inspectorObject = new ArrayList<InspectorObject>();
	
	public void Update()
	{
		
	}
	
	public void Alive(GraphNodeInstance n)
	{
		//check to see if node is in inspector
		//if it is, update/
		//if it isn't, add it
	}
}
