package MathOptimization;

/*
class INTORFLOAT {
	static int i;
	static float f;
} 

*/

public class LogarithmicOptimizationSquareRoot {

	int sqrttable[] = new int[256];
	
	float sqrt(float f)
	{
		INTORFLOAT ftmp = new INTORFLOAT();
		int n, e;
		
		ftmp.f = f;
		n = ftmp.i;
		e = (n >> 1) & 0x3f800000;
		n = (n >> 16) & 0xff;
		
		ftmp.i = sqrttable[n] + e;    //combine results
		
		return ftmp.f;
		
		
	}
	
}
