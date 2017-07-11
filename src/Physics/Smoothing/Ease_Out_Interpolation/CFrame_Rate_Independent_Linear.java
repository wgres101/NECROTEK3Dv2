package Physics.Smoothing.Ease_Out_Interpolation;

public class CFrame_Rate_Independent_Linear {

	
	/*
	 *  v= (x_f - x_0) / t
	 *  
	 *  x = x_0 + t_f * v
	 * 
	 */
	
	float v;
	float x_f;
	float x_0;
	float x;
	float t;
	float t_f;
	float time_passed;
	float current_time;
	
	public void Setup(float begin, float end, float time)
	{
		x_f = end;
		x_0 = begin;
		t = time;
		
		 
		long time_passed = System.currentTimeMillis( );  
		
	}
	
	public void Interpolate()
	{
		//current velocity
		v = (x_f - x_0) / t;
		
		
		//calculate time passed
		current_time = System.currentTimeMillis( );
		long new_time = (long) (current_time - time_passed);
		time_passed = current_time;
		
		//interpolation l inear
		x = x_0 + new_time * v;
		
		x_0 = x;
	}
	
	public void GetValue()
	{
	}
	
	
	
}
