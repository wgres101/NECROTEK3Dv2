package Blackboard;

import Factory.WebServiceFactory;
import Journaling.CJournal;

//The game blackboard holds "global" variable information


public class GameBlackboard extends Thread {

	
	
	
	boolean started = false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (started == false)
		{
			CJournal.Journal(WebServiceFactory.class, "Game Black Board Running Properly");
			started = true;
		}
	}

	
	
	public static void Init()
	{
		
	}
	
	public static void registerVariable(String varName, Object varValue) {}
	
	public static Object getVariable(String varName) { return null; }
	
	
}
