package Services.GeneralCodePerformanceServices;


//GEMES 5



// f = FORWARD * OP
// r = RIGHT * OP

//OP is the line from the eye to the point
//far is the far plane
//near is the near plane
//O is eye, behind the near plane

//
//CHECK IF POINT IS IN FRUSTRUM

//cVector2f OP = Point - EyePosition
//float f = OP * ForwardVector
//if (f < NearZ || FarZ < f) return false
//float r = OP * RightVector
//float rLimit  = rFactor * f;
//if (r < -rLimit || rLimit < 4) return false;
//
//up to here known to be in the frustrum
//return true

//FOV tangent (where FOV is the angle at the point of the frustrum)
//FOV tangent is the rFactor.
//rFactor = tan(FOV/2) oppositeside/adjacemtside = rLimit/f
//rFactor = rLimit/f
//rLimit = rFactor * f

//
//To three dimensions:
//uFactor = rFactor * ViewAspect
//UpVector directly extracted from camera just as Forward and Right Vectors (see triangle)
//Using the point P, the UpVector, and uFactor, a projection U and uLimit may be calculated.
//If not between uLimit variables the point is out of the frustrum











public class ImprovedFrustrumCullingService {

}
