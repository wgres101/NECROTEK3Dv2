package TaskManager;

import java.util.ArrayList;
import java.util.PriorityQueue;

import MessageManagement.Message;

//the purpose of the task manager is to monitor running classes
//the display for this is similar to Windows' task managerf


//coordinates task execution (where in this case, the classes it monitors are services?

public class CTaskManager {

	static PriorityQueue<Message> taskList = new PriorityQueue<Message>();
	
	ArrayList<Message> getCurrentTasks()
	{
		ArrayList<Message> list = new ArrayList<Message>();
		
		for (Message m : list)
		{
			taskList.add(m);
		}
		
		return list;
	}
	
	public boolean isInTaskList(Message message)
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
	
	public void addToTaskManager(Message message)
	{
		taskList.add(message);
	}
	
	
}
