package Shell;

import java.util.Scanner;

import GameMap.CHotLoader;
import PlayerCommands.GeneralCommands;
import Sampler.Main;
import Services.ActorServices.CreateFirstPersonPlayerCharacterService;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

public class Shell {

	static boolean shell_on = true;
	
	public static void Shell()
	{
		while (true && shell_on == true)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a command");
			String s = in.next();
			System.out.println("You entered command "+s);
			
			if (s.contains("move"))
			{
				System.out.println("You have moved to: " );
				String x = in.next();
				System.out.println("X: " + x);
				String y  = in.next();
				System.out.println("Y: " + y);
				
				GeneralCommands.PlayerMoveTo(Integer.parseInt(x), Integer.parseInt(y));
				CHotLoader.HotLoad();
				
			}
			if (s.contains("exit"))
			{
				System.out.println("Exiting shell");
				break;
			}
			
			
			if (s.contains("outputcoords"))
			{
				System.out.println("Current Coordinates: ");
				CHotLoader.OutputPlayerCoords();
			}
			
			if (s.contains("outputhexagon"))
			{
				System.out.println("Current Hexagon: ");
				WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();
				CHotLoader.OutputHexagon(player.hexagon);
			}
				
					
		}
	}
	
}
