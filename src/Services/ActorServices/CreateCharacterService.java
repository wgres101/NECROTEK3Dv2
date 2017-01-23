package Services.ActorServices;

import MessageManagement.Message;
import Services.ServiceRoot;

public class CreateCharacterService extends ServiceRoot{
	
	public void parseMessage(Message message)
	{
		switch(message.mflag)
		{
		case Message.EM.EM_GO_BACKWARD:
			break;
			
			
		/*
		
		 EM_GO_FORWARD,
		  EM_GO_BACKWARD,
		  EM_TURN_RIGHT_90,
		  EM_TURN_LEFT_90,
		  EN_SET_RANDOM_DIRECTION,
		  EM_MOVEMENT_STOP
		  
		  */
		}
	}

	
	
	
	
	
	
}
