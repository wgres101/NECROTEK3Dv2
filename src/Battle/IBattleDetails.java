package Battle;

public interface IBattleDetails {

	/*
	 * When you approach enemy territory, the rest of your party fans out. You can take control of whoever you like, characters not in control are controlled by the AI.

Battles are randomly triggered by the main game engine. When a battle is triggered, control is handed over to the game battle engine. A new background is displayed depending on the environment context of when the battle was triggered. There is no limit to the number of player characters allowed in a battle. The starting places of the characters (player characters and enemies) is determined in combination randomly, by the assigned battle formation, and by the situation of the battle (preemptive strike, etc..).

Each player has a meter which indicates their “readiness” to attack. Actions may only be delivered when the meter for the actor is set to “ready” (completely full). Different characters will reach “readiness” at different rates, dependent upon their “speed”. The exception to this is movement on the battle field, which can be done at any time no matter what their “readiness” meter is reading. The speed of their movement on the play field is determined by their “agility”.

When a character has reached readiness, they will deliver an action dependent upon the current status of their companions, the strength of the enemy, their personality factor, and their preset battle tendencies. This is all determined by the in-game AI. The exception to this is if the character is currently under control of the Player. If the Player is currently controlling the character.

If a player is controlling a character, upon “readiness”, a white blinking yellow box will appear around that player. That player can then be controlled.

If the character under control by the player would like to execute a multiple character attack (Double Tech, Triple Tech), the other player characters will cease their current action and move into position (or teleport into position) at which time the attack will commence.

If a player character is executing an attack and is taken over and commanded to perform a different attack, it will cease its previous attack and begin the commanded attack.


	 */
	
	
}
