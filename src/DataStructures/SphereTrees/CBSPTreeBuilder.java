

//Book 5 Section 1.5

package DataStructures.SphereTrees;
/*
public class CBSPTreeBuilder {

	public void TestSplitCandidate(CSphereTreeNode pSphereTreeNode, boolean bTerminateEarl)
	{
		//Test sphere tree node with plane
		float fDistance = m_pCurCandidate.m_Plane.GetDistance(pSphereTreeNode.m_Bounds.m_vPosition);
		
		if (fDistance < -pSphereTreeNode.m_Bounds.m_fRadius)
		{
			//Tree Nodes completely in back
			m_dwBackCount += pSphereTreeNode.m_dwPolyCount;
			
		}
		else if (fDistance > pSphereTreeNode.m_Bounds.m_fRadius)
		{
			m_dwFrontCount += pSphereTreeNode.m_dwPolyCount;
		}
		
		else
		{
			//Sphere node possibly straddles the plane
			
			if (pSphereTreeNode.m_Polygons)
			{
				//This is a sphere tree leaf so we have to test
				//the plygons individually
				CPolygon pCurPoly = (CPolygon) pSphereTreeNode.m_pPolygons;
				while (p_Cur_Poly)
				{
					//Check for splits with the current candidate
					if (p_Cur_Poly != m_pCurCandidate)
					{
						switch(pCurPoly.GetSide(m_pCurCadidate. m_Plane))
						{
						case CPolygon.epsFRONT:
							m_dwFrontCount++;
							break;
						
						case CPolygon.epsBACK:
							m_dwBackCount++;
							break;
							
						case CPolygon.epsBOTH:
							//Ya this one causes a split
							m_dwSplits++;
							
							if (m_dwSplits > m_dwBestSplit)
							{
								bTerminateEarly = true;
								break;
								//too many splits
								//this candidate is a loser
								//discard it early
							}
							break;
								
							}
						}
						
						pCurPoly = pCUrPoly.m_pNext;
						
					}
				}
			else
			{
				//sphere tree node so test both chidlren
				if (pSphereTreeNode.m_pChildren[0] &&
						pSphereTreeNode.m_pChildren[0].m_dwPolyCount > 0)
				{
					TestSplitCandidate(pSphereTreeNode.m_pChildren[0], bTerminateEarly);
					
					
				}
				if (!bTerminateEarly && pSphereTreeNode.m_pChildren[1].m_dwPolyCount > 0)
				{
					TestSplitCandidate(pSphereTreeNode.m_pChildren[1], bTerminateEarly)
				}
		}
		
		}
	}
	
}
 */