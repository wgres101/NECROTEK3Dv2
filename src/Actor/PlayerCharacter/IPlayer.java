package Actor.PlayerCharacter;

import java.util.Vector;

import AI.BitTables.Character.CSkill;
import AI.BitTables.Character.CSpell;
import Actor.PlayerCharacter.DoubleTech.CDoubleTech;
import Actor.PlayerCharacter.PhysicalAttacks.CPhysicalAttack;
import Hierarchy.PlayerCharacter.CAbility;
import Hierarchy.PlayerCharacter.CSingleTech;
import Hierarchy.PlayerCharacter.CTalent;
import Hierarchy.PlayerCharacter.CTripleTech;
import Hierarchy.PlayerCharacter.CUniqueInnate;
import Hierarchy.PlayerCharacter.CUniqueSkill;
import Hierarchy.PlayerCharacter.CWeaponMastery;

public interface IPlayer {

	
		//AIType ai = null;
	
	
		//In-battle stats
		int readiness = 0;
		int max_readiness = 0;
		int readiness_speed = 0;
		
		
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
		int attack_frequency = 0;
		int defense_frequency = 0;
		int control_frequency = 0;
		int flee_frequency = 0;
		int rage_frequency = 0;
		int desperation_frequency = 0;
		
		int aggression = 0;
		int battle_self_control = 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Battle Stats
		int strength = 0;
		int endurance = 0;
		int defense = 0;
		int intelligence = 0;
		int dexterity = 0;
		int speed = 0;
		int stamina = 0;

		int total_number_of_battles = 0;
		
		
		int charge_meter = 0; //a meter that fills up to do multiple attacks in one
		
		int hp = 0;
		int max_hp = 0;
		int mp = 0;
		int max_mp = 0;
		
		
		int punch = 0;
		int kick = 0;
		int dodge = 0;
		int agility = 0;
		
		int fear = 0;
		int alignment = 0;
		int fame = 0;
		int virtue = 0;
		int conscience = 0;
		int self_control = 0;
		int courage = 0;
		int bravery = 0;
		
		int rage_multiplier = 0;
		int desperation_multiplier = 0;

		int manipulation = 0;
		int apperaance = 0;
		int perception = 0;
		int wits = 0;
		
		//Taming stats
		int taming_difficulty = 0;
		int tameable = 0;
		
		//Magical Stats
		
		int wisdom = 0;
		int m_defense = 0;
		int m_dexterity = 0;
		
		//mental stats
		int will = 0;
		int will_power = 0;
		int boost = 0;
		
		//ability states
		int ability_points = 0;
		int max_ability_points = 0;
		
		//misc stats
		int luck = 0;
		int charisma = 0;
		int horror = 0;


		//world stats
		int run = 0;
		int sprint = 0;
		int leap = 0;
		int swim = 0;
		
		//level specific stats
		int experience = 0;
		int next = 0;
		int level = 0;
		int max_stats = 0;
		int next_level = 0;
		
		
		
		//equipment stats
		int weight = 0;
		int max_weight = 0;
		int gold = 0;
		
		//resistancevs
		int physical_resistance = 0;
		int fire_resistance = 0;
		int earth_resistance = 0;
		int ice_resistance = 0;
		int water_resistance = 0;
		int electric_resistance = 0;
		int poison_resistance = 0;
		
		//Knowledge and Lore

		int knowledge_of_technology = 0;
		int knowledge_of_magery = 0;
		int knowledge_of_security_systems = 0;
		int knowledge_of_computers = 0;
		int knowledge_of_substances = 0;
		int knowledge_of_law = 0;
		int knowledge_of_theatre = 0;
		int knowledge_of_art = 0;
		int knowledge_of_academics = 0;
		int knowledge_of_finance = 0;
		int knowledge_of_investigation = 0;
		int knowledge_of_linguistics = 0;
		int knowledge_of_meedicine = 0;
		int knowledge_of_occult = 0;
		int knowledge_of_poltiics = 0;
		int knowledge_of_science = 0;

