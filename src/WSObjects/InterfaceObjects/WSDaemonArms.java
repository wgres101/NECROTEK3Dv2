package WSObjects.InterfaceObjects;

import org.jdom2.Element;

import GameInterfaces.Armor.DaemonBone.IDaemonGloves;
import WSObjects.WSObject;

public class WSDaemonArms extends WSObject implements IDaemonGloves {

	public WSDaemonArms(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
		e = new Element("WSDaemonArms");
	}

}
