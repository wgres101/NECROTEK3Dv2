package Tweaker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//by adjusting the values in Tweakable we 
//can tweak the application separate from the rest of the code
//with little amount of tie-in

//calling tweak(variablename) will add it to the liist of variables
//to be tweaked by the tweakable's UI



public class Tweakable {

	static HashMap<Object, Object> tweakMap = new HashMap<Object, Object>();

	
	public static void tweak(Object variableValue, Object variable)
	{
		tweakMap.put(variableValue, variable);
	}
	
	public static void tweakUI()
	{
		  Iterator it = tweakMap.entrySet().iterator();
		  while (it.hasNext()) {
			  Map.Entry pair = (Map.Entry)it.next();
		      System.out.println("variablevalue: " + pair.getKey() + " variable: " + pair.getValue());
		  }
	}
	
	public static void changeTweak(Object variableValue, Object value)
	{
		tweakMap.put(variableValue, value);
		
	}
	
}
