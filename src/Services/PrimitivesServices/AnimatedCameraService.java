package Services.PrimitivesServices;


import org.jdom2.Element;

import Factory.WebServiceFactory;
import Services.ServiceRoot;
import WSObjects.WSObject;

public class AnimatedCameraService extends ServiceRoot {


	public AnimatedCameraService(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	public static void Launch() {}
	
	public static void Init() {}
	
	public static void Update() {}
	
	public static void Destroy() {}
	
	public static WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("VectorCameraInstance");
		
		
		return ws_object;
	}
	
	
	
}
