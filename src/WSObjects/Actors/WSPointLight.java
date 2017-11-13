package WSObjects.Actors;

import org.jdom2.Element;

public class WSPointLight extends WSLightActor {
	public WSPointLight(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
		e = new Element("PointLight");
	}
}
