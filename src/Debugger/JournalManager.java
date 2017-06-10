package Debugger;

import MessageManagement.Message;
import SchedulingManager.CScheduler;

public class JournalManager {

	
	
	
	public static void setJournalEntry(Object o, String customMessage)
	{
		
		DebugManager.Debug(o.getClass(), customMessage);
	
	}	
	
	
}
