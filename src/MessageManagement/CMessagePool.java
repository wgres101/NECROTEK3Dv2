package MessageManagement;

import java.util.PriorityQueue;
import java.util.Queue;

public class CMessagePool {

	public static PriorityQueue<Message> messagesQueue = new PriorityQueue<Message>();
	
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
	
	public static void DispatchMessage(Message message)
	{
	
	}

}
