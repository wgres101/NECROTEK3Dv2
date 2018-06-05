package MathOptimization;

//math gems 3

public class VectorFractions {

	
	/*
	 * To determine if a point P is on the right of an infinite line defined by start S and axis A
	 * we can test for the following inequality:
	 * 
	 * (P_x - S_x)A_y < (P_y - S_y) * A_x
	 * 
	 * To apply this to a point represented as a vector fraction
	 * we simply subsituate a fractional representation for P then multiply everyything by d_p to
	 * avoid division giving us the following inequality:
	 * 
	 * P = B + (C/d_p_)
	 * 
	 * (B_x*d_p + C_x - S_x*d_p)*A_y < (B_y*d_p + C_y - S_y*d_p)*A_x
	 * 
	 * A vector fraction is like the following
	 * 
	 * 
	 * I = S_1 + (n*A_1/d). It is a point represented as a fractional portion of a vector
	 * 
	 */
	
	
}
