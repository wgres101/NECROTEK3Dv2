package MathUtils;

public class FixedPoint {

	static long fix_1 = 0;
	
	public static void assignment(int a)
	{
		fix_1 = ((long)a << 8); 
	}
	
	public static void assignment(float a)
	{
		fix_1 = (long)a * 256;
	}
	//addition and subtraction of fixed point numbers works the same as typical
	
	public static FixedPoint multiplication(FixedPoint a, FixedPoint b)
	{
		fix_1 =( a.fix_1 * b.fix_1) >>8;
		FixedPoint c = new FixedPoint();
		c.fix_1 = fix_1;
				
		return c;
	}
	
	public static FixedPoint division(FixedPoint a, FixedPoint b)
	{
		FixedPoint c = new FixedPoint();
		FixedPoint d = new FixedPoint();
		c.fix_1 = 1/b.fix_1;
		d = multiplication(a, c);
	
		return d;
	}
	
}
