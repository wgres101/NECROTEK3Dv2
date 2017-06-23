package Services;

import javax.jws.WebMethod;

import Factory.WebServiceFactory;
import SceneGraph.GraphNodeInstance;
import WSObjects.WSObject;

public class CTrigger extends ServiceRoot implements GraphNodeInstance {

	//if condition is met execute response
	
	//if passed in function is true (condition) then execute a response function
	
	public void trigger(CTriggerConditionEnum condition)
	{
		switch(condition)
		{
			
		}
	}
	
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

	
	
}
