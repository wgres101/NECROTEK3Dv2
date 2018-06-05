package Handle;

//rinstead of pointers. manages memory so you don't
//try to access something that is no longer there or is out of scope.
//keep a reference count, that is, how many instances are 'checked out'

public class HANDLE {

	

	class NullResource<T>
	{
		// instead of setting something to null
		// we set it to a null object
		// so we never have to do a check for null
	}
	
	static class DataType <T>
	{
		T variable;
		
		public void StoreDataType(T variable)
		{
		    
			return;
		}
	}
	
	
}
