package SchedulingManager;

import java.util.ArrayList;

import MessageManagement.Message;

//start time
//execution frequency
//duratoin
//priority
//other

//a task is a basic unit of the scheduler
//this is what gets scheduled and executed
//tasks need to be small and indepedent

//one ctask can have multiple tasks in it

//a task wraps a message
public class CTask {

	public int count = 0;
	//wrapper class for Message State
	
	public boolean dead = false;
	
	//public CEvent task = new CEvent();
	
	public Message message;
	
	//start time
	public double startTime;
	
	//execution frequency
	public double executeFrequency;
	
	//duration
	public double duration;
	
	//priority
	int priority;
	
	ArrayList<CEvent> events = new ArrayList<CEvent>();
	
}
