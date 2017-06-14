package ObjectManagement;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Pool {

	static private int MAX_ENTRIES = 50;
	
	static private int LARGE_ENTRIES = 200;
	
	static private Vector<Object> poolEntries = new Vector<Object>();
	
	static private Vector<Object> largePoolEntires = new Vector<Object>();
	
	/*static private CMemoryTrie<Object> trieEntries = new CMemoryTrie<Object>();*/
	
	static public <E> void InitPool()
	{
		for (int i =0; i<MAX_ENTRIES;i++)
		{
			E o = null;
			poolEntries.add(o);
		}
		
		for (int i = 0; i<LARGE_ENTRIES;i++)
		{
			E o = null;
			largePoolEntires.addElement(o);
			
		}
		
	}
	
	
	static public Object getEntry(String name)
	{
		return findEntry(name);
	}
	public static <E> E requestMemoryTyped()
	{
		//memory unit
		
		Object entry = poolEntries.get(0);
		E unit = (E)entry;
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
