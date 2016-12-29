package Services.PrimitivesServices;

import javax.jws.WebMethod;
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

	@WebMethod
	public static void Launch() {}
	
	@WebMethod
	public static void Init() {}
	
	@WebMethod
	public static void Update() {}
	
	@WebMethod
	public static void Destroy() {}
	
	@WebMethod
	public static WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("BoxService");
		
		
		return ws_object;
	}
	
	
}
