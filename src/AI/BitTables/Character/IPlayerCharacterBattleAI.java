package AI.BitTables.Character;

public interface IPlayerCharacterBattleAI {
/*
 * 
 * 2. AI TACTICS
2.1. For fighters
The following is a list of the settings available to fighters under AI control and what each does:
2.1.1. Attack enemy with all your might!
Self-preservation is disregarded. There is no Fury conservation.
2.1.2. Act in a well-balanced manner!
Self-preservation is considered. The AI will stop attacking when Fury is 25% or below.
2.1.3. Conserve Fury!
The AI will stop attacking when Fury is 60% or below.
2.1.4. Focus your attack!
The AI will stop attacking when Fury is 25% or below.
2.1.5. Don't use coups de grace!
The AI will not activate any battle skills. In addition, the AI will not activate normal attacks when Fury is 40% or below and will stop the continuation of continuous attacks when Fury is 25% or below.
2.1.6. Do nothing!
The character can only be manually controlled by the player.
2.2. For mages
The following is a list of the settings available to mages under AI control and what each does:
2.2.1. Act in a well-balanced manner!
A mix of "Support your party!" and "Concentrate on attacking!".
2.2.2. Concentrate on healing/recovery!
Battle Skills are given priority.
2.2.3. Concentrate on attacking! Priority is given to casting offensive symbology.
2.2.4. Support your party!
Priority is given to casting stat-enhancement symbology.
2.2.5. Don't use magic!!
The AI will not cast any magic or activate any battle skills. In addition, the AI will not activate normal attacks when Fury is 40% or below.
2.2.6. Do Nothing!
The character can only be manually controlled by the player.
The best AI tactics to use
"Attack enemy with all your might!" for fighters.
"Concentrate on healing/recovery" for mages.
"Do nothing!" is for players who wish to micro-manage their entire active party.

3. AI LEVELS (ATTACK and DEFENSE)
These determine how effective the character will be when under AI control. "Attack" governs how good the AI will be at attacking and "Defense" governs how good the AI will be at self-preservation. Higher Attack levels will allow the AI to perform cancels reliably, and higher Defense levels will allow the AI to perform sidesteps and more accurately judge the need for self-perservation.
Having unbalanced levels will encourage the AI to behave in such a way as to reflect the AI level that is signficantly higher. If a character's Attack is maxed out (lvl 10) and has no SP invested in Defense, then said character will be aggresive under AI control in battle, with little to no competence in self-preservation. The opposite occurs when SP is invested into only Defense - the AI controlled character will be incompetent at attacking.
SP investment tips
It is recommended that Attack and Defense are leveled up evenly, with Attack first. For a character under AI control, the AI levels are the most important aspects to invest SP into - HP and MP are secondary. Since the AI tends to be fairly consistent and reliable into their performance when their AI levels are at lvl 4 or higher, it would be more advantageous overall to invest SP into HP and MP when both AI levels are at lvl 4. By functioning better, characters under AI control will survive longer by being hit less. This is more effective than just by being able to take a few more hits if HP/MP was leveled.
To get optimal AI performance, both Attack and Defense needs to be maxed out (lvl 10). As such, it is not possible to permanently mess up the AI of any party member.
The following is a basic description of what can be expected at these Attack and Defense levels:
Attack = 1, Defense = 1
The AI is capable of targetting downed enemies and executing attacks while the target is downed. The AI will not cancel attacks. The AI will not use side-steps or flee when near death.
Attack = 2, Defense = 2
More or less the same as previous. The AI is capable of obtaining a cancel bonus of 175%, but the occurence is relatively low.
Attack = 3, Defense = 3
The AI is incapable of targetting downed enemies and executing attacks while the target is downed. The AI is capable of canceling attacks. Use of side-steps possible.
Attack = 4, Defense = 4
More or less the same as previous, but more reliable. Refer to section "9. CANCELING BATTLE SKILLS" for more information.


4. SELF-PRESERVATION
When the AI determines that the character that it is controlling is near death, then it will try to keep said character alive by avoiding the enemies. This will result in either the character remaining stationary at long range to the enemies or running around the field.
Early on in the game when the characters have low AI levels, the AI may end up perceiving itself to be near MP death and focus on self-perservation when the character's Max HP:Max MP ratio is quite high. This is one of the reasons why it is recommended to invest SP into Attack and Defense first as opposed to HP and MP.
If the AI attempts self-preservation during battle and you find it undesirable, then the following is a list of possible fixes (both in-battle and out-of-batle):
	Restore the character's HP and/or MP. This should be done if the reason for self-preservation is apparent.
	Switch to a more aggressive AI Tactic. "Attack enemy with all your might!" for fighters and "Concentrate on healing/recovery!" for mages.
	Switch control to the aforementioned character and input a command to use a normal attack. This should reset the AI and may get it fighting again if the reason for self-preservation is not apparent.
	Balance the HP and MP levels of the character. The level of MP should not be below that of HP. This can only be done out of battle though.
Balance and then raise the Attack and Defense levels of the character. The level of Attack should not be below that of Defense. This can only be done out of battle though, and may take several level-ups to rectify.


5. DETERMINING A TARGET FOR ATTACK
The observed behavioural traits of AI with respect to how they find their targets are as follows:
5.1. Both ally and enemy AI are capable of finding a suitable target during their own stationary animation.
5.2. Enemy AI are capable of finding a suitable target during their running animation.
5.3. Both ally and enemy AI are incapable of targetting those that are lying on the ground, though they are still capable of targetting those in the downed animation.
5.4. Ally AI are incapable of targeting those that are running.
5.5. Ally AI are incapable of targetting those that are in their attack animations.
5.6. With the exception of petrification, ally AI is incapable of targetting enemies rendered immobile by status ailments not inflicted by said AI.
5.7. With the exception of petrification, enemy AI is capable of targetting party members rendered immobile by status ailments.
5.8. Priority is given to potential targets that are casting symbology.
As a result of observations 5.3, 5.4, and 5.5, the conclusion is that the ally AI can only target something that is either in its stationary animation or casting animation.
The following are observed enemy AI behavioural traits that are observed in specific game difficulties: 5.9.1. In Galaxy difficulty, enemy AI are capable of targeting those that are running.
5.9.2. In 4-D difficulty, enemy AI are incapable of targeting those that are running.
5.10.1. In Galaxy difficulty, enemy AI are capable of targeting those that are in their attack animations.
5.10.2. In 4-D difficulty, enemy AI are incapable of targetting those that are in their attack animations.
If the AI is unable to find a target then they will stand still and do nothing if there is no other action that they can take. This doesn't happen with enemy AI in lower difficulties because remaining stationary and moving aimlessly are apparently valid actions that they can take anytime (attacking is not a priority for them). =-=
This is the reason why the AI may sometimes seem like that they are waiting for the opponent to trigger an AAA. Neither ally or enemy AI are capable of actively waiting to replenish Fury back to 100%. The closest you can get are enemy AI on lower difficulty where they remain stationary, but the fact that they will continue to do so even after Fury has long been replenished implies that Fury is not the reason for their actions.
In higher difficulties, the enemy AI becomes more aggressive and will almost always focus on attacking. The result is that the enemy will end up standing still if they are unable to find any valid targets since they will have no other action to take. This behavioural trait can be exploited to reduce the frequency of enemy attacks by ensuring that all the active party members are in motion when the enemy is stationary (result of observations 5.9.2 and 5.10.2). The misnomer that describes the inability of the AI to find a valid target and thus resulting in them not moving is called the "No Movement Glitch" (NMG).
Tip
The most effective way to make use of the NM exploit is to use cancel chains - not only are enemies are unable to target party members that are in their attack animation, it also provides the longest period of time in which the party members can move while doing more than just running.
If a battle skill in the chain is able to interrupt the enemy (via knockdown, launching, or flinching), then the attacking party member cannot be targeted by said enemy during the entire animation of the cancel chain. As such, any battle skill setup with this inherent ability to trigger the NM exploit is desired in higher difficulties.
Note that Freya does not follow this behavioural trait when there are active party members within short range distance to her. Freya is able to target them; it is not possible to use the NM exploit against Freya in short range. However Freya's attempt to subvert the rules actually ends up providing an advantage for those that use the Roe Tablets/Shielding Device exploit, as her ability to target the (temporarily) invincible party member will encourage her to use minor attacks and hence frequently trigger the AAA of the other two manual characters.
Tip
The result of observation 4.7 gives another possible exploit with regard to enemy targeting. Enemy AI can be manipulated to target a desired party member by making said member cast symbology. Unlike t

20. SKILL SETUP RECOMMENDATIONS FOR THE AI
This section lists all the reasonable skill setups that can be used as desired by the AI, including their limitations and recommended purpose during battle. Note that some skill setups are not note-worthy in battle, but for some of the characters those setups are the best that can do under AI control. Since the AI of characters in the PAL version can use any skill setup available to their NTSC counterparts, skill setups for the NTSC AI will be listed first, followed by additional skill setups for the PAL version of the character.
20.1. NTSC ADRAY
The AI is incapable of reliably canceling out of Adray's short minor normal attack. Coupled with the fact that Adray is incapable of learning the support skill Max Fury, this makes AI Adray ineffective at fighting in short range. In addition, his long range battle skills are almost all elemental, thus making Adray the worst character to leave under AI control in the NTSC version of the game.
Recommended skill setup
SKILL SETUP: Charge -> Charge
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Arguably Adray's best setup in terms of general purpose damage.

SKILL SETUP: Lightning Blast -> Lightning Blast
BATTLE PURPOSE: Stunlock
LIMITATIONS: Requires target to have no wind-element protection.
COMMENTS: Symbology always have a chance of causing flinching, but the AI won't cancel out of Lightning Blast if it doesn't damage.

Recommended skill setup
SKILL SETUP: Aerial -> Aerial
BATTLE PURPOSE: Juggle
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Arguably Adray's most useful skill setup overall.

SKILL SETUP: (long range) Titan Fist -> (long range) Titan Fist
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no earth-element protection.
COMMENTS: Titan Fist has a horrible recovery time when not canceled out of, so it should only be used to exploit earth-weak enemies. It shouldn't really be used for general purposes.

SKILL SETUP: (long range) Fire Bolt -> (long range) Emotion Torrent
BATTLE PURPOSE: (Elemental) Damage
LIMITATIONS: Requires target to have no fire-element protection.
COMMENTS: Emotion Torrent is fairly slow, so it should be used at long range. Problem is, all of Adray's other long range skills are elemental.

SKILL SETUP: (long range) Ice Needles -> (long range) Emotion Torrent
BATTLE PURPOSE: (Elemental) Damage
LIMITATIONS: Requires target to have no water-element protection.
COMMENTS: Has the very slight advantage to Fire Bolt -> Emotion Torrent in that Ice Needles seem to have a faster activation time and is capable of freezing the enemy.

20.2. PAL ADRAY
The only skill that the AI can't cancel out of is Sea Gate. Regardless, the lack of Max Fury stilll makes AI Adray an awkward melee character. In addition to the skill setups available to NTSC Adray, PAL Adray also can make use of the following skill setups under AI control:
SKILL SETUP: Aerial -> Southern Cross
BATTLE PURPOSE: MP Damage
LIMITATIONS: Requires player manipulation of pseudo battle skills.
COMMENTS: Since good INT boosts are obtainable earlier than ATK boosts, Southern Cross is fairly good for damage in the main-game.

SKILL SETUP: Chaos Tide -> Chaos Tide
BATTLE PURPOSE: MP Damage
LIMITATIONS: None
COMMENTS: Possibly Adray's best skill setup for MP damaging purposes.

20.3. NTSC ALBEL
Since all but three of Albel's skills are capable of causing knockdown, this makes using skill setups in a cancel chain more difficult when the AI is fighting an enemy by itself without ally contribution. In addition, the AI is incapable of using Albel's useful skills as desired; making Albel a poor character to leave under AI control.
SKILL SETUP: (long range) Air Slash -> (long range) Air Slash
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no wind-element protection. Albel's long range normal attacks are short range in nature.
COMMENTS: Only skill setup for to make Albel a long range fighter. Would do far more damage if used at short range (PAL version only) and under manual control minor <=> major exploit) though.

Recommended skill setup
SKILL SETUP: Palm of Destruction -> Palm of Destruction
BATTLE PURPOSE: Damage
LIMITATIONS: Cannot be used fully as desired when fighting stand-alone.
COMMENTS: Very good for damage (until it reaches the damage cap), if you can keep the target from being downed (via stunlocking).

Recommended skill setup
SKILL SETUP: Aerial -> Charge
BATTLE PURPOSE: Juggle
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: The longest juggle that can be done by the AI for all characters in a skill setup. A fairly useful skill setup.

SKILL SETUP: Hand of Doom -> Hand of Doom
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Damage is only good if the target is kept from being downed (via stunlocking), else it acts more like a mediocre interruption chain.

Recommended setup for NTSC only
SKILL SETUP: Hand of Doom -> Dragon Roar
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Hand of Doom is capable of positioning the enemy close to the optimal distance for Dragon Roar. However, the skill's damage output is quite low; it is only recommended due to the AI being able to use this by itself.

20.4. PAL Albel
Not much better than his NTSC counterpart. Being able to cancel Double Slash doesn't really give the AI any significant advantages.
SKILL SETUP: Air Slash -> Air Slash
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no wind-element protection.
COMMENTS: Useful against enemies weak against wind-element.

Recommended skill setup
SKILL SETUP: Double Slash -> Dragon Roar
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: The optimal variant of the Dragon Roar setups. However, it is still only recommended due to the AI being able to use this by itself.

20.5. NTSC Cliff
One of the better characters to leave under AI control. Most of his useful battle skills can be used as desired by the AI. The recommended skill setups will be his better ones, but they are all fairly capable.
SKILL SETUP: Sphere of Might -> Sphere of Might
BATTLE PURPOSE: Stunlock
LIMITATIONS: None
COMMENTS: Damage output is fairly high for a stunlock-capable skill setup.

SKILL SETUP: Charge -> Charge
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Damage potential is fairly high, but the auto-positioning produces a hit delay that shouldn't be. Best used under manual control with FAM enabled.

SKILL SETUP: Aerial Assault -> Aerial Assault
BATTLE PURPOSE: MP Damage
LIMITATIONS: Only works when the AoE version of the skill is used (NTSC version only; no limits in the PAL version)
COMMENTS: A high risk of triggering enemy AAAs. The normal version of the skill is capable of knockdown, so this may be a problem in the PAL version.

SKILL SETUP: Sphere of Might -> Aerial Assault
BATTLE PURPOSE: MP Damage
LIMITATIONS: Only works when the AoE version of the skill is used (NTSC version only; no limits in the PAL version)
COMMENTS: Alternative to pure Aerial Assault chains with low risk of death by enemy AAA.

Recommended skill setup
SKILL SETUP: Sphere of Might -> Fists of Fury
BATTLE PURPOSE: Stunlock
LIMITATIONS: None
COMMENTS: Excellent stunlocking ability, with the ability to knock the enemy down if the chain ends with Fists of Fury. The AI is able use this skill setup just as effectively as the player.

Recommended skill setup
SKILL SETUP: Fists of Fury -> Fists of Fury
BATTLE PURPOSE: Stunlock
LIMITATIONS: None
COMMENTS: Provides longer stunlocking than Sphere of Might -> Fists of Fury, and is capable of knocking the enemy down at the end of the chain. This makes it the best stunlocking skill setup in the game, and the AI can use it just as effectively as the player.

Recommended skill setup
SKILL SETUP: (long range) Max Shockwave -> (long range) Max Shockwave
BATTLE PURPOSE: Damage
LIMITATIONS: Cliff's long range normal attacks are short range in nature.
COMMENTS: The knockback effect makes pure Max Shocwave chains safe to use.

20.6. PAL Cliff
The only battle skill in which the AI cannot use as desired is Uppercut, which is not that useful of a skill in the first place.
SKILL SETUP: Hammer of Might -> Hammer of Might
BATTLE PURPSE: Elemental damage
LIMITATIONS: Requires target to have no fire-element protection. Cannot be used fully as desired when fighting stand-alone.
COMMENTS: Very good damage if the enemy is kept from being downed (via stunlocking) and is not resistant to fire-element.

SKILL SETUP: Fiery Tackle -> Fiery Tackle
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no fire-element protection. Cannot be used fully as desired when fighting stand-alone
COMMENTS: Only worth it if the enemy is weak against fire and is prevented from being downed (via stunlocking).

Recommended skill setup
SKILL SETUP: Electric Fists -> Aerial Assault
BATTLE PURPOSE: MP Damage
LIMITATIONS: None
COMMENTS: Optimal Aerial Assault setup. Can be used as desired by the AI.

20.7. NTSC FAYT
Another character with poor canceling capabilities when under AI control. Fortunately, Fayt's more useful skill setups do not require canceling.
SKILL SETUP: Blade of Fury -> Blade of Fury
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Arguably the best general-purpose cancel option for NTSC AI Fayt.

SKILL SETUP: Charge -> Charge
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Acceptable cancel chain.

Recommended skill setup
SKILL SETUP: Blade of Fury -> Air Raid
BATTLE PURPOSE: Interruption
LIMITATIONS: Cannot be used fully as desired in the NTSC version. Cannot be used fully was desired when fighting stand-alone in the PAL version.
COMMENTS: Being able to cancel out of Air Raid is not necessary for this skill setup.

SKILL SETUP: Blade of Fury -> Dimension Door
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Dimension Door is better used for keeping generic enemies in their flinching animation, but the AI will not do so in a cancel chain.

SKILL SETUP: Blade of Fury -> Ethereal Blast
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Potentially very damaging, but Ethereal Blast's optimal activation range is mid-range. As such, it is only recommended for use when the enemy is kept in place (via stunlocking) and is a large target.

20.8. PAL FAYT
SKILL SETUP: Blade of Fury -> Aerial
BATTLE PURPOSE: Interruption
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Cancel chain ends at Aerial. Decent at the start of the game where there simply aren't much options available.

SKILL SETUP: Blade of Fury -> Side Kick
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Acceptable cancel chain.

Recommended skill setup
SKILL SETUP: Charge -> Side Kick
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Optimal Side Kick setup, and the AI is capable of using it as desired.

SKILL SETUP: Side Kick -> Side Kick
BATTLE PURPOSE: Damage
LIMITATIONS: Requires the target to be large in size.
COMMENTS: If the requirement is not met, then the major Side Kick will almost always miss when used in a cancel chain.

SKILL SETUP: Shotgun Blast -> Shotgun Blast
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no fire-element protection.
COMMENTS: Good damage, provided that the enemy is not resistant to fire-element.

SKILL SETUP: Side Kick -> Dimension Door
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Dimension Door is better used for keeping generic enemies in their flinching animation, but the AI will not do so in a cancel chain.

SKILL SETUP: Air Raid -> Ethereal Blast
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Optimal Ethereal Blast setup, and the AI can use it as desired. However, it is still not recommended for general purpose use.

20.9. NTSC MARIA
Cannot use the most damaging skill setup in the game as desired. Fortunately, she still have Pulse Blast chains (one of the most damaging setups). If the enemy is kept prevented from being downed, then NTSC AI Maria can provide good short range damage.
SKILL SETUP: (long range) Scatter Beam -> (long range) Scatter Beam
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Damage output is reduced drastically as most hits will miss.

SKILL SETUP: Charge -> Charge
BATTLE PURPOSE: MP Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Acceptable cancel chain.

Recommended skill setup
SKILL SETUP: (long range) Pulse Blast -> (long range) Pulse Blast
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Potentially very damaging skill setup, and the AI can use it as desired.

Recommended skill setup
SKILL SETUP: Crescent Locus -> Crescent Locus
BATTLE PURPOSE: Interruption
LIMITATIONS: Cannot be used fully was desired when fighting stand-alone
COMMENTS: Can become a significant damaging skill setup if the enemy is kept in place (via stunlocking).

Recommended skill setup for NTSC only
SKILL SETUP: Crescent Locus -> Triple Kick
BATTLE PURPOSE: Interruption
LIMITATIONS: Cannot be used fully was desired when fighting stand-alone
COMMENTS: Can become a significant damaging skill setup if the enemy is kept in place (via stunlocking).

SKILL SETUP: Laser Blast -> Laser Blast
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no fire-element protection.
COMMENTS: Very damaging skill setup if the enemy is weak to fire-element.

Recommended skill setup
SKILL SETUP: (long range) Aiming Device -> (long range) Energy Burst
BATTLE PURPOSE: MP Damage
LIMITATIONS: None
COMMENTS: Best MP damaging skill setup in the game, and the AI can use it as desired.

Recommended skill setup
SKILL SETUP: (long range) Scatter Beam -> (long range) Energy Burst
BATTLE PURPOSE: MP Damage
LIMITATIONS: None
COMMENTS: A launching-incapable alternative to Aiming Device -> Energy Burst. Less damage, but offers more setup compatibility with allies.

20.10. PAL MARIA
Allows the use of pure Scatter Beam chains at point-blank range.
Recommended skill setup
SKILL SETUP: Scatter Beam -> Scatter Beam
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Best HP damaging skill setup in the game.

20.11. NTSC MIRAGE
Another one of the least useful characters to leave under AI control. Fortunately, she has skill setups in which canceling is not really necessary.
SKILL SETUP: Charge -> Charge
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Acceptable cancel chain.

SKILL SETUP: Charge -> Sphere of Might
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Acceptable cancel chain.

SKILL SETUP: Sphere of Might -> Sphere of Might
BATTLE PURPOSE: Stunlock
LIMITATIONS: None
COMMENTS: Mirage's best stunlocking setup, and the AI can use it as desired.

SKILL SETUP: Aerial Assault -> Aerial Assault
BATTLE PURPOSE: MP Damage
LIMITATIONS: Only works when the AoE version of the skill is used (NTSC version only; no limits in the PAL version)
COMMENTS: A high risk of triggering enemy AAAs. The normal version of the skill is capable of knockdown, so this may be a problem in the PAL version.

SKILL SETUP: Sphere of Might -> Aerial Assault
BATTLE PURPOSE: MP Damage
LIMITATIONS: Only works when the AoE version of the skill is used (NTSC version only; no limits in the PAL version)
COMMENTS: Alternative to pure Aerial Assault chains with low risk of death by enemy AAA.

Recommended skill setup
SKILL SETUP: Crescent Locus -> Crescent Locus
BATTLE PURPOSE: Interruption
LIMITATIONS: Cannot be used fully was desired when fighting stand-alone
COMMENTS: Can be used as a damaging skill setup if the enemy is kept in place (via stunlocking).

Recommended skill setup
SKILL SETUP: Crescent Locus -> Triple Kick
BATTLE PURPOSE: Interruption
LIMITATIONS: Cannot be used fully was desired when fighting stand-alone
COMMENTS: Can be used as a damaging skill setup if the enemy is kept in place (via stunlocking).

20.12. PAL MIRAGE
The only battle skill in which the AI cannot use as desired is Blazing Cannon, which is not that useful of a skill in the first place.
SKILL SETUP: Hammer of Might -> Hammer of Might
BATTLE PURPSE: Elemental damage
LIMITATIONS: Requires target to have no fire-element protection. Cannot be used fully as desired when fighting stand-alone.
COMMENTS: Good damage if the enemy is kept from being downed (via stunlocking) and is not resistant to fire-element.

Recommended skill setup
SKILL SETUP: Electric Fists -> Aerial Assault
BATTLE PURPOSE: MP Damage
LIMITATIONS: None
COMMENTS: Optimal Aerial Assault setup. Can be used as desired by the AI.

SKILL SETUP: Sphere of Might -> Avenger Charge
BATTLE PURPOSE: Elemental Damage
LIMITATIONS: Requires target to have no fire-element protection. Cannot be used fully as desired when fighting stand-alone.
COMMENTS: Recommended for enemies with weakness to fire-element.

SKILL SETUP: Electric Fists -> Avenger Charge
BATTLE PURPOSE: Elemental Damage
LIMITATIONS: Requires target to have no fire-element protection. Cannot be used fully as desired when fighting stand-alone.
COMMENTS: Recommended for enemies with weakness to fire-element.

Recommended skill setup
SKILL SETUP: Sphere of Might -> Infinity Kick
BATTLE PURPOSE: Damage
LIMITATIONS: Cannot be used fully as desired when fighting stand-alone
COMMENTS: Good general purpose skill setup under AI control.

Recommended skill setup
SKILL SETUP: Electric Fists -> Infinity Kick
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Electric Fists has multiple cancel points, making it a better minor than Sphere of Might for continuing the cancel chain. Is Mirage's best general purpose skill setup under AI control.

20.13. NTSC NEL
The AI is incapable of using Nel's useful skills as desired; making Nel a poor character to leave under AI control.
Recommende skill setup for NTSC only
SKILL SETUP: Shockwave -> Shockwave
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Acceptable cancel chain for the NTSC version only due to a lack of significantly superior alternatives.

SKILL SETUP: Shadow Wave -> Shadow Wave
BATTLE PURPOSE: MP Damage
LIMITATIONS: Cannot be used fully as desired when fighting stand-alone
COMMENTS: Enemy needs to be kept in place via stunlocking to make damage dealt acceptable.

SKILL SETUP: (long range) Ice Daggers -> (long range) Ice Daggers
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no ice-element protection. Nel's long range normal attacks are short range in nature.
COMMENTS: Acceptable cancel chain.

SKILL SETUP: Charge -> Charge
BATTLE PURPOSE: Damage
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Acceptable cancel chain.

SKILL SETUP: Poison Cloud -> Poison Cloud
BATTLE PURPOSE: MP Damage
LIMITATIONS: None
COMMENTS: Though relatively slow, it is an acceptable cancel chain.

Recommended skill setup
SKILL SETUP: (long range) Flying Guillotine -> (long range) Flying Guillotine
BATTLE PURPOSE: MP Damage
LIMITATIONS: Nel's long range normal attacks are short range in nature.
COMMENTS: Arguably Nel's best long range skill setup under AI control.

Recommended skill setup for NTSC only
SKILL SETUP: (both slots) Poison Cloud -> (short) Divine Wrath
BATTLE PURPOSE: Damage
LIMITATIONS: Requires no other combatant to stand between Nel and her target
COMMENTS: Divine Wrath has too many inherent flaws to be a good skill to use. Problem is, there aren't any noticeably better AI alternatives.

20.14. PAL NEL
Significantly better than her NTSC counterpart, but still cannot use her most dangerous (albeit elemental) battle skill as desired.
Recommended skill setup
SKILL SETUP: Ice Daggers -> Ice Daggers
BATTLE PURPOSE: Elemental damage
LIMITATIONS: Requires target to have no ice-element protection.
COMMENTS: Quite damaging when the enemy does not resist against ice-element.

SKILL SETUP: Shockwave -> Mirror Slice
BATTLE PURPOSE: Damage
LIMITATIONS: None
COMMENTS: Good, but not the best Mirror Slice setup available.

SKILL SETUP: Shadow Wave -> Mirror Slice
BATTLE PURPOSE: Interruption
LIMITATIONS: None
COMMENTS: Shadow Wave causes knockdown, which will usually cause the first few hits of Mirror Slice to miss.

Recommended skill setup
SKILL SETUP: Charge -> Mirror Slice
BATTLE PURPOSE: Juggle
LIMITATIONS: Requires player manipulation for pseudo battle skills.
COMMENTS: Optimal Mirror Slice setup as it provides a continuous juggle after the enemy gets launched by the initial Mirror Slice. The AI can use it as desired.



 * 
 */
}
