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
	
	public void Update()
	{
		//called Update
		//
		//place camera (transform it) from world space to local space
	}
	
	public void Destroy()
	{
		//called Destroy
	}
}
