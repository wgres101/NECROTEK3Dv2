package AI.FLINCH;

public interface IFlinchNotes {
/*
 * 
 * Behavior Trees

Uses proprietary FLINCH algorithm.

THE FLINCH ALGORITHM

Decision/Behavior Tree
Fuzzy Logic Deciders
A* Search to choose behaviors
Choice Database
Run a simulation to train decider’s fuzzy logic using backwards propagation on the behavior tree at least 100 times. 
The tree starts out completely balanced. As the simulations are run, scores are generated that effect which choices are
 made at the fuzzy logic/decider/finite state machine level. 
 

 * 
 *
 * The State Machines are deciders, where dynamic and or static stats are compared against the decision variables. 
 *  So this is a tree structure. Different behaviors occur depending on the different statistics (sliders).
 *   Each decider has a different cost according to the comparison between the state machines variable and its own stats.
The path with the lowest cost is the one that is chosen.

Here is an example using the graph from above

Cost: Move Under Fire 0
Cost: State Machine 1 –  Fuzzy Logic:::
			The following
Player Loyalty Statistic 10%  
Player Health Statistic: 20%
Cost: State Machine 2 – Fuzzy Logic::::
			The following
			Player Intelligence 90%
			Player Enginering Training 50%
			  

 

Behaviors

Use A* algorithm over a decision tree with the beginning of the behavior as the root of the tree and its leaves leading to one or
 more behaviors. At each branch of the decision tree the decision is made in a state machine fashion, i.e, if
  the player is low on health but high on morale he is more likely to do the “Move under direct fire” than a player that is 
  low on health and low on morale. I’m thinking about supervised learning and subsumption architcture but we may need to wait 
  until the future to do that. Also I have to integrate the charts/stats from the original design document.

BEHAVIOR HAS MULTIPLE MOTIVES ( EXAMPLE: YOU WENT T O EAT BECAUSE IT IS 12:00 NOON, YOU ARE ON BREAK FROM CLASS, YOU DIDN’T EAT BREAKFAST.ETC

 * 
 * 
 * 
 * Decision Tree Outline in Detail

The decision tree is a simple rooted tree that starts out as a hard-coded number of neutral nodes and children. 
A behavior is attached to each leaf. When the AI is initialized, it creates this tree for a soldier, completely neutral.
 The soldier picks a random path and randomly moves down the tree until he or she reaches a leaf node where a behavior is. '
 That behavior is executed and the results are either rewarded or punished depending on the outcome. The results are propagated 
 backwards up the tree back to the root either strenghtening or weakining that behavior path.
 



A* Search and Tree

Whenever an action is to be performed, the process begins by moving from the root down to the branch with the least g(x) path cost. 
The path cost is a combination of a trainable back-propagation variable, the same used to initially train the tree. The total decision
 is made of a fuzzy logic component and a series of comparisons of stats. The stats are compared to a set of master stats. Depending on
  the condition, the soldier’s g(x) score will go up or down. There are fifty conditions that are used in comparison with the 
  fuzzy logic to determine if that branch will be traversed to the next node.

Behavior Functionality
When a behavior (leaf) has been reached via the behavior tree, for example, our demo behavior fireAtEnemies which is of the 
behavior class, for all behaviors the Behavior Class function Behavior.run() is called.

Each Behavior class consists of a List of SubBehavior classes. Behavior.run() iterates through these SubBehavior classes.
The sub behavior classes are common amongst the Behavior classes. The sub behavior classes are hard-coded actions
that fulfill the Behavior. When behavior.run() iterates through each of its SubBehaviors in the list, for each SubBehavior there
is a simulate() function. The simulate function for the SubBehavior is a hard-coded action like, “Fire on Enemy”, “Dig in”, “Camoflauge”, Etc. 
The SubBehaviors are added to the list on Game Start.

For example:

(initialization)
…fireAtEnemies’ Behavior’s list is loaded with the SubBehaviors: Dig In, Camofluage, Open Fire

(In Game)
….a star search reaches the leave (behavior) fireAtEnemies
fireAtEnemies.run() is called

fireAtEnemies.run() 
{
	//list of subBehaviors in class
	//List<SubBehaviors> subBehaviorsList 
	for (SubBehaviors sb in subBehaviorsList)
	{
		sb.simulate();
	}
}

In this case, sb.simulate calls DigIn(), Camoflauge(), and OpenFire()
These sb.simulate calls, e.g., DigIn(), are hard coded.

HARD-CODED BEHAVIORS
Morale

Morale is initially set from the Base Morale.  To that, one-half of the difference between Mental Fitness and fifty is added using 
Equation 1 above.  As such, this is a percentile value.  One-fifth of the initial Mental Fatigue is subtracted from that result, again
 using Equation 1, to find the initial Morale value.

Low morale will cause troopers to refuse to attack or follow other orders and not respond quickly.  In combat, low morale will 
cause fighters to duck and hide more often then they return fire.  And, of course, very low morale, especial by an entire unit,
will many times result in fighters fleeing the field of battle for safety elsewhere.  These various effects are listed below.

Failed Attack Orders
When a warfighter first receives an attack order, it will check a percentile roll against its Morale.  
If the roll is greater than its current Morale, it will not fire at the enemy, otherwise, it attacks normally.  
This check is made every twenty seconds while under an attack order.  If the individual does not fire, it is just Ducking. 
 It does not accrue aiming time but will defend itself normally against Close Quarters Combat

Ducking From Enemy Fire
When a trooper first comes Under Fire, another check is made against its Morale.  If it fails, the individual stops what it is doing 
and just Ducks.  While Ducking, a check is made every ten seconds to see if it resumes its previous order.  If it is not Ducking while
 Under Fire, a Morale check is made every thirty seconds to see if the individual starts Ducking.  
Cower
When ever a person is under fire and Ducks, there is a chance it Cowers.  If a percentile roll is greater than twice its Morale, the 
individual Cowers.  Cowering individuals will do nothing but hug the ground.  They will not flee, move or fight (not even defending 
against Close Quarters battle).  However, they will get an additional 10% bonus to their current Concealment and Cover values as 
they strive to make themselves as small and unseen as possible.  When Cowering, soldiers can attempt to regain their composure once 
every sixty seconds, using the same chance they have to Cower in the first place.    


Experience
Experience is responsiveness to orders.  Following established Standard Operating Procedures and the current Rules of Engagement are 
also a result of good Experience.

The Base Experience is found from the database, then adding one-quarter of the Mental Fitness.  Again, equation 1 is used and 
this is another percentile value.  One-third of the initial Mental Fatigue is subtracted from that result, again using Equation 1,
 to find the initial Experience value.

Low Experience will cause troops to make independent decisions, thus ignoring issued orders or creating their own orders when not given any
Low Experience soldiers will move without regard to proper spacing or procedure.  They may even ignore the Rules of Engagement for a battle.
Low Experience results in reduced awareness of an individual’s surroundings and shortens aiming time.


Aiming Time
Low Experience will decrease the time spent aiming in accuracy of attacks.  To find the effect of Experience on aiming, divide 
Experience by 20.0 to find the aim time—0.0 to 5.0 seconds aiming.  Aiming affects the targeting arc by dividing it by 20 and 
subtracting that result from 1.1 to give a value from 1.1 (corresponding to an Aim Time of 0.0s or a Experience of 0) to 0.85 
(Aim Time of 5.0 sec/Experience of 100%). 

Awareness of Surroundings
Lack of Experience will reduce a fighter’s area awareness.  His range of awareness is reduced by one-half of the difference between 
100% and his current Experience.  For instance, a soldier with 70% Experience would have a 15% reduction in his awareness--(100-70)/2. 
Since LOS is done on a team level, each member of a team reduces the team’s awareness proportionally to the number of member, with the
 team leader counting twice.  For instance, in a four-man fire team, each member would have a 20% effect on the awareness, except the 
 leader, who has a 40% effect.


Follow Rules of Engagement
Following the Rules of Engagement requires Experience.  When confronted with a situation which would go against its ROE, like first
 seeing an enemy when a war fighter is in a Weapons Tight situation, it must make a Experience check against double its current Experience.

If the roll is higher, the ROE are ignored.  This will have a negative effect on the Experience of his teammates.
Maintain Formations
Reduced Experience will add variance into the spacing of a formation.  One-tenth of the difference between 100% and the team member’s
 Experience will be the range in meters a trooper could be out of place for each move order.  For example, a soldier with 55% Experience 
 could be up to 4.5 m out of place in his formation. 
 
Ignore Orders 
Fighters will ignore new orders if they fail a percentile roll against their Experience.  If a new order is ignored, the fighter will 
check every 5 seconds until they begin following the order or another order is received.  When ignoring an order, the individual will
 continue their last order, moving, firing, defending or whatever.



 */
}
