package SchedulingManager;

public enum EEventMachine {

	
		TEST_EVENT_1,
		
		EM_BOOTSTRAP, //called on program start
		
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
				EM_INITIALIZE,
				
				EM_DRAW, //'Render Me' to the world
				
				EM_DRAW_OVERLAY, //certain enntitie smight need to perform drawing operations after all normal rendering has taken place
								//For example, a sun entity might handle drawing glare or halos when the player is
								//is looking into it. The game loop can send DRAWOVERLAY to all entities after the normal 
								//DRAW message has been sent
				EM_DRAW_SHADOW,	//similarly, many shadow algorithms are performed aftet primary rendering
				
				EM_UPDATE, //option to update according to the world by tick
				
				EM_POPMETHOD, //tells the deferred method manager to exeucte its next method
				
				EM_POSTUPDATE, //New state of the world after some ot her trhings have happened this tick
				
				EM_USERINPUT, // Called upon user input from a device
				
				
				
				EM_DAMAGED, //a character or characteres received damage
				
				EM_ONDAMAGE, //an enemy character has been damaged
				
				
				
				EM_SETOWNER, //can be used to establish routines between nodes in a scene graph
				
				EM_IMDEAD, //pretty self-explanatory. DO everything that happens when the character dies
				
				EM_TESTHIT, //Requests the recipient perform a hit test to see if there was a collision
				
			
				
				EM_CLIENT_UPDATE, //sends a messsage to the client to update its state
				
				EM_SERVER_UPDATE, //sends a message to the server to update something
			
				EM_DEBUG_DRAW, //draw the current debugging information for target entity
				
				EM_EDITDRAW,  //draw userful things when game is in 'edit' mode
				
				EM_GET_VAR_TABLE, //get a table and dispaly it of current variables loadsed

				EM_FRAME_TICK, //another frame has occured
		
				EM_CLOCK_TICK, //for actions that occur at every tick
				
				EM_INSPECTOR_PANEL_UPDATE,
				
				EM_UI_THREAD,
				
				EM_COLLISION, ///a collision occured
				
				EM_UPDATE_ANIMATIONS, //update the animation frames for all the animated objects
				
				EM_UPDATE_AI,
				
				EM_UPDATE_PHYSICS,  //a request to update the physics in the game
		
				EM_UPDATE_COLLISION, //a request to update collisions in the game
				
				EM_UPDATE_PATHFINDING,  //runs pathfinding code
				 EM_CLSNAME, EM_CLSINIT, EM_CLSFREE, EM_FREETICK,
				 EM_GO_FORWARD,
				  EM_GO_BACKWARD,
				  EM_TURN_RIGHT_90,
				  EM_TURN_LEFT_90,
				  EN_SET_RANDOM_DIRECTION,
				  EM_MOVEMENT_STOP,
				  
				  EM_UPDATE_LOGIC_LAYER, //update the logic layer
	
					EM_HOTLOAD, //call hotload periodically
					EM_SAVE_ME_NOW, //au to-save
					EM_NETWORK, //network handler
				 EM_LAGGING,
				 EM_LOW_PRIORIATY,
				 
				 /**communication between entities*/
				 
				 EM_SET_VAR,
				 EM_GET_VAR,
				 EM_VELOCITY,
				 EM_PITCH,
				 EM_YAW,
				 EM_ROLL,
				 EM_POS_X,
				 EM_POS_Y,
				 EM_POS_Z,
				 EM_SKIN,
				 EM_DAMAGE,	//when a projectile entity strikes a target it sends a DAMAGE message telling the
				 			//recipient how manyu hit point sof damage it wants to impart
				 EM_FORCE,	//an explosion could affect multiple objects in the world, effecttively damaging them
				 EM_GIVEPOINTS,	//when enemy is destroyed, deals out points
				 EM_SET_OWNER, //if an entity tree is used as a scene graph, SETOWNER can be used to establish ownership relationships between entities.
				 				//For example, when the player entit y fires a rocket, it sends SETOWNER to the new rocket, letting the rocket know who fired it
				 EM_IHITYOU,	//When an entitu determines via onre or more EM_TESTHIT messages, that it ha sactually
				 				//collided with an object, The EM_IHITYOU is sent back to the collider with information concerning it
				 				//and how to respond
				 /* network */
				 EM_SERVERUPDATE, //server nodes send SERVERUPDATE to handle AI, decisio nmaking and position updating.
				 					//Additionally entities on the server can transmit network packets to sync t h emselves across nodes
				 EM_CLIENTUPDATE,	//This message is used instead of the standard EM_UPDATE to allow client nodes to only dead-reckon their entities, without peerforming any AI or dynamics
				 EM_NETPROCESS,		//As the game loop receives network traffic, it distribute spackets destinee d for individual entities via NETPROCESS. This allows each entity class
				 						//to use its own most efficient means of network synchronization.
				 EM_PLAYER_MOVETO;	//the player has moved to a new location
				 ;
		};

	

