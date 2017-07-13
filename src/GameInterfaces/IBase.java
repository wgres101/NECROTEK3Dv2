package GameInterfaces;

public interface IBase {

	String name = null;
	String description = null;
	int amount = 0;
	int decayTime = 0;
	boolean decays = false;
	//enum direction
	int gridLocation = 0;
	int hue = 0;
	boolean isArtifact = false;
	int itemID = 0;
	int [] LocationCoordinates = new int[3];
	//LootType regular
	//Map trammel
	boolean movable = false;
	int pile_weight = 1;
	boolean quest_item = false;
	boolean stackable = false;
	int weight = 1;
	int cost_in_gold = 0;
	int hit_points = 0;
	int max_hit_points = 0;


}
