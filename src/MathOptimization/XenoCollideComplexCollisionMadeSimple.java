package MathOptimization;

//Math 7 gems

public class XenoCollideComplexCollisionMadeSimple {

	
	/*
	 * 
	 * Phase 1: portal discovery
	 * find_origin_ray();
	 * find_candidate_portal();
	 * while (oirigin ray does not intersect candidate)
	 * {
	 * 		choose_new_candidate();
	 * }
	 * 
	 *Phase 2: Portal Refinement
	 * 
	 * while (true)
	 * {
	 * 	if (origin inside portal) return hit;
	 *  find_support_in_direction_of_portal();
	 *  if (origin outside support plane) return miss;
	 *  if (support plane close to portal) return miss;
	 *  choose_new_portal():
	 * }
	 * 
	 * 
	 * 
	 * find_origin_ray step
	 * Find a point known to be in the interior of the Minkowski difference B-A
	 * Minkowski difference is the subtraction of one convex shape from another
	 * Such a point can be easily obtrained by taking a  point known to be inside B
	 * and subtracting a point known to be inside A. The center of mass is a convenient one to use.
	 * 
	 * The interior point is an important one buecause it lies on the inside of B-A
	 * If the ray drawn from the interior point through the origin, called the origin ray,
	 * passes throught he surface of b-A before it encounters the origin, the origin lies outisde
	 * of B-A. Conversely, if the ray passes through the origin before the surface, the origin is inside B-A
	 * 
	 * find_candidate_portal step
	 * 
	 * Uses the support mapping of B-A to find three non-collinear points on the surface of B-A that form a triangular
	 * portal through which the original ray may or may not pass.
	 * There are many ways to obtain three non-collinear surface points. XenoColllide uses the following support points:
	 * 
	 * ///Find support in the direction of the origin ray
	 * /// V1 = S(normalize(-V0) );
	 * 
	 * ///Find support perpendicular to plane containinng origin, interior point, and first support
	 * V2 = S(normalize(V1 X V0) );
	 * 
	 *  ///Find support perpendeicular to plane containing interior point and first two supports
	 *  V3 = S( normalize(((V2-V0) X (V1-V0)) );
	 *  
	 *  while(origina ray does not intersect candidate) Step
	 *  Test the candidate triangle to determine whether the origin ray intersects it.
	 *  Do this by testing whether the origin lies on the i nside of each of the three planes
	 *  formed by the triangle edges and the interior point - (v0,v1,v2); (v0,v2,v3); (v0,v3,v1). If the origin
	 *  lies within all three planes you've found a valid portal and can move on to the next step
	 *  If not, you need to choose a new portal cadidate and try again.
	 *  
	 *  The choose_new_candidate step
	 *  
	 *  If the origin lies outside the planes, use that plane's outer-facing normal to find a new support point. This
	 *  new support point is used to replace the triangle vertex that lies on the inside of the plane.
	 *  The resulting support points provide you with a new portal candidate. Repeat the loop until youj
	 *  get a hit.
	 *  
	 *  if(origin insdie portal) return hit Step
	 *  
	 *  The points V0, V1, V2, and V3 form a tetraheadron. Due to the convexity of B-A, this entire tetrahedron
	 *  lies inside B-A. If the origin lies within the tetraheadron, it must also lie in B-A.
	 *  You know that the origin lies within three of these faces, because the origin ray starts at V0
	 *  and pass through the portal, which form sthe opposite side of the tetrahedron.
	 *  IF the origin lies iwthin the portal, it lies within the tetrahedron and therefore lies within B-A. 
	 *  
	 *  (find_support_in_direction_of_portal Step
	 *  
	 *  If you make it here you know the origin lies on the far side of the portal. However you don't know
	 *  whether it lies within B-A nearby on the outside of the portal or whether it lies completely outside
	 *  of B-A. You need more information aboujt what lies on the far side of the portal, so you should use the exterior facing normal of the portal to
	 *  obtain a new support point that lies outisde of the portal's plane
	 *  
	 *  if(origiin outside support plane) return miss Step
	 *  
	 *  If the origin lies outside ofthe new suppport plane formeed by the support normal and new support points
	 *  the origin lies outside B-A and the algorithm returns a miss
	 *  
	 *  choose_new_portal Step
	 *  
	 *  The origin lies between the portal nad the support plane so you need to refine your search by finding a new portal 
	 *  tha t is closer to the surface of B-A. Consider the tetrahedron formed by the support point and portal.
	 *  The origin passes into the tetrahedron through the portal and is therefore guaranteed to exit the tetraheadron through one
	 *  of the three outer faces formed by the support point and the three edges of the portal. This step determines which of the three outer faces the ray passes through
	 *  and replaces the old portal with this new portal. To determine which of hte three outer faces the origin ray passes through, you test the
	 *  origin against hte three plnaes: (V4,V0,V1);(V4,V0,V2);(V4,V0,V3).
	 *  The origin will lie on the same side of two of these planes. The face that borders these two planes becomes the new portal.
	 *  
	 *  
	 *  if (support plane close to portal) return MIss Step
	 *  
	 *  As the algorithm iterates, the refined portals will rapidly approach the surface of B-A. 
	 *  HOwever, if B-A has a curved surface, the origin may lie infinitesemmily close to this curved surface. In this
	 *  case the refineed portals may require an arbitrary number of iterations to pass the origin. To terminate under these conditions,
	 *  you have to rely on a tolerancde. When the portal gets suficciently close to the surface youj terminate the algorit hm. You can terminate
	 *  a hit or a miss, dependin gon whether you prefer to err on the side of imprecise positive or negative results.
	 *  
	
	
	
	 * 
	 * 
	 */
	
}
