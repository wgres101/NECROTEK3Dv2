package SchedulingManager;



//Frame Events are simplest types of events and occur once per N frames or every frame
//They can also occur before and after a render event
//Time Events on the other hand, occur in virtual time and are not
//specifically synchronized with frames

//For example, time events can occur every 10 ms
//regardless of the rendering frame

//An EVENT wraps a task
public class CEvent implements Comparable {


	CTask task = new CTask();
	public EEventMachine current_event; 
	
	public int compareTo(Object o)
	{
	    return -1;
	}

}

