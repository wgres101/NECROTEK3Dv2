package SchedulingManager.Timer.ClockTimer;

import IDE.MainMerged;
import MessageManagement.Message;
import SchedulingManager.CScheduler;
import SchedulingManager.CTask;
import SchedulingManager.EEventMachine;

public class CClock extends Thread {

	
	
	//Internal time values
	//update all timers dependent on the clock	//gets updated time from timesource
	//updates internal time values
	//update all timers dependent on the clock
	
	final double max_frame_rate = 10;
	double frame_rate = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		while (true)
		{
		
		
			double time_cum = timeStep - timeStepLast;
			if (time_cum > max_frame_rate)
			{
				//surpassed the frame rate
				//fire a frame event
				Message message = new Message();
			//	actions that occur at every frame
				message.mflag = EEventMachine.EM_FRAME_TICK;
				//MessageManager.EnqueueMessage(message);
				CTask task = new CTask();
				task.message = message;
				MainMerged.scheduler.addToSchedule(task);
			}
			else
			{
				//actions that occur at every tick
				Message message = new Message();
				message.mflag = EEventMachine.EM_CLOCK_TICK;
				CTask task = new CTask();
				task.message = message;
				MainMerged.scheduler.addToSchedule(task);
				//MessageManager.EnqueueMessage(message);
			}
			
			for (int i=0;i<CScheduler.priorityTaskList.size(); i++)
			{
				//scheduled for messages for events that are
				//not top priority
				Message temp_message =new  Message();
				temp_message.mflag = EEventMachine.EM_LOW_PRIORIATY;
				CTask task = new CTask();
				task.message= temp_message;
				MainMerged.scheduler.addToSchedule(task);
			}
			if (time_cum < max_frame_rate)
			{
				//send to scheduler. we are lagging
				Message temp_message = new Message();
				temp_message.mflag = EEventMachine.EM_LAGGING;
				CTask task = new CTask();
				task.message = temp_message;
				MainMerged.scheduler.addToSchedule(task);
			}
		}
				
		
	}

	public static double timeStep = 0;
	public static double timeStepLast = 0;
	
	
	
	
	public static void FrameStep()
	{
		timeStepLast = timeStep;
		timeStep = System.nanoTime(); 
		
		
	}
	
	public void tick()
	{
		
	}
	
	


}
