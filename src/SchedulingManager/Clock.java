package SchedulingManager;

import java.util.Date;

import MessageManagement.Message;
import MessageManagement.MessageManager;

public class Clock implements Runnable {

	float frame_rate;
	Date date = new Date();
	long time = 0;
	
	//called upon creation of CLock Object
	public  void Init(float frame_rate, long time)
	{
		this.frame_rate = frame_rate;
	
	}
	
	
	
	
	//generates new events according to the game clock
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		//while runniing
		//store a value in the class representing the
		//current frame
		//calculated by the system clock
		//and frame_rate
		long oldTime = date.getTime();
		long newTime;
		long time_cum = 0;
		
		while(true)
		{
			newTime = date.getTime();
		     time = oldTime - newTime;
			oldTime = newTime;
			
			time_cum += time;
			
			if (time_cum > frame_rate)
			{
				//surpassed the frame rate
				//fire a frame event
				Message message = new Message();
				//actions that occur at every frame
				message.mflag = Message.EM.EM_FRAME_TICK;
				MessageManager.EnqueueMessage(message);
			}
			else
			{
				//actions that occur at every tick
				Message message = new Message();
				message.mflag = Message.EM.EM_CLOCK_TICK;
				//MessageManager.EnqueueMessage(message);
			}
			
			for (int i=0;i<Scheduler.priorityList.size(); i++)
			{
				//scheduled for messages for events that are
				//not top priority
				Message tempMessage = Scheduler.priorityList.get(i);
				if (time_cum >= tempMessage.frame_rate)
				{
					MessageManager.EnqueueMessage(tempMessage);
				}
				
			}
			
		}
		
	}

	//called upon destruction of clock
	public  void Destroy()
	{
		
	}
	
}
