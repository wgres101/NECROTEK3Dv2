package AnimationAlgorithms;

public class CurvedPathsForSeamlessAnimation {
//Gems 8 physics and animation
	
	
	/*
	 * 
	 * FitCurve(startpos, endPos, startVel, endVel)
	 * {
	 * 		create a Bezier curve from start to finish
	 * 		using startVal and endVal to define the control points
	 * 		
	 * 		while(the curve intersects with an obstacle)
	 * 		{
	 * 			reduce startVal and endVal
	 * 			recalculate the Bezier curve
	 * 			if StartVal and endVal reach a user-defined minimum: break
	 * 
	 * 		}
	 * 
	 * 		if the curve still intersects with an obstacle:
	 * 			divide the path in two by choosing a point NewPos on path
	 * 			set newVel using the vector between two neighbors of newPos
	 * 			FitCurve(startPos, newPos, startVal, endVel)     //recursion
	 * 			FitCurve(newPos, endPos, newVel, endVel)
	 * 
	 * 
	 */
	
}
