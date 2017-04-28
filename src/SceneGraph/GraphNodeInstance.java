package SceneGraph;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import WSObjects.WSObject;


@WebService
public class GraphNodeInstance extends Component {
	
	
	GraphNodeInstance parent;
	ArrayList<GraphNodeInstance> children;
	Element xmlData;
	
	/*
	public GraphNodeInstance()
	{
		
	}
	
	public GraphNodeInstance(Element e)
	{
		xmlData = e;
	}
	
	//calls updates on all children
	public void Update()
	{
		
	
	}
	
	public void BeginPlay()
	{
	}
	
	@WebMethod
	public void Render()
	{
		
	}
	
	

	
	//put end object code here
	public void EndPlay()
	{
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
	

	//call to destroy object
	@WebMethod
	public static void Destroy() {}
	
	@WebMethod
	public static WSObject SpawnWebServiceObject() {
		
		//WSObject ws_object = WebServiceFactory.launchWebServiceInstance("BoxService");
		
		
		return null; //return ws_object;
	}
	
 */
	
}
