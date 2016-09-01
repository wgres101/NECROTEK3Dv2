package IDE;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Blackboard.GameBlackboard;
import EngineTester.MainGameLoop;
import Factory.WebServiceFactory;
import GameMap.XMLAdapter;
import InspectorPanels.InspectorManager;
import MainGame.Loop;
import MessageManagement.MessageManager;
import RenderEngine.CoreRaster;
import SceneGraph.SceneGraphManager;
import SchedulingManager.Scheduler;


public class Main  extends JFrame   {

	static CoreRaster coreRaster = new CoreRaster();

	static MessageManager messageManager = new MessageManager();
	
	static SceneGraphManager scg = new SceneGraphManager();
	
	static Inspector ins = new Inspector();

	static InspectorManager insm = new InspectorManager();
	
	static Manager manager = new Manager();

	//static UserInterface ui = new UserInterface();
	
	public static UserInterface ui = new UserInterface();
	
	public static GameLogic gameLogic = new GameLogic();
	
	public static Scheduler schedulingManager = new Scheduler();
	
	//COMMON ACROSS CLASSES
	
	static WebServiceFactory wsFactory = new WebServiceFactory();
	
	static GameBlackboard gameBB = new GameBlackboard();
	
	static boolean simulate = false; //set to true to run simulation without rasterization
	

	public static void main(String[] args) {

		Main mainApp = new Main();
		mainApp.initApplication();

		//use the -r flag to load a map and run it
		//without rendering the 3D
		
		
		final Main app = new Main();
		//show what we've done
		SwingUtilities.invokeLater (
				new Runnable() {
					public void run() {
						app.setVisible(true);
					}
				}
				);
		while(true)
		{
			//Main.coreRaster.Update(scg, ins);
		}
	}




	public static void initApplication() {
		
		// TODO Auto-generated method stub
		//topMenu.add(mainDropDown);
		String[] fileMenuStrings = { "Assets", "Game Objects", "Components"};
		//ItemHandler handler = new ItemHandler();
//		
//		TreeDemo();
		
		//INITIALIZE
		
		//load sample map
		
		XMLAdapter adapter = new XMLAdapter();
		
		adapter.adapt();
		
		//three threads:
		//1. UI
		ui.run();
		//2. Game Logic Init	
		gameLogic.run();
		
		//ENTER LOOP
		
	    Loop.loop();
	    
	}	
}