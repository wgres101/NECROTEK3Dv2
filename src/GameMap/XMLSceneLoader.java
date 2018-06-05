package GameMap;

import org.jdom2.Element;

import DTI.DTIClass;
import Factory.WebServiceFactory;
import IDE.SceneGraph;
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
	// WSEmptyActorlaunch
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

	DTIClass dtiClass = new DTIClass("XMLSceneLoader", null);

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
			WSObject character = createWSFirstPersonPlayerCharacter(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding First Player Character Service to Scene Graph");

			SceneGraphManager.add(node, SceneGraphManager.root);
		}

		if (node.xmlData.getName().equals("WSFirstPersonPlayerCharacter")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate First Player Character Service from XML Map");
			WSObject character = createWSFirstPersonPlayerCharacter(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding First Player Character Service to Scene Graph");

			SceneGraphManager.add(node, SceneGraphManager.root);
		}

		if (node.xmlData.getName().equals("WSDaemonArms")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Daemon Arms from XML Map");
			WSObject WSDaemonArms = createWSDaemonArms(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding Daemon Arms WS Object to Scene Graph");

			SceneGraphManager.add(node, SceneGraphManager.root);
		}

		if (node.xmlData.getName().equals("WSDaemonBone")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Daemon Bone from XML Map");
			WSObject WSDaemonBone = createWSDaemonBone(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding Daemon Bone to Scene Graph");

			SceneGraphManager.add(node, SceneGraphManager.root);
		}

		if (node.xmlData.getName().equals("WSDaemonChest")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Daemon Chest from XML Map");
			WSObject WSDaemonChest = createWSDaemonChest(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding Daemon CHest to Scene Graph");

			SceneGraphManager.add(node, parent);
		}

		if (node.xmlData.getName().equals("WSDaemonHelm")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Daemon Helm from XML Map");
			WSObject WSDaemonHelm = createWSDaemonHelm(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding Daemon Helm to Scene Graph");

			SceneGraphManager.add(node, parent);
		}

		if (node.xmlData.getName().equals("WSDaemonLegs")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Daemon Legs from XML Map");
			WSObject WSDaemonLegs = createWSDaemonLegs(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding Daemon Legs to Scene Graph");

			SceneGraphManager.add(node, parent);
		}
		
		if (node.xmlData.getName().equals("GameStartHexagon")) {
			CJournal.Journal(XMLSceneLoader.class, "Hexagon Start Maps from XML Map");
			WSObject GameStartHexagon = createGameStartHexagon(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding GameStartHexagon to Scene Graph");

			SceneGraphManager.add(node, parent);
		}
		
		if (node.xmlData.getName().equals("Hexagon")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Hexagon from XML Map");
			WSObject Hexagon = createHexagon(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding Hexagon Map to Scene Graph");

			SceneGraphManager.add(node, parent);
		}

		if (node.xmlData.getName().equals("PointLightService")) {
			CJournal.Journal(XMLSceneLoader.class, "Instantiate Point Light Service");

			ServiceRoot point_light_service = createPointLightService(node, parent);

			CJournal.Journal(XMLSceneLoader.class, "Instantiate Point Light Service from XML Map");
			WSObject waspointlight = createWSPointLight(node, parent, node.xmlData);

			CJournal.Journal(XMLSceneLoader.class, "Adding WSPointLight Object to Scene Graph");

			SceneGraphManager.add(node, parent);
		}

		
				/* create ws object then pass it to the scenegraph */
		// WebServiceFactory.launchWebServiceInstance(instanceName);

	}

	// creates XML Tags into Scenegraph nodes
	public static WSObject createWSCharacter(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		ServiceRoot service = WebServiceFactory.launchWebService("CharacterService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("CharacterInstance", xmlData);
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createWSFirstPersonPlayerCharacter(SceneGraphNode node, SceneGraphNode parent,
			Element xmlData) {
		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSFirstPersonPlayerCharacter", xmlData);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createWSChild(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		ServiceRoot service = WebServiceFactory.launchWebService("ChildClassService)");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("ChildCLassInstance", xmlData);
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createFirstPlayerActor(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		ServiceRoot service = WebServiceFactory.launchWebService("FirstPlayerctorService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("FirstPlayerInstance", xmlData);
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}

	public static WSObject createThirdPersonPlayerActor(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {
		ServiceRoot service = WebServiceFactory.launchWebService("ThirdPersonPlauerActorService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("ThirdPersonPlayerCharacterInstance", xmlData);
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;

	}

	public static ServiceRoot createFirstPersonPlayerCharacterService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("FirstPersonPlayerCharacterService");
		// SceneGraphManager.add(service, parent);
		return service;
	}

	public static ServiceRoot createCameraObjectService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("CameraObjectService");
		SceneGraphManager.add(service, parent);
		return service;
	}

	public static WSObject createWSCameraObject(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {
		ServiceRoot service = WebServiceFactory.launchWebService("CameraObjectService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("CameraObjectInstance", xmlData);
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;

	}

	public static ServiceRoot createPointLightService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("PointLightService");
		 SceneGraphManager.add(service, parent);
		return service;
	}

	public static WSObject createWSPointLight(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSPointLight", xmlData);
		 SceneGraphManager.add(instance, parent);

		return instance;
	}

	public static ServiceRoot createBoxService(SceneGraphNode node, SceneGraphNode parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("BoxService");
		SceneGraphManager.add(service, parent);
		return service;

	}

	public static WSObject createWSBox(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {
		ServiceRoot service = WebServiceFactory.launchWebService("BoxService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("BoxInstance", xmlData);
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;

	}

	public static WSObject createWSDaemonArms(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		System.out.println("Create WS Daemon Arms");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSDaemonArms", xmlData);
		SceneGraphManager.add(instance, parent);
		System.out.println("Outputting Scene Graph");
		SceneGraphManager.output();

		return instance;
	}

	public static WSObject createWSDaemonBone(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSDaemonBone", xmlData);
		SceneGraphManager.add(instance, parent);

		return instance;
	}

	public static WSObject createWSDaemonChest(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSDaemonChest", xmlData);
		SceneGraphManager.add(instance, parent);

		return instance;
	}

	public static WSObject createWSDaemonHelm(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSDaemonHelm", xmlData);
		SceneGraphManager.add(instance, parent);

		return instance;
	}

	public static WSObject createWSDaemonLegs(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("WSDaemonLegs", xmlData);
		SceneGraphManager.add(instance, parent);

		return instance;
	}

	
	public static WSObject createGameStartHexagon(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("GameStartHexagon", xmlData);
		SceneGraphManager.add(instance, parent);

		return instance;
	}
	
	public static WSObject createHexagon(SceneGraphNode node, SceneGraphNode parent, Element xmlData) {

		WSObject instance = WebServiceFactory.launchWebServiceInstance("HExagon", xmlData);
		SceneGraphManager.add(instance, parent);

		return instance;
	}

	
}