package ObjectManagement;


//an alllocation policy
//allows chunks of contiguous memory
//and partitions them in blocks of size T

public class <T> CPlacementNewEmbeddedLink {
	
		//public
	
		private struct FreeBlock
		{
			FreeBlock pNext;
		}
		
		FreeBlock pFreeBlocks;
		
		Vector chunks = new Vector();
	
		int Grow(itn numBlocks)
		{
			//use malloc"" to assign memory to chunk
			 //Oject chunk = 
			chunks.push_back (pChunk);
			for (int ix = 0; ix < numBlocks; ++ix)
			{
				Push( (char)pChunk) + ix + sizeof(T));
				
			}
		}
		
		void Push(Object pBlock)
		{
			FreeBlock pNewHead = pBlock;
			pNewHead.pNext = pFreeBlocks;
			pFreeBlocks = pNewHead;
		}
		
		Object Pop()
		{
			if (!pFreeBlocks)
			{
				return 0;
			}
			pNewBlock = pFreeBlocks;
			pFreeBlocks = pFreeBlocks.pNext;
			return pNewBlock;
		}
		
		
		static <T> Create(Object pBlock)
		{
			return new (pBlock) T;
		}
		
		static <T> Destroy(T pObject)
		{
			pObject.T();
		}

}
