package SchedulingManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
	static CTaskManager taskManager = new CTaskManager();
	static HashMap<CTask, Integer> oftenUsed = new HashMap<CTask, Integer>();
	int current_task_ctr = 0;
	
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
		
		CTask task = pendingTaskList.get(0);
	
		//task is a mapped wrap message within task
		
		//2.Schedule Ready Tasks - assign taks that are readyf or worker threads
		
		// Use a spiffy algorithm here. For now we just pop the top and add it to the priority list
		// Use an MRU or LRU to re-order priority queue
		
		//store often used
		//foreach over the hashmap
		//find MRU and LRU
		
		oftenUsed.put(task, task.count);
		
		
		CTask MRU = new CTask();
		CTask LRU = new CTask();
		
		int smallest_unit = 0;
		int largest_unit = 0;
		
		
		for (Map.Entry<CTask, Integer> entry : oftenUsed.entrySet()) {
		    CTask key = entry.getKey();
		    Integer value = entry.getValue();
		    
		    if (value > largest_unit)
		    {
		    	largest_unit = value;
		    	MRU = key;
		    }
		    
		    if (value < smallest_unit)
		    {
		    	smallest_unit = value;
		    	LRU = key;
		    }
		    
		    
		    //check against value. find largest and smallest values
		    
		}

		//put task into hashmap
		
		oftenUsed.put(task, task.count);
	
		//
		
		//push LRU and MRU to adddToSchedule(task)
		
		CScheduler.addToSchedule(LRU);
		CScheduler.addToSchedule(MRU);
		
		
		removeFinishedTasks();
		//3.Delete executed tasks - delete tasks by checking them for a 'dead' boolean variable

				
		
		//Run Event Manager to broadcast events
		
		
		CEvent event = new CEvent();
		event.task = task;
		event.current_event = EEventMachine.TEST_EVENT_1;
				
		CEventManager.events_q.add(event);
	}
	
	
	public void removeFinishedTasks()
	{
		
		for (CTask task : priorityTaskList)
		{
			if (task.dead == true)
			{
				priorityTaskList.remove(task);
			}
					
			if (task.dead == true)
			{
				oftenUsed.remove(task);
			}
				
					
		}
		
	}

}
