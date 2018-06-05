package Services.ActorServices;

import org.jdom2.Element;

import WSObjects.WSObject;

public class FirstPersonPlayerCharacterService extends CreateCharacterService {

	
	public FirstPersonPlayerCharacterService(Element e) {
		super(e);
		
		// TODO Auto-generated constructor stub
		//e.setName("FirstPersonPlayerCharacterService");
		e = new Element("FirstPersonPlayerCharacterService");
	}

	public  void Launch() {}
	
	public  void Init() {
		
		
		
	}
	
	public  void Destroy() {}
	
	public  WSObject SpawnWebServiceObject() {
		return null;}

	
}
