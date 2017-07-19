package SchedulingManager;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

import MessageManagement.Message;
import MessageManagement.MessageManager;


//clock component keeps track of real time
//the current virtual time and frame count
// 
//CClock is a thread class that maintains frames and current time

public class CClock extends Clock implements Runnable {

	float frame_rate;
	Date date = new Date();
	long time = 0;
	
	//called upon creation of CLock Object
	public  void Init(float frame_rate, long time)
	{
		this.frame_rate = frame_rate;
	
	}
	
	//COMPUTR ONE SENDS ITS STATE TO COMPUTER 2
	//ONLY WHEN COMPUTER 2 ACKNOWLEDGES THIS AND SENDS ITS STATE
	//CAN COMPUTER ONE CONTINUE
	public void sendTokenToRemote() { } //
	
	public void receiveTokenFromRemote() { } //returns this objects token
	
	
	
	
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
				message.mflag = EEventMachine.EM_FRAME_TICK;
<<<<<<< HEAD
				/*CMessagePool.EnqueueMessage(message);*/
=======
				//MessageManager.EnqueueMessage(message);
>>>>>>> branch 'master' of https://ted_gress@bitbucket.org/ted_gress/necrotek3d_v2.git
			}
			else
			{
				//actions that occur at every tick
				Message message = new Message();
				message.mflag = EEventMachine.EM_CLOCK_TICK;
				//MessageManager.EnqueueMessage(message);
			}
			
			for (int i=0;i<CScheduler.priorityTaskList.size(); i++)
			{
				//scheduled for messages for events that are
				//not top priority
				Message temp_message =new  Message();
				temp_message.mflag = EEventMachine.EM_BOOTSTRAP;
				
				
				
				
				
				
				if (time_cum >= temp_message.frame_rate)
				{
<<<<<<< HEAD
					/*CMessagePool.EnqueueMessage(temp_message);*/
=======
					//MessageManager.EnqueueMessage(temp_message);
>>>>>>> branch 'master' of https://ted_gress@bitbucket.org/ted_gress/necrotek3d_v2.git
				}
				
			}
			
		}
		
	}

	//called upon destruction of clock
	public  void Destroy()
	{
		
	}

	@Override
	public ZoneId getZone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instant instant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clock withZone(ZoneId arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
