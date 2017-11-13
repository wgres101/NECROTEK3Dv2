package SceneGraph;

import Debugger.DebugManager;
import Factory.WebServiceFactory;
import GameMap.XMLAdapter;
import Journaling.CJournal;
import SchedulingManager.CEvent;
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
		
		for (SceneGraphNode sgn : root.children)
		{
			if (sgn == parent && node != null)
			{
				sgn.children.add(node);
				CJournal.Journal(SceneGraphManager.class, "Adding node, sgn==parent");
				CJournal.Journal(SceneGraphManager.class, "New node: " + node.xmlData.getName());
				CJournal.Journal(SceneGraphManager.class, "SGN parent node is " + parent.xmlData.getName());
				
			}
			else
			{
				recursive_add(node, parent, sgn);
			}
		}
		
	}
	
	public static void recursive_add(SceneGraphNode node, SceneGraphNode parent, SceneGraphNode search)
	{
		

		if (search == null)
		{
			return;
		}
		
		//find parent, if no parent then add to root
		for (SceneGraphNode alpha : search.children)
		{
		
			
			
			if (alpha == parent)
			{
				DebugManager.Debug(SceneGraphManager.class, "Recrusive Adding node, alpha==parent");
				search.children.add(node);
			}
			else
			{
				recursive_add(node, parent, alpha);
			}
		}
	
	}
	
	
	public static void update(CEvent event)
	{
		//traverse scene graph calling update function
	}
	
	public static void parseMessages(CEvent event)
	{
		//parse messagefs distributed by message manager
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
		for (SceneGraphNode sgn : root.children)
		{
			
			System.out.println("**Element Name " + sgn.xmlData.getName() + "***");
			recursive_output(sgn);
			
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
					
			System.out.println("***R Element Name " + sgn.xmlData.getName() + "***");
			recursive_output(sgn);
			return;
		}
		
		
				
	}
	
	
	
}
