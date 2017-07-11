package Physics.Smoothing.Ease_Out_Interpolation;


//works well with fixed point math
// x = (x_0 * 7 + x_f) >> 3


public class CFrame_Rate_Dependent_Integer {

	
	int x;
	int x_0;
	int x_f;
	int n;
	
	//shift factor should be 3
	
	public void Setup(int start, int end, int shift_factor)
	{
		x = start;
		x_0 = start;
		x_f = end;
		n = shift_factor;
		
	}
	
	public void Interpolate()
	{
		x = (x_0 * 7 + x_f) >> n;
		x_0 = x;
	}
	
	public void GetValue()
	{
		//get current interpolated value
		//returns TRUE when you are as close as possible
	}
	
}
