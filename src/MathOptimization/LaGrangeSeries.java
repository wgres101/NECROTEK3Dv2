package MathOptimization;

public class LaGrangeSeries {

	
	//  x[0] through x[9] data points
	//
	//	polynomials:
	//  (x-x[0]), (x-x[1]), (x-x[2]), ..., x-x[9]
	//
	//	multiply all simple polynomials together except x[0] for the final polynomial at x[0]
	//  
	//  if the answer is 2 per se, multiple by 4/2 to change  the output units
	//  insert x[0], x[1], x[2], etc. to get the answer for x[0]
	
	//  repeat for x[1], x[2], x[3], etc. to x[9] generating a polynomial for each data point
	//  compute the other polynomials for ( x[1], x[2], ..., x[9])
	
	//
	// adding all 9 generated polynomials together gives you the Lagrange Series which passes through
	// each data point
}
