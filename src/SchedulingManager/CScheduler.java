package SchedulingManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import Debugger.DebugManager;
import RealTimeProfiler.CProfiler;
import SchedulingManager.Timer.ClockTimer.CClock;

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

//
//Grouping
//small tasks should be grouped together and executed as a single batch


//
//Scehduler->TaskManager-->Task--->Event
//

public class CScheduler implements Runnable {

	
	public static Vector<CTask> priorityTaskList = new Vector<CTask>();
	static Vector<CTask> pendingTaskList = new Vector<CTask>();
	static CTaskManager taskManager = new CTaskManager();
	static HashMap<CTask, Integer> oftenUsed = new HashMap<CTask, Integer>();
	int current_task_ctr = 0;
	
	CTask renderingTask = new CTask();
	
	CTask animationTask = new CTask();
	CTask collisionTask = new CTask();
	CTask renderUITask = new CTask();
	CTask getInputTask = new CTask();
	CTask updatePhysicsTask  = new CTask();
	CTask updateAITask = new CTask();
	CTask updateUITask = new CTask();
	CTask updateInspectorTask = new CTask();
	CTask updateSceneGraphTreeTask = new CTask();
	CTask updateLogicLayerTask = new CTask();
	CTask hotloadTask = new CTask();
	CTask saveMeNowTask = new CTask();
	CTask networkHandlerTask = new CTask();
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
		while (true)
		{
			CProfiler.ProfileBegin("Scheduler Loop");
		// TODO Auto-generated method stub
		//System.out.println("Running CScheduler");
		//schedulers bracket of time
		//execute a batch
		
		//Scheduler Slice:
		//1.Register Pending Tasks - pops pending tasks and updates the internally
		CTask task = null;
		if (!pendingTaskList.isEmpty())
		{
			 task = pendingTaskList.get(0);
		}
	
		//task is a mapped wrap message within task
		
		//2.Schedule Ready Tasks - assign taks that are readyf or worker threads
		
		// Use a spiffy algorithm here. For now we just pop the top and add it to the priority list
		// Use an MRU or LRU to re-order priority queue
		
		//store often used
		//foreach over the hashmap
		//find MRU and LRU
		if (task != null)
		{
			oftenUsed.put(task, task.count);
		}
		
		/*
		 * Tasks 
		 * 
		 */
		
		
		
		
		CTask MRU = new CTask();
		CTask LRU = new CTask();
		
		int smallest_unit = 0;
		int largest_unit = 0;
		
		if (!oftenUsed.isEmpty())
		{
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
			}
		}
		    
		    
		    //check against value. find largest and smallest values
		    
		

		//put task into hashmap
		if (!oftenUsed.isEmpty())
		{
			oftenUsed.put(task, task.count);
		}
	
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
			
		
		
		renderingTask.priority = 1;
		addToSchedule(renderingTask);
		animationTask.priority = 1;
		addToSchedule(animationTask);
	
		collisionTask.priority = 2;
		addToSchedule(collisionTask);
		
		;
		renderUITask.priority = 3;
		addToSchedule(renderUITask);
		
		getInputTask.priority = 1;
		addToSchedule(getInputTask);
		
		updatePhysicsTask.priority = 1;
		addToSchedule(updatePhysicsTask);
		
		updateAITask.priority = 2;
		addToSchedule(updateAITask);
		
		updateUITask.priority = 3;
		addToSchedule(updateUITask);
		
		updateInspectorTask.priority = 3;
		addToSchedule(updateInspectorTask);
		
		updateSceneGraphTreeTask.priority = 3;
		addToSchedule(updateSceneGraphTreeTask);
		
		hotloadTask.priority = 1;
		addToSchedule(hotloadTask);
		
		saveMeNowTask.priority = 2;
		addToSchedule(saveMeNowTask);
		
		networkHandlerTask.priority = 1;
		addToSchedule(networkHandlerTask);
		
		
		
		CEventManager.events_q.add(event);
		//try {
		//	Thread.sleep(1000);
		//} catch (InterruptedException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
		CProfiler.ProfileEnd("Scheduler Loop");
		}
	}
	
	
	public static void removeFinishedTasks()
	{
		
		ArrayList<CTask> deadList = new ArrayList<CTask>();
		for (int i=0;i<priorityTaskList.size();i++)
		{
			CTask task = priorityTaskList.firstElement();
			
			if (task.dead == true)
			{
				deadList.add(task);
			}
					
			if (task.dead == true)
			{
				deadList.add(task);
			}
				
					
		}
		for (int i=0;i<deadList.size();i++)
		{
			CTask task = deadList.get(i);
			priorityTaskList.remove(task);
			oftenUsed.remove(task);
		}
		
	}

}
