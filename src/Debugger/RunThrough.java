package Debugger;

import IDE.Main;
import MessageManagement.Message;

public class RunThrough {

	
	public static void run()
	{
		JournalManager.setJournalEtry(RunThrough.class,"RunThrough beginning initialization");		
		
		Message message = new Message();
		
		message.mflag = Message.EM.EM_START;
		
		Main.schedulingManager.addToSchedule(message);
		
	}
	
	
}
