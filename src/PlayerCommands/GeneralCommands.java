package PlayerCommands;

import GameMap.CHexagonCoordinates;
import Journaling.CJournal;
import Sampler.Main;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

public class GeneralCommands {

	
	
	public static void PlayerMoveTo(int x, int y)
	{
		CJournal.Journal(GeneralCommands.class, "Moving player position to x: " + x + " y: " + y);
		WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();
		player.x = x;
		player.y = y;
		CJournal.Journal(GeneralCommands.class, "New player x is " + player.x  + " y is " + player.y);
		Main.webServiceFactory.StoreFirstPersonCharacterInstance(player);
		
	}
	
}