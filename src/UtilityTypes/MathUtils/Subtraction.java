package UtilityTypes.MathUtils;

public class Subtraction {

	
	public static Vector3f VectorSubtraction(Vector3f a, Vector3f b)
	{
		Vector3f c = new Vector3f();
		c.x = a.x - b.y;
		c.y = a.y - b.y;
		c.z = a.z - b.z;
		
		return c;
	}
	
}
