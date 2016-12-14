package Services.ActorServices;

public class CreatePawnService {

	
	public static void Update() { };
	
	public static void Message(EM message)
	
		//do some stuff

		//process messages
		switch (message)
		{
		
		//copy text into a parameter
		case EM_CLSNAME:
			break;
			
		//return text from parameter
		case EM.EM_CLSINIT:
			break;
			
		//perform free class 
		case EM.EM_CLSFREE:
			break;
			
		//create an entity
		case EM.EM_CREATE:
			break;
		
		//shuts down, doesn't necessarily remove from memory
		case EM.EM_SHUTDOWN:
			break;
			
		//completely remove entity from game
		case EM.EM_DESTROY:
			
			break;
		//start an entity
		case EM.EM_START:
			break;
			
		//called by the main loop to update environmemnt	
		case EM.EM_UPDATE:
			break;
			
		//rendres the entity
		case EM.EM_DRAW:
			break;
		
		default:
		}
	
	}
	
}
