package MathOptimization;

public class ProgrammingFractals {

	//random number generator
	
	/*
	 * float random( int x, int y)
	 * {
	 * 		int n=x+y*57;
	 * 		n = n << 13) ^ n
	 * 		float ret;
	 * 		ret = (1	 - ( ( n * (n * n * 19417 + 189851) + 4967243) & 4945007) / 3354521.0)
	 * 		return ret;
	 * }
	 */
	
	
	/* cosine interpolation
	 * 
	 * 	double cosineinterpolation(double number1, double number2, double x)
	 * 	{
	 * 		double ft;
	 * 		double f;
	 * 		double ret;
	 * 		ft = x * 3.1415927;
	 * 		f = (1 - cos(ft)) * 0.5
	 * 		ret = number1 * (1-f) + number2 * f;
	 * 		return ret;
	 * 
	 */
	
	//Takes a point on a heightmap or grid in which you wish to store the resutls
	
	/* noise function
	 * 	float noise(float x, float y)
	 * {
	 * 		int xinteger = x;
	 * 		float fractionx = x-xinteger;
	 * 		int yinteger = y;
	 * 		float fractiony = y-yinteger;
	 * 		float v1, v2, v3, v4, i1, i2;
	 * 		float ret;
	 * 		v1 = randomnumber(xinteger, yinteger)
	 * 		v2 = randomnumber(xinteger + 1, yinteger)
	 * 		v3 = randomnumber(xinteger, yinteger+1)
	 * 		v4 = randomnumber(xinteger+1, y integer+1)
	 * 		i1 = cosineinterpolation(v1, v2, fractionx)
	 * 		i2 = cosineinterpolation(v3, v4, fractionx)
	 * 		ret = cosineinterpolation(i1, i2, fractiony)
	 * 		ret urn ret;
	 * }	
	 */
	
	
	//if you want to smooth your noise instead of it looking blocky,
	//call smoothrandom instead of the randomnumber function above
	
	/* float smoothrandom(int x, int y)
	 * {
	 * 		float corners = (randomnumber(x-1, y-1)+randomnumber(x+1,y-1) + randomnumber(x-1, y+1)
	 * 						+ randomnumber(x+1, y+1))/16;
	 * 		float sides = (randomnumber(x-1, y)+randomnumber)x+1,y) + randomnumber(x,y-1) + randomnumber(x, y+1) ) /8
	 * 		
	 * 		float center = randomnuimber(x,y) / 4
	 * 		float ret = corners+sides+center;
	 * 		return ret;
	 * }
	 * 
	 
	 //with the noise function completed it is easy to compute Fractal Brownian MOtion Fractals
	  * float FBM(float xs, float y, float octaves, float amplitude, float frequency, float h)
	  * {
	  * 	float ret = 0;
	  *		for (int = 0; i<(octaves-1);i++)
	  *		{
	  *			ret += noise ( x*frequency, y*frequency) * amplitude);
	  *			amplitude *= h;
	  *		}
	  *		return ret;
	  *}
	  */
	  
	  //Multifractals are similar to to FBMs except that instead of adding noise,
	  //noise is multiplied toget her
	
	/* float Multifractcal(float xs, float y, float octaves, float amplitude, float freqauency, float h, float offset)
	 * {
	 * 		float ret = 1;
	 * 
	 * 		for (int i = 0; i<(octaves-1);i++)
	 * 		{
	 * 			ret *= (offset) *(noise (x*frequency, y*frequency)*amplitude;
	 * 			amplitude *= h;
	 * 		}
	 * 		return ret;
	 * }
	 */
	
	
	
}
