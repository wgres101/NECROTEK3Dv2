package Services.PrimitivesServices;

import org.jdom2.Element;

import Services.ServiceRoot;
import UtilityTypes.Color;
import WSObjects.WSObject;

public class FogService extends ServiceRoot {

	
	public FogService(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	public  void Launch() {}
	
	public  void Init() {}
	
	public  void Update() {}
	
	public  void Destroy() {}
	
	
	public  WSObject SpawnWebServiceObject() { return null;}
	
	
	
	
	//three types of fog
	//linear fog, exponential fog, and range-based fog
	
	//z is the value of the pixel to be fogged
	Color linearFog(Color pixelColor, Color fogColor, float z,  float z_0, float z_1)
	{
		float phi_value = 0.0f;
		if (z < z_0)
		{
			 phi_value = 0;
		}
		
		if (z >= z_0 && z <= z_1)
		{
			phi_value = ((z - z_0)/(z_1-z_0));
		}
		
		if (z > z_1)
		{
			phi_value = 1.0f;
		}
		
		return null;
	}

	//lambda > 0 is a parameter showing icnrease
	
	Color exponentialFog(Color pixelColor, Color fogColor, float lambda, float z)
	{
		float phi_value = 0.0f;
		double d_lambda = (double)lambda;
		
		phi_value = (float)Math.exp(d_lambda);
		
		return null;
	}
	
	
	//distance r from eyepoint to pixel
	Color rangeFog(Color pixelColor, Color fogColor, float r, float r_0, float r_1)
	{
		
		float phi_value = 0.0f;
		if (r < r_0)
		{
			 phi_value = 0;
		}
		
		if (r >= r_0 && r <= r_1)
		{
			phi_value = ((r - r_0)/(r_1-r_0));
		}
		
		if (r > r_1)
		{
			phi_value = 1;
		}
		
		return null;
	}
	
	Color fogEquation(Color pixelColor, float phiValue, Color fogColor)
	{
		pixelColor = pixelColor.addColors((pixelColor.floatMult(1 - phiValue, pixelColor)),  (pixelColor.floatMult(phiValue, fogColor)));
		return null;
	}
	
	
}
