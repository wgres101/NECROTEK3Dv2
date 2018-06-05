package Resources;

public class BaseResource {

	/*
	public enum PriorityType
	{
		RES_LOW_PRIORITY,
		RES_MED_PRIORITY,
		RES_HIGH_PRIORIY
	}*/
	
	
	BaseResource() { Clear(); }
	
	//Clears the class data
	//virtual
	public void Clear() { }
	
	//Create an destroy functions. Note that the Create() functions of the derived class
	//does not have to exactly match the base class. No assumptions are made regarding parameters.
	
	//virtual
	boolean Create() { return false; }
	
	//Dispose and recreate must be able to discard and then
	//completely recreate the data contained in the class with
	//no additional parameters
	//virtual
	
	boolean Recreate() {
		return false; }
	boolean Dispose() {
		return false; }
	
	//GetSize must return the sizeso fthe data inside the class
	//with no additional parameters
	//virtuals
	int GetSize() {
		return -1; } 
	boolean IsDisposed() {
		return false; }
	
	//These functions set the parametere sby which the sorting
	//operator determines in what order resources are discarded
	
	public void SetPriority(int priority)
	{
		m_Priority = priority;
	}
	
	public int GetPriority()
	{
		return m_Priority;
	}
	
	public int GetLastAccess()
	{
		return m_LastAccess;
	}
	
	public void SetReferenceCount(int nCount)
	{
		m_RefCount = nCount;
	}
	
	public int GetReferenceCount()
	{
		return m_RefCount; 
	}
	
	public boolean isLocked()
	{
		return (m_RefCount > 0) ? true: false;
	}
	

	public void SetLastAccessTime(int LastAccess)
	{
		m_LastAccess = LastAccess;
	}
	
	public int GetLastAccessTime()
	{
		return m_LastAccess;
	}
	
	//virtual
	
	public boolean lessThan(BaseResource container)
	{
		if (GetPriority() < container.GetPriority())
		{
			return true;
		}
		else if (GetPriority() > container.GetPriority())
		{
			return false;
		}
		
		else {
			if (m_LastAccess < container.GetLastAccess())
			{
				return true;
			}
				 
			else if (m_LastAccess < container.GetLastAccess())
			{
				return true;
			}
			else if (m_LastAccess > container.GetLastAccess())
			{
				return false;
			}
			else
			{
				if (GetSize() < container.GetSize())
				{
					return true;
				}
				else
					return false;
			}
		}
	}
			
	
	protected int m_Priority;
	protected int m_RefCount;
	protected int 	m_LastAccess;
	
	
}
