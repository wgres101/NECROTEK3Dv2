package AI.State.ExtendedBehaviorNetwork;

public class CConflictLink {

	
	//the activation that goes from a goal i to a module k through a conflict link at an instant t
	
	float activation = -CParameters.delta*CParameters.triangularnorm()*CParameters.ex_j;
	
	
	
}
