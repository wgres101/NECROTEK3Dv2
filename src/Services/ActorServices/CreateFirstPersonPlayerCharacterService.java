package Services.ActorServices;

import org.jdom2.Element;

import WSObjects.WSObject;

public class CreateFirstPersonPlayerCharacterService extends CreateCharacterService {

	
	public CreateFirstPersonPlayerCharacterService(Element e) {
		super(e);
		
		// TODO Auto-generated constructor stub
		//e.setName("FirstPersonPlayerCharacterService");
		e = new Element("FirstPersonPlayerCharacterService");
	}

	public static void Launch() {}
	
	public static void Init() {
		
		
		
	}
	
	public static void Destroy() {}
	
	public static WSObject SpawnWebServiceObject() {
		return null;}

	
}
