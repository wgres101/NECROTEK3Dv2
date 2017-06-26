package AI.Algorithms.A_Star;

public class CA_Star {
/*
 * List OpenList, ClosedList
 * 
 * AStarPathFinder(Node startNode, Node targetNode, MovementCriteria movementCriteria, Path pathFound)
 * {
 * 		Node startNode, Node bestNode, Node successorNode
 * 		Cost newCost
 * 
 * 
 * 		reset OpenList and ClosedList
 * 
 * 		if (startNode fails MovementCriteria) return as failure
 * 		set startNode cost to 0
 * 		set startNode estimate to heuristic estimate of remaining cost to targetNode
 * 
 * 		set startnode value to sum of cost and estimate
 * 		set startnode parent to no parent
 * 		add startnode to openlist
 * 
 * 		while openlist is not empty
 * 		{
 * 
 * 			remove bestnode BestNode from OpenList
 * 			if BestNode is targetNode
 * 			{
 * 				construct path and save in pathfound
 * 				ret urn as success
 * 			}
 * 
 * 			for each successornode of bestnode
 * 			{
 * 				if (successornode fails movementcriteria) continue
 * 				set NewCost to sum of BestNode cost and cost of moving from BestNode to SuccessorNode
 * 				if (successor node is in open list or closed l ist)
 * 				and newcost is not less than successornode cost
 * 				continue
 *  
 * 				set successornode cost to newcost
 * 				set successornode estimate to heuristicf estimate of remaining cost to targetnode
 * 
 * 				set successornode value to sum of cost and estimate
 * 
 * 				set successornode parent to bestnode
 * 
 * 				if successornode is in closed list
 * 				{
 * 					remove succcessornode from closed list
 * 				}
 * 
 * 				if successornode is not in open list
 * 				{
 * 					add successornode to open list
 * 				}
 * 			}
 * 
 * 			add BestNode to closed list
 * 			}
 * 			return as failure
 * 					
 * 			
 * 
 */
	
	
}
