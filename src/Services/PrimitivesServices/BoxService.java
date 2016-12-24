package Services.PrimitivesServices;

import javax.jws.WebService;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import MessageManagement.Message;
import Services.ServiceRoot;
import WSObjects.WSObject;

@WebService
public class BoxService extends ServiceRoot {

	public BoxService() {
	}
	
	public BoxService(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parseMessage() {
		// TODO Auto-generated method stub
		super.parseMessage();
	}

	public static void Launch() {}
	
	public static void Init() {}
	
	public static void Update() {}
	
	public static void Destroy() {}
	
	public static WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("BoxService");
		
		
		return ws_object;
	}
	
	
}
