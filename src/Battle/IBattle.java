package Battle;

public interface IBattle {
/*
 * Action Range

Every character has a certain attack range(s). If a character is not in that attack range, upon delivering the action command, the character will automatically move to that range.

Rage

When a character reaches an extremely low percentage of their health, they will go into a mode called Rage. When they are in Rage, they cannot be controlled. They will deal damage for every attack by a large multiplier and all of their stats will be boosted. If they are the only player left, they will enter a state called desperation. When in desperation, they can be controlled, but will have boosted stats and randomly deliver attacks which are not in their repertoire of skills in between points of ‘readiness’.

Magic

Magic can be used when the character is at a ready. It requires MP, when MP is drained to 0 it can no longer be used.

Non-magical Abilities

Non-magical abilities require AP, ability points, to be used. When AP has dropped to 0 those abilities can no longer be used.

Spoils

For every battle completed, the player has the opportunity of gaining gold, experience, and items. These are dependent upon the enemies fought and the point bonuses.

Point Bonuses

The more damage you do/ damage you receive / or combos you execute determines the more points you get. Point bonuses include:

Experience Bonuses
Gold Bonuses
Item Bonuses (medium rare)
Level Bonsues (very rare)

Spell Immunity

The more times you are subjected to a spell, the more immune you become to it. Immunity reflects the probability that you will receive a status impairment/damage from that spell. It is used for all spells, including cure spells, so the more times you are cured by a spell the less effective it will be.

Death

If all characters in the party die, you will be asked to either load from a save point or you can choose to bargain with the reaper by selling either experience points or gold. If you choose to bargain with the reaper you will be restored back to where you were before the battle commenced, along with full life and equipment.

Charge Attack

If A and B are pressed simulatenously, the character will perform something called a “Charge” attack. A “Charge” meter will appear. When that meter is filled, or the character has been “charged”, they will deliver a stronger attack than the original physical attack they were going to deliver. This attack will use no special points. After readiness, the charge meter will continue to go up to another level if A and B are held in again. For each level filled, the character will deliver a more magnified attack. The charge meter has a limit of 99 levels for any character. After the meter is filled, the next action (physical attack, spell, or defense) will trigger it, and be magnified by the amount of charge the player has gathered. So it can also be used to defend against strong enemies.

Combos

As levels go up, characters will learn different natural combos. Hitting these button combinations correctly will trigger an additional, often magnified, attack at the end of the attacks selected. In addition to this, say my combo required me to hit X, Y, A, B. The first attack delivered would be X attack, then Y attack, then A attack, then B attack. But my MP will only be drained for the first attack used. In addition, at the end of the series of attacks, a special combo attack will be delivered.

Mastery

The more a weapon/item/attack/spell is used, the more it is mastered. As the action gains in mastery it grows stronger. Once an action is 100% mastered, the character learns a new, “Mastery” technique that is significantly stronger than the original action. Also, the original action will no longer require perishable points (an item to trigger it, or mp to use it).

Controls

Pressing “Start” will pause the battle and bring up the context menu
Pressing “~” will pause the battle and bring up the console.
Pressing “Select” will toggle auto-fight and control character.
Pressing “L2” will move the Character Selector to the left on the Player Status Bar, choosing a player to control in control character mode.
Pressing “R2” will move the Character Selector to the right on the Player Status Bar, choosing a player to control in control character mode.
Pressing “L1”, “R1”, “X”, “Y” will trigger the assigned special attack.
Pressing “A” will trigger a standard physical attack.
Pressing “B” will trigger a standard defense position.
Pressing “A” and “B” simultaneously will deliver a charge attack.
Pressing the analog stick will move the character around the playing field.

Screens

Main Status Bar
Message Box: Displays spell/attack names
Current Character: Shows the avatar of the current character in action
Time: Shows the time the battle has been going on
Points: Shows the amount of bonus points the player has gotten

Player Status Bar
Consists of a series of Player Status Boxes. Sits below main status bar.
Player status box
Name: Name of the character
HP: Current hit points the character has left.
MP: Current magic points the character has left.
	AP: Current ability points the character has left
	Level: Current level of the player
	Avatar: A picture of the character’s face
Main Battle Screen
Character Box
	Damage Done
	Will appear briefly after being damaged
	HP Gained
	Will appear briefly after being healed
	Status Effect
	Will change appearance of character while in effect
Spell/Special Attack
May take up whole screen, part of screen, or cause temporary switch to video. Also may alter battle field.
Context Menu
Has several battle actions for the character that allow the player to choose those actions that are not pre-assigned to keys.
These are:
Magic (includes all magic, Summons, etc..)
Ability
Item
Show Ranges (displays a color coded range chart on the battle grid, showing who can hit who)
	In-Game Menu (opens the in-game menu)
 	Flee

In-Game Menu
	Will have the option to save the game.
	Will have the option to assign battle formations.
	Will have the option to assign battle tendencies.
	Will have the option to assign equipment.
	Will have the option to assign special abilities to different buttons.
	Will have the option to use special abilities.
	Will have the option view personality factors.
	Will be able to view character statuses. (including spell immunity)
	Will have the option of viewing and organizing items.
	Will have the ability to view known combos.


 */
}
