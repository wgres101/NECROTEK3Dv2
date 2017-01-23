package ObjectManagement;

public class ObjectManager implements Runnable {

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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}
