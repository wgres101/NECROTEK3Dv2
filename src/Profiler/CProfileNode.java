package Profiler;

import java.util.ArrayList;


public class CProfileNode {

	//
	ArrayList<CProfileNode> nodeList = new ArrayList<CProfileNode>();
	long start_time;
	long end_time;
	int ID;
	String location_message;
	
	public void begin_time()
	{
		start_time = System.nanoTime();
	}
	
	public void end_time()
	{
		end_time = System.nanoTime();
	}
}
