package MathOptimization;

//GEMS 2

//class INTORFLOAT {
//	static int i;
//	static float f;
//} 

public class TrigLookUpTables {

	final float FTOBIAS  = 12582912.0f;		//1.5 * 2^23
	final float PI = 3.14159265f;
	
	//REPAIRS - WHER ETHE HELL IS ftmp.f incorporated?
	
	public static float table[] = new float[256];
	
	float fsin (float theta)
	{
		int i;
		INTORFLOAT ftmp = new INTORFLOAT();
		ftmp.f = theta*(256.0f/(2.0f*PI)) + FTOBIAS;
		i = ftmp.i & 255;
		return table[i];
	}
	
	float fcos (float theta)
	{
		int i;
		INTORFLOAT ftmp = new INTORFLOAT();
		ftmp.f = theta*(256.0f/(2.0f*PI)) + FTOBIAS + 64f;
		i = ftmp.i & 255;
		return table[i];
	}
}
