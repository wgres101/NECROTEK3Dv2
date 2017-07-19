package ObjectManagement;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Pool {

	static private int MAX_ENTRIES = 50;
	
	static private int LARGE_ENTRIES = 200;
	
	static private Stack<Object> poolEntries = new Stack<Object>();
	
	static private Vector<Object> largePoolEntires = new Vector<Object>();
	
	/*static private CMemoryTrie<Object> trieEntries = new CMemoryTrie<Object>();*/
	
	static public void InitPool()
	{
		for (int i =0; i<MAX_ENTRIES;i++)
		{
			Object o = new Object();
			poolEntries.add(o);
		}
		
		for (int i = 0; i<LARGE_ENTRIES;i++)
		{
			Object o = new Object();
			largePoolEntires.addElement(o);
			
		}
		
	}
	static public Object requestMemoryTyped()
	{
		Object unit = (Object)poolEntries.pop();
		return unit;
	}
	
	static public Object getEntry(String name)
	{
<<<<<<< HEAD
		return findEntry(name);
	}

	public static Object requestMemoryTyped()
	{
		//memory unit
		
		Object unit = poolEntries.pop();
=======
		Object unit =  (Object)poolEntries.pop();
>>>>>>> branch 'master' of https://ted_gress@bitbucket.org/ted_gress/necrotek3d_v2.git
		return unit;
	}
	
	public static <classtype> Object requestMemory(String name, Class classVar)
	{	
		Class c = null;
		Object o = null;
		
		if (poolEntries.size() > MAX_ENTRIES)
		{
	/*		
			//ran out of memory!
			//pool memory from Trie class
			
			
				/*
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
			*/
			
			
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
			o = poolEntries.remove(0);
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
