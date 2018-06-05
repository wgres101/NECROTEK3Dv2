package MathOptimization;

//gems 3 math

public class ConstrainedInverseKinematics {

	
	/*
	 * PSEUDOCODE
	 * 
	 * Vecto3f effected = current end of effected bone in world space 
	 * displaced in local X by the bone length
	 * 
	 * Vector3f effector = current position of relevant control point in world space
	 * 
	 * Vector3 current = effected, reverse=transformed to local space
	 * Vector3f desired = effector, reverse transformed to local space
	 * 
	 * if the difference between current and desired is small, skip to next bone
	 * 
	 * normalize current and desired
	 * 
	 * compute a quaternion delta that would rotate current to desired
	 * 
	 * sum all the scaled deltas from themultiple effections and store in change
	 * 
	 * if velocity-limiting is on, limit change to the max per-frame anngle alloweed; this should
	 * be adjusted to the magnitude of the timestep
	 * 
	 * rotate thebone by the quaternion delta
	 * 
	 * Quaternion global_rot = parent's world rotation * this bone's local rotation (this is the bone's
	 * current world transform)
	 * 
	 * Quaternion parent_delta = parent's reference rotation * inverse of parent's current world rotation
	 * (this is how much the parent has deviated from reference with respect to the world)
	 * 
	 * Quaternion global_delta = parent_delta * global_rt * inverse of parent reference world rotation
	 * (this is the bone rotation in world-aligned axes adjusted for parent rotatoin)
	 * 
	 * convert Quaternion global_delta to Euler euler
	 * 
	 */
	
	/* if active and not limited, skip this axis (any angle is fine)
	 * 
	 * if not active, set the angle to the reference value; skip to next axis
	 * 
	 * X,Z axes only: if Y angle is near 90 degrees, set angle to last frame's value and skip
	 * to next axis (gimbal lock avoidance)
	 * 
	 * if current angle is within limits, reset bias to 2 (no preferencfe), and skip to next axis
	 * 
	 * mindiff = minimum - angle
	 * maxdiff = angle - maximum
	 * 
	 * adjust mindiff and maxdiff to be in range of 0 to 2*PI
	 * 
	 * if there is a bias preference, adjust angles to make flipping between solutions
	 * less desirable by adding the 10 degrees to the oppositve min/max diff variable
	 * 
	 * if maxdiff < mindiff, set angle to max and bias to 1
	 * if maxdiff > mindiff, set the the angle to min and bias to 0
	 * 
	 * store modified euler in case there is a gimbal lock next frame
	 * 
	 * convert euler to Quaternion global_delta
	 * 
	 * Quaternion constrained = inverse of parent reference world rotation  * global_delta * parent reference world rotation
	 * 
	 * set bone rotation to constrained
	 * 
	 * recompute cached current world transform for this bone and all descendents
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
