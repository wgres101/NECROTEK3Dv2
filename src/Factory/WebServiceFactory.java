package Factory;

import java.util.HashMap;

import org.jdom2.Element;

import Journaling.CJournal;
import Sampler.Main;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;
import Services.ActorServices.CreateCharacterService;
import Services.ActorServices.CreateFirstPersonPlayerCharacterService;
import Services.ActorServices.PointLightService;
import Services.CharacterServices.FirstPersonCharacterService;
import Services.OperationalServices.CharacterService;
import Services.PrimitivesServices.BoxService;
import Services.PrimitivesServices.VectorCameraService;
import WSObjects.WSObject;
import WSObjects.Actors.WSCharacter;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;
import WSObjects.Actors.WSPointLight;
import WSObjects.Primitives.WSVectorCamera;

public class WebServiceFactory extends Thread {

	boolean started = false;
	
	//
	//web factory on launching a web service registers the object of that
	//service so it can be retrieved later on
	
	
	//
	
	static HashMap<String, ServiceRoot> serviceRegistry = new HashMap<String, ServiceRoot>();
	static HashMap<String, WSObject> wsobjectRegistry = new HashMap<String, WSObject>();
	
	
	public static ServiceRoot launchWebService(String serviceName) {

		if (serviceName.equals("VectorCameraService")) {
			Element e = null;
			
			return new VectorCameraService(e);
		}

		if(serviceName.equals("BoxService")) {
			Element e = null;
			return new BoxService(e);
		}
		
		if(serviceName.equals("FirstPersonPlayerCharacterService")) {
			Element e = null;
			CreateFirstPersonPlayerCharacterService c = new CreateFirstPersonPlayerCharacterService(e);
			serviceRegistry.put("FirstPersonPlayerCharacterService", c);			
			return c;
			
		}
		
		
		
		
		
		WebServiceFactory.launchWebServiceInstance("WSPLayerCharacter");
		
		if(serviceName.equals("CharacterService")) {
			Element e = null;
			CreateCharacterService c = new CreateCharacterService(e);
			serviceRegistry.put("CreateCharacterService", c);
			return c;
			
		}
		
		if(serviceName.equals("FirstPersonPlayerCharacter")) {
			Element e = null;
			WSFirstPersonPlayerCharacter w = new WSFirstPersonPlayerCharacter(e);
			serviceRegistry.put("FirstPersonPlayerCharacter", w);
			return w;
			
		}
		
		
		if(serviceName.equals("CharacterInstance")) {
			Element e = null;
			WSCharacter w = new WSCharacter(e);
			wsobjectRegistry.put("CharacterInstance", w);
			return w;
			
		}
		

		if(serviceName.equals("PointLightService")) {
			Element e = null;
			return new PointLightService(e);
			
		}
		

		if(serviceName.equals("WSPointLight")) {
			Element e = null;
			return new WSPointLight(e);
			
		}
		
		
		return null;
	}


	public static WSObject launchWebServiceInstance(String instanceName) {
		Element e = null;
		
		if(instanceName.equals("WSFirstPersonPlayerCharacter")) {
			
			WSFirstPersonPlayerCharacter c = new WSFirstPersonPlayerCharacter(e);
			wsobjectRegistry.put("WSFirstPersonPlayerCharacter", c);			
			return c;
			
		}
		
		if (instanceName.equals("VectorCameraInstance")) {
			return new WSObject(e);
		}

		
		if (instanceName.equals("BoxInstance")) {
			return new WSObject(e);
		}
		
		return null;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (started == false)
		{
			CJournal.Journal(WebServiceFactory.class, "Web Service Factory Running");
			started = true;
		}
	}
	
	public CreateFirstPersonPlayerCharacterService retrieveFirstPersonCharacterService()
	{
		CreateFirstPersonPlayerCharacterService c = (CreateFirstPersonPlayerCharacterService)serviceRegistry.get("FirstPersonPlayerCharacterService");
		return c;
	}

	public WSFirstPersonPlayerCharacter retrieveFirstPersonCharacterInstance()
	{
		WSFirstPersonPlayerCharacter w = (WSFirstPersonPlayerCharacter)wsobjectRegistry.get("WSFirstPersonPlayerCharacter");
		return w;
	}
	
	//
	
	public void StoreFirstPersonCharacterInstance(WSFirstPersonPlayerCharacter w)
	{
		wsobjectRegistry.put("FirstPersonPlayerCharacter", w);
	}

	
	
	
}
