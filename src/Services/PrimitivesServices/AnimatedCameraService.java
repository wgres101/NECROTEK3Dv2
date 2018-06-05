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

	public  void Launch() {}
	
	public  void Init() {}
	
	public  void Update() {}
	
	public  void Destroy() {}
	
	public  WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("VectorCameraInstance", null);
		
		
		return ws_object;
	}
	
	
	
}
