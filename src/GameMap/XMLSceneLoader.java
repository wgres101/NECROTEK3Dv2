package GameMap;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import Journaling.CJournal;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;
import WSObjects.WSObject;

public class XMLSceneLoader {

	// Actors
	// --------
	// WSCharacter
	// WSChild
	// WSFirstPlayerActor
	// WSThirdPersonPlayerActor
	// WSEmptyActor
	// WSLightActor
	// WSLightMapImportance
	// WSLightMassCharacter
	// WSPawn
	// WSSolidModellingGrammar

	// AdvancedPrimitives
	// ------------------
	// WSPaths
	// WSSplines
	// WSUniformCurves
	// WSVoxels
	// WSBezierCurves
	// WSCircle
	// WSConstructiveSolidGeometry
	// WSCurves
	// WSLevelSetCurves
	// WSMetaBalls
	// WSNonUniformSPlines
	// WSNURBSCurve

	// Lighting
	// -----------
	// WSGroundPlaneShadows
	// WSPointLight
	// WSRealTimeShadows
	// WSSpotLight

	// Miscellaneous
	// ----------------
	// WSHeatAndHazePostProcessing
	//

	// Primitives
	// ------------------
	// WSAnimatedCamera
	// WSBox
	// WSCameraControlTechniques
	// WSCameraObject
	// WSFog
	// WSSphereStaticMesh
	// WSVectorCamera

	// WorldGeneration
	// -----------------
	// WSFractalTerrainGenerationFaultFormation

	public static void addToSceneGraph(SceneGraphNode node, SceneGraphNode parent) {
		// call functions below depending on node type info
		// then add them to the scene graph

		/* create web service then pass it to the scenegraph */
		// WebServiceFactory.launchWebService(serviceName);
		CJournal.Journal(XMLSceneLoader.class, "XML Name for test XML object: " + node.xmlData.getName());

		if (node.xmlData.getName().equals("FirstPersonPlayerCharacterService")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate First Player Character Service from XML Map");

			ServiceRoot character_service = createFirstPersonPlayerCharacterService(node, parent);

			CJournal.Journal(XMLSceneLoader.class, "Instantiate First Player Character WSObject from XML Map");
			WSObject character = createWSCharacter(node, parent);

			CJournal.Journal(XMLSceneLoader.class, "Adding First Player Character Service to Scene Graph");

			//SceneGraphManager.add(node, parent);
		}

		
		if (node.xmlData.getName().equals("PointLightService")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Point Light Service");

			ServiceRoot point_light_service = createPointLightService(node, parent);

			CJournal.Journal(XMLSceneLoader.class, "Instantiate Point Light Service from XML Map");
			WSObject waspointlight = createWSPointLight(node, parent);

			CJournal.Journal(XMLSceneLoader.class, "Adding WSPointLight Object to Scene Graph");

			//SceneGraphManager.add(node, parent);
		}

		
		/* create ws object then pass it to the scenegraph */
		// WebServiceFactory.launchWebServiceInstance(instanceName);

	}

	// creates XML Tags into Scenegraph nodes
	public static WSObject createWSCharacter(SceneGraphNode node, SceneGraphNode parent) {

		ServiceRoot service = WebServiceFactory.launchWebService("CharacterService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("CharacterInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createWSChild(SceneGraphNode node, SceneGraphNode parent) {

		ServiceRoot service = WebServiceFactory.launchWebService("ChildClassService)");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("ChildCLassInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createFirstPlayerActor(SceneGraphNode node, SceneGraphNode parent) {

		ServiceRoot service = WebServiceFactory.launchWebService("FirstPlayerctorService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("FirstPlayerInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createThirdPersonPlayerActor(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("ThirdPersonPlauerActorService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("ThirdPersonPlayerCharacterInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;

	}

	public static ServiceRoot createFirstPersonPlayerCharacterService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("FirstPersonPlayerCharacterService");
		SceneGraphManager.add(service, parent);
		return service;
	}

	public static ServiceRoot createCameraObjectService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("CameraObjectService");
		SceneGraphManager.add(service, parent);
		return service;
	}

	public static WSObject createWSCameraObject(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("CameraObjectService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("CameraObjectInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;

	}

	public static ServiceRoot createPointLightService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("PointLightService");
		SceneGraphManager.add(service, parent);
		return service;
	}

	public static WSObject createWSPointLight(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("PointLightService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("PointLightService");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);

		return instance;
	}

	public static ServiceRoot createBoxService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("BoxService");
		SceneGraphManager.add(service, parent);
		return service;

	}

	public static WSObject createWSBox(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("BoxService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("BoxInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;

	}
}