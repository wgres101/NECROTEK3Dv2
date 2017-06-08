package MultiThreading;

public class CCompareAndSwap {

	boolean compare_and_swap(int accum, int dest, int newval)
	{
	  if (accum == dest) {
	      dest = newval;
	      return true;
	  } else {
	      accum = dest;
	      return false;
	  }
	}
	
}
