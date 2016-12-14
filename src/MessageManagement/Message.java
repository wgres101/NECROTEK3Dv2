package MessageManagement;

public class Message {

	public EM mflag;
	
	public long frame_rate;
	
	public enum EM 
		{
				EM_CREATE, //An entity receives a create message after its container is created

				EM_SET_POS,     //accessors related to physics of world
				EM_GET_POS,
				EM_SET_DIR,
				EM_GET_DIR,
				EM_SET_VELOCITY,
				EM_GET_VELOCITY,
				EM_SET_ROTATION,
				EM_GET_ROTATION,
				EM_GET_COLOR,
				EM_SET_COLOR,
		
				EM_START, //AFter the entity is created, positioned, etc. it is sent the START_EM message
				
				EM_DESTROY, //Demands the destruction of a specific entitiy
				
				EM_SHUTDOWN, //Destroy after nicely shutting down
				
				EM_DRAW, //'Render Me' to the world
				
				EM_UPDATE, //option to update according to the world by tick
				
				EM_POPMETHOD, //tells the deferred method manager to exeucte its next method
				
				EM_POSTUPDATE, //New state of the world after some ot her trhings have happened this tick
				
				EM_USERINPUT, // Called upon user input from a device
				
				EM_FORCE, //An explosion occurred, or something major effecting a lot of entities
				
				EM_DAMAGED, //a character or characteres received damage
				
				EM_ONDAMAGE, //an enemy character has been damaged
				
				EM_GIVEPOINTS, //add points like skill points for example to an entity
				
				EM_DRAWOVERLAY, //Effecfts that occur after normal rendering, like a lens flare
				
				EM_DRAWSHADOW, //effects for shadowes that occur after normal rendering
				
				EM_SETOWNER, //can be used to establish routines between nodes in a scene graph
				
				EM_IMDEAD, //pretty self-explanatory. DO everything that happens when the character dies
				
				EM_TESTHIT, //Requests the recipient perform a hit test to see if there was a collision
				
				EM_IHITYOU, //Tell a character that you hit them 
				
				EM_CLIENT_UPDATE, //sends a messsage to the client to update its state
				
				EM_SERVER_UPDATE, //sends a message to the server to update something
			
				EM_DEBUG_DRAW, //draw the current debugging information for target entity
				
				EM_EDITDRAW,  //draw userful things when game is in 'edit' mode
				
				EM_GET_VAR_TABLE, //get a table and dispaly it of current variables loadsed

				EM_FRAME_TICK, //another frame has occured
		
				EM_CLOCK_TICK, //for actions that occur at every tick
				
				EM_COLLISION, ///a collision occured
				
				EM_UPDATE_ANIMATIONS, //update the animation frames for all the animated objects
				
				EM_UPDATE_PHYSICS,  //a request to update the physics in the game
		
				EM_UPDATE_PATHFINDING  //runs pathfinding code
		};
		
		Object sourceReference; //reference to the generator of this message
		
		
		
		//other types of events
		//ANIMATION
		//PHYSICS SIMULATION
		//CHARACTER ANIMATION
		//COLLISION DETECTION
		//GAME AI
		//RENDERING
		
		
	
	
}
