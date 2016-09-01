package SchedulingManager;

import java.awt.List;
import java.util.ArrayList;

import Debugger.DebugManager;
import MessageManagement.Message;

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
	}
	
	public static Thread requestThreadResource()
	{
		return new Thread();
	}
}
