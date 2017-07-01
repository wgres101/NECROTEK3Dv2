package IDE;
import GraphicsCentral.PanelFactory;
import GraphicsCentral.Renderer;
import GraphicsCentral.ServiceFactory;
import GraphicsCentral.WSObjectFactory;
import IDE.InspectorPanels.BoxInspector;
import Services.BasicServices.ServiceBox;
import WSObjects.WSObject;


public class Manager {

	
	public static void getBoxPrimitive()
	{
		//lilne below running properly
		System.out.println("Get Box Primitive");
		//if button is presedsed
		//webservice for that type
		//Add primitive to scene graph
		//Add primitive to inspector
		System.out.println("Get object, service, and inspector");
		WSObject boxObject = (WSObject)WSObjectFactory.getWSObject("Box");
		ServiceBox boxService = (ServiceBox)ServiceFactory.getService("Box");
		BoxInspector boxPanel = (BoxInspector)(PanelFactory.getPanel("Box"));
		//add service to object
		//WSObjects.WSBoxObject boxServiceObject.boxService = boxService;
		
		System.out.println("Add primitive to scene graph");
		//add primitive to scene graph and inspector
		//Main.scg.add(boxObject);
		InspectorPanel inspectorPanel = new InspectorPanel();
		///BoxInspector box_ins = new BoxInspector();
		inspectorPanel.guiPanelReference = boxPanel;
		
		//InspectorObject inspectorObject = new InspectorObject();
		//inspectorObject.add(boxPanel);
		
		//load primtiive
		//command below is running
		System.out.println("Loaing Quad Mesh");
		//Renderer.loadQuadMesh("cubeMesh.txt");
		//loadQuadMesh
	
		//try rendering primitive
		boxObject.Update();
		
	}
}


