package SchedulingManager;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;

import MessageManagement.Message;
import Timer.CTimerManager;

//the purpose of the task manager is to monitor running classes
//the display for this is similar to Windows' task managerf


//coordinates task execution (where in this case, the classes it monitors are services?

//Handles the registrationa and organization of taks
//Each task has a standardized interface that contains a calback function for the manager to execute.
//The task manager maintains a list of tasks, along with scheduling informatgion abouti each one
//such as start time, execution frequency, duration, priority, and other required properties.
//

public class CTaskManager {

	static PriorityQueue<CTask> taskList = new PriorityQueue<CTask>();
	
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
/*	
	public removeFinishedTasks()
	{
		
	}
	*/
}
