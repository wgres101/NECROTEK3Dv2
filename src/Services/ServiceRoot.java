package Services;

import java.util.ArrayList;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import SceneGraph.Component;
import SceneGraph.GraphNodeInstance;
import WSObjects.WSObject;

public class ServiceRoot extends GraphNodeInstance {

	public ServiceRoot(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}


	public static ArrayList<WSObject> objectPossesions = new ArrayList<WSObject>();
	
	
	//called by the engine to create an instance
	//of the object WSObject that is associated with this service
	public static void Launch() {}
	
	
	//called on object creation
	public static void Init() {}
	
	//called once per turn to update state
	public static void Update() {}
	
	//called when object is no longer needed
	public static void Destroy() {}
	
	public static WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("VectorCameraInstance");
		
		
		return ws_object;
	}
	

	//called every turn. checks messagemanager for message
	public void parseMessage()
	{
		
	}
	
	
}
