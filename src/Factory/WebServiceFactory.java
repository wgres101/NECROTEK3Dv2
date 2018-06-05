package Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.jdom2.Element;

import DTI.DTIClass;
import GameMap.CHexagonCoordinates;
import Journaling.CJournal;
import Sampler.Main;
import SceneGraph.SceneGraphNode;
import Services.ServiceRoot;
import Services.ActorServices.CreateCharacterService;

import Services.ActorServices.FirstPersonPlayerCharacterService;
import Services.ActorServices.PointLightService;
import Services.CharacterServices.FirstPersonCharacterService;
import Services.OperationalServices.CharacterService;
import Services.PrimitivesServices.BoxService;
import Services.PrimitivesServices.VectorCameraService;
import WSObjects.WSObject;
import WSObjects.Actors.WSCharacter;
import WSObjects.Actors.WSFirstPersonPlayerCharacter;
import WSObjects.Actors.WSPointLight;
import WSObjects.InterfaceObjects.WSDaemonArms;
import WSObjects.InterfaceObjects.WSDaemonBone;
import WSObjects.InterfaceObjects.WSDaemonChest;
import WSObjects.InterfaceObjects.WSDaemonHelm;
import WSObjects.InterfaceObjects.WSDaemonLegs;
import WSObjects.Primitives.WSVectorCamera;

public class WebServiceFactory extends Thread {

	boolean started = false;
	
	//
	//web factory on launching a web service registers the object of that
	//service so it can be retrieved later on
	DTIClass dtiClass = new DTIClass("WebServiceFactory", null);
	
	//
	
	static HashMap<FactoryKeyWrapper, ServiceRoot> serviceRegistry = new HashMap<FactoryKeyWrapper, ServiceRoot>();
	public static ConcurrentHashMap<FactoryKeyWrapper, WSObject> wsobjectRegistry = new ConcurrentHashMap<FactoryKeyWrapper, WSObject>();
	
	
	/************Launch Services ***************/
	
	public static ServiceRoot launchWebService(String serviceName) {
		
		if(serviceName.equals("FirstPersonPlayerCharacterService")) {
			Element e = null;
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("FirstPersonPlayerCharacterService");
			FirstPersonPlayerCharacterService c = new FirstPersonPlayerCharacterService(e);
			
			serviceRegistry.put(k, c);			
			return c;
			
		}
		
		if(serviceName.equals("PointLightService")) {
			Element e = null;
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("PointLIghtService");
			PointLightService c = new PointLightService(e);
			
			serviceRegistry.put(k, c);			
			return c;
			
		}
		
		
		
		
		
		
		return null;
	}

	/********* Launch Instances *********/
	
	

