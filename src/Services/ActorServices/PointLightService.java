package Services.ActorServices;

import org.jdom2.Element;

import WSObjects.WSObject;

public class PointLightService extends CreateLightActorService {
	
	public PointLightService(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
		//e.setName("FirstPersonPlayerCharacterService");
		e = new Element("PointLightService");
	}

	public static void Launch() {}
	
	public static void Init() {
		
		
		
	}
	
	public static void Destroy() {}
	
	public static WSObject SpawnWebServiceObject() {
		return null;}

	
}


