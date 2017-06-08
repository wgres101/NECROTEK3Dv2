package Resources;

//resources will always load faster when loaded sequentially

//Two ideal ways: Save an entire scene graph to a file - might get duplicates
//We want to be able to hotload however
//Store hexagonal map and its data in a custom file format
//when an object reaches the horizon, hot load the objects
//and unload the objects that are no longer within view\

//How do we do that and load sequentially?
//The scengraph of each hexagon is packed and stored next to each other


//Load Resources sequentially according to the storyline of the game
//Read the resource file sequentially!!! no random access
//Cache files in memory. If there is more than copy of the
//same texture for example -> fail


public class ResourceManager {

}
