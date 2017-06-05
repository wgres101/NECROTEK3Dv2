package SchedulingManager;

import java.awt.List;
import java.util.ArrayList;

import Debugger.DebugManager;
import IDE.Main;
import MessageManagement.Message;

//all functionality goes through the scheduler
//the scheduler will subdivide ticks or time steps, giving certain processes more priority than others


//virtual time scheduler divides time into frames
//tasks are executedd in batches between frames
//

public class Scheduler implements Runnable {

	static ArrayList<Message> priorityList = new ArrayList<Message>();
	
	public static void runScheduler()
	{
		Clock clock = new Clock();
		clock.run();
		
		//schedule events
		DebugManager.Debug("Scheduler", "Running scheduler");
		
	}
	
	public static void addToSchedule(Message message)
	{
		priorityList.add(message);
		Main.task_manager.addToTaskManager(message);
	}
	
	public static Thread requestThreadResource()
	{
		return new Thread();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
