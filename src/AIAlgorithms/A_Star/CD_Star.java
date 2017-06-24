package AIAlgorithms.A_Star;

//Book 5

public class CD_Star {

	/*
	 * D* takes map graph as input
	 * During traveresal it checks to see if there are any modifications to the map
	 * When a modification is detected, when there is, D* starts from the node in which there has
	 * been a change and modifies the proposed path only in the affected area
	 * 
	 * D* maintains a list of open states which is used to process states and to expand the computing
	 * to the affecvted neighbors of the current examined node
	 * At the beginning, all nodes are marked NEW
	 * They become OPEN w hen they are inserted into the Open LIst
	 * After their computation they are marked CLOSED
	 * 
	 * D* maintains an explicit list of these tags for each node, referred to as Tag(x)
	 * Backpointer(x) is intended as the direction to follow to arrive to the goal
	 * From each node x, if we follow Backpointer(x) we arrive at the goal following
	 * a shortest path. The cost of a path is the sum of all edges traversed when following it
	 * 
	 * H(x) is defined as the eswtimated distance from x to the goal.
	 * After a replan, H(x) is the minimum distance to the goal
	 * 
	 * The key f unction K(x) is defineed as the minimum between:
	 * 		H(x) before a modification occurs
	 *		All H(x) values since x was placed in the  open list
	 *Based on K(x) value and H(x) value we consider two types of nodes:
	 *
	 *RAISE K(x) < H(x): The class of nodes used when there is a cost increase in the
	 *					graph and we must propagate this information to all nodes affected
	 *LOWER K(x)= H(X): The class of nodes used when there is a cost decrease in the graph and we must 
	 *					propagate this information to all nodes affected
	 *
	 *
	 *ProcessState() <- initial pathfinding found by calling ProcessState repeatedly
	 *					backpointers tell us which direction we should follow to minimi xze the total cost of our path
	 *
	 *ModifyCost(x,y,value)  <- changes the arc cost from x to y and inserts the node x in the open list if its a closed node
	 *							next calls ProcessStatewhile there are nodes on the open list whose distance from the goal
	 *							that are lower than the one of the current node
	 *							In this way D* modifies only the backpointers of affected nodes. 
	 */
	
}
