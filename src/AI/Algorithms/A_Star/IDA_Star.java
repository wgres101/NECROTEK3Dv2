package AI.Algorithms.A_Star;

//iterative deepening A*


public class IDA_Star {

	/*
	 * root = start node
	 * threshold = root's g())
	 * 
	 * perform depth first search starting at root
	 * 
	 * if goal not found
	 * 		set threshold = minimum g() found that is higher than current threshold
	 * 		repeat depth first search starting at root
	 * 
	 * 
	 * depth-first-search(node)
	 * if node = goal
	 * 		return goal found
	 * 	if node's f() > threshold
	 * 		return goal not found
	 * 	else
	 * 		for each child of node, while goal not found, depth0first-search(child)
	 * 
	 */
	
}
