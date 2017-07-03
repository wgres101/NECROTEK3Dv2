
package AI.State.PatternBasedModularAI.States;

import AI.State.PatternBasedModularAI.Transitions.CChaseThenDodge;
import AI.State.PatternBasedModularAI.Transitions.CChaseThenShoot;
import AI.State.PatternBasedModularAI.Transitions.CDodgeThenChase;
import AI.State.PatternBasedModularAI.Transitions.CShootThenChase;

public class CChase {

	public  CChaseThenDodge cd = new CChaseThenDodge();
	public  CChaseThenShoot cs = new CChaseThenShoot();
	public  CDodgeThenChase dc = new CDodgeThenChase();
	public  CShootThenChase cc = new CShootThenChase();
	
	//chase then shoot
	//chase then dodge
	/*Chase->Shoot
	if (CLineOfSight && )
		it hsa been at least two seconds since our last shot
		it has been one second since our last dodge
		the players ehaoth is over 0 percent (not dead)
		transition to the shoot state
	chase->dodge
	
	if (LIghtOfSight &&)
		the player is aiming at us
		it has been one second since our last shot
		it has been five seconds since our last dodge
		our health is below 60 percent
		our health is less than 1.2 percent of the players health
		transition to the dodge state
	shoot->chase
		weve completed the shoot section
		transition tothe chase state
	dodge->chase
		we've completed the dodge action
		transition to the chase state
	/*
}
