package MathOptimization;


//Gems 7

public class UsingGaussianRandomnessVaryProjectilePaths {

	
	
	/*
	 * 
	 * Central Limit  THeorem
	 * 
	 * 
	 * double gaussrand(void)
	 * {
	 * 		static unsigned long seed = 61829450;
	 * 		double sum = 0;
	 * 
	 *		for (int i=0;i<3;i++)
	 *		{
	 *			unsigned long hold seed = seed;
	 *			seed^=seed<<13;seed^seed>>17;seed^=seed<<5;
	 *			long r = hold+seed;
	 *			sum += (double)r * (1.0/0x7FFFFFFF)
	 *		}
	 *		return sum; // REturns [-3.0,3.0]
	 * 
	 * 
	 * }
	 * 
	 * for 3d, use polar coordinates and a random angle and length
	 * 
	 */
}
