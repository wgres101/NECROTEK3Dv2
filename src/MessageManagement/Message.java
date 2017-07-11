package MessageManagement;

import SchedulingManager.EEventMachine;


public class Message implements Runnable,  Comparable<Message> {

	//a message wraps an event from EEVentMachine

	public EEventMachine mflag;
	
	public long frame_rate;
	
	public int priority = 1;
		
		Object sourceReference; //reference to the generator of this message

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		float duration;
		
	
		 public int compareTo( Message o ) {
		      int diff = priority;
		      return diff;
		   }
		
}
