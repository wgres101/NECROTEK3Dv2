package AI.State.ExtendedBehaviorNetwork;

public class CModuleThroughConflictLink {

	//a_conf and p_conf stand for the activation and 
	//proposition of the module that is the source of the conflict link
	float a_conf;
	float p_conf;
	
	float a_activation = -CParameters.delta*CParameters.sigma(a_conf)*CParameters.ex_j*CParameters.tau(p_conf);

}
