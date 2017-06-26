package AI.State.ExtendedBehaviorNetwork;

import java.util.HashMap;
import java.util.Vector;

public class CModule {

	
	//real valued propositions that represent the needed conditions for the module to execute
	Vector<CProposition> conditions_list = new Vector<CProposition>();
	
	//conjunction of propositions whose values are the values that we expect to have
	//after the module's action's execution
	Vector<CProposition> effects_list = new Vector<CProposition>();
	
	CProposition action = new CProposition(); //action to execute 
	
	HashMap<CResource, Integer> resource_list = new HashMap<CResource, Integer>(); //made of pairs (resource, amount) each indicating the expected amount of a resource an agent uses to perform an action

	//links to resource nodes
	Vector<CResourceLink> resource_links = new Vector<CResourceLink>();
	
	
	
}
