package AssetHandler;

//this class is designed to unload objects when they get
//out of view and reload them whent hey grow closer

//for example, if a resource is more than two hexagons 
//away it will be unloaded by the assethotloader. IF the
//asset approaches and is travelling towards the plauyer,
//when it reaches within two hexagonals its data will
//be loaded into the game. This yields a neverending
//map if desired - if tied in with procedural functinos.


public class AssetHotLoader {

	public static void loadAsset() { }
	
	public static void unloadAsset() { }
	 
	public static float [] assetDistanceToPlayer;
	
	public static float [] assetHexagonalDistanceToPlayer;
	
	public static void Update() { }
}
