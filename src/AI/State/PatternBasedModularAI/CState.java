package AI.State.PatternBasedModularAI;

import java.util.ArrayList;

import AI.State.PatternBasedModularAI.Behavior.CBehavior;

public class CState {

		//one behavior per state
	
	//list of transitions from state to other states using transition object
	ArrayList<CTransitions> listOfTransitions = new ArrayList<CTransitions>();
	
	CBehavior behavior = new CBehavior();
}
