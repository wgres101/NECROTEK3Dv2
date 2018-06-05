package SchedulingManager;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;

import MessageManagement.Message;
import SchedulingManager.Timer.CTimerManager;

//the purpose of the task manager is to monitor running classes
//the display for this is similar to Windows' task managerf


//Scehduler->TaskManager-->Task--->Event
//Task is a grouping of events



//coordinates task execution (where in this case, the classes it monitors are services?

//Handles the registrationa and organization of taks
//Each task has a standardized interface that contains a calback function for the manager to execute.
//The task manager maintains a list of tasks, along with scheduling informatgion abouti each one
//such as start time, execution frequency, duration, priority, and other required properties.
//

public class CTaskManager extends Thread{

	static Vector<CTask> taskList = new Vector<CTask>();
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true)
		{
			//System.out.println("Running task manager");
			
			//try {
			//	Thread.sleep(1000);
			//} catch (InterruptedException e) {
			//	// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
		}
	}
		
	
	public static Vector<CTask> getCurrentTasks()
	{
		Vector<CTask> list = new Vector<CTask>();
		
		for (CTask m : list)
		{
			taskList.add(m);
		}
		
		return list;
	}
	
	public static boolean isInTaskList(Message message)
	{
		ArrayList<Message> list = new ArrayList<Message>();
		
		for (Message m : list)
		{
			if (m == message)
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static void addToTaskManager(CTask task)
	{
		taskList.add(task);
		CTimerManager.getNewTimer(30, 1);
		
	}
	public static void updateTaskList()
	{
		//LRU and MRU
		//increment time on the task list
		for (CTask task : taskList)
		{
			task.count++;
		}
		
		//perform LRU
		
		for (int i=0;i<taskList.size();i++)
		{
			if (taskList.get(i).count < taskList.get(i+1).count)
			{
				CTask new_task = taskList.get(i);
				taskList.add(new_task);
			}
		}
		
		//perform MRU
		
		for (int i=0;i<taskList.size();i++)
			{
				if (taskList.get(i).count > taskList.get(i+1).count)
				{
					CTask new_task = taskList.get(i);
					taskList.add(new_task);
				}
			}
		
	}
	
/*	
	public removeFinishedTasks()
	{
		
	}
	*/
}
