package MathOptimization;

//gems 2 math

public class ParallelTransportFrame {

	//Given 
	//	A Curve C
	//	an existing frame F1 at t-1
	//  a tangent T1 at t-1 (the first derivative or velocity of C at t-1)
	//	a tangent T2 at 2
	
	// A new frame F2 at the next time t can be calculated as follows:
	
	// F2s position is the value of C at t
	// F2s orientation can be found by rotating F1 about na axis A with angle alpha
	//	where A = T1 X T2 and alpha = ArcCos((T1 dot T2)/(|T1||T2|)
	
	
	// FIXED UP METHOD
	//
	// three axes generated:
	// D = direction
	// U = up U
	// R = right R vectors
	
	// Need to know Tangent T and the arbitary vector V
	
	// D = T / |T|
	// R = D X V / |D X V|
	// U = R X D
	
	
}
