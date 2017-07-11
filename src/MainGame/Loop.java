package MainGame;

import IDE.Main;
import IDE.RenderGL;
import Journaling.CJournal;

public class Loop extends Thread {

	static RenderGL renderGL = new RenderGL();
	
	
	boolean loop_running = false;
	
	@Override
	public  void run() 
	{
		CJournal.Journal(Loop.class, "Loop Thread is running.");
		//fire initialize event
		//fire erase object event
		
		while (true)
		{
			if (loop_running == false)
			{
				CJournal.Journal(Loop.class, "Main Game Loop is Running");
				loop_running = true;
			}
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
