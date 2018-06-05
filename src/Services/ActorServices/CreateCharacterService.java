package Services.ActorServices;

import org.jdom2.Element;

import MessageManagement.Message;
import Services.ServiceRoot;
import WSObjects.WSObject;

public class CreateCharacterService extends ServiceRoot{
	
	
	public CreateCharacterService(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
		e = new Element("CharacterService");
	}

	public  void Launch() {}
	
	public  void Init() {
		
		
		
	}
	
	public  void Destroy() {}
	
	public  WSObject SpawnWebServiceObject() {
		return null;}

	
	public void parseMessage(Message message)
	{
		switch(message.mflag)
		{
		case EM_GO_BACKWARD:
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
