package GameInterfaces.NPCs;

import AI.AIEnums.EChores;
import AI.AIEnums.EMoods;
import AI.AIEnums.ENPCActions;
import AI.BitTables.Character.CAIBits;
import AI.BitTables.Character.CAdvancedAISliders;
import AI.BitTables.Character.CAnotherBitTable;
import AI.BitTables.Character.CBaseStats;
import AI.BitTables.Character.CCharacterStatistics;
import AI.BitTables.Character.CDynamicStats;
import AI.BitTables.Character.CEmotions;
import AI.BitTables.Character.CInternalThingTable;
import AI.BitTables.Character.CKnowledgeAndLore;
import AI.BitTables.Character.CSkill;
import AI.BitTables.Character.CSocialBehaviorsSliders;
import AI.BitTables.Character.CThingInfoClass;
import AI.BitTables.Character.CVvampireTable;
import GameInterfaces.IBase;

public interface IBaseNPC extends IBase, IEmotionParameters {

	//AI TYPE
	
	int active_speed = 0;
	boolean allured = false;
	String corpse_name = null;
	direct_damage = 0;
	energy_damage = 0;
	
	///fight mode
	
	int [] home = new int[3];
	
	boolean is_bonded = false;
	boolean is_champion_spawned = false;
	boolean is_paragoned = false;
	boolean is_prisoner = false;
	boolean no_loot_on_death = false;
	int passive_speed = 0;
	int physical_damage = 0;
	int poison_damage = 0;
	boolean alive = true;
	int armor_rating = 0;
	
	int back_pack_index = 0;
	int bank_box_index = 0;
	boolean blessed = false;
	
	int body_type_index = 0;
	int body_value_index = 0;
	boolean can_hear_ghosts = false;
	boolean can_swim = false;
	boolean cant_walk = false;
	
	int cold_resistance = 0;
	//combatant
	//corpse
	boolean criminal = false;
	int dex = 0;
	int str = 0;
	int intel = 0;
	
	int emote_hue = 0;
	
	int face_hue = 0;
	int face_item_id = 0;
	
	int facial_hair_hue = 0;
	int facial_hair_item_id = 0;
	
	int flying = 0;
	
	int hair_hue = 0;
	int hair_item_id = 0;
	
	boolean hidden = false;
	int hue = 0;
	
	int hunger = 0;
	boolean is_stealthing;
	
	int kills = 0;
	
	int [] location = new int[3];
	
	int mana = 0;
	
	//map
	
	boolean meditating = false;
	
	//mount
	
	boolean mounted = false;
	boolean murderer = false;
	
	int name_hue = 0;
	
	boolean paralyzed = false;
	boolean poisoned = false;
	
	//race
	
	String raw_name = null;
	int speech_hue = 0;
	
	int thirst = 0;
	String title = null;
	
	int total_gold = 0;
	int total_items = 0;
	int total_weight = 0;
	
	int weapon = 0;
	boolean war_mode = false;
	
	//Chores:
	EChores chore = null;
	EMoods mood = null;
	ENPCActions npc_action = null;
	
	CAdvancedAISliders advanced_sliders = null;
	
	CAIBits ai_bits = null;
	
	CAnotherBitTable another_bits = null;
	
	CBaseStats  base_stats = null;
	
	CCharacterStatistics char_stats = null;
	
	CDynamicStats dynamic_stats = null;
	
	CEmotions emotions  = null;
	
	CInternalThingTable internal_thing = null;
	
	CKnowledgeAndLore knowledge_lore = null;
	
	CSkill skillls = null;
	
	CSocialBehaviorsSliders social_sliders = null;
	
	CThingInfoClass thing_info = null;
	
	CVvampireTable vampire_table = null;
	
	
	
	
}
