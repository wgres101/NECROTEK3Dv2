package Profiler;

import java.util.ArrayList;

//profiler uses a unique begin and end function + parameters
//in these blocks critical output is displayed for debugging


public class CProfilerManager {

	//unique name for sample point
	//average, minimum, and maximum of sample frame time spent
	//number of times sample was called
	//parent/child relationship?
	
	
	static int current_ID;
	static CProfileNode current_node;
	
	//an n-ary tree of current nodes
	public static CProfileNode root;
	
	public static void BeginProfile(String location_message)
	{
		CProfileNode node = new CProfileNode();
		node.location_message = location_message;
		current_ID++;
		root.nodeList.add(node);
		node.begin_time();
		
	}
	
	public static void EndProfile(String location_message)
	{
		current_node.end_time();
	}
	
	public static void printProfileTree(CProfileNode node)
	{
		if (node != null)
		{
			System.out.println("ID:" + node.ID + "Location:" + node.location_message + "Start Time:" + node.start_time + "End Time" + node.end_time);  
			printProfileTree(node);
		}
		
		return;
	}
	
}
