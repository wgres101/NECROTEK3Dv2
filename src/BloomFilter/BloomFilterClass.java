package BloomFilter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BloomFilterClass {

					
	boolean hit = false; //hash input (function parameters) to an expensive function
						//use md5 or another hash function
						//if the input
	
						//store the data in an array or another
						//suitable data struture
	
						//next time you come to the function
						//hash the input again to see if it
						//is the same. if it isn't, run the 
						//expensive function again
	//hashmap functionname, boolean (bloom) filter value)
	//hashmap functionname, functionname, boolean value>
	
	public static HashMap<String, HashMap< Float, Boolean>> bloomFilter = new HashMap<String, HashMap<Float, Boolean>>();
	
	//return true if parameters changed
	//return false is parameters did not change
	public static boolean bloomTest(String functionName, float sumOfParameters)
	{
		HashMap innerMap = bloomFilter.get(functionName);

		Float storedBloomFloat = null;
		Boolean storedBloomBool = null;
		if (innerMap == null)
		{
			innerMap = new HashMap<Float, Boolean>();
			innerMap.put(0.0f, false);
		}
				
		Iterator<HashMap> it = innerMap.entrySet().iterator();
		while (it.hasNext()) {
			HashMap.Entry pair = (HashMap.Entry)it.next();
			
			 storedBloomFloat = (Float) pair.getKey();
			 storedBloomBool = (Boolean) pair.getValue();
		}
		
		if (sumOfParameters != storedBloomFloat)
		{
			System.out.println("BLOOM FILTER VALUE" + sumOfParameters + " st" + storedBloomFloat);
			return true;
		}
		
		innerMap.put(sumOfParameters, false);
		bloomFilter.put(functionName, innerMap);
		
		return false;
	}
	
} 