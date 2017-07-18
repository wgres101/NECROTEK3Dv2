package GameInterfaces.Monsters;

import java.util.Vector;

import AI.BitTables.Character.CSpell;
import Actor.PlayerCharacter.CImmunity;
import Actor.PlayerCharacter.CPet;
import Actor.PlayerCharacter.CWyvernMorph;
import Actor.PlayerCharacter.PhysicalAttacks.CPhysicalAttack;
import GameInterfaces.IBase;
import Hierarchy.PlayerCharacter.CAbility;

public interface IBaseMonster extends IBase {

	int active_speed = 0;
	boolean allured = false;
	int chaos_damage = 0;
	int [] charm_target = new int[3];
	int cold_damage = 0;
	String corpse_name = null;
	
	int damage_max = 0;
	int damage_min = 0;
	
	int direct_damage = 0;
	int energy_damage = 0;
	
	//fight_mode
	
	int fire_damage = 0;
	int [] home = new int[3];
	
	boolean is_prisoner = false;
	
	int loyalty = 0;
	boolean no_kill_rewards = false;
	boolean no_loot_on_death = false;
	
	int physical_damage =0;
	int physical_resistance = 0;
	
	int poison_damage =0;
	int poison_resist = 0;
	
	int range_fight = 0;
	int range_home = 0;
	int range_perception = 0;
	
	boolean remove_if_untamed = false;
	boolean seeks_home = false;
	boolean tamable = false;
	boolean alive = false;
	
	
	//AIType ai = null;


	//In-battle stats
	int readiness = 0;
	int max_readiness = 0;
	int readiness_speed = 0;
	
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
	int fire_resistance = 0;
	int earth_resistance = 0;
	int ice_resistance = 0;
	int water_resistance = 0;
	int electric_resistance = 0;
	int poison_resistance = 0;
	
	Vector<CSpell> spells = null; //magic spells
	Vector<CAbility> abilities = null; //abilities
	Vector<CPhysicalAttack> physicals = null; //physical attacks

	boolean poison = false;
	boolean frozen = false;
	boolean slow = false;
	boolean paralyzed = false;
	boolean mute = false;
	boolean dumb = false;
	boolean on_fire = false;
	boolean shock = false;
	
	//Permament
	
	boolean stone = false;
	boolean plague = false;
	boolean berserk = false;
	
	boolean fast = false;
	boolean courageous = false;
	boolean genius = false;
	boolean rage = false;
	boolean desperation = false;

	
	//there are three ranges for attack
	//Action Range
	enum Range { FAR_RANGE, MID_RANGE, CLOSE_RANGE, VERY_CLOSE_RANGE }

	Vector<CImmunity> immunities = null; //you build up immunities to spells over time
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
	//appearance
	int body_id = 0;
	
	boolean can_hear_ghosts = false;
	boolean can_swim = false;
	boolean cant_walk = false;

	boolean flying = false;
	int karma = 0;
	
	int current_map_id = 0;
	
	int mount_id = 0;
	
	boolean murderer = false;
	
	int race_id = 0; //race
	

	
	

	
}
