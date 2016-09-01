package Central;

import InspectorPanels.BoxInspector;
import InspectorPanels.CameraInspector;
import Services.BasicServices.ServiceBox;
import Services.BasicServices.ServiceCamera;

public class PanelFactory {
	//retrieves a web service object

	
	 //returns an inspectorobject
	public static Object getPanel(String command)
	{
		if (command.equals("Camera"))
		{
			return new CameraInspector();
		}
		
		if (command.equals("Box"))
		{
			
			//Create a Box Object and Service
			
			return new BoxInspector();
		}

		return command;
	}
}
	
	

