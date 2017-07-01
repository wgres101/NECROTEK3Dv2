package AI.Training;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CTrainer {

	
	public static enum EState { ST_WALK_FORWARD, ST_WALK_BACKWARD,
								ST_WALK_LEFT, ST_WALK_RIGHT,
								ST_TURN_LEFT, ST_TURN_RIGHT,
								ST_SWING_SWORD }
	
	class State {
			//store a behavior and how many times it occurs
			//in context 
			EState current_state; 

			//fuzzy training value from 0 to 1 clamped
			
			HashMap<Edge, Float> weightedEdges = new HashMap<Edge, Float>();
			
			public void train(Edge e) {
				
				float adjustor = 0.01f;
				
				for (HashMap.Entry<Edge, Float> entry : weightedEdges.entrySet()) {
					
					if (entry.getKey() == e)
					{
						entry.setValue(entry.getValue() + adjustor);
					}
					else
					{
						entry.setValue(entry.getValue() - adjustor);
					}
					
				    System.out.println(entry.getKey() + "/" + entry.getValue());
				}
			}
	
	}
	
	class Edge {
		
		//contains link to states
		State state_src = new State();
		State state_dest = new State();
	}
	
	State root = new State();
	State lastState = new State();
	//records player behavior and uses it to train the AI
	
	public void train(State state ) {
		
		//input current state player is in
		//link to last state
		//should be able to walk up the tree from last state to root
		//each state has a hashmap of edges
		//each edge in the hashmap has a training value
		//everytime that edge is encountered its training value goes up
		
		
		
		//use this treee to guide the AI
	}
}
