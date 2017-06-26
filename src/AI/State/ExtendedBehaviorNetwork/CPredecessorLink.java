package AI.State.ExtendedBehaviorNetwork;

public class CPredecessorLink {

	
	//activation that goes from a goal g to a module k through a predecessor
	//link at instant t Function f is a triangular norm that combines the strength 
	//and dynamic relevance of a goal. The term ex_j is the value of the effect
	//proposition that is the target of a link
	
	float activation_a = CParameters.gamma * CParameters.triangularnorm()*CParameters.ex_j;

	


}



