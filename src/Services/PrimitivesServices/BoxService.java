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

	@WebMethod
	public  void Render()
	{
		
	}
	
	@WebMethod
	public  void parseMessage() {
		// TODO Auto-generated method stub
		
	}

	@WebMethod
	public  void Launch() {}
	
	@WebMethod
	public  void Init() {}
	
	@WebMethod
	public  void Update() {}
	
	@WebMethod
	public  void Destroy() {}
	
	@WebMethod
	public  WSObject SpawnWebServiceObject() {
		
		WSObject ws_object = WebServiceFactory.launchWebServiceInstance("BoxService", null);
		
		
		return ws_object;
	}
	

	
	
}
