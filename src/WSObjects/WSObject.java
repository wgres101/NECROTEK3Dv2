package WSObjects;

import javax.jws.WebMethod;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import Hierarchy.PlayerCharacter.CPrimitive;
import SceneGraph.Component;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;

public class WSObject extends ServiceRoot {
	
	public WSObject(Element e) {
		
		// TODO Auto-generated constructor stub
	}
	public WSObject() { 
		
	}

	public Element xmlData;
	
	//called upon initialization of object
	public  void Init(ServiceRoot AnimatedCharacterService)
	{
		//Called Init
		
		//Register with service
		
		ServiceRoot.objectPossesions.add(this);
	}
	
	//update is called once per tick
	//to update internal variables
	//and to execute per turn actions
	//used to update state
	public  void InstanceUpdate()
	{
		//called Update
	}
	
	//called upon when object is no longer needed
	
	public  void InstanceDestroy()
	{
		//called Destroy
	}
	
	//called every turn. checks messagemanager for message
	
	public void InstanceParseMessage()
	{
		
	}
	
	
	public static void InstanceLaunch() {}
	
	
	//called on object creation
	
	public static void InstanceInit() {}
	


	public static void  InstanceRender()
	{
		
	}

	
	public static void  InstanceCollision()
	{
		
	}
	
	//when the game requires this particular state to be active
	
	public static void  InstanceOnEnter()
	{
		
	}
	
	//When the object no longer needs to be attachd to the scene graph
	
	public static void  InstanceOnExit()
	{
	}

	//for exammple, hitting the pause button
	
	public static void  InstanceOnSuspend()
	{
	}
	


	//
}
