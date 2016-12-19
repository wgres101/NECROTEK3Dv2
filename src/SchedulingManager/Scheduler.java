package SchedulingManager;

import java.awt.List;
import java.util.ArrayList;

import Debugger.DebugManager;
import IDE.Main;
import MessageManagement.Message;

//all functionality goes through the scheduler
//the scheduler will subdivide ticks or time steps, giving certain processes more priority than others

public class Scheduler {

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
		Main.task_manager.
	}
	
	public static Thread requestThreadResource()
	{
		return new Thread();
	}
}
