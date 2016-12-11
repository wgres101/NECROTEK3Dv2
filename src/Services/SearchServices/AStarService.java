package Services.SearchServices;

import java.util.ArrayList;
import java.util.PriorityQueue;

import Services.AIServices.DataTypes.ANode;

public class AStarService {

	
	public static void search(ANode startLoc, ANode goalLoc)
	{
		PriorityQueue<ANode> open = new PriorityQueue<ANode>();
	
		ArrayList<ANode> closed = new ArrayList<ANode>();
	
		//initialize a start node
		
		ANode StartANode = new ANode();
		StartANode.loc = startLoc;
		StartANode.costFromStart = 0;
		StartANode.costToGoal = PathCostEstimate(startLoc, goalLoc);
		
		StartANode.Parent = null;
		
		open.add(StartANode);
		
		while (!open.isEmpty())
		{
			ANode  ANode = open.remove(); //ANode has lowest total cost
			
			//if at a goal we are done
			if (ANode.equals(obj))
			{
				//construct a path backwards from ANode to StartLoc
				//return success
			}
			
			else
			{
				for (ANode NewANode : ANode.successors)
				{
					int NewCost = ANode.costFromStart + TraverseCost( ANode, NewANode);
					//ignore this ANode if exists and no improvement
					
					if ((open.contains(NewANode) || closed.contains(NewANode)) && (NewANode.costFromStart <= NewCost))
					{
						
						
					}
					else
					{
						//store the new and improved information
						NewANode.Parent = ANode;
						NewANode.costFromStart = NewCost;
						NewANode.costToGoal = PathCostEstimate(NewANode.loc, goalLoc);
						NewANode.totalCost = NewANode.costFromStart + NewANode.costToGoal;
						if (closed.contains(NewANode))
						{
							closed.remove(NewANode);
						}
						
						if (open.contains((NewANode)))
						{
							//adjust newANode's location in Open
						}
						
						else
						{
							open.add(NewANode);
						}
								

					}


				}
			}
		}
	}






}
