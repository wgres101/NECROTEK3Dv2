package Journaling;

import java.util.ArrayList;

public class CSwitchBox {

	ArrayList<CSwitch> cswitches = new ArrayList<CSwitch>();
	
	
	static CSwitch ourInstance = getInstance();

	
	void addCSwitch(CSwitch item)
	{
		cswitches.add(item);
	}
	
	//singleton retrieval
		public static CSwitch getInstance()
		{
			if (ourInstance != null) {
				return ourInstance;
			}
			return staticFactory();
		}
		
		
		//simple factory to generate CSwitch
		public static CSwitch  staticFactory() {
			
			return ourInstance;
		}
	
}
