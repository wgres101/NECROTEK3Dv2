package Actor.PlayerCharacter;

import java.util.Vector;

import Hierarchy.Character.CSkill;
import Hierarchy.Character.CSpell;
import Hierarchy.PlayerCharacter.CAbility;
import Hierarchy.PlayerCharacter.CSingleTech;
import Hierarchy.PlayerCharacter.CTalent;
import Hierarchy.PlayerCharacter.CTripleTech;
import Hierarchy.PlayerCharacter.CUniqueInnate;
import Hierarchy.PlayerCharacter.CUniqueSkill;
import Hierarchy.PlayerCharacter.CWeaponMastery;


/*

Battle Stats
Strength – Used to calculate attack
Endurance – Used to calculate hit points
Defense – Used to calculate defense
Dexterity – Used to calculate how often you hit with a weapon

Punch – Used to calculate how well you hit barehanded
Kick – Used to calculate how well you kick
Dodge – Used to calculate how well you dodge attacks manually
Agility – Used to calculate how well you auto-dodge attacks

Fear – Controls how often monsters and people run from you in combat
Alignment – How much evil or good you are (interactions with people)
Fame – How well known you are
Virtue – points gathered according to type of things killed (good animals/monsters)
Conscience – how your actions effect your mentality
Self-Control – how difficult it is for the character to go on a kill-spree
Courage – how often a character will risk saving another character
Bravery – how much it takes for a character to lead the attack

Charisma – how good looking the character is
Manipulation – how well the character can control others by nonmagical means
Appearance – how cleanly and human like the character appears to be
Perception – how correct the characters perception of things is
Wits – how easily the character can get out of a bad situation


Taming Stats
Taming Difficulty – how difficult it is to tame this creature
Tameable – can the creature be tamed

Magical Stats
Intelligence – Used to calculate magical attack
Wisdom – Used to calculate mana
M. Defense – Used to calculate defense against magic
M. Dexterity – Used to calculate how often you hit with magic

Mental Stats
Will – Used to measure will power
Will Power – a bonus to hp and attack when gauge is full.
Boost – a meter that boosts your attack by a percentage

Miscellaneous Stats
Luck – How often you find freebees
Charisma – How good looking or freakish you are
Horror – Points given to how well known of a monster you are
Stamina – Contributes to how long you can run
Max Weight – the maximum weight you can carry

World Stats
Run – how fast you can run, how long you can run, etc…
Sprint – how fast you can sprint, how long you can sprint, etc..
Leap – how high you can jump, how  long you can stay jumping
Swim – how fast you can swim and how long you can swim



Level Specific Stats
Experience – The accumulated experience
Next – How much experience you need for the next level
Level – The current level you are in your class
Maximum Stats – the maximum your base statistics can be

Life Related Stats
Hit Points – Endurance*Level
Stamina – How long you can run or work
Mana – How much magic power you have left

Equipment Stats
Weight – How much weight you are currently carrying
Max Weight – The maximum amount of weight you can carry
Gold – How much gold you are carrying

Resistances
Physical Resistance
Fire Resistance
Earth Resistance
Ice Resistance
Water Resistance
Electric Resistance
Poison Resistance

Innates
Skills that cannot be learned. Innate abilities come naturally from experience.

Unique Innates
Skills that cannot be taught and are unique to a character or race
Innate abilities come naturally and come from experience.

Skills
Abilities that can be taught.

Unique Skills
Abilities that are taught, but only a certain character or race can learn them.

Talents
Abilities that come naturally and require no skill power or will power to use.



Knowledge and Lore

Knowledge of Technology – a natural tech wiz.
Knowledge of Magery – gifted in the art of magic
Knowledge of Security Systems – skills of a modern thief
Knowledge of Computers – a hacker
Knowledge of Substances – a natural born chemist
Knowledge of Law – wisdom in the legal field
Knowledge of Theatre – a great actor
Knowledge of Art – a gifted artist
Knowledge of Academics – teachers, professors
Knowledge of Finance – bankers, creditors
Knowledge of Investigation – cops, detectives, fbi, bounty hunters
Knowledge of Law – laywers, judges
Knowledge of Linguistics – translators, language teachers
Knowledge of Medicine – doctors, nurses
Knowledge of Occult – witches, fortune tellers
Knowledge of Politics – mayors, governors, presidents
Knowledge of Science – chemists, physicists, biologists

*/

public class CPlayer {

	//In-battle stats
	int readiness;
	int max_readiness;
	int readiness_speed;
	
	
	/* 
	 * Personality Factors

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


	 */
	int attack_frequency;
	int defense_frequency;
	int control_frequency;
	int flee_frequency;
	int rage_frequency;
	int desperation_frequency;
	
	int aggression;
	int battle_self_control;
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Battle Stats
	int strength;
	int endurance;
	int defense;
	int intelligence;
	int dexterity;
	int speed;
	int stamina;

	int total_number_of_battles;
	
	
	int charge_meter; //a meter that fills up to do multiple attacks in one
	
	int hp;
	int max_hp;
	int mp;
	int max_mp;
	
	
	int punch;
	int kick;
	int dodge;
	int agility;
	
