package MathOptimization;

//gems 2 math
/*
public class RecursiveDimensionalClustering {

	
	//detects objects in contact with other objects
	
	/* pseudocode
	 * void RDC( Pairs &pairs, Group & group, Axis axis1, Axis axis2, Axis axis3)
	 * {
	 * 	//pairs holds all final pairs that are in collision
	 *  //group is the current group of objects to analyze
	 *  //axis1 is the axdis to analyze within this function
	 *  //axis2, "a3" will be analyzed in recursive calls
	 *  
	 *  if (Size (group) < 10 || axis1 == INVALID_AXIS)
	 *  {
	 *  	//end recursion and test for collisions\
	 *  	//recursion halts and minimal cluster is found
	 *  	BruteForceComparison(pairs, subGroup)
	 *  }
	 *  else {
	 *  	OpenCloseBoundaryList boundaries;
	 *  	FindOpenCloseBoundaries(axis1, group, boundaries);
	 *  	SortOpenCloseBoundaries (boundaries); //O(nlogn)
	 *  	
	 * 		Group subGroup;
	 * 		unsigned into count = 0;
	 * 		Axis newAxis1 = axis2;
	 * 		Axis newAxis2 = axis3;
	 * 		Axis newAxis3 = INVALID_AXIS;
	 * 		
	 * 		//subdivide the group if possible and call recursively
	 * 		for ( ever y curBoundary in boundaries list)
	 * 		{
	 * 			if (curBoundary is "open bracket")
	 * 			{ //this entity lies within a cluster group
	 * 			  count++;
	 * 			 AddToGroup( subGroup, curBoundary->entity);
	 * 			}
	 * 			else
	 * 			{
	 * 			  count--;
	 * 			  if (count == 0)
	 * 			  {
	 * 				//found the end of a cluster group - take subgroujp
	 * 				//and call recrusively on remaining axis'
	 * 
	 * 				if (curBoundary != GetLastBoundary( boundaries)
	 * 				{
	 * 					//this group is being subdivided, remember
	 * 					groupSubdivided = true;
	 * 				}
	 * 				if (groupSubdivided)
	 * 				{
	 * 					//reconsider all other axis'
	 * 					if (axis1 == X_AXIS  ) {
	 * 						newAxis1 = Y_AXIS;
	 * 						newAxis2 = Z_AXIS:
	 * 					}
	 * 					else if (axis1 == Y_AXIS) {
	 * 						newAxis1 = X_AXIS;
	 * 						newAxis2 = Z_AXIS;
	 * 					}
	 * 					else if (axis == Z_AXIS) {
	 * 						newAxis1 = X_AXIS;
	 * 						newAxis2 = Y_AXIS;
	 * 					}
	 * 				}
	 * 			}
	 * 			
	 * 			//recursive call
	 * 			RecursiveClustering( pairs, subGroup, newAxis1, newAxis2, INVALID_AXIS);
	 *			Clear (subGroup); //clear the subgroup for the next group
	 *		}
	 *	}
	 *}
	
	
	
}
*/