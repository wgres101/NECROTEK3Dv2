package RealTimeProfiler;

import java.util.Random;

public class CProfile {

	double startTime;
	double endTime;
	String name;
	
	double min;   //minimum time spent per frame 
	double max;  //maximum time spent per frame 
	double ave;  //average time spent per frame 
	
	
	double minPerc;
	double maxPerc;
	double avePerc;
	
	double frameTime;
	
	double time_spent = 0;
	
	double time_frame_ratio = 0;
	
	double accumulator = 0;
	
	int numberOfInstances = 0;
	
	double ID = 0;
	
	public CProfile()
	{
		Random rand = new Random(System.currentTimeMillis());
		
		ID = rand.nextDouble();
		
	}
	
	public double getID()
	{	
		return ID;
	}
	
	public state profile_state = state.PROFILE_NULL;
	
	public enum state { PROFILE_NULL, PROFILE_BEGIN, PROFILE_END, PROFILE_COMPLETE } 
}
