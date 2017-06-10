package MultiThreading;

public class CCompareAndSwap 
{

	public int CAS(int Ptr, int Value, int Comparand)
	{
		if (Ptr == Comparand)
		{
			Ptr = Value;
			return Comparand;
		}
		return Ptr;
	}
	
}

//Example
/*I
int AtomicAND(int Value, int Op)
{
	while(true)
	{
		int CurValue = Value;
		int NewValue = (CurValue & Op);
		if (CAS(Value, NewValue, CurValue) == CurValue)
		{
			return NewValue;
		}
	}
}
 */