package Resources;

import java.util.Deque;
import java.util.Vector;

import CustomAssert.CAssert;

public class HandleManager <DATA, HANDLE extends RHANDLE> {


	static int magicIndex = 0;
	
	static Vector<RHANDLE> HandleList= new Vector<RHANDLE>();
	
	public static RHANDLE getNewHandle()
	{
		magicIndex++;
		RHANDLE handle = new RHANDLE();
		handle.setMagicNumber(magicIndex);
		return handle;
	}
	
	private Deque<DATA> 	m_UserData;
	private Deque<Integer>		m_MagicNumbers;
	private Deque<Integer>	m_FreeSlots;
	
	//
	
	
	
	//Handle Methods
	//acquisition
	
	RHANDLE Acquire(RHANDLE rhandle)  { return rhandle; }
	
	void Release() { }
	
	//other queries
	
	int GetUsedHandleCount()
	{
		return (m_MagicNumbers.size() - m_FreeSlots.size());
	}

	int Acquires(HANDLE handle, DATA m)
	{
		//if free list i sempty add a new oen otherwise use first one found
		int index;
		if (m_FreeSlots.isEmpty() ) {
			index = m_MagicNumbers.size();
			handle.Init( index);
			m_UserData.push(m);
			m_MagicNumbers.push(handle.magicNumber);
		
		}
		else {
			
			index = m_FreeSlots.size();
			handle.Init(index);
			m_FreeSlots.pop();
			m_MagicNumbers.push(handle.getMagicNumber());
		}
		
		
		return index;
				
	}
	
	void  Release(HANDLE handle)
	{
		int index = handle.getM_Index();
		
		//make sure its valid
		CAssert.Assert(index < m_UserData.size(), HandleManager.class, "Release", "null)");
		//CAssert.Assert(m_MagicNumbers.element(index)  == handle.GetMagicNumber, HandleManager.class, "NULL");
		
		
		//ok remov eit. tag is as unusued and add to free list
		
		m_MagicNumbers.remove(handle);
		m_FreeSlots.push(index);
		
	}
	/*
	<DATA, HANDLE> void Dereference(HANDLE handle)
	{
		if (((RHANDLE) handle).IsNull() return 0;
		//check handle validitiy
		//this check can be removed for speed
		//if you can assume all handl ereferences are always valid
		int index = handle.
		
		if ( (index >= m_UserData.size()) || m_MagicNumbers.element(index) != handle.GetMagic()) 
		{
			//no good. invalid handle. client rogramming error
			assert(0);
			return (0);
		}
		
		return (index);
			
	}
*/

	
	


}	


