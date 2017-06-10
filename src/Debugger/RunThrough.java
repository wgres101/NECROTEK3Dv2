package Debugger;

import IDE.Main;
import MessageManagement.Message;
import SchedulingManager.CTask;
import SchedulingManager.EEventMachine;

public class RunThrough {

	
	public static void run()
	{
		JournalManager.setJournalEntry(RunThrough.class,"RunThrough beginning initialization");		
		
		Message message = new Message();
		
		message.mflag = EEventMachine.EM_START;
		
		CTask task = new CTask();
		
		

	}
	
	
}
