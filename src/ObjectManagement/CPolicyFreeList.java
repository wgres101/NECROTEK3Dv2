package ObjectManagement;

//Book 5 Section 1.11

 class FreeList <T, GrowthPolicy, AllocationPolicy>
 {
	 public FreeList()
	 {
		 int numToPrealloc = GrowthPolicy.GetNumberToPreallocate()
		 if (numToPrealloc > 0)
		 {
			 AllocationPolicy.Grow(numToPrealloc);
		 }
		 
	 }
	 
	 
	 //requests a block of information from the Allocatoin POlicy
	 
	 public <T> void Allocate()
	 {
		 Object pBlock = AllocationPolicy.Pop();
		 if(!pBlock)
		 {
			int numAlloced = AllocationPolicy.GetNumAllocated();
			int growSize = GrowthPolicy.GetNumberToGrow(numAlloced);
			
			if (growSize > 0)
			{
				AllocationPolicy.Grow(growSize);
				pBlock = AllocationPolicy.Pop();
			}
		 }
		 if (pBlock)
		 {
			 return AllocationPolicy.Create(pBlock);
			 
		 }
		 else
		 {
			 return 0;
		 }
	 }
	 
	 //convert the object back to a memory block
	 //returns memory block back to allocation policy
	 
	 public <T> Free(T pObject)
	 {
		 if (!pObject)
			 return;
		 AllocationPolicy.Destroy(pObject);
		 AllocationPolicy.Push(pObject);
		 
	 }
	

}
