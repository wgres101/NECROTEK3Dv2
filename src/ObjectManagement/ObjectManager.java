package ObjectManagement;

public class ObjectManager {

	static Pool pool = new Pool();
	
	
	
	public static Object requestClass(Class classVar, String name)
	{
		
		pool.getEntry(name);
		
		return null;
	}
	
	public static Object requestObjectOfClass(Class classVar, String name)
	{
		Object o = pool.requestMemory("name", classVar);
		
		return o;
	}
	
	
}
