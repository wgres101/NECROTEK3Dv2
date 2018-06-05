package MathOptimization;

import UtilityTypes.Vec3f;

//gems 2

public class IntersectionOf3DLines {

	
	/*
	//Two lines in 3D intersect if we can find values
	//s and t where points C and D are coincident
	
	//A = A_x + A_y + Az //vector
	//B = B_x + B_y + Bz //vector
	
	Vec3f A_1 = new Vec3f();
	
	
	//initial
	
	L_A = A_2 - A_1;      //line A
	L_B = B_2 - B_1;     //line B
	
	
	//
	
	L_A = A_2 - A_1;
	L_B = B_2 - B_1;
	AB = B - A;
	
	L_11 = L_A * L_A
	L_22 = L_B * L_B
	L_12 = -L_A * L_B
	r_a = L_A * AB;
	r_b = -L_B*AB;
	
	
	//parameters solution
	
	t = (L_11*r_b - L_12(r_A)/(L_11*L_22 - L_12));
	s = (r_a - L_12*t)/L_11;
	
	
	//the point where the first segment comes closest to the second segment is then
	C = A_1 + s*L_A;
			
	//the point where the second segment comes closest to the first segment is then
	D = B_1 + t*L_B;
	
	//when the points do intersect, they intersect at P
	P = (C+D)/2

	//if s and t are within 0 < s < 1 and 0 < t < 1 then we don't have to do anything
	//if one of the parameters falls outside
	//then we have to: 
	//1. clamp the out of range paraemter to [0,1]
	//2. compute on the line the new parameter this is nearest point for the first segment
	//3. find the point on the other line that is nearest to the ne wpoint on the first segment
	
	///in the case that they both are outside the parameter range
	//1. choose a segment and clamp its out of range parameter to [0,1]
	//2. compute the point on the line for the new parameter. This is not guaranteed to the be the nearest point for
	//	for the first segment!
	//3.Find the point on the other line that is nearest to the new point on the first line, with the nearest point 
	//	calculation performed for a finite line segment
	//	This is the nearest point for the second line segment'
	//4. Find the point on the first line segment that is nearest ot the point
	//	that resulted from step 3. This is the nearest point for the first line segment
			
	
		*/	
}


