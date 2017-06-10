package Component;


//ABook 5 Section 1.3

public class CComponent {

	/*

	public boolean Init(CParameterNode compNode)
	{
		mHealth = compNode.GetInit(" Health");
		if (GetLastResult != EPR_OK)
		{
			return false;
		}
		return true;
	}
	public void DeInit() { } 
	public EMessageResult HandleMessage(CMessage Message)
	{
		int newHeatlh;
		switch(Message.mType)
		{
			case M_TAKE_DAMAGE:
			{
				int newHealth = mHealth - Message.mpData;
				if (newHealth <= 0 && newHealth > 0)
				{
					//send message, HEALTH_DEPELETED
					CComponentObjectManager.GetObjectManager().PostMessage(
							GetObjectID(), EObjectPoster.MT_HEALTH_DEPLETED);
			
				}
				mHealth = newHealth;
				return EMessageResult.MR_TRUE;	
			}
			
			default:
			{
				return EMessageResult.MR_ERROR;
			}
		}
			
		
	}
	
	//returns an enumaterated value of type EcomponentID
	public EComponentID GetComponentTypeID() { return null; }
	public CObjectID GetObjectID() {return mObjectID; }
	public ICmpEntity GetEntity() {return null; }
	
	private void SetObjectID(CObjectID o_ID) { mObjectID = o_ID; }
	CObjectID mObjectID;
	
	int mHealth = 100;
	
	
	
	*/
}
