package GraphicsCentral;

//GEMS4

public class AdjustingRealTimeLightingForShadowVolumes {

	
	
	//for culling algorithm, use all three vertex normals instead of the single face normal
	//solves cullling problem but not shadow volume problem
	
	//best: compensate for the lightiing in the pixel shader
	//can use interpolated normals or per-pixel normlas from a normal map
	
	
	//interpolated vertex normals, HLSL code
	
	///float ComputeDAiffuseAdjustment(float diffuseNDoL)
	//{ 
	//  return saturate((diffuseNdotL * (5.0f/4.0f)) - (1.0f/4.0f));
	//}


	//perpixel normals
	
	//float  ComputeDiffuseBumpAdjustment(float diffuseNDotL, float diffuseBumpNdotL)
	//	{
	//    float adjustment = CompuiteDiffuiseAdjustment(diffuseBumpNdotL );
	//	  adjustment *= 1.0f - (pow (1.0f - ComputeDiffuseAddjustment(diffuseNdotL), 8.0f));
	//	  return saturate(adjustment)

	// this function makes two calls to the previous. First call is used exactly as the previous
	// except we are feeding the function the diffuse lighting based on the per pixel normal from the normal map
	// 
	
}

