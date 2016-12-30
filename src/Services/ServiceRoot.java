package Services;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import MessageManagement.Message;
import SceneGraph.Component;
import SceneGraph.GraphNodeInstance;
import WSObjects.WSObject;

@WebService
public class ServiceRoot extends GraphNodeInstance {

	public ServiceRoot() {
		
	}
	
	public ServiceRoot(Element e) {
		super(e);
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
	public void Render()
	{
		
	}
	
	//called every turn. checks messagemanager for message
	@WebMethod
	public void parseMessage()
	{
		
	}
	
	public void Collision()
	{
		
	}
	
	
}
