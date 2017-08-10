package UtilityTypes;

public class Quaternion {

	
	//q = cos(theta) + vsin(theta) is a unit quaternion (where v is a threedimensional unit vector)
	
	
	
	private float x,y,z,w;
	public Quaternion Inverse() { return null;}
	
	public static Quaternion getQuaternionFromMatrix(Mat4f mat) 
	{
		float v_i = (float) ((float)Math.sqrt(mat.matrix[0][0] - mat.matrix[1][1] - mat.matrix[2][2] + 1)/2.0);
		float v_j = (mat.matrix[0][1] + mat.matrix[1][0])/4*v_i;
		float v_k = (mat.matrix[0][2] + mat.matrix[2][0])/4*v_i;
		float v_w = (mat.matrix[1][2] - mat.matrix[2][1])/4*v_i;
		
		Quaternion quat = new Quaternion();
		quat.x = v_i;
		quat.y = v_j;
		quat.z = v_k;
		quat.w = v_w;
		return quat;
	}
	public static Mat4f getMatrixFromQuaternion(Quaternion q) {
	/*	float [][] Mat4 = new float[4][4];
		Mat4[0][0] = 1-2*(y*y+z*z);
		Mat4[0][1] = 2*(x*y-w*z);
		Mat4[0][2] = 2*(w*y-x*z);
		Mat4[0][3] = 0;
		Mat4[1][0] = 2*(xy+wz);
		Mat4[1][1] = 1-2*(x*x+z*z);
		Mat4[1][2] = 2*(y*z - w*x);
		Mat4[1][3] = 0;
		Mat4[2][0] = 2*(x*z - w*y);
		Mat4[2][1] = 2*(y*z + w*x);
		Mat4[2][2] = 1-2*(x*x + y*y);
		Mat4[2][3] = 0;
		Mat4[3][0] = 0;
		Mat4[3][1] = 0;
		Mat4[3][2] = 0;
		Mat4[3][3] = 1;
		Mat4f mat4f = new Mat4f();
		
		mat4f.matrix[0][0] = Mat4[0][0];
		mat4f.matrix[0][1] = Mat4[0][1];
		mat4f.matrix[0][2] = Mat4[0][2];
		mat4x.matrix[0][3] = Mat4[0][3];
		
		mat4f.matrix[1][0] = Mat4[1][0];
		mat4f.matrix[1][1] = Mat4[1][1];
		mat4f.matrix[1][2] = Mat4[1][2];
		mat4x.matrix[1][3] = Mat4[1][3];

		
		mat4f.matrix[2][0] = Mat4[2][0];
		mat4f.matrix[2][1] = Mat4[2][1];
		mat4f.matrix[2][2] = Mat4[2][2];
		mat4x.matrix[2][3] = Mat4[2][3];

		
		mat4f.matrix[3][0] = Mat4[3][0];
		mat4f.matrix[3][1] = Mat4[3][1];
		mat4f.matrix[3][2] = Mat4[3][2];
		mat4f.matrix[3][3] = Mat4[3][3];

		return mat4f;*/
		return null;
	}
	
	//Book 1 2.10
	public static void ShortestArc()
	{
		//[q_x,q_y,q_z] = [c_x,c_y,c_z]/sqrt(2(1+d)
		//[c_x,c_y,c_z] = cross(v_0,v_1)
		//d = v_0 dot v_1
		//q_w = sqrt(1+d/2)
	}
	
	public static void LinearInterpolate(Quaternion q_0, Quaternion q_1, float t)
	{ 
		//q(t) = f_0(t)q_0 + f_1(t)q_1 0 <= t <= 1
		//f_0(t) and f_1(t) are scalar functions:
		//f_0(0) = 1
		//f_1(1) = 0
		//f_1(0) = 0
		//f_1(1) = 1
		
		
		//Linear Interpolation
		//lerp(t;q_0,q_1) = (1-t)q_0 + t*q_1= t(q_1-q_0) + q_0
		
		//get interpolation
		Quaternion lerp1 = MultiplyByFloat(q_0, 1-t);
		Quaternion lerp2 = MultiplyByFloat(q_1, t);
		Quaternion lerp = AddQuaternions(lerp1, lerp2);
		
	}
	
