package AI.Algorithms.A_Star2;

import java.util.ArrayList;

public class Location {

	
	int costFromStart = 0;
	
	int costToGoal = 0;
	
	int totalCost = 0;
	
	Location parent = null;
	
	ArrayList<Location> successors = new ArrayList<Location>();
	
	
	
}
