package SceneGraph;



/* The scenegraph contains octrees for rendering, collision detection, 
 * It also contains matrix transformations for object to world projection,
 * and contains static and dynamic objects, particle systems,
 * and animations for dynamic objects, including Inverse Kinematics
 */








import Debugger.DebugManager;
import Factory.WebServiceFactory;
import GameMap.XMLAdapter;
import Journaling.CJournal;
import SchedulingManager.CEvent;
import SchedulingManager.EEventMachine;
import Services.CharacterServices.FirstPersonCharacterService;


public class SceneGraphManager extends Thread {


	public static SceneGraphNode root = new SceneGraphNode(); //root of document in node form
	
	boolean started = false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (started == false)
		{
			CJournal.Journal(SceneGraphManager.class, "Scene Graph Manager Thread Working Properly");
			started = true;
			
		}
	}
	
	
	public static void add(SceneGraphNode node, SceneGraphNode parent)
	{
		//add node to parent
		//adds a node to the grpah
		if (node != null && node.xmlData != null)
		{
			CJournal.Journal(SceneGraphManager.class, "Scene Graph Manager: Testing add function for node (xmldata): " + node.xmlData.getName());
		}
		
		else if (node.xmlData == null)
		{
			CJournal.Journal(SceneGraphManager.class, "Scene Graph Manager: Testing add function for nodexmlData is null ");
		}
		
		else if (node == null)	
		{
			CJournal.Journal(SceneGraphManager.class, "Scene Graph Manager: Testing add function for node, node or xmlData is null ");
		}
		//find parent, if no parent then add to root
		if (root == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "Root is null");
		}
		else if (root.children == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "Children is null");
		}
		if (node == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "SceneGraphManager node is null");
		}
		
		if (parent == root)
		{
		
			//CJournal.Journal(SceneGraphManager.class, "Adding node " + node.xmlData.getName() + ", parent is root");
			root.children.add(node);
		}
		else
		{
			if (root.children.contains(parent))
			{
				parent.children.add(node);
			}
			
			else
			{
				root.children.add(parent);
				parent.children.add(node);
			}
		}
		
			
		/*
		for (SceneGraphNode sgn : root.children)
		{
			if (sgn != null && sgn.children != null && node != null && node.xmlData != null && parent.xmlData != null)
			{
				sgn.children.add(node);
				CJournal.Journal(SceneGraphManager.class, "Adding node, sgn==parent");
				CJournal.Journal(SceneGraphManager.class, "New node: " + node.xmlData.getName());
				CJournal.Journal(SceneGraphManager.class, "SGN parent node is " + parent.xmlData.getName());
			}
			
			else
			{
				
			}
		}\
		*/
		
	}
		
	
	
	
	public static void update(CEvent event)
	{
		//traverse scene graph calling update function
	}
	
	public static void parseMessages(CEvent event)
	{
		//parse messagefs distributed by message manager
		if (event.current_event == EEventMachine.EM_UPDATE)
		{
			root.Update();
		}
		if (event.current_event == EEventMachine.EM_INITIALIZE)
		{
			root.Init();
		}
		if (event.current_event == EEventMachine.EM_COLLISION)
		{
			root.Collision();
		}
		if (event.current_event == EEventMachine.EM_INSPECTOR_PANEL_UPDATE)
		{
			root.UpdateInspector();
		}
		if (event.current_event == EEventMachine.EM_UI_THREAD)
		{
			root.UpdateUI();
		}
		if (event.current_event == EEventMachine.EM_UPDATE_ANIMATIONS)
		{
			root.UpdateAnimations();
		}
		if (event.current_event == EEventMachine.EM_UPDATE_PHYSICS)
		{
			root.UpdatePhysics();
		}
		
		if (event.current_event == EEventMachine.EM_UPDATE_AI)
		{
			root.UpdateAI();
		}
		
		if (event.current_event == EEventMachine.EM_DRAW)
		{
			root.Render();
		}
		
//		if (event.current_event == EEventMachine.EM_USERINPUT)
//		{
//			root.UserInput();
//		}
		
	}
	
	public static void output()
	{
		CJournal.Journal(SceneGraphManager.class, "Test Output of Scene Graph");
		
		//find parent, if no parent then add to root
		if (root == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "Root is null - output");
		}
		else if (root.children == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "Children is null - output");
		}
		CJournal.Journal(SceneGraphManager.class, "There are " + root.children.size() + "children of root");
		CJournal.Journal(SceneGraphManager.class, "Root element is: " + root.xmlData.getName());
		for (SceneGraphNode sgn : root.children)
		{
			if (sgn.xmlData == null)
			{
				DebugManager.Debug(SceneGraphManager.class, "SceneGraphNode sgn xmlData is null");
			}
			else {
			System.out.println("**Element Name " + sgn.xmlData.getName() + "***");
			}
			//recursive_output(sgn);
			
		}
		
	}
	
	public static void recursive_output(SceneGraphNode search)
	{
		
		//find parent, if no parent then add to root
		if (search == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "Search is null - output");
			return;
		}
		
		if (search.children == null)
		{
			DebugManager.Debug(SceneGraphManager.class, "Children is null - output");
			return;
		}
		for (SceneGraphNode sgn : search.children)
		{
			
			if (sgn.xmlData == null)
			{
				DebugManager.Debug(SceneGraphManager.class, "R SceneGraphNode sgn xmlData is null");
			}
			else {
				System.out.println("***R Element Name " + sgn.xmlData.getName() + "***");	
			}
			
			
			
		}
		recursive_output(search);
		
		return;
				
	}
	
	
	
}
