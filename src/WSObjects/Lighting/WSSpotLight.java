package WSObjects.Lighting;

import Services.ServiceRoot;
import Tweaker.Tweakable;
import UtilityTypes.Float3;
import UtilityTypes.Mat4;

public class WSSpotLight {
	
	
	 Mat4 WVPMatrix;
	 Mat4 WMatrix;
	 Float3 CameraModelPosition;
	 Float3 MaterialEmissive;
	 Float3 MaterialAmbient;
	 Float3 MaterialDiffuse;
	 Float3 MaterialSpecular;
	 Float3 Light0ModelPosition;
	 Float3 Light0ModelDirection;
	 Float3 Light0Ambient;
	 Float3 Light0Diffuse;
	 Float3 Light0Specular;
	 Float3 Light0SpotCutoff;
	 Float3 Light0Attenuation;
	
	
	
	//add tweakable
	public void Init(ServiceRoot AnimatedCharacterService)
	{
		//Called Init
		Tweakable tweaker = new Tweakable();
		 tweaker.Tweak("WVPMatrix", Mat4.class, WVPMatrix);
		 Mat4 WMatrix;
	
		 
		 tweaker.Tweak("MaterialEmissive", Float3.class, MaterialEmissive);
		 
		 tweaker.Tweak("MaterialAmbient", Float3.class,MaterialAmbient);
		 tweaker.Tweak("MaterialDiffuse", Float3.class,MaterialDiffuse);
		 tweaker.Tweak("MaterialSpecular", Float3.class,MaterialSpecular);
		 tweaker.Tweak("Light0ModelPosition", Float3.class,Light0ModelPosition);
		 tweaker.Tweak("Light0ModelDirection",Float3.class, Light0ModelDirection);
		 tweaker.Tweak("Light0Ambient", Float3.class,Light0Ambient);
		 tweaker.Tweak("Light0Diffuse",Float3.class,Light0Diffuse);
		 tweaker.Tweak("Light0Specular",Float3.class,Light0Specular);
		 tweaker.Tweak("Light0SpotCutoff", Float3.class,Light0SpotCutoff);
		 tweaker.Tweak("Light0Attenuation",Float3.class, Light0Attenuation);
		 	
	}
	
	public void Update()
	{
		//called Update
	}
	
	public void Destroy()
	{
		//called Destroy
	}
}
