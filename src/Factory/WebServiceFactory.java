package Factory;

import org.jdom2.Element;

import Journaling.CJournal;
import Services.ServiceRoot;
import Services.PrimitivesServices.BoxService;
import Services.PrimitivesServices.VectorCameraService;
import WSObjects.WSObject;
import WSObjects.Primitives.WSVectorCamera;

public class WebServiceFactory extends Thread {

	boolean started = false;
	
	public static ServiceRoot launchWebService(String serviceName) {

		if (serviceName.equals("VectorCameraService")) {
			Element e = null;
			return new VectorCameraService(e);
		}

		if(serviceName.equals("BoxService")) {
			Element e = null;
			return new BoxService(e);
		}
		
		return null;
	}


	public static WSObject launchWebServiceInstance(String instanceName) {
		Element e = null;
		
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

	
	
	//

	
	
	
}
