package GameMap;

import Factory.WebServiceFactory;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;
import WSObjects.WSObject;

//Run every cycle. Loads map elements that are on the fringe



public class CHotLoader {

	
	public void HotLoad(String object, SceneGraphNode parent)
	{
		
		//load object
		ServiceRoot service = WebServiceFactory.launchWebService(object);
		WSObject instance = WebServiceFactory.launchWebServiceInstance(object);
		
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		
	}
	
}
