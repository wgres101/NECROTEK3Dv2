package AIAlgorithms.A_Star;

//Book 5

public class CBeyondA_Star {

	
	/*
	 *  List OpenList, ClosedList
	 *  
	 *  BeyondAStarPathfinder(List startList
	 *  					 List stopList
	 *  					Node	targetNode
	 *  					MovementCriteria MovementCriteria
	 *  					Path	PathFound
	 *  {
	 *  	Node StartNode, BestNode, SuccessorNode
	 *  	Cost New Cost
	 *  	
	 *  	reset OpenList and ClosedList
	 *  
	 *  	for each StartNode in StartList
	 *  		i f(StartNode fails MovementCriteria) continue
	 *  		Set StartNode cost to 0
	 *  		set StartNode estimate to heuristic estimate of remaining cost to TargetNode
	 *  		set StartNode value to sum of cost and estimate
	 *  		set StartNode parent to NoParent
	 *  		add StartNode to OpenList
	 *  	}
	 *  
	 *  	while(OPenList is not empty)
	 *  	{
	 *  		remove best node BestNode from OpenList
	 *  		if Best Node is in StopList
	 *  		{
	 *  			construct path and save it in Pat hFound
	 * 				return as success
	 * 			}
	 * 			for each successor SuccessorNode of BestNode
	 * 			{
	 * 				if (SuccessorNode fails MovementCriteria) continue
	 * 				
	 * 				set NewCost to s um of BestNode cost and cost of moving from BestNode to SuccessorNode
	 * 				
	 * 				if ((SuccessorNode is in Open List or Closed List) and (NewCost is not less than SuccessorNode cost)
	 * 				continue
	 * 
	 * 				set SuccessorNode cost to NewCost
	 * 				set SuccessorNode estimate to heuristic estimate of rema ining cost to TargetNode
	 * 				set SuccessorNode value to sum of cost and estimate
	 * 				set SuccessorNode parent to BestNode
	 * 				if SuccessorNode is in ClosedList
	 * 					remove SuccessorNode from ClosedList
	 * 				if SuccessorNode is not in OpenList
	 * 					add SuccessorNode to OpenList
	 * 			}
	 * 			add BestNode to ClosedList
	 * 			}
	 * 			return as failure
	 * }
	 * 
	 *  
	 *  
	 *  
	 */
	
	
}
