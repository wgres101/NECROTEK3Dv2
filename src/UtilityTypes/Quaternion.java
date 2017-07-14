package UtilityTypes;

public class Quaternion {

	
	//q = cos(theta) + vsin(theta) is a unit quaternion (where v is a threedimensional unit vector)
	
	
	
	private float x,y,z,w;
	public Quaternion Inverse() { return null;}
	
	public static Quaternion getQuaternionFromMatrix(Mat4f matrix) { return null;}
	
	public static Mat4f getMatrixFromQuaternion(Quaternion q) { return null;}
	
	public static void interpolate(Quaternion a, Quaternion b, float amount) {  }
	
	
	
	public Vec3f AxisOfRotation() { return null; }
	
	public float AngleOfRotation() { return w;  }
	
	public static Quaternion RotationArc(Vec3f v0, Vec3f v1) { return null; }
	
	////////////////
	
	public static Quaternion multiply(Quaternion q, Quaternion q_prime)
	{
		float x = q.x;
		float y = q.y;
		float z = q.z;
		float w = q.w;
		

		float x_prime = q_prime.x;
		float y_prime = q_prime.y;
		float z_prime = q_prime.z;
		float w_prime = q_prime.w;
		
		
		
		float x_double_prime = y*z_prime - z*y_prime + w*x_prime + x*w_prime;
		float y_double_prime = z*x_prime - x*z_prime + w*y_prime + y*w_prime;
		float z_double_prime = x*y_prime - y*x_prime + w*z_prime + z*w_prime;
		float w_double_prime = w*w_prime - x*x_prime - y*y_prime - z*z_prime;
		
		Quaternion result = new Quaternion();
		
		result.x = x_double_prime;
		result.y = y_double_prime;
		result.z = z_double_prime;
		result.w = z_double_prime;
		
		return result;
	}
}
