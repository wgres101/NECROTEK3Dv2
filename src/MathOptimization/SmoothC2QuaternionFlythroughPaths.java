package MathOptimization;

//gems 2 math

public class SmoothC2QuaternionFlythroughPaths {

	
	//UNIT QUATERNION 4-SPHERE (S^3)
	//AND FOUR DIMENSIONAL SPACE (R^4)
	
	//a,b,c,s are the four parts of the quaternion
	//a,b,c are the vector portions, with s being the scalar portion
	
	//Transformation from S^3 to R^4 is:
	//
	// x = a/sqrt(2(1-s))
	// y = b/sqrt(2(1-s))
	// z = c/sqrt(2(1-s))
	// w = (1-s)/sqr5t(2(1-s))
	
	//Transformation from R^4 to S^3 is:
	//
	// s = (x^2 + y^2 + z^2 - w^2) / (x^2 + y^2 + z^2 + w^2)
	// a = 2xw / (x^2 + y^2 + z^2 + w^2)
	// b = 2yw / (x^2 + y^2 + z^2 + w^2)
	// c = 2zw / (x^2 + y^2 + z^2 + w^2)
	
	//first apply transformation from S^3 to R^4 to convert control quaternions to their resulting value in R^4
	//The resulting 4-vectors can be interpolated using the spline of your choice
	//Once the desired point on the spline in R^4 is found, it cna be converted back into a 
	//quaternion using the R^4 to S^3 transformation
	
	
	
	
	
	
	
	
	
}
