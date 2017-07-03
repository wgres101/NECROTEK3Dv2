package AI.State.Needs_Based_AI;

public class CNeedsBased {

	/*
	 * Each agent has some of everchanging needs that need to be satisfied
	 * Agents looks around the area and sees what an be done on what's in the area
	 * Scores all those possibilities, based on beneficial they are
	 * Picks an appropriate one based on the score
	 * Finds what concrete seqeuence of action it requires and pushes it
	 * onto its action Queue
	 * 
	 * High level AI loop looks like:
	 * Whiel there are actions in the queue, pop off the next one, perform it,
	 * and maybe get a reward
	 * 
	 * Run out of actions, perfrom actions election based on current needs to find more actions
	 * IFf you still have nothing to do, do some fallback actions
	 * 
	 * action selection point:
	 * 1. Examines objects around you and find out what they advertise
	 * 2.Score each advertisement based on your current needs
	 * 3.Pick the best advertisement and get its action sequence
	 * Push the action sequence on your queue
	 * 
	 * Needs - example: to eat, drink, rest
	 * [0 to 100] 90 satiated, 10 starving to death
	 * 
	 * Each object in the world advertises a set of action/reward tuples
	 * for example a refrigerator might advertise "prepare food" with a reward of +30 hunger
	 * 
	 * Atoms chained, i.e.,
	 * Take a food item from the fridge->Prepare the food item on the counter -> Cookt he food item in the stove -> sit down and eat and get a hunger reward
	 * 
	 */
	
	
	
}
