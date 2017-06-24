package DesignPatterns.AutomaticSingleton;

//GEMS 1

public class AutomaticSingletonUtilityService<Entry> {
	
	
	public  Entry ms_Singleton;
	
	public AutomaticSingletonUtilityService(Entry singleton)
	{
		ms_Singleton = singleton;
	}
	
	public Entry getSingleton(Entry entry)
	{
		return ms_Singleton;
	}
	
	public void setSingleton(Entry entry)
	{
		ms_Singleton = entry;
	}
	
	
	
}