	public static WSObject launchWebServiceInstance(String instanceName, Element xmlData) {
		Element e = null;
		CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance");
		if(instanceName.equals("WSFirstPersonPlayerCharacter")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("WSFirstPersonPlayerCharacter");
			
			WSFirstPersonPlayerCharacter c = new WSFirstPersonPlayerCharacter(e);
			
			c.xmlData = xmlData;
			
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
			
			wsobjectRegistry.put(k, c);
			
			
			
			System.out.println("Just added WSFirstPersonPlayerCharacter");
			WebServiceFactory.dump();
					
			return c;
			
		}
		if (instanceName.equals("WSDaemonArms")) {
			FactoryKeyWrapper k = new FactoryKeyWrapper("WSDaemonArms");
			
			WSDaemonArms c = new WSDaemonArms(e);
			
			c.xmlData = xmlData;
			
			
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
			
			wsobjectRegistry.put(k, c);
			
			System.out.println("Just added WSDaemonArms");
			WebServiceFactory.dump();
					
			return c;
		}
	
		
		if (instanceName.equals("WSDaemonBone")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("WSDaemonBone");
		
			WSDaemonBone c = new WSDaemonBone(e);
		
			c.xmlData = xmlData;
			
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
		
			wsobjectRegistry.put(k, c);
		
			System.out.println("Just added WSDaemonBone");
			WebServiceFactory.dump();
					return c;
		}
		

		if (instanceName.equals("WSDaemonChest")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("WSDaemonChest");
		
			WSDaemonChest c = new WSDaemonChest(e);
		
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
		
			wsobjectRegistry.put(k, c);
		
			System.out.println("Just added WSDaemonCHeste");
			WebServiceFactory.dump();
					return c;
		}
		
			if (instanceName.equals("WSDaemonHelm")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("WSDaemonHelm");
		
			WSDaemonHelm c = new WSDaemonHelm(e);
		
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
		
			wsobjectRegistry.put(k, c);
		
			System.out.println("Just added WSDaemonHelm");
			WebServiceFactory.dump();
					return c;
		}
		if (instanceName.equals("WSDaemonLegs")) {
				
				FactoryKeyWrapper k = new FactoryKeyWrapper("WSDaemonLegs");
			
				WSDaemonLegs c = new WSDaemonLegs(e);
			
				CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
			
				wsobjectRegistry.put(k, c);
			
				System.out.println("Just added WSDaemonLegs");
				WebServiceFactory.dump();
						return c;
			}
		if (instanceName.equals("GameStartHexagon")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("GameStartHexagon");
		
			CHexagonCoordinates c = new CHexagonCoordinates();
		
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
		
			wsobjectRegistry.put(k, c);
		
			System.out.println("Just added GameStartHexagon");
			WebServiceFactory.dump();
					return c;
		}
		if (instanceName.equals("Hexagon")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("Hexagon");
		
			CHexagonCoordinates	 c = new CHexagonCoordinates();
		
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
		
			wsobjectRegistry.put(k, c);
		
			System.out.println("Just added Hexagon");
			WebServiceFactory.dump();
					return c;
		}
		
		
		if (instanceName.equals("WSPointLight")) {
			
			FactoryKeyWrapper k = new FactoryKeyWrapper("WSPointLight");
		
			CHexagonCoordinates	 c = new CHexagonCoordinates();
		
			CJournal.Journal(WebServiceFactory.class, "launchWebServiceInstance (inside if)");
		
			wsobjectRegistry.put(k, c);
		
			System.out.println("Just added Point Light");
			WebServiceFactory.dump();
					return c;
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
	
	/**************Retrieve  Services **********/
	
	public FirstPersonPlayerCharacterService retrieveFirstPersonPlayerCharacterService()
	{
		FactoryKeyWrapper k = new FactoryKeyWrapper("FirstPersonPlayerCharacterService");
	
		FirstPersonPlayerCharacterService c = (FirstPersonPlayerCharacterService)retrieveFromServices(k);
		
		return c;
	}

	/************ Retrieve Instances *************/
	
	public static  WSFirstPersonPlayerCharacter retrieveFirstPersonCharacterInstance()
	{
		//System.out.println("Executing retrieveFirstPersonCharacterInstances");
		FactoryKeyWrapper k = new FactoryKeyWrapper("WSFirstPersonPlayerCharacter");
		WSObject fromMap = Main.webServiceFactory.retrieveFromMap(k);
		
		return (WSFirstPersonPlayerCharacter)fromMap; 
		/*
		System.out.println("Size of fromMap" + fromMap.size());

		ArrayList<WSFirstPersonPlayerCharacter> convertList= WSObjectToPlayerCharacterArrays(fromMap);
		
		if (fromMap == null)
		{
			System.out.println("WSFirstPersonPlayerCharacter returned null");
		}
		return convertList;
		*/
	}
	

	
	public static void StoreFirstPersonCharacterInstance(WSFirstPersonPlayerCharacter w)
	{
		FactoryKeyWrapper k = new FactoryKeyWrapper("WSFirstPersonPlayerCharacter");
		//wsobjectRegistry.put(k, w);
		wsobjectRegistry.put(k,  w);
	}

	/************Retrieve from map**************/
	
	public WSObject retrieveFromMap(FactoryKeyWrapper k)
	{
		//System.out.println("RetrieveFromMap()");
		long i = 0;
		for (Map.Entry<FactoryKeyWrapper, WSObject> pair :WebServiceFactory.wsobjectRegistry.entrySet()) {
		    
			CJournal.Journal(WebServiceFactory.class, "Search retrieveFromMap keyValue is : " + pair.getKey().name + " Factory Key Wrapper is " + k.name);
						
			if (pair.getKey().name.equals(k.name))
			{
				CJournal.Journal(WebServiceFactory.class, "Matched pair.getKey().name > " + pair.getKey().name + " with a FactoryKeyWraper: " + k.name);
				CJournal.Journal(WebServiceFactory.class, "retrieveFromMap arraylist sizes is : " + pair.getValue());
				WebServiceFactory.dump();
				return pair.getValue();
			}
		}
		
		System.out.println("Couldn't find the WSObject in the map");
		dump();
		return null;
	}
	
	public ServiceRoot retrieveFromServices(FactoryKeyWrapper k)
	{
		long i = 0;
		for (Map.Entry<FactoryKeyWrapper, ServiceRoot> pair : serviceRegistry.entrySet()) {
		    
			if (pair.getKey().name.equals(k.name))
			{
				return pair.getValue();
			}
		}
		return null;
	}
	
	/**************** Dump Map Contents  ****************/
	public static void dump()
	{
		CJournal.Journal(WebServiceFactory.class, "Output Dump of Both Maps");
		long i = 0;
		for (Map.Entry<FactoryKeyWrapper, WSObject> pair : wsobjectRegistry.entrySet()) {
		   
		    	CJournal.Journal(WebServiceFactory.class , " key: " + pair.getKey().name + " value: " + pair.getValue().toString());
		    
		}
		for (Map.Entry<FactoryKeyWrapper, ServiceRoot> pair : serviceRegistry.entrySet()) {
		    
			CJournal.Journal(WebServiceFactory.class , " key: " + pair.getKey().name + " value: " + pair.getValue().toString());
		}
		return;
	}
	
	
	/**************Put in Map***************/
	/*
	public static void putInMap2(FactoryKeyWrapper k, WSObject instance)
	{
		CJournal.Journal(WebServiceFactory.class, "putting in map, k: " + k.name);
		long i = 0;
		for (HashMap.Entry<FactoryKeyWrapper, ArrayList<WSObject>> pair : wsobjectRegistry.entrySet()) {
		    System.out.println("Inside map loop");
			//if key is already in here
			if (pair.getKey().name.equals(k.name))
			{
				for (WSObject wsobject : pair.getValue())
				{
					System.out.println("Putting key: " + pair.getKey().name + " and value " + pair.getValue().toString());
					//upate key
					wsobjectRegistry.put(pair.getKey(), pair.getValue());
					return;
				}
			} else
			{
				System.out.println("Putting new key: " + k.name + " value" + instance.toString());
				
				//object isn't in the map
				ArrayList<WSObject> list = pair.getValue();
				list.add(instance);
				wsobjectRegistry.put(k,list);
				CJournal.Journal(WebServiceFactory.class, "Size after new key " + list.size());
				
			}
			
		}
		
	
	}
	
	/************** putin map two ********/
	/*
	public static void putInMap(FactoryKeyWrapper k, WSObject instance)
	{
		System.out.println("[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]");
		System.out.println("wsobjectRegistry size " + wsobjectRegistry.size());
		long i = 0;
		for (Iterator<Map.Entry<FactoryKeyWrapper, ArrayList<WSObject>>> entries = wsobjectRegistry.entrySet().iterator(); entries.hasNext(); ) {
		    Map.Entry<FactoryKeyWrapper, ArrayList<WSObject>> pair = entries.next();
		 
		    System.out.println("****************Put in map ****************"); 
		    System.out.println(pair.getKey().name);
		    System.out.println(pair.getValue().toString());
		    //if object is already in the map
		    
		    if (pair.getKey().name.equals(k.name))
			{
				for (WSObject wsobject : pair.getValue())
				{
					System.out.println("Putting key: " + pair.getKey().name + " and value " + pair.getValue().toString());
					//upate key
					wsobjectRegistry.put(pair.getKey(), pair.getValue());
					return;
				}
			} 
		    else
			{
				System.out.println("Putting new key: " + k.name + " value" + instance.toString());
				
				//object isn't in the map
				ArrayList<WSObject> list = pair.getValue();
				list.add(instance);
				wsobjectRegistry.put(k,list);
				CJournal.Journal(WebServiceFactory.class, "Size after new key " + list.size());
				
			}
		    //if object isn't there, it might be here
		}
		
		//this is the case where the map won't iterate because its empty! dumbass
		
		ArrayList<WSObject> list = new ArrayList<WSObject>();
		list.add(instance);
		wsobjectRegistry.put(k, list);
		CJournal.Journal(WebServiceFactory.class, "Completed insertion of new wsobject map");
	}
	
	*/
	
	/*************Dump dumpplayerlist **********/
	
	public static void dumpPlayerList(ArrayList<WSFirstPersonPlayerCharacter> playerList)
	{
		//CJournal.Journal(WebServiceFactory.class, "Size of arraylist" + playerList.size());
		
		if (playerList == null)
		{
			CJournal.Journal(WebServiceFactory.class, "Array list is null");
			return;
		}
		/*
		for (WSObject  wsobject: playerList)
		{
			CJournal.Journal(WebServiceFactory.class, "WSObject is " + wsobject.toString());
		}
		*/

	}
	
	/******** conversion *************/
	
	public static ArrayList<WSFirstPersonPlayerCharacter> WSObjectToPlayerCharacterArrays(ArrayList<WSObject> wsobjectList)
	{
		ArrayList<WSFirstPersonPlayerCharacter> pcharacterList = new ArrayList<WSFirstPersonPlayerCharacter>();
	
		
		
		for (WSObject wsobject : wsobjectList)
		{
			if (wsobject == null)
			{
				System.out.println("wsobject is null");
			}
			if (wsobject.xmlData == null)
			{
				System.out.println("wsobject xmldata is null");
				
			}
			//System.out.println("XMLData name: " + wsobject.xmlData.getName());
			//if (wsobject != null && wsobject.xmlData != null && wsobject.xmlData.getName().equals("WSFirstPersonPlayerCharacter"))
			
			
				WSFirstPersonPlayerCharacter pobject = (WSFirstPersonPlayerCharacter)wsobject;
			
				
				pcharacterList.add(pobject);
			//}
		
					
		}
		return pcharacterList;
	}
	
	public static ArrayList<WSDaemonBone> WSObjectToDaemonBoneArrays(ArrayList<WSDaemonBone> wsobjectList)
	{
		ArrayList<WSDaemonBone> daemonBoneList = new ArrayList<WSDaemonBone>();
		for (WSObject wsobject : wsobjectList)
		{
			System.out.println("daemonBoneListg iterating");
			if (wsobject.xmlData.getName().equals("WSDaemonBone"))
			{
				WSDaemonBone dobject = (WSDaemonBone)wsobject;
				daemonBoneList.add(dobject);
			}
					
		}
		return daemonBoneList;
	}
	/*
	public static ArrayList<WSObject> PlayerCharacterToWSObjectArrays(ArrayList<WSFirstPersonPlayerCharacter> pcList)
	{
		ArrayList<WSObject> objectList = new ArrayList<WSObject>();
		for (WSFirstPersonPlayerCharacter pcobject : pcList)
		{
			WSObject wsobject = (WSObject)pcobject;
			objectList.add(wsobject);
		}
		return objectList;
	}
	*/
		
}



