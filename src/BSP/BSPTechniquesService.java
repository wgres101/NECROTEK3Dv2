package BSP;

import java.util.ArrayList;

//GEMS 6

public class BSPTechniquesService {

	/* 
	class TPlane { }
	
	class TPolygon { }
	
	class TNode
	{
		TNode front;
		TNode back;
		TNode parent;
		ArrayList polygons;
		TPlane plane;
	}
	
	public class NodeBasedBSP {
	
	TNode BuildBSP(ArrayList<TPolygon> polygons, TNode node)
	{
		if (polygons.isEmpty()
				return null;
		ArrayList front_list;
		ArrayList back_list;
		
		TPolygon polygon = Pick_Splitter_AndRemove(polygons);
		node.plane = polgyon.GetPlane();
		node.polygons.add(polygon);
		for (TPolygon polygon : polygons)
		{
			if (polygon is in front of node.plane)
				front_list.add(polygon);
			else if (polygon is on back of node.plane
					//split the polygon with the splitter plane
					//and add the polygon fragments accordingly
			else if (polygon is not coplanar with node.plane)
					TPolygon front_polygon, back_polygon;
					SplitPolygon(polygon, front_polygon, back_polygon;
					back_list.add(back_polygon);
					front_list.add(front_polygon);
			
			//add all polyogn fragments into this node		
					
			else
					node.polygons.add(polygon);
			
		}
		
		BuildBSP(front_list, node.front;
		BuildBSP(back_list, node.back);
		
	}
	
	
	public void Render(pomt camera_position TNode node)
	{
		//camera is on the front of the nocdes plane
		if Distance(camera_position <0 && node.plane < 0)
		{
			Render(camera_position,node.front);
			Render(node.polys);
			Render(camera_position, node.back);
		}
		
		//camera is on the back of the nodes plane
		
		else
		{
			Render(camera_position, node.back);
			Render(node.polygons;
			Render(camera_position,node.back);
		}
	}

	class ConvexLeafyBSP
	{
		TNode BuildSolidLeafBSP(ArrayList<polygon> polygons, TNode node)
		{
			ArrayList front_list;
			ArrayList back_list;
			
			//pick a splitter among polyggons Avoid picking a splitter
			//chosen before as a splitter
			Polygon polygon = Pick_Splitter(polygons);
			
			//Flag the polygon as beoinjg a spltiter
			
			FlagAsSplitter(polygon);
			front_list.add(polygon);		//add it to front listg
			node.plane = polygon.GetPlane(); //store it in the node
			
			for (Polygon polygon : polygons)
			{
				//partition all the polygons against the splitter
				if (polygon is on front of node.plane)
				{
					front_list.add(polygon);
				}
				else if (polyogn is on back of node.plane)
				{
					back_list.add(polygon);
				}
			
				//split the polygons with the splitter plane\
				else if (polygon is not coplanar with node.plane)
				{
					Polygon front_polygon, back_polygon;
					SplitPolygon(polygon, front_pollygon, back_polygon)
					back_list.add(back_polygon);
					front_list.add(front_polygon);
				}
				
				else if (polygon is coplanar with node.plane)
				{
					if (polygon is facing as node.plane)
					{
						front_list.add(front_polygon);
					}
					else
					{
						back_list.add(back_polygon);
					}
				
				}
			
			}
			
			if (IsConvex(front_list) || AllPolygonsAreSplitters(front_list))
			{
				//Front node is a leaf storing all the polyoghns
				//They form a convex space bordered by leaf polygons
				 node.front.polygons = front_list;
				 
			}
		
			else
			{		BuildBSP(front_list, node.front);
			}
			if (IsEmpty(back_list))
			{
				//back leaf is null indicating a solid space.
				node.back = 0;
			}
			
			else 
			{
				BuildBSP(back_list, node.back);
			}
			
		}
		
		class ConvexLeafyBSPPortals
		{
			FindPairTouchingLeaves()
			{
				for (Leaf leaf1 : Leaves)
				{
					for (Leaf leaf2 : Leaves)
					{
						if leaf1 == leaf2
								continue
						if (leaf1.box tocuhes(leaf2.box))
						{
							//find common parent of both leaves
							//nuild there a huge polygon
							//This is the initial portal
							Node node = FindCommonParent(Node)leaf1, (Node)leaf2)
							Portal portal = CalculateInitialPortal(node);
							//clip intial portal with leaf sizes
							ClipWithLeavesSides(leaf1, portal);
							ClipWithLeavesSides(leaf2, portal);
							
							//remaining polygons are valid portals
							listBSPTree.Portals.Add(portal);
						}
					}
				}
			}
		}
	
			
			
*/			
}

	