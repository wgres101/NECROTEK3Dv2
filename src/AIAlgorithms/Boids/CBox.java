package AIAlgorithms.Boids;

import java.util.Vector;

public class CBox {


	Vector<CFlock> flocks = new Vector<CFlock>();

	//creates a box with a default values of 50 meters
	
	CBox (float lv=50.0, float wv=50.0, float hv = 50.0);
	
	//miscellaneous functions
	
	//Get Box Length
	float GetBoxLength();
	
	//Get Box Width
	float GetBoxWidth();
	
	
	//Get Box Heigh t
	float GetBoxHeight();
	









}
