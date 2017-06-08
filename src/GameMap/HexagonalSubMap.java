package GameMap;

import java.util.Iterator;


//Every object has a hexagonal sub map index
//Each hexagonal sub map has a set of coordinates it covers
//Instead of LOS calculations for every object
//we can calculate the range between multiple objectes
//and only submit for rendering those within range

//Every object has a range value that is computed
//

public class HexagonalSubMap {

	
	public void setHexagon(int x, int y) { }
	
	public Hexagon getHexagon() { return null;}
	
	public Iterator getIterator() { return null; }
	
	public Hexagon [] getNeighbors() { return null; }
}
