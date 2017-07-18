package Handlers;

//called by the main loop
//distributes messages to message manager
//message manager distributes to scene graph

public interface IAnimationHandler {
/*
 * Falling off cliff
Death
Cape Blowing Animation
Eating
Attacking
Running
Walking
Standing
Half Run
Half Walk
Getting Splashed by Wave
Spell Effected
Casting a spell
Left foot up
Right foot up
Walking through water
Suspense Take
Surprise Take
Sliding
King Rear View
Turning

Soldier’s movement when they capture you


 */
	
	
	/*
	 * Animations (Bosses)

More Player Animations

Player Characters
==============

Battle and Ability Animations:

Ready Pose
Attack Animation (long range)
Attack Animation (mid range)
Attack Animation (short range)
Defending Animation
Death Animation
Injured Animation (near dead)
Poisoned Animation
Dodging Animation
Charging Animation
Damaged Animation (just took a hit)
Casting Magic Animation (requires mp)
Using non-magic Battle Ability (doesn’t require mp)
Using Will Animation (preparing to transform from normal form to morphed form)
Using Overworld Ability


Movement Animations:
Walking left
Walking right
Walking up
Walking down
Jumping
Ducking

Flying Left
Flying Right
Flying North
Flying South
Flying Ascending
Flying Descending

Swimming Left
Swimming Right
Swimming North
Swimming South
Swimming Ascending
Swimming Descending


More Monster Animations

Death Animation
Injury Animation
Poisoned Animation
Damaged Animation
Dodging Animation
Attack Animation

Walking left
Walking right
Walking up
Walking down
Jumping
Ducking

Flying Left
Flying Right
Flying North
Flying South
Flying Ascending
Flying Descending

Swimming Left
Swimming Right
Swimming North
Swimming South
Swimming Ascending
Swimming Descending

Objects

Chests
Closed Frame
Open Frame
Opening Animation


*/
	
	/*
	 * Adaptive Skeletal Animation System

The naked body reflects a generic template for that race, female or male. Metadata is used to make the naked template unique for each player. This makes the playable characters different from one and another. For example between one elf and another. This occurs inside a guild when a new character is available. The main character Seren is hard-coded with body template and starting character class. You can switch characters class and therefore clothing and weapons as well for Seren. Both the clothing and character are animated with skeletal animation. The clothes will fit. There are one joinable characters in the beginning of the game for each race . Some are gathered, you start with two and the main character who have their own unique template naked characters with their own unique metadata for their template and  a unique race. There is at least one of each race that can be brought back to the guild to assign a class. The metadata and race of each character is is unique.

The clothing mesh can have a separate skeleton from the naked mesh of the individual unique character. The two are animated at the same time so they have a smooth animation. Also, the techniques or skills are animated in a separate skeleton.


For example, Seren (character) is of an Dark Knight class, and uses a sword.  First Seren is clothed using the clothing mesh for a Dark Knight which reacts like a normal knight. Then the technique skeletons/motion capture are interpolated to fit (rig) the character.

To make certain characters unique metadata can be used to add things to the characters equipment or clothing that makes the character appear unique, even if they are wearing generic clothing for his or her class.


*/
	/*
	 * 
	 * NECROTEK Facial Animation 


 The facial animation system interfaces with ASA to take real-time skeletal animation skeletons and mapping them to the vertices
  of the target face.
This is done only once (creating the facial expression) for each emotion or facial expresssion and then mapped to the different 
faces as appropriate.


	 * 
	 */
	 
	 
}
