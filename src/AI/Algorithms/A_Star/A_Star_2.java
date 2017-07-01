package AI.Algorithms.A_Star;

public class A_Star_2 {

	/*
	 * open - priority queue of search nodes
	 * closed - searchable container of search nodes (such as an associative array)
	 * 
	 * 
	 * root start node
	 * push root onto open
	 * 
	 * while goal not found and open not empty
	 * 		sort open by f() of each search node
	 * 		remove top of open and set to ccucrrent node
	 * 		if current node = goal
	 * 			stop
	 * 		else
	 * 			pushs current node onto closed
	 * 			
	 * 		for each child of current node
	 * 			if child present in closed
	 * 				continue
	 * 			else set child's f() = g() + h() 
	 * 				push child onto open
	 */
}
