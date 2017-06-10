package SchedulingManager;

import java.util.Vector;

import Debugger.DebugManager;

//all functionality goes through the scheduler
//the scheduler will subdivide ticks or time steps, giving certain processes more priority than others


//virtual time scheduler divides time into frames
//tasks are executedd in batches between frames
//

//Scheduler is responsible for assigning tasks to worker threads
//

//Scheduler Slice:
//1.Register Pending Tasks - pops pending tasks and updates the internally
//2.Schedule Ready Tasks - assign taks that are readyf or worker threads
//3.Delete executed tasks - delete tasks by calling ONExecuted on them

public class CScheduler implements Runnable {

	
	static Vector<CTask> priorityTaskList = new Vector<CTask>();
	static Vector<CTask> pendingTaskList = new Vector<CTask>();
	
	
	public static void runScheduler()
	{
		//Run CClock object
		CClock clock = new CClock();
		clock.run();
		
		//schedule events
		DebugManager.Debug("Scheduler", "Running scheduler");
		
	}
	
	public static void addToSchedule(CTask task)
	{
		priorityTaskList.add(task);
		CTaskManager.addToTaskManager(task);
	}
	
	/*public static Thread requestThreadResource()
	{
		return new Thread();
	}
*/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//schedulers bracket of time
		//execute a batch
		
		//Scheduler Slice:
		//1.Register Pending Tasks - pops pending tasks and updates the internally
		
		CTask task = pendingTaskList.firstElement();
	
		//task is a mapped wrap message within task
		
		//2.Schedule Ready Tasks - assign taks that are readyf or worker threads
		
		// Use a spiffy algorithm here. For now we just pop the top and add it to the priority list 
		
		CScheduler.addToSchedule(task);
		
		//3.Delete executed tasks - delete tasks by calling ONExecuted on them

		//?CTaskManager.removeFinishedTasks();
		
		
		
		
		
		//Run Event Manager to broadcast events
		
		
		CEvent event = new CEvent();
		event.task = task;
		event.current_event = EEventMachine.TEST_EVENT_1;
				
		CEventManager.events_q.add(event);
	}
}
