package Debugger;

import MessageManagement.Message;
import SchedulingManager.Scheduler;

public class JournalManager {

	
	
	
	public static void setJournalEtry(Object o, String customMessage)
	{
		
		DebugManager.Debug(o.getClass(), customMessage);
		
		Message message = new Message();
		
		message.mflag = Message.EM.EM_BOOTSTRAP;
		
		Scheduler.addToSchedule(message);
	}	
	
	
}
