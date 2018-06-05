package CustomAssert;

import Debugger.DebugManager;

//a custom assert function/ test boolean expressions and output debug info

public class CAssert {

	public static void Assert(boolean boolean_expression, Class classname, String functionName, String message)
	{
		if (boolean_expression == false)
		{
			DebugManager.Debug(classname, " " + functionName + " " + message);
		}
		assert(boolean_expression);
	}
	static boolean ignoreAlways = false;
	
	
	
}
