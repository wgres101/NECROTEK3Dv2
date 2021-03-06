package Services;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jdom2.Element;

import DTI.DTIClass;
import Factory.WebServiceFactory;
import MessageManagement.Message;
import SceneGraph.Component;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphNode;
import WSObjects.WSObject;

@WebService
public class ServiceRoot extends SceneGraphNode {

	
	//required///
	
	DTIClass dtiClass = new DTIClass();
	
	public ServiceRoot() {
		
	}
	
	public ServiceRoot(Element e) {
		
		// TODO Auto-generated constructor stub
	}


	public static ArrayList<WSObject> objectPossesions = new ArrayList<WSObject>();
	
	
	//called by the engine to create an instance
	//of the object WSObject that is associated with this service
	@WebMethod
	public static void Launch() {}
	
	
	//called on object creation
	@WebMethod
	public static void Init() {}
	
	//called once per turn to update state
	@WebMethod
	public static void Update() {}
	
	//called when object is no longer needed
	@WebMethod
	public static void Destroy() {}
	
	@WebMethod
	public static WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("BoxService");
		
		
		return ws_object;
	}
	

	@WebMethod
	public static void  Render()
	{
		
	}
	
	//called every turn. checks messagemanager for message
	@WebMethod
	public static void parseMessage()
	{
		
	}
	
	public static void  Collision()
	{
		
	}
	
	//when the game requires this particular state to be active
	
	public static void  OnEnter()
	{
		
	}
	
	//When the object no longer needs to be attachd to the scene graph
	
	public static void  OnExit()
	{
	}

	//for exammple, hitting the pause button
	
	public static void  OnSuspend()
	{
	}
	


	//
	
}
