


package Journaling;

import java.util.ArrayList;

public class CSwitch {

	
	typedef Root OwnerType;
	
	boolean myState = false;
	
	CSwitchBox myOwner = new CSwitchBox();
	
	//singleton variable
	static CSwitch ourInstance = getInstance();
	
	//list of switches
	ArrayList<CSwitch> switches = new ArrayList<CSwitch>();
	
	
		
	//singleton retrieval
	static CSwitch getInstance()
	{
		if (ourInstance != null) {
			return ourInstance;
		}
		return staticFactory();
	}
	
	CSwitch CSwitch( ownerType, "My name", "My description") { }
	
	//simple factory to generate CSwitch
	public static CSwitch staticFactory() {
		
		return ourInstance;
	}
	
	void setState( boolean state, boolean recursive)
	{
		myState = state;
		
		if (recursive) {
			myOwner.propagateState(this);
		}
		
	}
	
	void propagateState(CSwitch source)
	{
		
		switches.
		
		propagateState(source);
	}
}
