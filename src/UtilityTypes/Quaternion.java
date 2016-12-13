package UtilityTypes;

public class Quaternion {

	
	//q = cos(theta) + vsin(theta) is a unit quaternion (where v is a threedimensional unit vector)
	
	
	
	private float x,y,z,w;
	public Quaternion Inverse() { return null;}
	
	public static Quaternion getQuaternionFromMatrix(Mat4f matrix) { return null;}
	
	public static Mat4f getMatrixFromQuaternion(Quaternion q) { return null;}
	
	public static void interpolate(Quaternion a, Quaternion b, float amount) {  }
	
	public static Quaternion multiply(Quaternion a, Quaternion b) { return null;} 
	
	public Vec3f AxisOfRotation() { return null; }
	
	public float AngleOfRotation() { return w;  }
	
	public static Quaternion RotationArc(Vec3f v0, Vec3f v1) { return null; }
	
	
}
