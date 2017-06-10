package Sampler;

import Debugger.DebugManager;
import Debugger.JournalManager;
import Journaling.CJournal;
import MainGame.Loop;
import Timer.CTimerManager;
/*
TODO:
	Finish Debug System and Journaling System
	Finish Memory System
	 

*/


public class Main {

	//The role of this class is to test out all the
	//programmatic systems before graphics are
	//introduced
	
	public static void main(String[] args) {
		System.out.println("Welcome to NecroTek3D");
		
		
		//Launch Profiler, Journal, and Logging Systems
		
			//Launching Journal
			CJournal.Journal(Main.class, "Launching the Journaling ");
		
					
		//Initialize scheduling system
			CJournal.Journal(Main.class, "Launching the scheduling system");
			CTimerManager timerManager = new CTimerManager();
			timerManager.init();
			CJournal.Journal(Main.class, "Begin Timing");
			
			
		//Initialize memory system
			
			
		//Intialize mesaging system
		

		
		//launching xml reader
		//launching scenegraph parser
		//upon launching file, use hotloader to load the resources
		
		

		Loop loop = new Loop();  //hand over to game loop
		
		
		return;
	}
		
} 