		Vector<CInnate> innates = null;
		Vector<CUniqueInnate> unique_innates = null;
		Vector<CSkill> skills = null;
		Vector <CUniqueSkill> unique_skills = null;
		Vector<CTalent> talents = null;
		
		Vector<CSpell> spells = null; //magic spells
		Vector<CAbility> abilities = null; //abilities
		Vector<CPhysicalAttack> physicals = null; //physical attacks
		Vector<CWyvernMorph> wyvern_morphs = null; //secret morphs acquired 
		Vector<CPet> pets = null; //pets you can tame to follow you around and help in battle
		
		//Vector of professions
		//Vectoro of character classes
		//status ailments

		boolean poison = false;
		boolean frozen = false;
		boolean slow = false;
		boolean paralyzed = false;
		boolean mute = false;
		boolean dumb = false;
		boolean on_fire = false;
		boolean shock = false;
		
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
		
		boolean stone = false;
		boolean plague = false;
		boolean berserk = false;
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
		boolean fast = false;
		boolean courageous = false;
		boolean genius = false;
		boolean rage = false;
		boolean desperation = false;

		
		//there are three ranges for attack
		//Action Range
		enum Range { FAR_RANGE, MID_RANGE, CLOSE_RANGE, VERY_CLOSE_RANGE }

		Vector<CImmunity> immunities = null; //you build up immunities to spells over time

		Vector<CCombo> combos = null; //button combinations that boost attacks. Learned over time
		Vector<CWeaponMastery> weapon_mastery = null; //Use of the same weapon over time boosts its power and 
											//grants special attacks
		
		Vector<CSingleTech> single_techs = null; //a special technique 
		Vector<CDoubleTech> double_techs = null; //a special technique requriing two characters
		Vector<CTripleTech> triple_techs = null; //a special technique requirinig three characters
		Vector<CMorph> morphs = null; //regular morphs learned as you level up
		Vector<CFormulae> formulas = null; //abilties gained by mixing reagents to create learnable spell scrolls
		
		
		/** Equiment wearing */
		
		int left_hand = 0;
		int right_hand = 0;
		int head = 0;
		int body = 0;
		int sleeves = 0;
		int leggings = 0;
		int shoes = 0;
		int robe = 0;
		int overcoat = 0;
		int rings = 0;
		int necklace = 0;
		int gloves = 0;
		int cloak = 0;
		int back = 0;
		
		
		/* Stats borrowed from ultima */
		int access_level = 0;  //game master, counselor, owner
		
		String acccount_name = null;
		int accelerated_skill = 0;
		
		//
		boolean player_companion = true;
		boolean can_fly = false;
		
		//current activity bits
		boolean gem_mining = false;
		boolean basket_weaving = false;
		boolean glass_blowing = false;
		boolean sand_mining = false;
		boolean spell_weaving = false; //casting a spell
		boolean stone_mining = false;
		
		
		//guild guildname
		
		
		//mobile
		boolean alive = true;
		int allowed_stealth_steps = 0;
		int back_pack_id = 0;
		int bank_box_id = 0;
		
		//appearance
		int body_id = 0;
		
		boolean can_hear_ghosts = false;
		boolean can_swim = false;
		boolean cant_walk = false;
		
		//combatant
		//corpse
		
		int emote_hue = 0;
		int face_hue = 0;
		int face_item_id = 0;
		int facial_hair_hue = 0;
		int facial_hair_item_id = 0;
		boolean female = false;
		
		boolean flying = false;
		
		int followers_num = 0;
		
		//list of followers
		
		boolean hidden = false;
		int hue = 0;
		int hunger = 0;
		
		boolean is_stealthing = false;
		
		int karma = 0;
		
		int current_map_id = 0;
		
		int mount_id = 0;
		
		boolean murderer = false;
		
		int race_id = 0; //race
		
		
	}


