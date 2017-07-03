package Terrain.ConvexTerrainAnalysis;

import java.util.Vector;

//Book 3 Section 3.4

public class CMatchbox {

	Vector<CMatchboxListHeader> MPointArray;		//x axis representation of points. Each element in the array is a y (start-end) point rangeed list
	
	long mOffset;								//Odds are that it won't start with x = 0. In case, we can shift it (10,50) to (25, 99) for example
	
	long mSize;									//Number of points inside the container
	
	
	long mStart;
	long mEnd;
	
	
	public void buildPointList() { } 			//Fill the incoming vector with all of our points. Puts our poitns essentially in an array
	
	public void computeCenterPoint() { }		//Determines the center of mass to determine center of all these points
	
	public boolean contains(long inNum) { 					//REturns true if the passed-in point exists. (real or implied) inside this container
	
		return (inNum >= this.mStart && inNum <= this.mEnd);
		
	}
	
	
	
	public void create() { }					//Create our container from the passe din points
	
	public void getClosestPoint()	{ } 		//Odds are you are going to want to quickly retrieve the closest point passed in to a passed-in point or another matchbox container.
	
	public void getOnlyExtremeEdgePoints() { }		//This gets only the extreme edges of a polygon. AThis means if a contiennt is donut shaped, none of the inner-ring doughnot points would be returned. 
												//This is ideal for optimizing the computation of a convexd hull. It's a huge optimization to build a hull with 200 points instead
												//of 80,000. Its aslo possible to write a ver y fast convex hull creation method based on previously known extreme points and incorporating
												//the sorting implied in the storage of this structure
	
	public void getRandomPoint() { } 				//By passing in a random number generator, you can get a get-random point method that will be used often.
	
	public void insert() { }					//Javomg three insert methods is handy/ One method takes a point, another a vector of points, and third takes a matchbox class
												
	public void remove() { }					//Given a point or vector of points, the method should remove them from t he container.
	
	
}
