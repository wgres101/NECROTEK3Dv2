package MainGame;

import GameMap.CHotLoader;
import IDE.Main;
import IDE.RenderGL;
import Journaling.CJournal;
import Journaling.JournalManager;
import RealTimeProfiler.CProfile;
import RealTimeProfiler.CProfiler;
import SchedulingManager.Timer.ClockTimer.CClock;
import Shell.Shell;

public class Loop extends Thread {

	static RenderGL renderGL = new RenderGL();
	

	boolean loop_running = false;
	
	@Override
	public  void run() 
	{
		//CJournal.Journal(Loop.class, "Loop Thread is running.");
		//fire initialize event
		
		//fire erase object event
		//
		while(true)
		{
		
			JournalManager.beginJournal();
			CClock.FrameStep(); //begin frame counter for clock

			try {
				JournalManager.JournalEntry(Loop.class, "run()", "Start of while(true)");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			CProfiler.beginFrame = System.nanoTime();
				CProfiler.ProfileBegin("Main Loop");
				
				try {
					JournalManager.JournalEntry(Loop.class, "run", "Main Game Loop is Running");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				loop_running = true;
				
				CProfiler.ProfileEnd("Main Loop");

				CProfiler.endFrame = System.nanoTime();
				
				CProfiler.Calculate();
				CProfiler.Percentages();
				
				try {
					JournalManager.JournalEntry(Loop.class, "run()", "Test Journal Manager");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Shell.Shell();
				
				
				
				//end profiler frame time
			//}
			
			
			
			JournalManager.endJournal();
			
			
		
			// this is java ide code -> Main.gameLogic.run();
			//each of the following run in a loop on t heir own thread
			//renderGL.run();
			//get local input
			//get remote input
			//animation
			//collsion
			//render
			//
		}
		
		
		
	}
	
	
}
