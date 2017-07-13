package GameInterfaces.Armor;

import GameInterfaces.IBase;

public interface IBaseArmor extends IBase {
		
	
		int base_armor_rating = 0;
		String blessed_by = null;
		int block_repair = 0;
		//Body Position = arms
		boolean cold_bonus = false;
		boolean cold_imbuing = false;
		String crafter = null;
		int dex_bonus = 0;
		int dex_requirement = 0;
		//Durability = regular
		boolean energy_bonus = false;
		boolean energy_imbuing = false;
		boolean fire_bonus =false;
		boolean fire_imbuing = false;
		boolean identified = false;
		int int_bonus = 0;
		int int_requirement = 0;
		boolean is_imbued = false;
		int item_power = 0;
		int phys_imbuing = 0;
		int phys_bonus = 0;
		boolean player_constructed = false;
		boolean poison_bonus = false;
		boolean poison_imbuing = false;
		//Protection
		//Protection Level
		boolean refined_cold = false;
		boolean refined_defense_chance = false;
		boolean refined_fire = false;
		boolean refined_physical = false;
		boolean refined_poison = false;
		
		//Resource - regular leather 
		int strength_bonus = 0;
		int strength_requirement = 0;
		int durability_bonus = 0;
		int lower_stat_req = 0;
		boolean mage_armor = false;
		int reactive_paralyze = 0;
		int self_repair = 0;
		int soul_charge = 0;
		
		
		/** attribute s**/
		int attack_chance = 0;
		int balanced_weapon = 0;
		int bonus_int = 0;
		int bonus_dex = 0;
		int bonus_str = 0;
		
		int brittle = 0;
		int cast_recovery = 0;
		int cast_speed = 0;
		int defend_chance = 0;
		int enhance_potions = 0;
		int increase_karma_loss = 0;
		int lower_ammmo_cost = 0;
		int lower_mana_cost = 0;
		int lower_reg_cost = 0;
		int luck = 0;
		int nightsight = 0;
		
		int reflect_physical = 0;
		int regen_hits = 0;
		int regen_mana = 0;
		int regen_stam = 0;
		
		int spell_channeling = 0;
		
		int spell_damage = 0;
		int weapon_damage = 0;
		int weapon_speed = 0;
		
		int casting_focus = 0;
		int eater_cold = 0;
		int eater_damage = 0;
		int eater_energy = 0;
		int eater_fire = 0;
		int eater_kinetic = 0;
		int eater_poison = 0;
		int resonance_cold = 0;
		int resonance_damage = 0;
		int resonance_energy = 0;
		int resonance_fire = 0;
		int resonanace_kinetic = 0;
		int resonanace_poison = 0;
		
}
