package Resources;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import ObjectManagement.Resource;

public class ResourceManager {

	
	public ResourceManager() { Clear(); }
	
	public void Clear() { }
	
	public boolean Create(int MaxSize) { return false; }
	
	public void Destroy() { }

	
	 
	protected RHANDLE m_rhNextResHandle;
	protected int m_nCurrentUsedMemory;
	protected int m_nMaximumMemory;
	BaseResource     m_CurrentResource;
	///ResMap  m_ResourceMap;
	ConcurrentHashMap<RHANDLE, BaseResource> m_ResourceMap = new ConcurrentHashMap<RHANDLE, BaseResource>();
	
	//Resource map iteration
	//Access functions for cycling through each item. Giving
	//direct access to the map or iterator causes a stack
	//pointer stault if you access the map across a dlal boundary
	//but its safe through the wrappers
	Iterator m_iter =  m_ResourceMap.entrySet().iterator();
	
	
	public void GotoBegin() { 
		//m_CurrentResource 
		m_iter = m_ResourceMap.entrySet().iterator();
		return;
	}
	
	public BaseResource GetCurrentResource()
	{
		//return (m_CurrentResource);
		Entry entry = (Map.Entry)m_iter.next();
		return (BaseResource) entry.getValue();
	}
	
	public boolean GotoNext()
	{
		//m_CurrentResource++;
		m_iter.next();
		return IsValid(); 
	}
	
	public boolean IsValid()
	{
		
		
		if (!m_iter.hasNext())
		{
			return false;
		}
		//return ((m_CurrentResource != m_ResourceMap.end) ? true : false; 
		return true;
	}
	
	
	//General Resource acces
	//ALlows the resource manager to pre-reserver an amount of memory
	//so an inserted resource doesn't exceed the amount of memory
	
	boolean ReserveMemory(int size, int nMem)
	{
		return false;
	}
	
	//IF you pass in the address of a resource handle, the
	//resource manager will provide a uni que handle for you
	
	void InsertResource(BaseResource resource) { 
		
		RHANDLE handle  = HandleManager.getNewHandle();
		
		m_ResourceMap.put(handle, resource);
	}
	
	//Removes an object completely from the manager
	
	void RemoveResource(BaseResource resource)
	{

		
		Iterator<Map.Entry<RHANDLE, BaseResource>> entries = m_ResourceMap.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<RHANDLE, BaseResource> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		    if (resource == entry.getValue())
		    {
		    	m_ResourceMap.remove(resource);
		    }
		}
		
	}
	
	
	
	
	
	//locking the resource ensures that the resource doesn't get managed by the resource manager
	//You can use this to ensure that a surface does not get swapped out, for iinstance. 
	//THe resource contains a reference count ot ensure that numerous locks can be safely made
	
	void Lock(RHANDLE rhUniqueID)
	{
		rhUniqueID.locked = true;
	}
	
	//Unlocking the object lets the resource manager know tha tyou no long
	//need exclsuive access. When all locks have been released (t he reference count is 0)
	//the object is consdiered safe for managment again and cvvan be swapped out at the
	//manager's direction. T he object can be referenced either by handle
	
	 void Unlock(RHANDLE rhUniqueID)
	 {
		 rhUniqueID.locked = true;
	 }
	
	 //Retrieve the stored handle based on the resource. Note that resource. Not that its assumed that there are no duplicate pointers
	 //as it will return the first match found
	 
	 RHANDLE FindResourceHandle(BaseResource resource)
	 {

			Iterator<Map.Entry<RHANDLE, BaseResource>> entries = m_ResourceMap.entrySet().iterator();
			while (entries.hasNext()) {
			    Map.Entry<RHANDLE, BaseResource> entry = entries.next();
			    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			    if (resource == entry.getValue())
			    {
			    	return entry.getKey();
			    }
			}
			return null;
	 }
	  
	 //This must be called when tyou wish the manager to hcheck for discarable resources. Resource swill only be
	 //swapped out if the maximum allowable limit has been reached, and it will discard them from lowest
	 //to highest priority, determined by the resource class's < operator. Function willf ail if requested memory
	 //cannot be freed.
	 
	 boolean CheckForOverallocation()
	 {
		 return false;
	 }
}



