package MessageManagement;

import java.util.PriorityQueue;
import java.util.Queue;

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
//			I send a message to the message maanager
//			The message manager puts my request on queue
//			The message maanager broadcasts the "RenderTriangles" message
//			There are only two methods (receivers) for that message
//			They execute and after sending the remaining messages
//			the messagemanager is done.
// 			


public  class MessageManager {

		static Queue<Message> messagesQueue = new PriorityQueue<Message>();
	
		public static void EnqueueMessage(Message message)
		{
			messagesQueue.add(message);
		}
		
		public static void Update()
		{
			//handle messaging duties such as calling parseMessage
			//on the scene graph and removing the message from the queue
			//after its been sent out
			
		}
		
	
}
