package MessageManagement;

import SchedulingManager.EEventMachine;

public class Message implements Runnable {

	//a message wraps an event from EEVentMachine

	public EEventMachine mflag;
	
	public long frame_rate;
	

		
		Object sourceReference; //reference to the generator of this message

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		float duration;
		
	
}
