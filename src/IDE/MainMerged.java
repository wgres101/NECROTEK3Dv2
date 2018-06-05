package IDE;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.swing.SwingUtilities;

import Blackboard.GameBlackboard;
import BloomFilter.TestBloomFilter;
import DTI.DTIClass;
import Debugger.RunThrough;
import Factory.WebServiceFactory;
import GameMap.CHotLoader;
import GameMap.GameMapManager;
import GameMap.XMLAdapter;
import IDE.InspectorPanels.InspectorManager;
import Input.InputManager;
import Journaling.CJournal;
import Journaling.JournalManager;
import Journaling.Logger.OutputLog;
import Journaling.Profiler.CProfilerManager;
import MainGame.GameInitializeService;
import MainGame.Loop;
import MessageManagement.Message;
import MessageManagement.MessageManager;
import ObjectManagement.ObjectManager;
import RealTimeProfiler.CProfiler;
import Sampler.Main;
import SceneGraph.SceneGraphManager;
import SchedulingManager.CEvent;
import SchedulingManager.CEventManager;
import SchedulingManager.CScheduler;
import SchedulingManager.CTask;
import SchedulingManager.CTaskManager;
import SchedulingManager.EEventMachine;
import SchedulingManager.PushToScheduler.PublishingManager;
import SchedulingManager.Timer.CTimer;
import SchedulingManager.Timer.CTimerManager;
import SchedulingManager.Timer.ClockTimer.CClock;
import Shell.Shell;

public class MainMerged {

	// The role of this class is to test out all the
	// programmatic systems before graphics are
	// introduced

	public static MessageManager messageManager = new MessageManager();
	public static SceneGraphManager sceneGraph = new SceneGraphManager();
	public static WebServiceFactory webServiceFactory = new WebServiceFactory();
	public static GameBlackboard gameBlackBoard = new GameBlackboard();
	public static XMLAdapter xmlAdapter = new XMLAdapter();
	public static ObjectManager objManager = new ObjectManager();
	public static ThreadFactory threadFactory;
	public static CEventManager eventManager = new CEventManager();
	public static PublishingManager publishManager = new PublishingManager();
	public static CScheduler scheduler = new CScheduler();
	public static CTaskManager taskManager = new CTaskManager();
	// public static Profiler profiler = new Profiler();
	public static DTIClass dtiClass = new DTIClass("Main", null);

	public static OutputLog log = new OutputLog();

	// UI classes
	public static Inspector ins = new Inspector();
	public static InspectorManager insm = new InspectorManager();
	public static Manager manager = new Manager();
	public static UserInterface ui = new UserInterface();
	public static GameLogic gameLogic = new GameLogic();
	static boolean simulate = false; // set to true to run simulation without rasterization
	static RunThrough runThrough = new RunThrough();
	public static InputHandler inputHandler = new InputHandler();
	public static InputManager inputManager = new InputManager();

	//

	// clock object
	public static CClock clock = new CClock();

	public static CProfiler profiler = new CProfiler();

	public static JournalManager journal = new JournalManager();
	
	public static Shell shell = new Shell();
	

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Welcome to NecroTek3D");

		// initialize journaling system
		JournalManager journaling = new JournalManager();
		Thread journalingThread = new Thread(journaling);
		journalingThread.start();

		JournalManager.InitJournal(JournalManager.file);
		JournalManager.beginJournal();

		Thread t0 = new Thread(log);
		t0.start();

		
		// Launch Profiler, Journal, and Logging Systems
		Thread m = new Thread(profiler);
		m.start();
		CProfiler.ProfileBegin("Main Merged");

		// Launching Journal
		CJournal.Journal(Main.class, "Launching the Journaling ");

		Thread j = new  Thread(journal);
		j.start();
		
		// initializing clock system
		JournalManager.JournalEntry(MainMerged.class, "main", "Launching clock timer thread");
		Thread c = new Thread(clock);
		c.start();

		// Initialize scheduling system
		CJournal.Journal(Main.class, "Launching the scheduling system");
		CTimerManager.init();
		CJournal.Journal(Main.class, "Begin Timing. Testing Timer Unit");

		// Initialize a dummy timer
		CTimer dummy_timer = CTimerManager.getNewTimer(30, 2);

		// Create a test message

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

		// Initialize memory system

