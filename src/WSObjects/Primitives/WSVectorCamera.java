package WSObjects.Primitives;

import Services.ServiceRoot;
import UtilityTypes.Vec3D;
import WSObjects.WSObject;

import org.jdom2.Element;

import Blackboard.GameBlackboard;

//GEMS ONE

public class WSVectorCamera extends WSObject {

	
	public WSVectorCamera(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	Vec3D U;
	Vec3D V;
	Vec3D N;
	
	Float screen_height = 1080f;
	Float screen_width = 720f;
	
	
	float AspectRatio = screen_height/screen_width;
	float FOV = (float)Math.PI/2;
	float hFrac = (float)Math.tan(FOV*0.5);
	float vFrac = (float)Math.tan(FOV*0.5*AspectRatio);
	
	public void Init(ServiceRoot AnimatedCharacterService)
	{
		//Called Init
		GameBlackboard.registerVariable("screen_height", screen_height);
		GameBlackboard.registerVariable("screen_width", screen_width);
		
	}
	//update is called once per tick
			//to update internal variables
			//and to execute per turn actions
			//used to update state
	public void InstanceUpdate()
	{
		//called Update
		//
		//place camera (transform it) from world space to local space
	}
	
	
		
		//called upon when object is no longer needed
		
		public void InstanceDestroy()
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

	

