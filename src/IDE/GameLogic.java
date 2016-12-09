package IDE;

import Debugger.DebugManager;


public class GameLogic implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DebugManager.Debug("GameLogic", "DISABLED: maingameloop.maingame");
	    //MainGameLoop.maingame(); // (EngineTester package)
		DebugManager.Debug("GameLogic", "Updating Scene Graph");
		Main.scg.update(); //update scene graph
		DebugManager.Debug("GameLogic", "Updating Message Manager");
		Main.messageManager.Update();
		DebugManager.Debug("GameLogic", "Updating Inspector Manager");
		Main.insm.Update();
		DebugManager.Debug("GameLogic", "Updating Game Scheduler");
		Main.schedulingManager.runScheduler();
		
		
	}

	
}
