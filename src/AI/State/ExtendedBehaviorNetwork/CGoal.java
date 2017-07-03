package AI.State.ExtendedBehaviorNetwork;

import java.util.Vector;

public class CGoal {

	//goal proposition
	CProposition condition = new CProposition();
	
	//context propositions that fired to get to this goal?
	//a goal without a relevance condition amounts to a goal that
	//is always relevant
	Vector<CProposition> relevance_condition = new Vector<CProposition>();
	String name;
	
	
	float strength; //provides the static context independent importance of the goal
					//and the relevance condition provides the dynamic, context-dependent one
	
}
