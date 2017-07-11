package Physics.Smoothing.Ease_Out_Interpolation;


//book 1, 2.1


/*
 *  x = (x_0 * (weight-1) + x_f) / weight 
 * 
 */




public class CFrame_Rate_Dependent_Floating {

	
	
	float x;
	float x_0;
	float weight;
	float x_f;
	
	
	
	public void Setup(float x_start, float x_end, float scale)
	{
		//scale factor how fast interpolation occurs
		x = x_start;
		x_0 = x_start;
		weight = scale;
		x_f =x_end; 
	}
	
	//does the work
	public void Interpolate()
	{
		x =  ((x_0 * (weight-1) + x_f)) / weight;
		x_0 = x;
		
		
	}
	
	public void GetValue()
	{
		//get current interpolated value
		//returns TRUE when you are as close as possible
	}
	
}
