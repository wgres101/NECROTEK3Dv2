package Services.AIServices.DataTypes;

import java.util.ArrayList;

import Services.SearchServices.Location;

public class ANode {


	public int costFromStart = 0;
	
	public int costToGoal = 0;
	
	public int totalCost = 0;
	
	public ANode Parent = null;
	
	public ArrayList<Location> successors = new ArrayList<Location>();
	
	public ANode loc;
	
	
}
