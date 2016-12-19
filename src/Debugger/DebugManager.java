package Debugger;

public class DebugManager {
	
	public static void Debug(Class<? extends Object> class1, String errorMessage)
	{
		System.out.println("In Class::" + class1 + " Error:" + errorMessage);
	}

	public static void Debug(String class1, String errorMessage)
	{
		System.out.println("In Class::" + class1 + " Error:" + errorMessage);
	}

}
