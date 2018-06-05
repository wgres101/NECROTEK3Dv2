package AnimationAlgorithms;

public class NonIterativeInverseKinematicsChainSolver {

	
	/*
	 * 
	 * Function SolveIKChain( chain)
	 * 
	 * begin
	 * 	calculate chain target alignment
	 * 	
	 * 	for each bone in chain
	 * 	begin
	 * 		apply chain target alignment to bone
	 * 		
	 * 		if bone is last bone
	 * 			aim bone at target
	 * 		else if bone is second last
	 * 			use trigonometry to calculate bone angle
	 * 		else
	 * 		begin
	 * 			determine FK bone angle
	 * 			determine maximum FK bone angle
	 * 			determine maximum IK bone angle
	 * 			
	 * 			IK bone angle = ( FK bone angle / maximum FK bone angle) * (maximum IK bone angle)
	 * 		end
	 * 	end
	 * end
	 * 
	 * 
	 * 
	 */
	
}
