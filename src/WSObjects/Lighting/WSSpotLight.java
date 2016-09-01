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
		
		 Tweakable.tweak(WVPMatrix, WVPMatrix);
		 Mat4 WMatrix;
		 
		 Tweakable.tweak(CameraModelPosition, CameraModelPosition);
		 
		 Tweakable.tweak(MaterialEmissive, MaterialEmissive);
		 
		 Tweakable.tweak(MaterialAmbient, MaterialAmbient);
		 Tweakable.tweak(MaterialDiffuse, MaterialDiffuse);
		 Tweakable.tweak(MaterialSpecular, MaterialSpecular);
		 Tweakable.tweak(Light0ModelPosition, Light0ModelPosition);
		 Tweakable.tweak(Light0ModelDirection, Light0ModelDirection);
		 Tweakable.tweak(Light0Ambient, Light0Ambient);
		 Tweakable.tweak(Light0Diffuse, Light0Diffuse);
		 Tweakable.tweak(Light0Specular, Light0Specular);
		 Tweakable.tweak(Light0SpotCutoff, Light0SpotCutoff);
		 Tweakable.tweak(Light0Attenuation, Light0Attenuation);
		 	
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