		/*
		 * CJournal.Journal(Main.class, "Testing Memory System");
		 * 
		 * CJournal.Journal(Main.class, "Establishing memory pool");
		 * 
		 * objManager.InitPool();
		 * 
		 * CJournal.Journal(Main.class, "Attempting memory request: Dummy string object"
		 * );
		 * 
		 * String stringObject = (String) ObjectManager.requestObjectOfClass(String);
		 * 
		 * //System.out.println(stringObject);
		 * 
		 * CJournal.Journal(Main.class,
		 * "Attempting integer memory request. Dummy integer objects");
		 * 
		 * Integer intObject = (Integer) ObjectManager.requestObjectOfClass();
		 * 
		 * //test formula
		 * 
		 * int a = 0; int b = 1; int c = intObject.intValue(); c = a + b;
		 * 
		 * CJournal.Journal(Main.class, "Dumy keycode for memory. Value is " + c +
		 * "should add to 1");
		 * 
		 */

		// Initialize Thread Pooling Thread System?
		threadFactory = Executors.defaultThreadFactory();

		// initialize message manager
		CJournal.Journal(Main.class, "Initializing message manager");
		// MessageManager messageManager = new MessageManager();

		messageManager.start();

		// send bootstrap message
		CJournal.Journal(Main.class, "Testing messanger: sending bootstrapping message to messagemanager");
		Message boot_strap_message = new Message();
		boot_strap_message.mflag = EEventMachine.EM_BOOTSTRAP;
		messageManager.EnqueueMessage(boot_strap_message);

		// initializing Scene Graph (need to perform a test, declared above)
		/*
		 * CJournal.Journal(Main.class, "Testing Scene Graph"); SceneGraphNode sgn = new
		 * SceneGraphNode(); SceneGraphManager.add(sgn, SceneGraphManager.root);
		 */
		sceneGraph.start();

		// initialziing inspector (have to rewrite)

		// initializing inspector manager (have to rewrite)

		// initializing user interface (have to rewrite)

		// initializizng web service factory

		CJournal.Journal(Main.class, "Initialzing web service factory...");

		webServiceFactory.start();

		// initializing black board

		CJournal.Journal(Main.class, "Initialzing game black board...");

		gameBlackBoard.start();

		// launching xml reader
		// xmlAdapter.adapt("demo.xml");

		// launch xml reader demo

		GameInitializeService.initializeService();

		// !!!upon launching file, use hotloader to load the resources - use
		// XMLSceneLoader to get objects and add to scenegraph
		// load xml hexagon, start spawning position
		// load fringe using hotloader

		// initializing hot loader

		//CJournal.Journal(Main.class, "Initialzing hot loader...");

		//CHotLoader.InitHotLoader();

		//GameMapManager.LoadIndices();

		// initailizing input handler (have to rewrite)

		// Dumping Scene Graph Info
		CJournal.Journal(Main.class, "Dumping scene graph output (loaded from XMLAdapter)");
		SceneGraphManager.output();

		/// starting event manager
		Thread t1 = new Thread(eventManager);
		t1.start();

		// starting scheduler
		Thread t2 = new Thread(scheduler);
		t2.start();

		/// running publish manager
		publishManager.start();

		/// initializing task manager
		taskManager.start();

		// Launch profiler
		// Profiler.ProfileInit();
		;

		CProfiler.ProfileEnd("Main Merged");

		JournalManager.JournalEntry(MainMerged.class, "main", "Preparing Game Loop");

		JournalManager.endJournal();
		JournalManager.JournalToFile();
		
		
		
		// 2. Game Logic Init
		gameLogic.run();


		
		// testing main game loop
		CJournal.Journal(Main.class, "Testing main game loop");
		Loop loop = new Loop(); // hand over to game loop
		loop.start();

		JournalManager.JournalEntry(MainMerged.class, "main", "Preparing user interface");

		//shell thread
	
		
				// runThrough.run();

		// test bloom filter

		TestBloomFilter.testBloomFilter(5, 7, 8);

		

		final MainMerged app = new MainMerged();
		
		//Thread u = new Thread(ui);
		//u.start();
		
		Thread s = new Thread(shell);
		s.start();
		
		// show what we've done
		//SwingUtilities.invokeLater(new Runnable() {
		//	public void run() {
		//		app.setVisible(true);
		//	}
		//});
		//SwingUtilities.invokeLater(ui);
		//try {
		//	SwingUtilities.invokeAndWait(ui);
		//} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

		return;
	}

}
