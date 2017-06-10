package GameMap;

import Factory.WebServiceFactory;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import Services.ServiceRoot;
import WSObjects.WSObject;

public class XMLSceneLoader {

	//Actors
	//--------
	//WSCharacter
	//WSChild
	//WSFirstPlayerActor
	//WSThirdPersonPlayerActor
	//WSEmptyActor
	//WSLightActor
	//WSLightMapImportance
	//WSLightMassCharacter
	//WSPawn
	//WSSolidModellingGrammar

	//AdvancedPrimitives
	//------------------
	//WSPaths
	//WSSplines
	//WSUniformCurves
	//WSVoxels
	//WSBezierCurves
	//WSCircle
	//WSConstructiveSolidGeometry
	//WSCurves
	//WSLevelSetCurves
	//WSMetaBalls
	//WSNonUniformSPlines
	//WSNURBSCurve


	//Lighting
	//-----------
	//WSGroundPlaneShadows
	//WSPointLight
	//WSRealTimeShadows
	//WSSpotLight

	//Miscellaneous
	//----------------
	//WSHeatAndHazePostProcessing
	//

	//Primitives
	//------------------
	//WSAnimatedCamera
	//WSBox
	//WSCameraControlTechniques
	//WSCameraObject
	//WSFog
	//WSSphereStaticMesh
	//WSVectorCamera


	//WorldGeneration
	//-----------------
	//WSFractalTerrainGenerationFaultFormation

	public static void addToSceneGraph(GraphNodeInstance node, GraphNodeInstance parent)
	{
		//call functions below depending on node type info
		//then add them to the scene graph
		
		/* create web service then pass it to the scenegraph */
		//WebServiceFactory.launchWebService(serviceName);
		
		/* create ws object then pass it to the scenegraph */
		//WebServiceFactory.launchWebServiceInstance(instanceName);
		
	}

	
	//creates XML Tags into Scenegraph nodes
	public static WSObject createWSCharacter(GraphNodeInstance parent) {
		
		ServiceRoot service = WebServiceFactory.launchWebService("CharacterService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("CharacterInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}
	public static WSObject createWSChild(GraphNodeInstance parent) {
		
		ServiceRoot service = WebServiceFactory.launchWebService("ChildClassService)");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("ChildCLassInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}
	
	public static WSObject createFirstPlayerActor(GraphNodeInstance parent) { 
		
		ServiceRoot service = WebServiceFactory.launchWebService("FirstPlayerctorService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("FirstPlayerInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
	}
	public static WSObject createThirdPersonPlayerActor(GraphNodeInstance parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("ThirdPersonPlauerActorService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("ThirdPersonPlayerCharacterInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
		
	}
	
	public static ServiceRoot createFirstPersonPlayerCharacterService(GraphNodeInstance parent) { 
		ServiceRoot service = WebServiceFactory.launchWebService("FirstPersonPlayerCharacterService");
		SceneGraphManager.add(service, parent);
		return service;
	}	
	
	public static ServiceRoot createCameraObjectService(GraphNodeInstance parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("CameraObjectService");
		SceneGraphManager.add(service, parent);
		return service;
	}
	
	public static  WSObject createWSCameraObject(GraphNodeInstance parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("CameraObjectService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("CameraObjectInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
		
	}
	
	public static ServiceRoot createPointLightService(GraphNodeInstance parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("PointLightService");
		SceneGraphManager.add(service, parent);
		return service;
	}
	public static WSObject createWSPointLight(GraphNodeInstance parent) {
		ServiceRoot service = WebServiceFactory.launchWebService("PointLightService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("PointLightService");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		
		return instance;
	}
	public static ServiceRoot createBoxService(GraphNodeInstance parent) { 
		ServiceRoot service = WebServiceFactory.launchWebService("BoxService");
		SceneGraphManager.add(service, parent);
		return service;
		
	}
	public static WSObject createWSBox(GraphNodeInstance parent) { 
		ServiceRoot service = WebServiceFactory.launchWebService("BoxService");
		WSObject instance = WebServiceFactory.launchWebServiceInstance("BoxInstance");
		SceneGraphManager.add(service, parent);
		SceneGraphManager.add(instance, parent);
		return instance;
		
	}
}