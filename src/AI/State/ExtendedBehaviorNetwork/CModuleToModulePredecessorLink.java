package AI.State.ExtendedBehaviorNetwork;

public class CModuleToModulePredecessorLink {

	
	float p_succ; //proposition of the successor module
	float a_succ; //activation of the successor module
	float activation_a = CParameters.gamma*CParameters.sigma(a_succ)*CParameters.ex_j*(1-CParameters.tau(p_succ));
	
}
