package GraphicsCentral;

import Services.BasicServices.ServiceBox;
import Services.BasicServices.ServiceCamera;
import WSObjects.Primitives.WSCameraObject;

 public class ServiceFactory {

	//retrieves a web service object

	//web service singletons, returns a singleton
    static ServiceCamera serviceCamera = new ServiceCamera();
	static ServiceBox serviceBox = new ServiceBox();
	 
	public static Object getService(String command)
	{
		if (command.equals("Camera"))
		{
			return serviceCamera;
		}
		
		if (command.equals("Box"))
		{
			
			//Create a Box Object and Service
			
			return serviceBox;
		}

		return command;
	}
}
