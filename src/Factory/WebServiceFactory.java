package Factory;

import org.jdom2.Element;

import Services.ServiceRoot;
import Services.PrimitivesServices.VectorCameraService;
import WSObjects.WSObject;
import WSObjects.Primitives.WSVectorCamera;

public class WebServiceFactory {

	public static ServiceRoot launchWebService(String serviceName) {

		if (serviceName.equals("VectorCameraService")) {
			Element e = null;
			return new VectorCameraService(e);
		}

		return null;
	}


	public static WSObject launchWebServiceInstance(String instanceName) {
		Element e = null;
		
		if (instanceName.equals("VectorCameraInstance")) {
			return new WSObject(e);
		}

		return null;
	}

}
