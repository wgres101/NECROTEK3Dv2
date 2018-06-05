package MathOptimization;

public class FastRigidBodyCollisionDetectionFarthestFeatureMaps {

	
	//Math 7 GEMS
	
	
	class Node
	{
		int Index;
	}
	/*
	class VertexNeighborhood
	{
		Vector<Plane> Faces;
		Vector <DWORD> Triangles;
		Vector <Pair < DWOARD,DWORD> > Edges;
		Vector3 CenterOfBestFittingSphere;
	}
	
	public void run()
	{
		lastC_1 = lastC_2 = null;
		Connect the two centroids C_1C_2
		Find the distance C_1C_2 between two centroids
		Find the distance d_1 and d_2 to fathest features along C_1C_2
		
		while (C_1C_2 < d_1 + d_2 || lastC_1 != C_1 || lastC_2 != C_2>)
		{
			lastC_1 = C_1;
			lastC_2 = C_2;
			C_1 = center of best fitting sphere at farthest feature of object 1
			C_2 = center of best fitting sphere at farthest feature of object 2
			d_1 = Distance to farthest feature along C_1C_2 from C_1
			d_2 = Distance to farthest feature along C_2C_1 from C_2
		}
	}
	
	 */
	//when the algorithm concludes you are left with two farthest features from two objects nad their 
	//ring-1 neighborhooods. For a typucal game mesh, these two triangle fans will have around six
	//triangles each. At this point you have to determine if a triangle fan from the triangle-fan for one
	//object intersects with any triangle from the triangle-fan corresponding to the other object.
	//You thus are left with having to do triangle-triangle intersections tests for typically 
	//36 (triangle-triangle) pairs. 
}
