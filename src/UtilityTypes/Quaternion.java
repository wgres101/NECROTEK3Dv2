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
		float [][] Mat4 = new float[4][4];
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

		return mat4f;
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
	
	public setatic SphericalCubeInterpolation()
	{
		//squad(t;p,q,a,b) = slerp(2t(1-t);slerp(t;p,q);slerp(t;a,b,)
	}
	
	public static SphericalLinearInterpolation(Quaternion q_0, Quaternion q_1)
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
		quat.x = sin(q.x*theta);
		quat.y = sin(q.y*theta);
		quat.z = sin(q.z(theta);
		quat.w = cos(t*theta);
		
		return quat;
	}
	
	public static float Logarithm(float theta, Vec3f vector)
	{
		//vtheta
		Quaternion q = new Quaternion();
		q.x = sin(theta)*vector.x;
		q.y = sin(theta)*vector.y;
		q.z = sin(theta)*vector.z;
	}
	
	public static float Derivative(Quaternion q, float power)
	{
		//q^t log q
	}
	
	public static float ChainRule(Quaternion q, float power, f_of_t)
	{
		//f'(t)*q^f(t)log(q)
	}
	
	
}
