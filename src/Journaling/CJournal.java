package Journaling;

import java.util.Vector;

import Journaling.Logger.OutputLog;

//Book 3 section 1.17


public class CJournal implements Runnable {

	public static Vector<String> journalHistory = new Vector<String>();
	public static int time_step = 0;

	CJournal()
	{
		time_step = 0;
	}
	
	public static String Journal(Class<? extends Object> class1, String journalMessage)
	{
		System.out.println(time_step + " In Class::" + class1 + " Journal Entry:" + journalMessage);
		String entry = time_step + "In Class::" + class1 + " Journal Entry:" + journalMessage;
		time_step++;
		journalHistory.addElement(entry);
		//OutputLog.addToLog(entry);
		JournalManager.beginJournal();
			//JournalManager.JournalEntry(class1, "", journalMessage);
			JournalManager.endJournal();
			//System.out.println("Placed journal entry");
				
		return entry;
	}
	

	void disableAll()
	{
		//turns off all switches
	}
	
	void printWholeTree()
	{
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
