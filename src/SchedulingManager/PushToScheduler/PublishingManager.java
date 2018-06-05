package SchedulingManager.PushToScheduler;

import Factory.WebServiceFactory;
import Journaling.CJournal;
import SchedulingManager.CEvent;
import SchedulingManager.CEventManager;
import SchedulingManager.CTask;
import SchedulingManager.EEventMachine;
import SchedulingManager.Timer.CTimer;

public class PublishingManager extends Thread {

	//publishes messages to the scheduler to schedule
	
	
	//Render()
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean started = false;
		if (started == false)
		{
			CJournal.Journal(WebServiceFactory.class, "Publishing Manager Running");
			started = true;
			while(true)
			{
				publishMessageToScheduler();
			}
		}
	}
	
	public static void publishMessageToScheduler()
	{
		CJournal.Journal(PublishingManager.class, "Running Publish Messager");
		CTimer timer= new CTimer();
		
		timer.init(30, 1);
		
		while(timer.frameStep() <= 0)
		{
			CEvent event = new CEvent();
			event.current_event = EEventMachine.EM_UPDATE;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_INITIALIZE;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_COLLISION;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_INSPECTOR_PANEL_UPDATE;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_UI_THREAD;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_UPDATE_ANIMATIONS;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_UPDATE_PHYSICS;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_UPDATE_AI;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_DRAW;
			CEventManager.push_events(event);
			event.current_event = EEventMachine.EM_USERINPUT;
			CEventManager.push_events(event);
						
		}
	}
	
	
	
}
