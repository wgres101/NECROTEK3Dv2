package AI.State.AdaptiveTacticSelection;

//Book 8 Section 3.6

public class CAdaptiveTactics {

	
	/*
	 * Choose Tactic from Tactics Library closest to K
	 * If enemies fall within the Tactics Sphere use that tactic
	 * Calculate fitness function:
	 * f(t) = 1/10(7*A(t) + 3*S(t))
	 * where A is [-1,1] difference in ilfe caused by the tactic
	 * and S [-1, 1] evaluates the surprise of the attack
	 * A surprise is the anticipation of an experience that doesn't happen
	 * 
	 * A(t) = (hl(opp)-hl(NPC))/100
	 * hl(opp) is health lost from opponent
	 * hl(NPC) Is health lost from the NPC
	 * 
	 * S(t) = [ (hl(opp) - hl(NPC)) - AvgLifeLost ]/ 200
	 * AgLifeLost contains the average difference in life caused by the tactic
	 * from the previous weight n updates
	 */
	
	/*
	 * 
	 */
	
	
}
