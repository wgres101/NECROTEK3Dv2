package Battle;

public interface IBattleSystem {
/* Combat System

Enemies and Player Characters have circular attack ranges. There is extra long distance, long distance, middle, short, and adjacent. If a character is in, say, long distance and their circular distance intersects the enemy then the character can attack the enemy. What happens is if one of the player characters gets too close to an enemy character, it triggers the battle mode. All the player characters that are in play scatter into a formation. When that player is selected to attack or an enemy prepares to attack a bulls eye type image appears below the player character and below any character currently selected. Take note, this is a real time strategy RPG and all of this is happening in real time. Also see switching.

Realistic combat to a point. For example, a stab won’t kill a skeleton but a good swing will. Kicking an enemy in the back will make him arch back, attack to the legs makes them lose their footing and fall.

Certain weapons have different ranges

Combat begins when into an enemies field of view and they are alerted.
In some cases you can try to hide in the shadows, as long as you don’t make too much noise.  Sneaking around is possible like Metal Gear Solid.

Bodies remain after win. Flys., vultures, etc. go after it until it disappears. Necromancer can also resurrect.

NPCs walk around battle, but try to get away. When the main character enters combat mode,  if there are people around  they will gather in a circle to watch. As soon as either the player or an enemy draws a weapon or attacks another crowd runs away screaming. If a character has high Bravery, like a Knight or a Guard, or even a Blacksmith on some occasions; the NPC will either stay to watch the battle or try to join in. The enemy will not hesitate from attacking and killing an npc.

Tossing: you can pick up objects as well as enemies and toss them.

Backgrounds Description-

Some levels which are not fully 3rd person 3D, will have a layered perspective.

The layered perspective will contain a mixture of 2D/3D elements, such as a 2D background (with perspective depth) and a 3D walking surface layer, and a 2D foreground layer (with or without perspective depth). In these levels, the player is restricted from certain alterations of the camera, which will be controlled automatically by the engine. All game art, whether 2D or 3D should be cohesive.




Battle System

Background Info:

When you approach enemy territory, the rest of your party fans out. You can take control of whoever you like, characters not in control are controlled by the AI.

Battles are randomly triggered by the main game engine. When a battle is triggered, control is handed over to the game battle engine. A new background is displayed depending on the environment context of when the battle was triggered. There is no limit to the number of player characters allowed in a battle. The starting places of the characters (player characters and enemies) is determined in combination randomly, by the assigned battle formation, and by the situation of the battle (preemptive strike, etc..).

Each player has a meter which indicates their “readiness” to attack. Actions may only be delivered when the meter for the actor is set to “ready” (completely full). Different characters will reach “readiness” at different rates, dependent upon their “speed”. The exception to this is movement on the battle field, which can be done at any time no matter what their “readiness” meter is reading. The speed of their movement on the play field is determined by their “agility”.

When a character has reached readiness, they will deliver an action dependent upon the current status of their companions, the strength of the enemy, their personality factor, and their preset battle tendencies. This is all determined by the in-game AI. The exception to this is if the character is currently under control of the Player. If the Player is currently controlling the character.

If a player is controlling a character, upon “readiness”, a white blinking yellow box will appear around that player. That player can then be controlled.

If the character under control by the player would like to execute a multiple character attack (Double Tech, Triple Tech), the other player characters will cease their current action and move into position (or teleport into position) at which time the attack will commence.

If a player character is executing an attack and is taken over and commanded to perform a different attack, it will cease its previous attack and begin the commanded attack.




Battle Formations

The battle formations submenu in the in-game menu allows you to alter battle formations. A bull’s eye of Ranges is displayed, with the center being the “Extreme Short-Range” range. You are allowed complete freedom in placing your characters into any formation you desire.

Battle Situations

Preemptive Strike – You get the first attack (Your readiness meter starts full)
Reactive Strike – The enemy gets the first attack (Enemies readiness meter starts full)
Simultaneous Strike – You both get to attack first. (Everybody’s readiness meter is filled)
Stall Strike – Both enemy and you start with readiness meter empty
Pincer Strike – Enemy surrounds you, enemy gets first strike.
Scatter Strike – Formations are broken and everyone is randomly placed wherever.
Medieval Strike – Both enemy and player characters are lined up, face to face and formations broken.
Normal Strike – Formations kept, readiness meters are filled randomly for every character (enemy and player).
Doom Strike (rare) – Readiness meter starts out empty for you, full for enemy, you also start out at half your hit points.
Superior Strike (rare) – Readiness meter starts out empty for enemy and full for you, enemy starts out at half hit points.


Player Character AI

When a character has reached readiness, they will deliver an action dependent upon the current status of their companions, the strength of the enemy, their personality factor, and their preset battle tendencies.

Readiness Rules:
If companion is below 30%, heal them
If companion is dead, revive them
If enemy deals more than 80% damage, defend always.
If companion has a temporary status ailment (poison, paralysis, etc..) and is below 30% health, cure status ailment.
If companion has a permanent status ailment (stone, plague), cure it


Battle Tendencies (Rules)

Running Rules
Run when life is less than 10%
Run when party life is less than 10%

Attacking/Defending Percentages
Attack 50% of the time, Defend 50% of the time
Attack 50% of the time, Heal 50% of the time
Attack 75% of the time, Heal 25% of the time
Attack 25% of the time, Heal 75% of the time
Attack 100% of the time
Heal 100% of the time
Defend 100% of the time

Strength Percentages
Attack with 100% strongest attacks
Attack with 75% strongest attacks, 25% medium attacks
Attack with 50% strongest attacks, 50% medium attacks
Attack with 50% strongest attacks, 25% medium attacks, 25% weak attacks
Attack with 50% medium attacks, 50% weak attacks
Attack with 100% weak attacks

Attack Type

Use Magic 100% of the time
Use Magic 50% of the time
Use Magic 25% of the time

Use Abilities 100% of the time
Use Abilities 50% of the time
Use Abilities 25% of the time

Use Regular Attacks 100% of the time
Use Regular Attacks 50% of the time
Use Regular Attacks 25% of the time

Use Items 100% of the time
Use Items 50% of the time
Use Items 25% of the time

Personality Factors

General Synopsis: Personality factors change throughout the game dependent upon different actions taken by the player. Personality factors will influence actions taken in battle, successfulness of different skills, and skills gained.

Influencers:

How often a character attacks (Attack Frequency)
How often a character defends (Defense Frequency)
How often a character is controlled (Control Frequency)
How often a character flee (Flee Frequency)
How often a character rages (Rage Frequency)
How often a character is desperate (Desperation Frequency)

Aggression – the higher the attack frequency the higher the aggression. The higher the defense frequency and flee frequency, the lower the aggression. The higher the aggression, the more likely they will attack. The lower, the more likely they will defend.
Self Control – the higher the control frequency, the higher the self control. The higher the rage frequency or desperation frequency, the lower the self control. The lower the self control, the more likely they will rage or become desperate.

Types of Hits

Miss – A total miss
Weak Hit – A glancing blow
Normal Hit – A normal blow
Critical Hit – A heavy blow
Master Hit – When a weapon is mastered it will deliver random ‘master’ special attacks

Limit Meter
When the limit meter fills up, you can select a special overdrive attack to use.

Combo Attacks
Hitting certain button sequences launches combo attacks, powered up versions of your regular attacks.


Action Range

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


*/
}
