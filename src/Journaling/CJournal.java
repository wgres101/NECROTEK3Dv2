package Journaling;

import java.util.Vector;

//Book 3 section 1.17


public class CJournal {

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
		
		return entry;
	}
	

	void disableAll()
	{
		//turns off all switches
	}
	
	void printWholeTree()
	{
		
	}
}
