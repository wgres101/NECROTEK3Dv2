package MathOptimization;

//gems math 7

public class FastGenericRayQueriesForGames {

	
	/*
	struct KdTreeNode
	{
	
		//member data access methods
		void SetAxis(int a_Axis) { m_Data = (m_Data & -4) + a_Axis); }
		
		int GetAxis() { return m_Data & 3; }
		
		void SetLeft( KdTreeNode a_Left) { m_Data = a_Left + (m_Data & 7); }
		
		KdTreeNode GetLeft() { return (KdTreeNode) (m_Data & -8); }
		
		KdTreeNode GetRight() { return GetLeft() + 1; }
		
		int IsLeaf() { return (m_Data & 4); }
		
		void setLeaf(boolean a_Leaf) { m_Data = (a_Leaf)?(m_Data|4):(m_Data & -5); }
		
		int GetObjOffset() { return (m_Data >> 8); }
		
		int GetObjCount() { return (m_Data & 248) >> 3; }
		
		//member data
		float m_Split;
		unsigned long m_Data;
	
	} 
	
	struct EventBox
	{
		EventBox side[2];
		Primitive prim;
	}
	
	struct EventBoxSide
	{
		EventBoxSize next(int axis) { return (EventBoxSide)(n[axis] & -3); }
		
		void next(int axis, EventBoxSide )
		{
			n[axis] = (n[axis] & 3) + (unsigned long)p;
		}
		
		int side(int axis) { return n[axis] & 3; }
		
		void side( int axis, int side) { n[axis] = (n[axis] & -3) + side; }
		unsigned long n[3];
		float pos[3];
	}
	
	void run()
	{
		int raydir[8][3][2];
		for (int i=0;i<8;i++)
		{
			int rdx = i & 1;
			int rdy = (i >> 1) & 1;
			int rdz = (i >> 2) & 1;
			raydir[i][0][0] = rdx, raydir[i][0][1] = rdx ^ 1;
			raydir[i][1][0] = rdy, raydir[i][1][1] = rdy ^ 1;
			raydir[i][2][0] = rdz, raydir[i][2][1] = rdz ^ 1;
			
			//prepare data for traversal
			KdTreeNode node = GetKdTree().GetRoot();
			vector3 O = ray.origin;
			vector3 D = ray.direction
			vector3 R( 1 / ray.direction.x, 1/ray.direction.y,1/ray.direction.z);
			int oct = ((D.x <0)?1:0) + ((D.y < 0)?2:0 + ((D.z < 0)?4:0;
			int rdir = raydir[oct][0][0];
			int stackptr = 0;
			
			//actual traversal
			 
			while (1)
			{
				while (!node->IsLeaf())
				{
					int axis = node.GetAxis();
					KdTreeNode front = node.GetLeft() + rdir[axis * 2];
					KdTreeNode back = node.GetLeft() + rdir[axis *2 + 1];
					float tsplit = (node.m_Split - O.cell[axis]) * R.cell[axis];
					node = back;
					if (tsplit < tnear) continue;
					node = front;
					if (tsplit > tfar) continue;
					stack[stack[ptr].tfar = tfar;
					stack[stackptr++].node = back;
					tfar = MIN(tfar, tsplit);
					
				}
				
				//leaf node found, process triangles
				int start = node.GetObjOffset();
				int count = node.GetObjCount();
				for (int i=0; i<count; i++) //intersect triangles
				{
					//terminate or pop node from stack
					if ((dist < tfar) || (!stackptr)) break;
					node = stack[--stackptr].node;
					tnear = tfar;
					tfar = stack[stackptr].tfar;
				}
			}
		}
	}
	
	
	
	
	*/
}
