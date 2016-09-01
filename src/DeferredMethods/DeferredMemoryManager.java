package DeferredMethods;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;


//the role of this class is to act as storage for methods that don't
//have to be immediately executed

public class DeferredMemoryManager {

	//use scheduling algorithms such as Most Recently Used (MRU) and least recently used (LRU)
	
	private static PriorityQueue<HashMap<Method, Object>> methodsq = new PriorityQueue<HashMap<Method, Object>>();
	
	
	public static void registerFunction(Method method, Object param)
	{
		//adds a method along with its parameters to the queue
		HashMap<Method, Object> newmap = new HashMap<Method, Object>();
		newmap.put(method, param);
		
		methodsq.add(newmap);
		
	}
	
	public static void popFunction()
	{
		HashMap<Method, Object> map = methodsq.remove();
		
		Iterator it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	        
	        Method m = (Method)pair.getKey();
	        Object p = (Object)pair.getValue();
	    }
	}
	
}
