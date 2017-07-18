package AI.EnemyEnums;

public interface IEnemySpecificBehaviors {
/*
 * Order of attack: Enemy attacks weakest character first. If strength of the two characters is close, the enemy attacks the player character that can do the most damage
If an enemy is being continuously attacked by one character, the enemies will gang up on that player.
Sense trails are left behind for players and enemies. Other enemies will follow both types of sense trails to track down players. The sense trails dissolve over time.
Once you “interrupt” one enemy from what he is doing, battle begins and other enemies will run in to join the battle and support the first enemy.
Enemies will take different formations (Pincer, Circle, Wedge, Preemptive)
Enemy looks at your armor type, weaknesses, and depending on the enemies intelligence will do attacks for those weaknesses
Enemy compares levels and equipment , spells, etc.  and will either keep fighting, call for reinforcements, or run,
Enemeis are able to travel in packs, set up traps, set up ambushes, and can travel alone in stealth.
Very smart enemies can take hostages or use a character nearby as a human shield.
They will also try to throw things such as boulders (esp. giants) and knock down buildings you are inside.
Some enemies will try to  “snipe” you out
Enemies are very life-like. They grunt, jabber, scratch, talk amongst themselves, stomp around when they are angry. Their movements are never exactly the same because of the way the skeletal animation reacts to the physics of the ground. 
Enemy emotion points are set in the beginning against you.  Behavior will change. Depending on outcome, relationships towards enemies, npcs, and pcs will change. Your alignment will change depending on who you kill or if you steal from someone. You build a reputation.
Character AI uses a pseudo neural net so enemies learn about levels (like Eraser Bot and Kingpin)??
Enemies have a self-preservation AI. When wounded, an enemy will stalk to gain some hp back , and then attack again when the moment presents itself.
You can actually talk and reason with enemies depending on your alignment.. If you are neutral or evil then they will respond. Completely pious characters won’t be able to talk to them.
The monsters will follow you from the wilderness into town if you don’t’ kill them. The town has guards that will fight the monster but unlike Ultima, the guards aren’t superhero strong and the monsters can kill a sole guard or two.
Some enemies have their own villages and mind their own business. Its only if you either interfere with their daily activities or attack one of them will they attack. However, monster villlages have tons of loot.
Other monsters wander around the map and scavenge and will attack on sight.
Enemies aren’t dumb either. For the higher intelligent monstesr, their behavior mirrors and NPC.
Enemies have emotions as well. They can be frustrated, scared, angered, etc.
Enemies will act in a collective according to their captain’s emotions. 
Corner an enemy and it will become more aggressive
Enemies may return fire, retreat and fire at the same time, or run off and bring back reinforcements
Enemies may duck
Enemies may pretend to be dead when actually they are alive to trick you
Line of sight (look for cover behind objects)
Goals – Enemy creates and resolves goals. Importance of goals measures his or her actions
 
You are able to roam and kill NPCs for their equipment, threaten NPCs, work for them, or do favors for them. All NPCs have items and skills should you fit and kill them. 

Enemy may hide behind a crack and start firing at you.

NPCs may talk to other NPCs

Order of attacks. Gazellle phenomenon. Will attack the weakest characters first, if two are close in weakness, will attack the one that deals the most damage
If an enemy is being continuously attacked by one of the PCs, the enemies will all gang up on that PC.
Sense trails are left by PCs and Enemies. Other enemies will pick up on the trail if it hasn’t faded and follow it.
Once you interrupt one enemy more will come to its aid.  
Enemies have different attack formations: arrow, wedge, circle, pincer, etc.
Enemy looks at your stats and equipment and weaknesses. Depending on the enemy’s intelligence it will attack those weaknesses. Also, depending on the intelligence of the enemy and your stats, it will call for help, play dead, fight, run, etc.
Will attack creatures of furthest alignment. 
Enemies travel in packs, set traps, set ambushes, or travel stealthily alone
Some enemies are smart enough to use human shields. Some will try to use your characters in your party as human shields. Those of the most evil alignment will take enemies in their pack and use like a human shield.
Enemies if unarmed (which can happen. You can knock the weapon out of their hands) will try and throw things at you. 
Giants will try and knock down buildings if you are near one.
Imps will try to set wooden buildings to the ground.
Enemies might go and get help if in a sticky situation.
Corner an enemy it might become extra aggressive
Enemies personalities grow closer to their “friends” as they spend time around them


 */
}
