package Sampler;

import Journaling.CJournal;
import MainGame.Loop;
import MessageManagement.Message;
import SchedulingManager.CEvent;
import SchedulingManager.CEventManager;
import SchedulingManager.CScheduler;
import SchedulingManager.CTask;
import SchedulingManager.CTaskManager;
import SchedulingManager.EEventMachine;
import Timer.CTimer;
import Timer.CTimerManager;
/*
TODO:
	Finish Debug System and Journaling System
	Finish Memory System
	 

*/


public class Main {

	//The role of this class is to test out all the
	//programmatic systems before graphics are
	//introduced
	
	public static void main(String[] args) {
		System.out.println("Welcome to NecroTek3D");
		
		
		//Launch Profiler, Journal, and Logging Systems
		
			//Launching Journal
			CJournal.Journal(Main.class, "Launching the Journaling ");
		
					
		//Initialize scheduling system
			CJournal.Journal(Main.class, "Launching the scheduling system");
			CTimerManager.init();
			CJournal.Journal(Main.class, "Begin Timing");
			
			//Initialize a dummy timer
			CTimer dummy_timer = CTimerManager.getNewTimer(30, 2);
			
			//Create a test message
			
			Message message = new Message();
			message.mflag = EEventMachine.TEST_EVENT_1;
			
			CJournal.Journal(Main.class, "Set message.mflag to " + message.mflag.toString());
			
			CTask task = new CTask();
			task.message = message;
			
			CJournal.Journal(Main.class, "Set task message to dummy message");
			
			CScheduler.addToSchedule(task);
			
			CEvent event = new CEvent();
			
			CJournal.Journal(Main.class, "Created dummy CEvent. Pushing to event manager.");
			
			CEventManager.push_events(event);
			
			
			
			
		//Initialize memory system
			
		
		//Initialize Thread Pooling Thread System?
			
			
		//Intialize messaging system
		

		
		//launching xml reader
		//launching scenegraph parser
		//upon launching file, use hotloader to load the resources
		
		

		Loop loop = new Loop();  //hand over to game loop
		
		
		return;
	}
		
} 



