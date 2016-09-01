package MainGame;

import IDE.Main;
import IDE.RenderGL;

public class Loop {

	static RenderGL renderGL = new RenderGL();
	
	public static void loop()
	{
		while (true)
		{
			Main.gameLogic.run();
			//renderGL.run();
		}
	}
}
