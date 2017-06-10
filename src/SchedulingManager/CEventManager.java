package SchedulingManager;

import java.util.PriorityQueue;

import SceneGraph.SceneGraphManager;

//event manager is the heart of the scheduler
//each task in the task manager defines
//one or more events it handles
//

//event manager sits in a loop
//watches a real=time clock
//and as son as a target time is reached
//it fires an event


//The event manager handles the sequencing and generation of events
//Since tasks are triggered by events, proper ordering occurs naturally
//


public class CEventManager extends CTask implements Runnable {

	
	static PriorityQueue<CEvent> events_q = new PriorityQueue<CEvent>();
	
	public static void push_events(CEvent events)
	{
		events_q.add(events);
		
			
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true)
		{
			//when reaches a certain time, fires off a message to all functions
			//in the scene graph
			//clock timer calls this function
			
			//process priority queue
			CEvent event = events_q.remove();
			
			//broadcast messages across scene graph
					
			SceneGraphManager.parseMessages(event);
		}
		
		
	}

	
	
	
	
	
	
}
