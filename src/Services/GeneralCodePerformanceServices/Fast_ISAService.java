package Services.GeneralCodePerformanceServices;

//GEMS 8

public class Fast_ISAService {

	
	//ONLY WORKS ON A BALANCED BINARY TREE	
	
	
		public static boolean IsA(Object pA, Object pB)
		{
			int nAIndex = pA.getClassIndex();
			int nBIndex = pB.getClassIndex();\
		
			
			//BSR function is an assembly function that
			//uses the BSR instruction (BitScanReverse)
			return nBIndex == (nAIndex >> (BSR(nAIndex) - (BSR(nBindex) ));
		}
}
