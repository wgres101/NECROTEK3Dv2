package AI.ProceduralStoryGenerator;

public interface IProceduralStoryGenerator {

	/*
	Most, if not all of the scenarios can be generated procedurally using  Procedurally Generated Stories.
	 There are parameters attached to each Proccdural Generated Stories. So for example,
	If the story was generated with story text X, the algorithm will also pick the NPCs involved, and then choose from  
	the possible situations from the situation list below this paragraph. This is constantly going on for all of the NPCs in the game,
	 making many multiple stories going on, just like real life.  That, depending on the current emotions and the Procedural Storyline,
	  an ACTION will be generated.

	For Ted: Figure out how to procedurally interact with other players and creatures using the above. Sometimes the npc, for example,
	 might fall in love with a woman and another npc may be in love with her as well. That’s the summary of the story generated. Now 
	 how do we implement it so that the two men even recognize the other is in love with the woman, and if so, how do they know to fight, 
	 or have one say to the other “you can have her”. This needs to be given some thought.
	 
	 Using weighted TRAMS we can take a bunch of base stories, connect them, and apply TRAMS to them to create various storylines
	 When queried, the NPC assigned to a node in the procedural story will talk about his role in the current story.
	 Need a lot of base stories and a lot of TRAMS and they all need to be connected.
	 
	 We also need to connect the story(s) to the npc AI attributes.
*/

	/*
	 * There is a bottom bar on screen that has conversations between the other party members talking and what any nearby NPCs or enemies are saying.
	 *  You can talk to NPCs and what they say is integrated into the Procedural Story Generation algorithm.
	 */

	
}
