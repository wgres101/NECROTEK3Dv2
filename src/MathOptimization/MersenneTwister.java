package MathOptimization;

//GEMS 4 Math


/*
 *  In many games, deep and wide searches are used to make decisions.
 *  Once a game state has been decided, an evaluation function determines the pros and cons
 *  of the state. A good searching technique will generate a large number of game states to be
 *  evaluated. Because of the nature of strategy games, games states can repeat,
 *  and the same state can result from man y different sets of moves.
 *  Because running the evaluation function of a game state is often a critical performance
 *  factor, we want to minimize the use of this function.
 *  
 *  In the case of chess, we can cache the contents of every board state that has been
 *  previously evaluated. Before evaluating any new board, the board can be compared
 *  against the list of cached boards, and the evaluation can be avoided if the board
 *  is already in the list. Searching the list is a linear operation, but the performance can be
 *  improved to around constant-time by using a  hash.
 */


public class MersenneTwister {

	//generates 64 bit random numbers
	//better than rand()
	//fast pseudorandom number generator
	
	
	
	
	//Mersenne parameters - MTI19937
	
	static final int 	MT_W = 32;
	static final int 	MT_N = 624;
	static final int	MT_M = 397;
	static final int 	MT_R = 31;
	static final int	MT_A = 0x9908b0df;
	static final int	MT_U = 11;
	static final int 	MT_S = 7;
	static final int	MT_B = 0x9d2c5680;
	static final int	MT_T = 15;
	static final int 	MT_C = 0xefc60000;
	static final int 	MT_L = 18;
	static final int 	MT_LLMASK = 0x7fffffff;
	static final int 	MT_UMASK =  0x80000000;
	
	int t_y;
	
	/*
	y = s_aMT[m_ix++];           //s_aMT is a 624 element array seeded with 32 bit numbers any numbers are valid
								//except 0
	y ^= y >> MT_U;
	y ^= y << MT_S & MT_B;
	y ^= y << MT_T & MT_C;
	y ^= y >> MT_L;
	
	
	
	*/
	
}

 class ZobristHash
{
		
	
	//ZOBRIST HASH

	//create a An n dimensional Zobrist table is constructed and filled with 64 bit random numbers
	// (see Mersenne Twister)
	//The number of dimensions is related to the number of game parameteres being used
	//An exclusive or function is used to combine the piece parameters together
	//Exlcusive or has the property of being reversible using the same inputs
	//To calculate the Zobrist key, exclusive or the piece values together
	//Once the zobrist key is generated, the easiest way to use it is 
	//modulo the size of the hash table.
	//
	
	
	
	
}
