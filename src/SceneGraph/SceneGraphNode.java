package SceneGraph;

import java.util.ArrayList;

import org.jdom2.Element;

import Hierarchy.Object.CObject;
import Input.Input;
import Input.InputRecorder;
import Services.ServiceRoot;

public class SceneGraphNode extends CObject implements GraphNodeInstance   {
	public SceneGraphNode parent = null;
	public ArrayList<SceneGraphNode> children = new ArrayList<SceneGraphNode>();
	public Element xmlData = null;
	
	

	
	
	//update is called once per tick
	//to update internal variables
	//and to execute per turn actions
	//used to update state
	public void Update()
	{
		//called Update
		for (SceneGraphNode child: children)
		{
			child.Update();
		}
	}
	
	//called upon when object is no longer needed
	
	public  void Destroy()
	{
		//called Destroy
		for (SceneGraphNode child: children)
		{
			child.Destroy();
		}
	}
	
	//called every turn. checks messagemanager for message
	
	public void ParseMessage()
	{
		for (SceneGraphNode child: children)
		{
			child.ParseMessage();
		}
	}
	
	
	public  void Launch() {
		for (SceneGraphNode child: children)
		{
			child.Launch();
		}
	}
	
	public  void UpdateAnimations() { 
		for (SceneGraphNode child: children)
		{
			child.UpdateAnimations();
		}
		
		
	}
	
	//called on object creation
	
	public  void Init() {
		
		for (SceneGraphNode child: children)
		{
			child.Init();
		}
	}
	
	public  void UpdatePhysics() { 
		for (SceneGraphNode child: children)
		{
			child.UpdatePhysics();
		}
		
	}

	public  void UpdateAI() { 
		
		for (SceneGraphNode child: children)
		{
			child.UpdateAI();
		}
		
	}
	
	public  void  Render()
	{
		for (SceneGraphNode child: children)
		{
			child.Render();
		}
	}

	
	public  void UserInput(Input input)
	{
		
		//need to give a value
		

//		for (SceneGraphNode child: children)
//		{
//			child.UserInput();
//		}
	}
	
	public  void  Collision()
	{
		for (SceneGraphNode child: children)
		{
			child.Collision();
		}
	}
	
	//when the game requires this particular state to be active
	
	public  void  OnEnter()
	{
		for (SceneGraphNode child: children)
		{
			child.OnEnter();
		}
	}
	
	//When the object no longer needs to be attachd to the scene graph
	
	public  void  OnExit()
	{
		for (SceneGraphNode child: children)
		{
			child.OnExit();
		}
	}

	//for exammple, hitting the pause button
	
	public  void  OnSuspend()
	{
		for (SceneGraphNode child: children)
		{
			child.OnSuspend();
		}
	}
	
	//update details and insepector panels
	public  void UpdateInspector()
	{
		for (SceneGraphNode child: children)
		{
			child.UpdateInspector();
		}
	}
	
	public  void UpdateUI()
	{
		//update sthe UI
		for (SceneGraphNode child: children)
		{
			child.UpdateUI();
		}
	}

	public void UpdateLogicLayer()
	{
		//update the logic layer
		for (SceneGraphNode child: children)
		{
			child.UpdateLogicLayer();
		}
	}
	
	public void HotLoad()
	{
		//update sthe UI
		for (SceneGraphNode child: children)
		{
			child.HotLoad();
		}
	}
	
	public void UpdateNetwork()
	{
		//update sthe network
		for (SceneGraphNode child: children)
		{
			child.UpdateNetwork();
		}
	}
	
	public void SaveMeNow()
	{
		//update savemenow
		for (SceneGraphNode child: children)
		{
			child.SaveMeNow();
		}
	}
	
	public void Serialize()
	{
		//serialize
		for (SceneGraphNode child: children)
		{
			child.Serialize();
		}
	}
	
	public void DeSerialize()
	{
		//deserialize
		for (SceneGraphNode child: children)
		{
			child.DeSerialize();
		}
	}
	
	
	public void PlayerMoveTo(int x, int y, int z)
	{
		//update sthe players position
		for (SceneGraphNode child: children)
		{
			child.PlayerMoveTo(x,y,z);
		}
		
				
				
	}
}
