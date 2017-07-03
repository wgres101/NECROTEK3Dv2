package AI.State.PatternBasedModularAI.States;

import AI.State.PatternBasedModularAI.Transitions.CChaseThenDodge;
import AI.State.PatternBasedModularAI.Transitions.CChaseThenShoot;
import AI.State.PatternBasedModularAI.Transitions.CDodgeThenChase;
import AI.State.PatternBasedModularAI.Transitions.CShootThenChase;

public class CShoot {
	public  CChaseThenShoot cs = new CChaseThenShoot();
	public  CShootThenChase cc = new CShootThenChase();
	
}
