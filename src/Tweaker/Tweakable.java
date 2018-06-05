package Tweaker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Journaling.CJournal;
import UtilityTypes.Float3;
import UtilityTypes.Mat4;

//by adjusting the values in Tweakable we 
//can tweak the application separate from the rest of the code
//with little amount of tie-in

//calling tweak(variablename) will add it to the liist of variables
//to be tweaked by the tweakable's UI



public class Tweakable<T,V> {

	static HashMap<String, Integer> tweakInts = new HashMap<String, Integer>();
	static HashMap<String, Float> tweakFloats = new HashMap<String, Float>();
	static HashMap<String, Double> tweakDoubles = new HashMap<String, Double>();
	static HashMap<String, String> tweakStrings = new HashMap<String, String>();
	static HashMap<String, Long> tweakLongs = new HashMap<String, Long>();
	static HashMap<String, Boolean> tweakBooleans = new HashMap<String, Boolean>();
	static HashMap<String, Mat4> tweakMat4 = new HashMap<String, Mat4>();
	static HashMap<String, Float3> tweakFloat3 = new HashMap<String, Float3>();
	
	
	public void Tweak(String name, T types, V value)
	{
		if (types.getClass() == Integer.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Integer Class");
			tweakInts.put(name, (Integer) value);
			
		}
		if (types.getClass() == Float.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Floats Class");
			tweakFloats.put(name,  (Float)value);
		}
		if (types.getClass() == Double.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Double Class");
			tweakDoubles.put(name, (Double)value);
			
		}
		if (types.getClass() == String.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking String Class");
			tweakStrings.put(name,  (String)value);
			
		}
		if (types.getClass() == Long.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Long Class");
			tweakLongs.put(name,  (Long)value);
			
		}
		if (types.getClass() == Boolean.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Boolean Class");
			tweakBooleans.put(name,  (Boolean)value);
			
		}

		
		if (types.getClass() == Mat4.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Matrix Class");
			tweakMat4.put(name,  (Mat4)value);
			
		}
		if (types.getClass() == Float3.class)
		{
			CJournal.Journal(Tweakable.class, "Tweaking Float Class");
			tweakFloat3.put(name,  (Float3)value);
			
		}

		
	}
	
	public Integer getTweakedInteger(String name)
	{
		return tweakInts.get(name);
	}
	
	public Float getTweakedFloat(String name)
	{
		return tweakFloats.get(name);
	}
	
	public Double getTweakedDouble(String name)
	{
		return tweakDoubles.get(name);
	}
	
	public String getString(String name)
	{
		return tweakStrings.get(name);
	}
	
	public Long getTweakedLong(String name)
	{
		return tweakLongs.get(name);
	}
	
	public Boolean getTweakedBoolean(String name)
	{
		return tweakBooleans.get(name);
	}
	
	
	
	public Mat4 getTweakedMat4(String name)
	{
		return tweakMat4.get(name);
	}
	
	public Float3 getTweakedFloat3(String name)
	{
		return tweakFloat3.get(name);
	}
	
	
	/*
	public static void tweakUI()
	{
		  Iterator it = tweakMap.entrySet().iterator();
		  while (it.hasNext()) {
			  Map.Entry pair = (Map.Entry)it.next();
		      System.out.println("variablevalue: " + pair.getKey() + " variable: " + pair.getValue());
		  }
	}
	*/
	
}
