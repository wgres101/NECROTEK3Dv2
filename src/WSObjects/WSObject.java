package WSObjects;

import org.jdom2.Element;

import SceneGraph.Component;
import SceneGraph.GraphNodeInstance;
import Services.ServiceRoot;

public class WSObject extends GraphNodeInstance {
	
	public WSObject(Element e) {
		
		// TODO Auto-generated constructor stub
	}
	

	//called upon initialization of object
	public void Init(ServiceRoot AnimatedCharacterService)
	{
		//Called Init
		
		//Register with service
		
		ServiceRoot.objectPossesions.add(this);
	}
	
	//update is called once per tick
	//to update internal variables
	//and to execute per turn actions
	public void Update()
	{
		//called Update
	}
	
	//called upon when object is no longer needed
	
	public void Destroy()
	{
		//called Destroy
	}
	
	//called every turn. checks messagemanager for message
	
	public void ParseMessage()
	{
		
	}
}
