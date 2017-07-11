package WSObjects;

import javax.jws.WebMethod;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import Hierarchy.PlayerCharacter.CPrimitive;
import SceneGraph.Component;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;

public class WSObject extends CPrimitive {
	
	public WSObject(Element e) {
		
		// TODO Auto-generated constructor stub
	}
	

	//called upon initialization of object
	public void Init(ServiceRoot AnimatedCharacterService)
	{
		//Called Init
		
		//Register with service
		
		ServiceRoot.objectPossesions.add(this);
	}
	
	//update is called once per tick
	//to update internal variables
	//and to execute per turn actions
	//used to update state
	public void Update()
	{
		//called Update
	}
	
	//called upon when object is no longer needed
	
	public void Destroy()
	{
		//called Destroy
	}
	
	//called every turn. checks messagemanager for message
	
	public void ParseMessage()
	{
		
	}
	
	
	public static void Launch() {}
	
	
	//called on object creation
	
	public static void Init() {}
	


	public static void  Render()
	{
		
	}

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
