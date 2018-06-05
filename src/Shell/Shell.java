package Shell;

import java.util.ArrayList;
import java.util.Scanner;

import DTI.DTIClass;
import GameMap.CHotLoader;
import PlayerCommands.GeneralCommands;
import Sampler.Main;

import WSObjects.Actors.WSFirstPersonPlayerCharacter;

public class Shell extends Thread {

	
	DTIClass dtiClass = new DTIClass("Shell", null);
	
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
				
				//GeneralCommands.PlayerMoveTo(Integer.parseInt(x), Integer.parseInt(y));
				//CHotLoader.HotLoad();
				
			}
			if (s.contains("exit"))
			{
				System.out.println("Exiting shell");
				break;
			}
			
			
			if (s.contains("outputcoords"))
			{
				//System.out.println("Current Coordinates: ");
				//CHotLoader.OutputPlayerCoords();
			}
			
			if (s.contains("outputhexagon"))
			{
				System.out.println("Current Hexagon: ");
				WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();
				
				
				//CHotLoader.OutputHexagon(CHotLoader.coordsOfCurrentMap, "Coords of Current Map outputhexagon command");
				//CHotLoader.OutputHexagon(player.hexagon, "Player Current Hexagon outputhexagon command");
			}
			
			if (s.contains("forcehotload"))
			{
				System.out.println("Forcing HotLoad");
				//GeneralCommands.RunHotLoad();
			}
					
			if (s.contains("factorycoords"))
			{
				System.out.println("Factory Player Coordinates");
				//GeneralCommands.FactoryPlayerCoords();
			}
			if (s.contains("dumpscenegraph"))
			{
				System.out.println("Scene Graph Dump");
				//GeneralCommands.DumpSceneGraph();
			}
			if (s.contains("isinhexagon"))
			{
				System.out.println("PLayer is in Hexagon?");
				//GeneralCommands.IsInCurrentHexagon();
			}
			if (s.contains("profiler"))
			{
				System.out.println("Printing PRofiler Output");
				//GeneralCommands.ShowProfiler();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Shell();
	}
	
}
