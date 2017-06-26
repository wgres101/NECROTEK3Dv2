package AI.Algorithms.MachineLearningSimple;

import java.util.Vector;

//car example
//stop, movefwd, turnleft, turnright, movebwd


public class CActionState {

	Vector<CActionState> transitionList = new Vector<CActionState>();
	
	boolean allRulesFired;
	
	public void getRelevantTangentSet() { }
	
	public CActionRuleSet actionRuleSet = new CActionRuleSet();
	
	public void transition() { }
	
}
