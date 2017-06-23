package ConvexTerrainAnalysis;

public class CChokeSpot {
	
	
	public void mainloop {
	
		
	//do this first before the loop
	//cache the XY array position
	long theXY = ((theXLoop*theMaxX) + theYLoop);
	
	
	//if this tile is blocked, fill in the areas id
	if (CChokeSpot.isBlockedTile(inMap.GetTile(theXLoop, theYLoop), thexLoop, theYLoop, theAreaID)
	{
		//store t he blocking areas id and set a cost
		CChokeSpot.sTerrainIDMap[theXY] = theAreaID;
		CChokeSpot.sCostMap[theXY] = kBlockedCost;
		
	}
	else
	{
		CChockSpot.sTerrainIDMap[thexy] = 0;
		CChockSpot.sCostMap[thexy] = 0;
	}
		
		
		
		
		
		
		
	
	//copy the original map into choke point map
	CopyOriginalMapIntoChokePointMap(inMap, outMap);
		//inPasses controls how much area's aura grows
		for(theLoop = inPasses -1; theLoop > 0; theLoop--)
		{
			//copy the map (uses cached map from above the loop
			CopyOriginalMapIntoChokePointMap(inMap, theResultMap);
			
			//apply the algorithm
			ApplyChokePointAlgorithmToMap(theOutMap, theTempMap, theMaxx. theMaxy);
		}
	}
	
	//create the final choke points
	
	CreateChokePointAreas(inMap);
	
	
	
	
	
}
