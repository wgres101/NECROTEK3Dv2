package GraphicsCentral;

///GEMS 7

public class AdvancedParticleDeposition {

	
	
	
	//volcanos - particle placement heuristic in pseudocode
	
	//choose a position for a central vent
	//choose the number of streams
	//choose a random length and direction for each stream
	// while the stopping criteria has not been  met:
	// for each stream:
	//		start at the central vent
	//		while the end of the stream has not been reached
	//			drop a particfle and compute particle dynamics
	//			move in the direction ofthe stream +/- (small random angle)
	
	//mountains and brownian trees
	
	//choose one or more seed positions
	//while stopping criteria has not been met
	//	move the random walker until it is adjacent to a seed
	//	place a new seed at the random walker's position
	
	//sand dune suitable cost function
	
	//while stopping criteria has not been met:
	//	choose a random position and remove a particle
	//	displacement = small random number
	//  while displacement >= 0
	//		move the particle one position in the direction of tghe wind
	//		if the particle moves up
	//			displacement -= 1
	//		if the particle moves down
	//			displacement -= 2
	//	drop the particle and compute particle dynamics
	
	//overhanging terrain
	
	//choose an arbitrary threshold, S
	//for each dropped particle
	//	determine the particle's stickiness Sp (3D Noise)
	//	check the particles path as it falls to the height field
	//	if the particle touches an adjacent particlce
	//		determine the adjacent particles stickiness SA (3D Noise)
	//		if (Sp>=S) and (Sa >= S)
	//			leave the particle at this position
	//	else
	//		use t he heuristic discussed in the particle dynamics above
	
}
