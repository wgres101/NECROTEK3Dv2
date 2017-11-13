package MathOptimization;

//GEMS 2 - comment: WHERE IS THE BIAS.F?

class INTORFLOAT {
	static int i;
	static float f;
} 




public class ImprovingFloatingPointPerformance {

	public int FastConversionFloatToInt(float a)
	{
		INTORFLOAT n = new INTORFLOAT(); //floating point number
		n.f = a;                           //some floating point number, say 123.456
		INTORFLOAT bias = new INTORFLOAT(); //magic number
	
		
		if (a > 0)
		{
			bias.i = (23 + 127) << 23;
		
			n.f += bias.f;
			n.i += bias.i;
		}
		
		if (a < 0)
		{
			bias.i = (23 + 127) << 23 + 1 << 22;
			
			n.f += bias.f;
			n.i += bias.i;
		}
		
	
		return n.i;
		//n.i is now 123, the integer portion of the original a
	}
	
	
	public float FastConversionFloatToFixedPoint(float a, int bits)
	{
		INTORFLOAT n = new INTORFLOAT(); //floating point number
		n.f = a;                           //some floating point number, say 123.456
		INTORFLOAT bias = new INTORFLOAT(); //magic number
	
		
		if (a > 0)
		{
			bias.i = (23-bits + 127) << 23;
		
			n.f += bias.f;
			n.i += bias.i;
		}
		
		if (a < 0)
		{
			bias.i = (23-bits + 127) << 23 + 1 << 22;
			
			n.f += bias.f;
			n.i += bias.i;
		}
		
	
		return n.i;
		//n.i is now 123, the integer portion of the original a
	}

	public float FastConversionIntToFloat(int a)
	{
		INTORFLOAT n = new INTORFLOAT(); //floating point number
		n.i = a;                           //some floating point number, say 123.456
		INTORFLOAT bias = new INTORFLOAT(); //magic number
		
		bias.i = (23 + 127) << 23;
		
		n.i += bias.i;
		n.f += bias.f;
		//n.f is now 123.0 the original n.i converted to a float
		
		return n.f;
	}
	
	
	
	
}
