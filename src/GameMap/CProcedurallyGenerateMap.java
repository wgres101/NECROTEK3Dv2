package GameMap;

import org.jdom2.Element;

import Sampler.Main;
import SceneGraph.SceneGraphNode;

//when outside linear story areas, map is generated dynamically
//and saved


public class CProcedurallyGenerateMap {

	//MegaTexture: Blend between them
	
	/*
	 * Climate: Desert, Forest, Cliffface, Beach, Ocean, Lake, Waterfall, Jungle
	 * 
	 * 	Dynamic lighting, corona, ambient, spotlight, normal lighting, Colored Lighting, Fog Lights, Smoke Lights.
	 * Castle

*/
	
	
	
	public static void GenerateNewHexagon(CHexagonCoordinates hex) //coordiantes of new map
	{
		System.out.println("Generating New Procedural Hexagon");
		
		
		generateOcean();
		
		/*
		generateLake();
		generateWaterfall();
		generateCliff();
		generateDesert();
		generateOasis();
		generatePineForest();
		generateMapleForest();
		generateBeach();
		generateJungle();
		generateLavaBed();
		generateSnowForest();
		generateTown();
		generateVillage();
		generateSwamp();
		generateRuins();
		generateCemetary():
		generateSandStoneTown();
		generateVolcano();
		generateLabyrinth();
		generateStoneHenge();
		generateForestOfMyst();
		generateForestCaslte();
		generateMagesTower();
		generateBridge();
		gemerateLostCastle();
		generateDiscoveredCastle();
		generateEden();
		generateUndergroundLake();
		generateHills();
		generateHauntedForest();
		generateDragonsLair();
		generateUndergroundTunnel();
		generateIcePrairie();
		generateRainyVillage();
		generateForcedLaborCamp();
		generatePlains();
		generateLightningPlains();
		generateGhostTown();
		generateGoldCity();
		generateSpring();
		generateIceMountain();
		generateCastleRuins();
		generateAirshipDock():
		generatePrisonVillage();
		generateBreezyMountains():
		generateUnderWaterCity();
		generatePalace();
		generateAnElementalIsland();
		generateSkyTower();
		generateFloatingCastle();
		generateCrystalPalace();
		generateMiddleEasternPalace();
		generateSwampPalace();
		generateSkullWoods();
		generateThievesTown();
		generateOrcFort();
		generateMiseryMine();
		generateMine();
		generateGargoyleTower();
		generateTurtleRock();

		*/
	}
	
	public static void generateOcean()
	{
		System.out.println("Generating Ocean");
		SceneGraphNode sgn= new SceneGraphNode();
		sgn.xmlData = new Element("Ocean");
		Main.sceneGraph.add(sgn,  Main.sceneGraph.root);;
		
	}
}
