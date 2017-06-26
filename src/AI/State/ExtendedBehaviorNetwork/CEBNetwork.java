package AI.State.ExtendedBehaviorNetwork;

//Book 6 Section 3.5


import java.util.TreeSet;

public class CEBNetwork {

	TreeSet<CGoal> goals = new TreeSet<CGoal>();
	TreeSet<CModule> modules = new TreeSet<CModule>();
	TreeSet<CResource> resources = new TreeSet<CResource>();
	TreeSet<CParameters> parameters = new TreeSet<CParameters>();
	
	
	//modules to be executed at each cycle are selected in the following way:
	
		//1. activation of eah module is calculated
		//2. The executability e of each module is calculated using some triangular
	 		//norm operation over its condition list
		//3. The execution value h(a,e) is calculated by multiplying a and e. Note
			//that this value combines the utility of executing a behavior (activation)
			//and the probability of it executing it succesfully (executibiliy)
			//This way even modules with conditions that ar e not very satisfied may 
			//execute if they have high activation
		//4. FOr each resource used by a module, starting by the last nonavailable resource
				//the module checks to see if it has exceed the resource threshold and 
				//if there is enough of the resource for its execution. IF so, it binds the 
				//the resource
		//5. IF am oudle has bound all of its needed resources, it executes and resets the
				//the resources threshold sto the value of the global threshold
		//6. Each module unbinds the resources it used.
	
	
	
	
}
