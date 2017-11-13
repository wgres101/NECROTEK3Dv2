package Services.ActorServices;

import org.jdom2.Element;

import Services.ServiceRoot;

public class CreateLightActorService extends ServiceRoot {
	public CreateLightActorService(Element e) {
		
		// TODO Auto-generated constructor stub
		//e.setName("FirstPersonPlayerCharacterService");
		e = new Element("PointLightService");
	}
}
