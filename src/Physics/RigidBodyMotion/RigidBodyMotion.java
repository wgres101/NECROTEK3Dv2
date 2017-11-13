

// GEMS 1

package Physics.RigidBodyMotion;

public class RigidBodyMotion
{
	
	//return orientation using quaternions
	//q_1 = q_0 + (1/2)*w*q*delta_t;
	
	//w is a quaternion - (pure quaternion: w_xi + w_yj + w_zk
	//q is the unit quaternion
	
	//multiplying (1/2)*w
	//Quaternion sol1 = Quaternion.MultiplyByFloat(w, 1/2)
	
	//multiply sol1*q   (both are quaternions)
	//Quaternion sol2 = Quaternion.multiply(sol1, q)
	
	//multiply sol2 * delta_t
	//Quaternion sol3 = Quaternion.MultiplyByFloat(sol2, delta_t)
	
	///adding quaternions
	//Quaternion solution = Quaternion.AddQuaternions(sol3, q_0)
	
	
	
	
	
	
	
	
}