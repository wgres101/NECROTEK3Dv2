package UtilityTypes;

public class TrigFunctions {

	
	
	
	private  static final float FTOBIAS = 12582912.0f; 
	private static final float PI = 3.1459265f;
	
	static float [] table;

	
	public static void genTable()
	{
		for (int i=0;i<256;i++)
		{
			table[i] = (float) Math.sin(i);
		}
	}
	
	
	
	public static float fsin(float theta)
	{	
		int i;
		INTORFLOAT ftmp = new INTORFLOAT();
		ftmp.f = theta*(256.0f/(2.0f*PI)) + FTOBIAS;
		i = ftmp.i & 255;
		return table[i];
		
	}
	
	public static float fcos(float theta)
	{
		int i;
		INTORFLOAT ftmp = new INTORFLOAT();
		ftmp.f = theta * (256.0f/(2.0f*PI)) + FTOBIAS + 64f;
		i = ftmp.i & 255;
		return table[i];
	}
	
	
	
}
