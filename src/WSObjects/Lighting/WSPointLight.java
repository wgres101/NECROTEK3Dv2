package WSObjects.Lighting;

import Services.ServiceRoot;
import Tweaker.Tweakable;
import UtilityTypes.Float3;
import UtilityTypes.Mat4;

public class WSPointLight {
	
	float startx;
	float starty;
	float startz;
	
	float curr_x;
	float curr_y;
	float curr_z;
	
	//parameters
	
	Mat4	WVPMatrix;
	Mat4 	WMatrix;
	Float3	CameraModelPosition;
	Float3	MaterialEmissive;
	Float3	MaterialAmbient;
	Float3	MaterialDiffuse;
	Float3	MaterialSpecular;
	Float3	Light0ModelPosition;
	Float3	Light0Ambient;
	Float3	Light0Diffuse;
	Float3	Light0Specular;
	Float3	Light0Attenuation;
	
	///add 
	
	
	public void Init(ServiceRoot AnimatedCharacterService)
	{
		//Called Init
		Tweakable tweak = new Tweakable();
		tweak.Tweak("WVPMatrix", Mat4.class, WVPMatrix);
		tweak.Tweak("WMatrix", Mat4.class, WMatrix);
		tweak.Tweak("CameraModelPosition", Float3.class, CameraModelPosition);
		tweak.Tweak("MaterialEmissive",Float3.class,MaterialEmissive);
		tweak.Tweak("MaterialAmbient", Float3.class,MaterialAmbient);
		tweak.Tweak("MaterialDiffuse", Float3.class,MaterialDiffuse);
		tweak.Tweak("MaterialSpecular", Float3.class,MaterialSpecular);
		tweak.Tweak("Light0ModelPosition", Float3.class,Light0ModelPosition);
		tweak.Tweak("Light0Ambient",Float3.class, Light0Ambient);
		tweak.Tweak("Light0Diffuse", Float3.class,Light0Diffuse);
		tweak.Tweak("Light0Specular",Float3.class,Light0Specular);
		tweak.Tweak("Light0Attenuation",Float3.class, Light0Attenuation);

;

		
	}
	
	public void Update()
	{
	
	}
	
	public void Destroy()
	{
		//called Destroy
	}
}