	int fear;
	int alignment;
	int fame;
	int virtue;
	int conscience;
	int self_control;
	int courage;
	int bravery;
	
	int rage_multiplier;
	int desperation_multiplier;

	int manipulation;
	int apperaance;
	int perception;
	int wits;
	
	//Taming stats
	int taming_difficulty;
	int tameable;
	
	//Magical Stats
	
	int wisdom;
	int m_defense;
	int m_dexterity;
	
	//mental stats
	int will;
	int will_power;
	int boost;
	
	//ability states
	int ability_points;
	int max_ability_points;
	
	//misc stats
	int luck;
	int charisma;
	int horror;


	//world stats
	int run;
	int sprint;
	int leap;
	int swim;
	
	//level specific stats
	int experience;
	int next;
	int level;
	int max_stats;
	int next_level;
	
	
	
	//equipment stats
	int weight;
	int max_weight;
	int gold;
	
	//resistancevs
	int physical_resistance;
	int fire_resistance;
	int earth_resistance;
	int ice_resistance;
	int water_resistance;
	int electric_resistance;
	int poison_resistance;
	
	//Knowledge and Lore

	int knowledge_of_technology;
	int knowledge_of_magery;
	int knowledge_of_security_systems;
	int knowledge_of_computers;
	int knowledge_of_substances;
	int knowledge_of_law;
	int knowledge_of_theatre;
	int knowledge_of_art;
	int knowledge_of_academics;
	int knowledge_of_finance;
	int knowledge_of_investigation;
	int knowledge_of_linguistics;
	int knowledge_of_meedicine;
	int knowledge_of_occult;
	int knowledge_of_poltiics;
	int knowledge_of_science;

	Vector<CInnate> innates;
	Vector<CUniqueInnate> unique_innates;
	Vector<CSkill> skills;
	Vector <CUniqueSkill> unique_skills;
	Vector<CTalent> talents;
	
	Vector<CSpell> spells; //magic spells
	Vector<CAbility> abilities; //abilities
	Vector<CPhysicalAttack> physicals; //physical attacks
	Vector<CWyvernMorph> wyvern_morphs; //secret morphs acquired 
	Vector<CPet> pets; //pets you can tame to follow you around and help in battle
	
	
	//status ailments

	boolean poison;
	boolean frozen;
	boolean slow;
	boolean paralyzed;
	boolean mute;
	boolean dumb;
	boolean on_fire;
	boolean shock;
	
	/*
	Status Ailments

	Temporary:

	These status ailments will wear off over time.

	Poison – The player routinely receives damage from the poison.
	Frozen – The player can no longer function.
	Slow – Slows down readiness and movement time
	Paralyzed – The player can no longer move or use physical attacks
	Mute – The player can no longer use magic
	Dumb – The player can no longer use special abilities
	On Fire – The continue takes fire elemental damage until the fire goes out or until someone casts a water spell on him. (Note, the water spell will not damage him).
	Shock – The player is taken off guard and his readiness meter is reduced to 0 upon acquiring this ailment.

	*/

	
	//Permament
	
	boolean stone;
	boolean plague;
	boolean berserk;
	/*
	Permanent:

	These status ailments cause a player to be considered “dead” if all other players die. These ailments do not wear off on their own and must be cured with either spells or items.

	Stone – The player can no longer function.
	Plague – permanent poison. The player continues to take damage but cannot operate.
	Berserk – The player has lost his mind and will attack anything or anyone he/she sees fit.
	*/

	//Positive Status Effects
	
	/*	These status ailments have a positive effect on the player.

		Fast – Speeds up movment and readiness time.
		(Element) Immunity – Has a temporary immunity to that elemental type of magic.
		Courage – Boosts physical attack power.
		Genius – Boosts magical attack power
		Rage – See above. Wears off when the player’s HP increases.
		Desperation – See above. Wears off if another player is revived or if HP is increased.
	*/
	boolean fast;
	boolean courageous;
	boolean genius;
	boolean rage;
	boolean desperation;

	
	//there are three ranges for attack
	//Action Range
	enum Range { FAR_RANGE, MID_RANGE, CLOSE_RANGE, VERY_CLOSE_RANGE }

	Vector<CImmunity> immunities; //you build up immunities to spells over time

	Vector<CCombo> combos; //button combinations that boost attacks. Learned over time
	Vector<CWeaponMastery> weapon_mastery; //Use of the same weapon over time boosts its power and 
										//grants special attacks
	
	Vector<CSingleTech> single_techs; //a special technique 
	Vector<CDoubleTech> double_techs; //a special technique requriing two characters
	Vector<CTripleTech> triple_techs; //a special technique requirinig three characters
	Vector<CMorph> morphs; //regular morphs learned as you level up
	Vector<CFormulae> formulas; //abilties gained by mixing reagents to create learnable spell scrolls
	
	
	/** Equiment wearing */
	
	int left_hand;
	int right_hand;
	int head;
	int body;
	int sleeves;
	int leggings;
	int shoes;
	int robe;
	int overcoat;
	int rings;
	int necklace;
	int gloves;
	int cloak;
	int back;
}
