package GameMap;

import java.util.HashMap;
import java.util.Iterator;


//Every object has a hexagonal sub map index
//Each hexagonal sub map has a set of coordinates it covers
//Instead of LOS calculations for every object
//we can calculate the range between multiple objectes
//and only submit for rendering those within range

//Every object has a range value that is computed
//

//Each hexagon has six neighbors
//No two tiles share only one vertex
//No two tiles share more than one edge

public class HexagonalSubMap {

	
	enum direction {
		DIRECT_NORTH,
		DIRECT_SOUTH,
		DIRECT_NORTHWEST,
		DIRECT_NORTHEAST,
		DIRECT_SOUTHWEST,
		DIRECT_SOUTHEAST
		
	};
	
	public HashMap<Integer, Integer> SkewHexagon = new HashMap<Integer, Integer>();
		 
	public HexagonalSubMap retrieveHexagon(HexagonalSubMap hexmap, direction dir) {return null; }
	
	public void setHexagon(int x, int y) { }
	
	public Hexagon getHexagon() { return null;}
	
	public Iterator getIterator() { return null; }
	
	public Hexagon [] getNeighbors() { return null; }
}
