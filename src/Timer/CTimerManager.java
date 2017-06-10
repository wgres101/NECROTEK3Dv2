package Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import Journaling.CJournal;
import SchedulingManager.UniversalStateMachine;

//manages time
//returns time created, time step, tick tick, etc.
//for example, can create timers using this class
//like in game maker, to initiate an event after x amount of ticks

//Internal time values
	//update all timers dependent on the clock	//gets updated time from timesource
	//updates internal time values (CCLock)
	//update all timers dependent on the clock

public class CTimerManager  implements Runnable
{
	static Vector<CTimer> listOfTimers = new Vector<CTimer>();
	
	public static void init()
	{
		CJournal.Journal(CTimerManager.class, "Created a CTimerManager Object");
		
	}
	
	public static CTimer getNewTimer(long frames_per_tick,long ticks_per_second) 
	{
		CJournal.Journal(CTimerManager.class, "Creating a CTimer Object");
		
		CTimer timer_obj = new CTimer();
		
		timer_obj.frames_per_tick = frames_per_tick;
		
		timer_obj.ticks_per_second = ticks_per_second;        //set priority. Gets 2 runs for every run
		
		Timer timer = new Timer();

		// scheduling the task
		
		TimerTask tasknew = new UniversalStateMachine();
		
		timer.scheduleAtFixedRate(tasknew, new Date(), 100);


		/* timer_obj.t.schedule(new CTimer(), 0, callback_object_type); */ 
		CJournal.Journal(CTimerManager.class, "Timer creation success. Adding CTimer object to internal list Of Timers");
		
		listOfTimers.addElement(timer_obj);
		
		
		return timer_obj;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
		


	
}