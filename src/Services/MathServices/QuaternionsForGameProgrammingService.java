package Services.MathServices;


//GEMS ONE

public class QuaternionsForGameProgrammingService {

	
	class Quaternion
	{
		float i,j,k,w;
	}
	
	float squareRoot(Quaternion k)
	{
		return -1;
	}
	
	float multiplyi_j(float i, float j)
	{
		return k;
	}
	
	float multiplyj_k(float j, float k)
	{
		return i;
	}
	
	float multiplyk_i(float k, float i)
	{
		return j;
	}
	
	Quaternion multiply(Quaternion q1, Quaternion q2)
	{
		Quaternion total = new Quaternion();
		total.w = (q1.w*q2.w -q1.i*q1.i - q1.j*q2.j - q1.k*q2-q2.k);

		total.i = (q1.i*q2.k - q1.i*q2.k + q1.w*q2.j + q1.w*q2.i);
		
		total.j = (q1.k*q2.i - q1.k*q2.i + q1.w*q2.j + q1.w*q2.j);
		
		total.k = (q1.i*q2.j - q1.i*q2.j + q1.w*q2.k + q1.w*q2.k);
	
	}
	
	float norm(Quaternion q)
	{
		float N_q = q.i*q.i + q.j*q.j + q.k*q.k + q.w*q.w;
		return N_q;
		
	}
	
	Quaternion conjugate(Quaternion q)
	{
		Quaternion q;
		q.i = -q.i;
		q.j = -q.j;
		q.k = -q.k;
		return q;
	}
	
	//pure means no scalar w
	
	
	Quaternion pureQuaternion()
	{
		
	}
	
	
	//rotation of a vector P[x y z] byt hte unit quaternion q
	// is done by creating the pure quaternion and the conjugade of p
	// p = xi + yj + zk
	// Rot_q(P) = qpq*
	//
	// Rotation of around quaternion q is done by
	//multipluing the original quaternion q by the pure quaternion
	//by the conjugate of the result
	
	Matrix4f QuaternionToMatrix
	{
		Matrix4f mat = new Matrix4f;
		
		m
	}
}

