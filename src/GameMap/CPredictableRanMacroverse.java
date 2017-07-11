package GameMap;



/* use pseudorandom numbers to generate the world right outside the view of the player
 * 
 * example using galaxies and stars
 * 
 * 		srand(1)
 * 		for galaxy_x =1 to 100
 * 			for galaxy_y = 1 to 100
 * 				probability = rand() % 100
 * 				if probability > 70 then
 * 					universe (galaxy_x,galaxy_y) = star
 * 				else
 * 					universe(galaxy_x, galaxy_y) = no_star
 * 
 * 
 * 
 * Still need to store the location of each star, 10,000 positions
 * The number that determines this percentage is createe from a seeded sequence based on the simple seed 1
 * Given that we would like a near infinite population, it makes more sense to perform this calculation
 * on an as-needed basis
 * 
 * 
 * 	int StarAt(int nGalaxy, int nX, int nY)
 * {
 * 		int x, y, nReturn;
 * 		
 * 
 * 		sRand(nGalaxy);   <=== seed determines result of generated space
 *		for (y=0; y < nY; y++)
 *		{
 *			for (x=0; x<nX, x++) 		
 *			{
 *				nReturn = rand() % MAXIMUM_VALUE
 *			}
 *		}
 *		return nReturn;
 *}
 * 
 */

public class CPredictableRanMacroverse {

}
