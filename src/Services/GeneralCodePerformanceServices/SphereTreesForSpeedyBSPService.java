package Services.GeneralCodePerformanceServices;

//GEMS 5





// Sphere trees can be built an order of magnitude faster than a BSP
// To build a sphere tree we want a fast and dirty way of the
// partitioning soup. And optimality in sphere tree is not necessaru

//First calculate a bounding sphere enclosing all the polygon's in the polygon soup
//this will be the bounding sphere for the sphere tree root node.
//
//Create a plane dividing front side and back side
//Create bounding spheres for each subgroup
//Create two child nodes in the sphere tree attach them to the parent
//And assign the polygon and assign an axial on the y-axis

//Continue this process recursively 
//Recursively build the tree until the area covered bny the sphere leaf is as small as the smallest
//polygon's bounding sphere, or when there is only can polygon in the leaf\

//This process will produce a sphere tree that loosely groups polygons that are close to each other 
//into clumps bounded by the bounded by the spheres. 
//OPTIMIZING BSP

//SO THIS IS WHAT I THINK
//WORKS LIKE NORMAL BSP BUT WITH THE POLYGONS ENCASED IN SPHERES on the tree (BSP Tee/Sphere Tree)









public class SphereTreesForSpeedyBSPService {

}
