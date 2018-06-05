package BloomFilter;

public class TestBloomFilter {

	
	
	
	
	
	
	public static void testBloomFilter(int a, int b, int c)
	{
		while (true) {
		if (BloomFilterClass.bloomTest("testBloomFilter", a+b+c) == true)
		{
			System.out.println("TESTING BLOOM FILTER == true");
			return;
		}
		System.out.println("TESTING BLOOM FILTER");
		}
	}
	
	
	
	
	
	
	
	
}
