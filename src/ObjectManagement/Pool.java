package ObjectManagement;

import java.util.ArrayList;
import java.util.Stack;

public class Pool {

	static private int MAX_ENTRIES = 200;
	
	
	
	static private Stack<Object> poolEntries = new Stack<Object>();
	
	static public void InitPool()
	{
		for (int i =0; i<MAX_ENTRIES;i++)
		{
			Object o = null;
			poolEntries.add(o);
		}
	}
	

	
	static public Object getEntry(String name)
	{
		return findEntry(name);
	}
	
	static public Object requestMemory(String name, Class classVar)
	{	
		Class c = null;
		Object o = null;
		
		if (poolEntries.size() > MAX_ENTRIES)
		{

			try {
				c = Class.forName(classVar.getName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				o  = c.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			poolEntries.setSize(MAX_ENTRIES*10);
			MAX_ENTRIES *= 10;
		}
		else 
		{
			try {
				c = Class.forName(classVar.getName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			o = poolEntries.pop();
			return o;
		}


		return o;
	}
	static public Object setEntry(String name, Object value)
	{
		Object temporary = findEntry(name);
		temporary = value;
		
		return temporary;
	}
	
	static Object findEntry(String name)
	{
		for (Object entry : poolEntries)
		{
			if (entry.equals(name))
			{
				return entry;
			}
			
		}
		return null;
	}
	
}
