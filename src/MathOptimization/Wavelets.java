package MathOptimization;

//GEMS 1 MATH

public class Wavelets {

	
	
	
	//Wavelets work as follows
	//Construct a list of values
	//Then form a tree where each branch of the tree
	//contains two values,
	//the "average" (detail coefficient applied)
	//of the two value in the list
	//and the detail coefficient, which is the value applied
	//to obtain the average. For example,
	//the numbers 7, 11, 5, and 5 would produce
	//the two numbers 9 and 5 and their detail coefficients
	//would be 2 and 0. 
	
	//9 is the midpoints between 7 and 11 and the difference between
	//the first number and the midpoint is 2, which is the detail coefficient
	//5 and 5 have a distance of 0 so its detail coefficient is 0.
	
	//This method allows for "lossless compression" or factoring since there
	//is no loss of information moving up or down the tree.
	
	
	
	
	
	
	
}
