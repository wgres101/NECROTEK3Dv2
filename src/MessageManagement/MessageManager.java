package MessageManagement;

import java.util.PriorityQueue;
import java.util.Queue;

import Journaling.CJournal;
import SchedulingManager.EEventMachine;

//Services work on messages passed to them
//the message manager receives and sends messages
//that in queue to to the other services that are runing

//so it
//a: receives messages from servies
//b: puts (stores) messages in a list
//c: passes along all messages to all services that are awake
//d: removes messages from list after complete


///!!!!!
// The message pump exists on one thread and
// the game itself exists on another

//example:  I'd like to draw an array of triangles (me being the AI for edxample)
//			I send a message to the scheduler			
//			The scheduler isolates a thread for the message amd semds to the message manager
//			The message manager puts my request on queue
//			The message maanager broadcasts the "RenderTriangles" message
//			There are only two methods (receivers) for that message
//			They execute and after sending the remaining messages
//			the messagemanager is done.
// 			


// delay message delivery

public  class MessageManager implements Runnable {

	
		@Override
		public  void run() {
			// TODO Auto-generated method stub
			while (true)
			{
				//pull message from queue
				Message message = CMessagePool.messagesQueue.remove();
				
				//dispatch messages according to their type
				switch(message.mflag)
				{
				case EM_BOOTSTRAP:
					CJournal.Journal(MessageManager.class, "Messaging system working properly.");
				default:
					CJournal.Journal(MessageManager.class, "Dispatch Message Trashed");
				}
			}
		}
		
	
}
