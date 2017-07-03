package AI.Algorithms.A_Star;

public class CFringeSearch {
/*
 * 	now	-	linked list of search nodes, list order determines order of evaluation
 * later -  linked list of search nodes
 * 
 * root - start node
 * threshold - root's g()
 * 
 * push root into now
 * 
 * while now not empty
 * 		for each node in now
 * 			if node = goal
 * 				stop
 * 			if node's f() > threshold
 * 				push node onto end of later
 * 			else
 * 				insert children of node into now behind node
 * 
 * 			remove node from now and discard
 * 		
 * 		push later onto now, clear later
 * 		set threshold = minimum g() found that is higher than current threshold
 * 	
 */
}
