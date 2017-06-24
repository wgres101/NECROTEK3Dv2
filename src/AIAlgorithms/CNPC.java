package AIAlgorithms;


//each NPC lives on a thread
//this class is the NPC thread
//full autonomous NPC

public class CNPC implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	/*EXCHANGE INFORMATION BETWEEN NPCs
	 * ATTACK SLOTS
	 * 
	 * A slot acts like a token and rpresents the minimum distance an NPC is allowed to attack the player while
	 *possesing that token
	 * 
	 * EXCLUSION ZONES
	 * 
	 * Represent zones that are already occupied.
	 * 
	 * TRIGGER SYSTEMS
	 * 
	 * Triggers as communication. Broadcast an event
	 * 
	 * ENEMY EVENTS
	 * 
	 * Direct communication between NPCs
	 * 
	 * PLAYER MUTEX
	 * 
	 * A token given to an NPC giviing it the right to attack in melee
	 * 
	 * ALLOWED ZONES
	 * 
	 * Areas where the NPC is allowed to travel or attack from\
	 * 
	 * BLACKBOARDS
	 * 
	 * Commnication across the board between NPCs
	 */
	
}
