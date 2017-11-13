package Sampler;

import Blackboard.GameBlackboard;
import Factory.WebServiceFactory;
import GameMap.GameMapManager;
import GameMap.XMLAdapter;
import Journaling.CJournal;
import MainGame.Loop;
import MessageManagement.Message;
import MessageManagement.MessageManager;
import ObjectManagement.ObjectManager;
import ObjectManagement.Pool;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;
import SchedulingManager.CEvent;
import SchedulingManager.CEventManager;
import SchedulingManager.CScheduler;
import SchedulingManager.CTask;
import SchedulingManager.CTaskManager;
import SchedulingManager.EEventMachine;
import SchedulingManager.Timer.CTimer;
import SchedulingManager.Timer.CTimerManager;


public class Main {

	//The role of this class is to test out all the
	//programmatic systems before graphics are
	//introduced
	
	public static MessageManager messageManager = new MessageManager();
	public static SceneGraphManager sceneGraph = new SceneGraphManager();
	public static WebServiceFactory webServiceFactory = new WebServiceFactory();
	public static GameBlackboard gameBlackBoard = new GameBlackboard();
	public static XMLAdapter xmlAdapter = new XMLAdapter();
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to NecroTek3D");
		
		
		//Launch Profiler, Journal, and Logging Systems
		
			//Launching Journal
			CJournal.Journal(Main.class, "Launching the Journaling ");
		
					
		//Initialize scheduling system
			CJournal.Journal(Main.class, "Launching the scheduling system");
			CTimerManager.init();
			CJournal.Journal(Main.class, "Begin Timing. Testing Timer Unit");
			
			//Initialize a dummy timer
			CTimer dummy_timer = CTimerManager.getNewTimer(30, 2);
			
			//Create a test message
			
			Message message = new Message();
			message.mflag = EEventMachine.TEST_EVENT_1;
			
			CJournal.Journal(Main.class, "Testing messaging system " + message.mflag.toString());
			CJournal.Journal(Main.class, "Set message.mflag to " + message.mflag.toString());
			

			CJournal.Journal(Main.class, "Testing Task Manager");
			
			
			CTask task = new CTask();
			task.message = message;
			
			CJournal.Journal(Main.class, "Set task message to dummy message");
			
			CJournal.Journal(Main.class, "Testing Scheduler");
			
			
			CScheduler.addToSchedule(task);
			
			
			CEvent event = new CEvent();
			
			CJournal.Journal(Main.class, "Testing Event Manager");
			CJournal.Journal(Main.class, "Created dummy CEvent. Pushing to event manager.");
			
			CEventManager.push_events(event);
			
			
		//Initialize memory system
			/*
			
			CJournal.Journal(Main.class, "Testing Memory System");
			
			CJournal.Journal(Main.class, "Establishing memory pool");
			
			Pool.InitPool();
			
			CJournal.Journal(Main.class, "Attempting memory request: Dummy string object" );
			
			String stringObject = (String) ObjectManager.requestObjectOfClass();
			
			System.out.println(stringObject);
			
			CJournal.Journal(Main.class, "Attempting integer memory request. Dummy integer objects");
			
			Integer intObject = (Integer) ObjectManager.requestObjectOfClass();
			
			//test formula
			
			int a = 0;
			int b = 1;
			int c = intObject.intValue();
			c = a + b; 
			
			CJournal.Journal(Main.class, "Dumy keycode for memory. Value is " + c + "should add to 1");
			
			*/
			
		
		//!!!Initialize Thread Pooling Thread System?
			
	
		
		//initialize message manager
		CJournal.Journal(Main.class, "Initializing message manager");
		//MessageManager messageManager = new MessageManager();
		
		messageManager.start();
		
				
		//send bootstrap message
		CJournal.Journal(Main.class, "Testing messanger: sending bootstrapping message to messagemanager");
		Message boot_strap_message = new Message();
		boot_strap_message.mflag = EEventMachine.EM_BOOTSTRAP;
		messageManager.EnqueueMessage(boot_strap_message);

		
		
		//initializing Scene Graph (need to perform a test, declared above)
		CJournal.Journal(Main.class, "Testing Scene Graph");
		SceneGraphNode sgn = new SceneGraphNode();
		SceneGraphManager.add(sgn, SceneGraphManager.root);

		sceneGraph.start();
		
		
		
		//initialziing inspector (have to rewrite)
		
		
		//initializing inspector manager (have to rewrite)
		
		//initializing user interface (have to rewrite)
		
		//initializizng web service factory
		
		webServiceFactory.start();
		
		//initializing black board
		
		gameBlackBoard.start();
		
		//launching xml reader
		xmlAdapter.adapt("demo.xml");
		
		//launch xml reader demo
		
		
		
		//!!!upon launching file, use hotloader to load the resources - use XMLSceneLoader to get objects and add to scenegraph
		//load xml hexagon, start spawning position
		//load fringe using hotloader
		
		GameMapManager.LoadIndices();
		
		
		//initailizing input handler (have to rewrite)
		
		//Dumping Scene Graph Info
		CJournal.Journal(Main.class, "Dumping scene graph output (loaded from XMLAdapter)");
		SceneGraphManager.output();
		
		//testing main game loop
		CJournal.Journal(Main.class, "Testing main game loop");
		Loop loop = new Loop();  //hand over to game loop
		loop.start();
		
		return;
	}
		
} 



