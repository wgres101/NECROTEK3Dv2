package AIAlgorithms.Boids;

public class CBoid {

	/*
	//static variables
	
	static CBoid VisibleFriendsList[MAX_FRIENDS_VISIBLE];
	
	//constructors
	
	//craetes an individuakl boid with randomized position, velocity, and orientation
	CBoid (short id_v);
	
	//creates an individual boid with specific position, velocity, and orientation
	CBoid (short id_v, Vector3f pos_v, Vector3 vel_v, Vector3f ang_v);
	
	//public flocking methods
	
	//FlockIt
	//Used for frame by frame updates. no time deltas on positions
	void FlockIt(int flock_id, CBoid first_boid);
	
	//miscellaneous functions
	
	//AddToVisibleList 
	//This visibilit y list i s regenerated for each memebe reache
	//update cycle and acts mcuh like a push-down qaueue, t he
	//latest member addeed to the list becomes the first one
	//when the list is sequentially accessed. Mostly I did
	///this for speed reasons, as this allows for fast inserts
	//and we don't delete from this list, just rebuild it
	//each update cycle
	
	void AddToVisibleList(CBoid ptr);
	
	//CLear visible list
	//clears the visibility list
	void ClearVisibleList();
	
	//GetNext
	//REturns the next pointer of the invoking member
	CBoid GetNext();
	
	//LinkOut
	//Removes a member from the list
	void LinkOut();
	
	//PrintData
	//Dumps all data describing a given member
	void PrintData();
	
	//SetNext
	//Set the next pointer of an individual member
	void SetNext(CBoid ptr);
	
	//SetPrev
	//Set the prev pointer of an individual member
	void SetPrev(CBoid ptr);
	
	//data members
	
	short m_id;	//member individual id
	float m_perception_range; // how far a member can see
	Vector3f m_pos; 	//position of member (in meters)
	Vector3f m_vel; 	//velocity of member (in meters/sec)
	Vector3f angle;		//oritentation of member
	
	//computed
	float m_speed;	//overall speed of member
	u_short m_num_flockmates_seen;	//# of flockmates this one sees
	u_short m_num_enemies_seen;			//# of enemies this one sees
	CBoid m_nearest_flock_mate;			//pointer to nearest flockmate
	CBoid m_nearest_enemy;			//pointer to nearest enemy
	float dist_to_nearest_flockmate;	//distance to nearest flockmate
	float dist_to_nearest_enemy;		//distance to nearest enemy
	Vector3f m_oldpos;				//old position
	Vector3f m_oldvel;				//old velocity
	CBoid m_next;					//pointer to next flockmate
	CBoid m_prev;					//pointer to previous flockmate
	
	//flocking methods
	
	//Cruising
	//Generates a vector indicat ing how a flock boid would
	//like to move, if it were all up to him and he was under
	//no ot her influences of any kind
	Vector3f Cruising():
		
	//FleeEnemies
	//Generates a vector for a flcok boid to avoid the
	//nearest enemy (boid of a different flock) it sees
	
	Vector3f FleeEnemies();
		
	//KeepDistance
	//Generate a vecotr for a flock boid to maintain his
	//desired seperation distance from the nearest flockmate he sees
		
	Vector3f KeepDistance();
	
	//MatchHeading
	//Generates a vector for a flock boid to try
	//to match the heading of the nearest flock mate
	Vector3f MatchHeading();
	
	//SeeEnemies
	//Determines which enemy flock boids a given flock boid can see
	Vector3f SeeEnemies();
	
	//SeeFriends
	//Determines which rflockmates a given flock boid can see
	CBoid SeeFriends(CBoid first_boid);
	
	//Steer To Center
	//ZGenerates a vector toguide a flock boid towards
	//the"center of mass" of the flockmates he can see
	Vector3f SteerToCenter();
	
	//WorldBound
	//Implements a world boundar  y so that flocks don't fly
	//infinitely far away from the camera,  instead remaining
	//in anice viewable area. It does this by wraping flock
	//boids around to the ot her side of the world
	//so (for example) t hey move out the right and return on the left
	
	void WorldBound();
	
	//miscellanous functions
	
	//Accumulator Changes
	//Adds vector values in changes into the accumulator
	//vector. Returns magnitude of accumu lator vector after adding
	//changes. 
	
	float AccumulateChangres(Vector3f accumulator, Vector3f changes);
	
	//CanISee
	//Determine whjether a given invoking boid can see the boid
	//in question. Ret urns the distance to the boid.
	
	float CanISee(CBoid ptr);
	
	//Compute RPY
	//Computes the roll./pitch/yaw of the flcok boid based on
	//its latest velocity vector changes. Roll/pitch/yaw area
	//stored in the "ang" data member as follows:
	//pitch is about the x axis
	//yaw is about the y axis
	//roll is about the z axis
	//
	//Alll calculations are right handed coordinates
	//+x through the left side of the object
	//+y = up
	//+z through the nose of the model
	
	void ComputeRPY();
*/
}

