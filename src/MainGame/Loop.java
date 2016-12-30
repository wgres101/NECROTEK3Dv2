package MainGame;

import IDE.Main;
import IDE.RenderGL;

public class Loop {

	static RenderGL renderGL = new RenderGL();
	
	public static void loop()
	{
		
		//fire initialize event
		//fire erase object event
		
		while (true)
		{
			Main.gameLogic.run();
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
