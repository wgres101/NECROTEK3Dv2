package AI.State.PatternBasedModularAI;

//health based example

public class CConsiderationBoolean {

	
	CConsiderationBoolean() { }
	
	//Evaluate this consideration
	boolean Evaluate(CDecisionContext ctxt)
	{
		//Get the health that we're checking - player or npc and 
		//compare it to the cutoff
		float health;
		if (m_CheckPlayer)
	//get appropriate health value from the context and ci
				health = ctxt.GetHealth(ctxt.GetPlayer());
		else
				health = ctxt.GetHealth(ctxt.GetMyActor());
		
		//Do the check
		if (m_HighIsGood) 
		{
			return curentHealth >= m_Cutoff;
		}
		else
		{
			return currentHealth <= m_Cutoff;
		}
				
		
	//Load the data that controls our decision
	CCsdrHealth LoadData(CDataNode node) { 
		//If true we check the player's health, otherwise
		//we check our actor's health
		m_CheckPlayer = node.GetBoolean("CheckPlayer");
		
		//The cutoff for our health check - may be the
		//upper or lower limit, dpeending onthe value
		//of m_HighIsGood
		m_Cutoff = node.GetFloat("Cutoff");
		
		//IF true then we return true when our health is
		//above the cutoff, otherwise we return true when
		//our health is below the cutoff
		m_HighIsGood = node.GetBoolean("HighIsGood");
	}
	
}
 