	public static void SphericalCubeInterpolation()
	{
		//squad(t;p,q,a,b) = slerp(2t(1-t);slerp(t;p,q);slerp(t;a,b,)
	}
	

	public static void SphericalLinearInterpolation(Quaternion q_0, Quaternion q_1)
	{
		Quaternion inversequat = Inverse(q_0);
		Quaternion middle = Multiplication(inversequat, q_1);
		//Quaternion power = PowerFunction(middle)
		//Quaternion beginning = Multiplicaiton(q_0, power)
		//Quaternion end = Logarithm(middle);
		//Quaternion complete = Multiplication(beginning, end)
	}
	
	public static Quaternion MultiplyByFloat(Quaternion q, float f)
	{
		Quaternion quat = new Quaternion();
		quat.x = q.x*f;
		quat.y = q.y*f;
		quat.z = q.z*f;
		quat.w = q.w*f;
		return quat;
	}
	
	public static Quaternion AddQuaternions(Quaternion q1, Quaternion q2)
	{
		Quaternion quat = new Quaternion();
		quat.x = q1.x + q2.x;
		quat.y = q1.y + q2.y;
		quat.z = q1.z + q2.z;
		quat.w = q1.w + q2.w;
		return quat;
	}

	
	public Vec3f AxisOfRotation() { return null; }
	
	public float AngleOfRotation() { return w;  }
	
	public static Quaternion RotationArc(Vec3f v0, Vec3f v1) { return null; }

	public static Quaternion Multiplication(Quaternion q, Quaternion q_prime)
	{
		/*
		Quaternion double_prime = new Quaternion();
		float x_prime = q_prime.x;
		float y_prime = q_prime.y;
		float z_prime = q_prime.z;
		float x_double_prime = y*z_prime - z*y_prime + w*x_prime + x*w_prime;
		float y_double_prime = z*x_prime - x*z_prime + w*y_prime + y*w_prime;
		float z_double_prime = x*y_prime - y*x_prime + w*z_prime + z*w_prime;
		float w_double_prime = w*w_prime - x*x_prime - y*y_prime - z*z_prime;
		double_prime.x = x_double_prime;
		double_prime.y = y_double_prime;
		double_prime.z = z_double_prime;
		*/
		return null;
	}
	
	public static Quaternion Inverse(Quaternion q)
	{
		Quaternion q_inverse = new Quaternion();
		q_inverse.x = -q.x;
		q_inverse.y = -q.y;
		q_inverse.z = -q.z;
		q_inverse.w = q.w;
		return q_inverse;
	}
	
	public static Quaternion PowerFunction(Quaternion q, float t, float theta)
	{
		Quaternion quat = new Quaternion();
		quat.x = (float) Math.sin(q.x*theta);
		quat.y = (float) Math.sin(q.y*theta);
		quat.z = (float) Math.sin(q.z*theta);
		quat.w = (float) Math.cos(t*theta);
		
		return quat;
	}
	
	public static float Logarithm(float theta, Vec3f vector)
	{
		//vtheta
		Quaternion q = new Quaternion();
		q.x = (float) (Math.sin(theta)*vector.x);
		q.y = (float) (Math.sin(theta)*vector.y);
		q.z = (float) (Math.sin(theta)*vector.z);
	}
	
	public static float Derivative(Quaternion q, float power)
	{
		//q^t log q
		return 0;
	}
	
	/*public static float ChainRule(Quaternion q, float power, f_of_t)
	{
		//f'(t)*q^f(t)log(q)
	}*/
	
	
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
