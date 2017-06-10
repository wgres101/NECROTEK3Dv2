package Smoothing;

public class CSpringSmoothing {

	
	//time delta is the time step between updates
	//of the specified code in seconds
	/*
	public static float SmoothCD(float from, float to, float vel, float smoothTime)
	{
		float omega = 2.f/smoothTime;
		float x = omega*timeDelta;
		float exp = 1.f/(1.f+x+0.48f*x*x+0.235f*x*x*x);
		float change = from - to;
		float temp = (vel+omega*change)*timeDelta;
		vel = (vel - omega*temp)*exp; //equation 5
		return to + (change+temp)*exp; //equation 4
	}
	*/
	
}
