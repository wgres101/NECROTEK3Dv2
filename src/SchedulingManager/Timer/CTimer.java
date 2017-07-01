package SchedulingManager.Timer;

import java.util.Timer;
import java.util.TimerTask;

//CTimer uses information from the clock object to calculate ticks

public class CTimer  extends TimerTask  {


	Timer t = new Timer(true);

	long start_time;
	long last_time = start_time;

	long current_time;

	long frames_per_tick;

	long ticks_per_second;
	//calculate elapsed time
	//check against fps_forced
	
	long callback_object_type = 0;

	public void scheduleExecution()
	{
		
	}



	public long frameStep()
	{
		///sample time
		long elapsed_time = current_time - last_time;

		if (elapsed_time >= ticks_per_second)
		{
			return ticks_per_second;
		}

		return 0;
	}

	public long init(long frames_per_tick, long ticks_per_second)
	{
		this.frames_per_tick = frames_per_tick;
		this.ticks_per_second = ticks_per_second;

		return 0;
	}

	//instructions for the thread that the timer runs on
	//this should be in the form of tasks or messages, not sure yet
	//use callback_object_type statemachine
	public void run()
	{
		
	}

}

