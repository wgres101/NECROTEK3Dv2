
package Central;

import org.jdom2.Element;

import Services.BasicServices.ServiceBox;
import Services.BasicServices.ServiceCamera;
import WSObjects.Primitives.WSCameraObject;
import WSObjects.WSObject;



//pass in the service name and it will return a WSObject for it
//WSObjects have member variables
//the code resides in the service
//Member variables manifest in the inspector of an object
public class WSObjectFactory {

	public static Object getWSObject(String command)
	{
		if (command.equals("Camera"))
		{			
			Element e = null;
			return new WSObject(e);
		}
		
		if (command.equals("Box"))
		{
			//Create a Box Object and Service
			Element e = null;
			return new WSObject(e);
		}

		return command;
	}
	
}
