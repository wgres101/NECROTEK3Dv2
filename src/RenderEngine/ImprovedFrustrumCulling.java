package RenderEngine;

import Hierarchy.Entities.Camera;
import MathUtils.DotProduct;
import MathUtils.Subtraction;
import MathUtils.Vector3f;


//INCOMPLETE. GEMS SECTION1 PAG

public class ImprovedFrustrumCulling {

	
	
	public static boolean ClassifySphere (Vector3f Center, float Radius, Camera camera)
	{
		Vector3f ForwardVector = new Vector3f(0.0f,0.0f, 1.0f);
		Vector3f OP = Subtraction.VectorSubtraction(Center, camera.Eyeposition);   //OP dot ForwardVector  //OP is the eye distance from O(origin) amd (point we are checking )
		
		//float f = VectorDotProduct(OP, ForwardVector);
		float f = DotProduct.VectorDotProduct(OP, ForwardVector);
		
		
		//float f = OP * ForwardVector;			//forward vector is the "height" of the triangle in traditional geometry
		if (f< camera.NearZ-Radius || camera.FarZ + Radius < f)  ///near and far planes adjusted by the sphere radius
		{
			return false;
		}
		
		//unoptmized but more understandable
		Vector3f RightVector = new Vector3f(1.0f, 0.0f, 0.0f);
		Vector3f UpVector = new Vector3f(0.0f, 0.0f, 1.0f);
		//float r = OP * RightVector;					//r is the OP dot RightVector?? and rFactor??
		float r = DotProduct.VectorDotProduct(OP, RightVector);
		
		//field of view is the angle of view 
		
		float rFactor = (float) Math.tan((double)camera.FOV/2);
		
		float rLimit = rFactor * f;					//
		
		if (r < -rLimit-Radius || rLimit + Radius < r)   //the value of r is OP * RightVector. 
		{
			return false;
		}
		
		//Optimized ( a subtraction is removed
		//float u = DotProduct.VectorDotProduct(OP, UpVector);
		//float uLimit = uFactor * f + Radius;
		//if (u < -uLimit || uLimit < u)
		//{
		//	return false;
		//}
	
		return true;
	}
	
	
}
