package WSObjects.Primitives;

import org.jdom2.Element;

import Services.ServiceRoot;
import WSObjects.WSObject;

public class WSAnimatedCamera extends WSObject {

	public WSAnimatedCamera(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	public void Init(ServiceRoot AnimatedCameraService)
	{
		//Called Init
	}
	
	@Override
	public void InstanceParseMessage() {
		// TODO Auto-generated method stub
		super.InstanceParseMessage();
	}

	public void InstanceUpdate()
	{
		//called Update
	}
	
	public void InstanceDestroy()
	{
		//called Destroy
	}
	
}
