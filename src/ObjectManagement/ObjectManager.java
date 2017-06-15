package ObjectManagement;


//GEMS 7

//USE POLICIES TO DECIDE ON TYPE OF FREELIST TO USE
//See Gems 5 1.11

//Page allocation requirements are a mix of 
//age (how long since the page was 'born'
//and APC (how big the page is)
// use freelists to combat memory fragmentation
// A freelist is a contiguous series of blocks of memory
// The object manager (memory manager) delivers memory
// according to the free memory in the free list
// multiple freelists, each freelist is specific to an object type

//GEMS 4
//Freeweight Object Manager
//Every allocated piece of memory ( object)
//has its own "bin" which can store information,
//destroy information
//most likely implemented using a map

//unique pager
//Create a series of vectors. Treat them like physical memory
//Use paging to divide up memory returned by the Object Manager

//small allocations are handled by lists, large allocations by "trie" data structure

//Split memory allocation. Use the small linked list and also one larger, a cache
//eventually objects are moved from the cache to the linkede list

//if no elements are free, request more memory from the operating system and expand the vector

//Use red-black trees to searcfh through large memory allocated. Self-balancing
//and easy to search through. Each "bin" (node) can easily be found with little search


public class ObjectManager implements Runnable {

	static Pool pool = new Pool();
	
	
	
	public static Object requestClass(Class classVar, String name)
	{
		
		pool.getEntry(name);
		
		return null;
	}
	
	public static <E> E requestObjectOfClass()
	{
		E t = Pool.<E>requestMemoryTyped();
	
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void ReserveMemory()
	{
	
	
	}
	/*
	public static void InsertMemoery()
	{
		
	}
	
	public static void RemoveMemory()
	{
	}
	
	public static void DestroyResource()
	{
	}
	
	public static Resource GetResource()
	{
		return null;
	}
	
	public static void Lock()
	{
	}
	
	public static void Unlock()
	{
	}
	
	public static Resource FindResource()
	{
		return null;
		
	}
	
	
	
	
*/	
	
}
