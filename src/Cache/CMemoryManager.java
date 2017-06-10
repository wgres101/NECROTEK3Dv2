package Cache;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
/*
public class CMemoryManager {

	
	//an entry in the cache has the following properties
	
	Object scratchPad; //an object newly loadeed has a trial time
	Queue<Object> MRU = new PriorityQueue<Object>(); //a queue is used to track most recently used objects
										//objects that are frequently used aren't swapped
	Queue<Object> LRU = new PriorityQueue<Object>(); //a queue is used to track least recently used
											//if MRU causes thrashing, we switch to LRU
	HashMap<Object, Double> Age = new HashMap<Object, Double>(); //one pass is made through Age every cache cycle
																//oldest objects are removed on a cache miss
	
	double maxsize; //max size of the cache
	
	
	
}
*/