package MathOptimization;

//gems 2 math

public class InverseTrajectories {

	//defining position and veloctiy as a function of time
	// 
	// v_x = v_i*cos(theta)
	// v_y = v_i*sin(theta) - gt      //where g is the force of gravity
	//								//theta is the angle of the trajectory
									//v_i is the initial velocity
	//								//v_x is the velocity in the x direction
	//								//v_y is the velocity in the y direction
	
	//////////////////////////////////////////
	
	// Solving for angle of elevation
	//
	// tan(theta) = (-b +- sqrt(b^2-4ac))/2a
	// where
	//
	// a = gx^2/2*v_i^2
	// b = -x
	// c = (gx^2/2v_i^2) + y
	
	
	/////////////////////////////////////////////////
	//
	// Solving for initial velocity
	//
	// v_i = (x/(cos(theta)) * (sqrt(g/2(x*than(theta)-y)))
	//
	
	//////////////////////////////////////////////////
	//
	// Calculating the maximum height for a trajectory
	//
	// y_max = (v_i^2*sin^2(theta)) / 2g
	
	
	
}
