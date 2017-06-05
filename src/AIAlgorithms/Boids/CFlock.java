package AIAlgorithms.Boids;

import java.util.Vector;

public class CFlock {

	
		Vector<CBoid> boids = new Vector<CBoid>();
		
		//creates a new flock
		CFlock();
		
		//flocking functions
		
		//AddTo
		//Adds the indicated boid to the flock
		void AddTo(CBoid boid);
		
		//GetCount
		//Returns the # of boids in a given flock
		int GetCount();
		
		//GetFirstMember
		CBoid GetFirstMember();
		
		//PrintData
		//Dumps all data describing a given flock
		void PrintData();
		
		//RemoveFrom
		//Removes the given boid from the flock
		void RemoveFrom(CBoid boid);
		
		private int m_id;	//id of this flock
		private m_num_members;	//number of boids in this flock
		CBoid m_first_member; //pointer to first member
		
		
	
}
