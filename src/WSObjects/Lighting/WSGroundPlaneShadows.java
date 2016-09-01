package WSObjects.Lighting;

import Tweaker.Tweakable;
import UtilityTypes.Mat4;

//uses ground plane shadows

public class WSGroundPlaneShadows {

	
	//vertex = C*S*T*m
	//T converts model m to world space
	//S is the shadow projection matrix
	//C is the camera transformation from world space to to view space
	
	//Shadow Projection Matrix:
	
	// [ 1 k1 0 0 ]
	// [ 0 0  0 0 ]
	// [ 0 k2 1 0 ]
	// [ 0 0  0 1 ]
	
	//where k1 = (ox - lx)/ly (ox-lx) distance from object to the light
	//
	// and k2 = (oz - lz)/ly  (distance from object to the light
	// and ly is the height of the light
	
	Mat4 shadowProjectionMatrix = new Mat4();
	
	
	public void Update() {
		Tweakable.tweak(shadowProjectionMatrix, shadowProjectionMatrix);
		Blackboard.GameBlackboard.registerVariable("shadowProjectionMatrix", shadowProjectionMatrix);

		
	}
	
	
	
	
	
	
	
	
	
	
}
