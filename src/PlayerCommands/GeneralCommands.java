package PlayerCommands;

import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

import Debugger.DebugManager;
import Factory.FactoryKeyWrapper;
import Factory.WebServiceFactory;
import GameMap.CHexagonCoordinates;
import GameMap.CHotLoader;
import IDE.MainMerged;
import Journaling.CJournal;
import MessageManagement.PlayerMoveToMessage;
import RealTimeProfiler.CProfiler;
import Sampler.Main;
import SchedulingManager.CTask;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;

public class GeneralCommands {

	

	public static void PlayerMoveTo(int x, int y, int z)
	{
		/*
		CJournal.Journal(GeneralCommands.class, "Moving player position to x: " + x + " y: " + y);
		
		WSFirstPersonPlayerCharacter player = Main.webServiceFactory.retrieveFirstPersonCharacterInstance();
		
		CJournal.Journal(GeneralCommands.class, "New player x is " + player.x  + " y is " + player.y + "z is:" + player.z);
		FactoryKeyWrapper k = new FactoryKeyWrapper("WSFirstPersonPlayerCharacter");
		WebServiceFactory.wsobjectRegistry.put(k, player);
		player.x = 20;
		player.y = 20;
	    
				
		if (player == null)
		{
			DebugManager.Debug(GeneralCommands.class, "Player is null");
		}	
		WebServiceFactory.dump();
		CJournal.Journal(GeneralCommands.class, "Debug player x is " + player.x  + " y is " + player.y);
		CHotLoader.moveto(x, y);
		*/
		CTask task = new CTask();
		PlayerMoveToMessage message = new PlayerMoveToMessage();
		message.MoveTo(x, y, z);
		task.message = message;
		MainMerged.scheduler.addToSchedule(task);
	}
	/*
	public static void RunHotLoad()
	{
		CHotLoader.HotLoad();
	}
	
	public static void FactoryPlayerCoords()
	{
		CHotLoader.FactoryPlayerCoords();
	}
	
	public static void DumpSceneGraph()
	{
		Main.sceneGraph.output();
	}
	
	public static void IsInCurrentHexagon()
	{
		CHotLoader.IsInCurrentHexagon(CHotLoader.current_player_hexagon, CHotLoader.new_player_x, CHotLoader.new_player_y);
	}
	
	public static void ShowProfiler()
	{
		CProfiler.DumpStackContents();
	}
	*/
}