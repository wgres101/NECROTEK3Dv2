package Actor;


public class CCmpHealth implements ICmpHealth {
/*
	@Override
	public int GetHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	//Static Methods
	
	//tell about CreateMe function
	//Register as an implementer of ICmpHealth interface
	///also what name (hash) it woudl like to be ujnder
	//;lastly it registers itself as a listener of
	//MT_TAKE_DAMAGE
	public static void RegisterComponentType()
	{
		
		RegisterInterface(CID_HEALTH);
		GetObjectManager().RegisterComponentType(
				CID_HEALTH,
				CreateMe(),
				DestroyMe(),
				CHash("Health"))
				
		GetObjectManager().SubscribteToMessageType(
				CID_HEALTH,
				MT_TAKE_DAMAGE);
		
		
	}
	public static IComponent CreateMe()
	{
		return new CCMpHealth;
	}
	
	//IComponent Methods
	
	//reads the data the componenet needs
	//compNod eis the component level parameter node
	public boolean Init(CParamterNode compNode) 
	{ 
		//asks for the int value of the child node
		//with name "health"
		
		//to simplifty things there is only one 
		//child layer of nodes underneath compNode
		mHealth = compNode.GetInt("Health");
		
		//check for failed request
		if (CParameterNode.GetLastREsult != EPR_OK)
		{
			return false;
		}
		return true;
	}
	
	public void DeInit() { }
	
	//right one
	
	public EMessageResult HandleMessage(CMessage Message) 
	{
		int newHealth;
		//when we receive the MT_TAKE_DAMAGE message
		//we know that its field type is of type int
		//and represents how much damage we have taken
		//
		switch (Message.mType)
		{
		case MT_TAKE_DAMAGE:
			newHealth = mHealth - reinterpret_cast<int>(Message mpData);
			if (newHealth <= 0 && mHealth > 0)
			{
					//Tell other objects that the health has been depeleted
					GetObjectManager().PostMessage(GetObjectID, MT_HEALTH_DEPELETED);
					
			}
			mHealth = newHealth;
			return M_TRUE;
			}
		}
	return M_ERROR;
	}
	
	public EComponentTypeID GetComponentTypeID() { }
	
	
	//ICmpHealth Methods
	
	int mHealth;

	
*/	
}
