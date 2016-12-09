package DesignPatterns;

public class SingletonBase {
	public SingletonBase() {};
	
	public void access() {};
	
	public static SingletonBase getObj() {
		return mp_obj;
	}
		
	public static void SetObj(SingletonBase singletonB)
	{
		mp_obj = singletonB;
	}
	
	public SingletonBase Base()
	{
		return(getObj());
	}
	
	
	
	
	
	static SingletonBase mp_obj;
	
	
}
