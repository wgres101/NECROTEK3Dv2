package MathOptimization;

//GEMS MATH 4

public class ExtractingFrustrumAndCameraInfo {

	
	
	
	
	/*
	 * 
	 * M is the modelview matrix
	 * 
	 * N is a plane
	 * 
	 * N_left = [M_41 + M_11 M_42 + M_12 M_43+M_13 M+44 + M_14 ]^T
	 * N_right = [ M_41 - M_11 M_42-M_12 M_43-M13 M_44 - M_14 ] ^T
	 * N_bottom = [ M_41+M_21 M_42+M_22  M_43+M23 M_44 + M_24 ] ^ T
	 * N_top = [ M_41 - M_21 M_42-M_22 M_43-M_23 M_44 - M_24 ] ^ T
	 * N_near = [ M_41 + M_31 M_42+M_32 M_43+M_33 M_44 + M_34 ] ^ T
	 * N_far = [ M_41 -M_31 M_42-M_32 M_43 - M_33 M_44-M_34 ] ^ T
	 */
	
	
	//Camera Position
	/*
	 * A = [ a_left b_left c_left ]
	 *     [ a_right b_right c_right ]
	 *     [ a_top b_top c_top ]
	 *     
	 * P = [ x y z ] ^T
	 * 
	 * B = [ -d_left -d_right -d_top ]^T
	 * 
	 * Camera point P can be found using Cramer's rule for determinants
	 * 
	 * 
	 * P = [ det A_a / det A ]
	 *     [ det A_b / det A ]
	 *     [ det A_c / det A ]
	 * 
	 */
	
	
	/* Near and Far Distances can be calculated as such:
	 * 
	 * D_near = -a_near*P_x - b_near*P_y - c_near*Pz - d_near
	 * D_far = a_far*P_x + b_far*P_y + c_far*Pz + d_far
	 * 
	 */
	
	/* Angles of field of view
	 * 
	 * The horizontal angles of the field of view, theta_v and theta_h can be computed
	 * from the frustrum planes
	 * 
	 * cos (PI - theta_v) = [a_bottom b_bottom c_bottom] dot [ a_top b_top c_top ]
	 * cos(PI - theta_h) = [a_right b_right c_right] dot [a_left b_left c_left ]
	 */
	
	
	
	
	
	
	
}
