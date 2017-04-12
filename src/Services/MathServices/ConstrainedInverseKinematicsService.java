package Services.MathServices;

//GEMS3

//apply IK to one specific boneV
/*
public class ConstrainedInverseKinematicsService {

	Vector3f effected = current end of effected bone in world space
						displaced in local X by the bone length
						
	VAector3 effector = current position of relevant control po int in world space
	Vector3f current = effected, reverse-transformed to local space
	Vector3f desired = effector, reverse transformed to local space
	
	if the differnce between current and desired is small,skip to the next bone
	
	normalize current and desired
	
	compute  a quaternion delta that would rotate current to desired
	
	sum all the scaled deltas from the multiple effections and store in change
	
	if velocity-limiting is on, limit change to the max per-frame angle allowed,
	this should be adjusted to the order of magnitude of the time step\
	
	rotate the bone by the quaternion delta
	
	Quaternion global_rot = parent' sworld rotation * thjis bone's local rotation 
													this is the bones current transform
	Quaternion parent_delta = parent's reference rotation * inverse of the
							parents current world transform 
							(this is how much the parent has deviated from reference)
							(with the respect to the world)
							
	Quaternion global_delta = parent_delta * global_rot * inverse of parent reference
							world rotation
							(this is the bone rotation in world aligned axes adjusted for parent rotation)
	convert Quaternion global_delta to Euler euler
	
	
	
	//block two
	
	if active and not limited, skip this axis( any angle is fine)
	
	f not acative, set the angle to the reference value, skip to next axis
	
	X,Z axes only' if Y angle is near 90 degrees, set angle to last frame's value nad skip to next axis (gimal lock avoidance)
	if current angle is within limits, reset bias to 2 (no prefernce)
	
	mindiff = minimum - maximum;
	maxdiff = angle - maximum;
									
	 adjust mindiff and maxdiff to be in range of 0 to 2*PI
	 
	 if there is a bias preference, adjust angles to make flipping between solutions kless desirable by adding the the 10 degrees
	 to the opposite min/max diff variables
	 
	 if maxdiff<mindiff, set angle to max and bias to 1
	 if maxdiff>mindiff, set angle to min and bias to 0 
	 
	 store a modified euler in case there is a gimbal lock next frame
	 
	 convert euler to Quaternion global_delta
	 
	 Quaternion constrained = inverse opf parent reference world rotation**global_delta* parent reference world rotation
	
	 set bone rotation to constraineed
	 
	 recompute cached world transform for this bone and all descendentgs
									
	
	
	
}
*/