package TerrainAnalysisi;

public class CPolygon {

	Vector<C2DPoint> mPoints = new Vector<C2DPoint>(); //all the vertices of the polygon
	C2DRectangle mBoundingBox = new C2DRectangle(); //Quick representation of the area of the polygon
	C2DPoint mCenterPoint = new C2DPoint();    //center of mass point. handy for making quick fuzzy decisions
												//about distances to a polygon
	float mArea; 

	calculateArea() { }   //determines the area of the polygon or hull
	clearPolygon() { }    //clears the polygons data
	contains()  { }  //does a fast point in rectangle check before calling the more expensive 
					//containsInPOly() method
	containsInPoly() { }
	create() { } 	//this create the polygon, and an optionoal sorted flag is passed as an optimization for shapes like convex hull
	createCenterPoint() { } //computes the center point using the appropriate algorithm
							//one way to compute the center point is the center of mass method
	expand() { } 			//A handy method for increasing gthe size o polygons propertionally by expanding outward
							// asimple expand algorithm woujdl be to draw a line from each vertex to the center pointand project that vertex
							// a way from the center
	getClosestPoint() { }   // returns a potentially fabricated point on the hull. Its a good idea to ahve two closest point methods
							// one for returning the closest vertex and one for returning theclosest line intersection point onthe hull or poly
	getClosestPoints() { } 	// use this method to find the closet point given two polyogns or convex hulls
	
	getIntersecftion () { } // returns true if the two polygons intersect and can optionally create a polygon representing the intersection
	
	sortPoints() { } 		// template function that sorts points
	
	trimToVitalPoints() { } // this si where the convex hull creation algorithm should run. however a normal polygon would probabnly do nothing in this method
	

}


