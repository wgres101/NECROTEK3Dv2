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
//			I send a message to the scheduler			
//			The scheduler isolates a thread for the message amd semds to the message manager
//			The message manager puts my request on queue
//			The message maanager broadcasts the "RenderTriangles" message
//			There are only two methods (receivers) for that message
//			They execute and after sending the remaining messages
//			the messagemanager is done.
// 			


// delay message delivery

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
		

			//called upon when object is no longer needed
			
			public void Destroy()
			{
				//called Destroy
			}
			
			//called every turn. checks messagemanager for message
			
			public void ParseMessage()
			{
				
			}
			
			
			public static void Launch() {}
			
			
			//called on object creation
			
			public static void Init() {}
			


			public static void  Render()
			{
				
			}

			
			public static void  Collision()
			{
				
			}
			
			//when the game requires this particular state to be active
			
			public static void  OnEnter()
			{
				
			}
			
			//When the object no longer needs to be attachd to the scene graph
			
			public static void  OnExit()
			{
			}

			//for exammple, hitting the pause button
			
			public static void  OnSuspend()
			{
			}
			
		
		public static void Train()
		{
			//incoming messages are analyzed and sent
			//to the trainer to record the behavior for the AI
		}
		
		
		
}
