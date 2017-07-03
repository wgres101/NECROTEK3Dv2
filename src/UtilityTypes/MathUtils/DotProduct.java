package UtilityTypes.MathUtils;

public class DotProduct {

	
	
	
	public static float VectorDotProduct(Vector3f a, Vector3f b)
	{
		float ScalarQuantity = a.x * b.x + a.y * b.y+ a.z * b.z;
		
		return ScalarQuantity;
	}
	
}
