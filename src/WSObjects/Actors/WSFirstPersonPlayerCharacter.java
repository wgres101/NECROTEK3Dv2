package WSObjects.Actors;

import org.jdom2.Element;

import GameMap.CHexagonCoordinates;
import RenderEngine.IThreeDimensionalObject;

import WSObjects.WSObject;

public class WSFirstPersonPlayerCharacter  extends WSObject implements IThreeDimensionalObject {

	 
	 public WSFirstPersonPlayerCharacter(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
		e = new Element("WSFirstPersonPlayerCharacter");
		
		//default start hexagon
		
		hexagon.height = 200;
		hexagon.width = 300;
		hexagon.lower_right_x = 200; 
		hexagon.lower_right_y =0; 
		hexagon.midleft_x = 0; 
		hexagon.midleft_y = 100;
		hexagon.upper_left_x = 100;
		hexagon.upper_left_y = 200;
		hexagon.lower_left_x = 100;
		hexagon.lower_left_y = 0;
		hexagon.upper_right_x = 200;
		hexagon.upper_right_y = 200;
		hexagon.midright_x = 300;
		hexagon.midright_y = 100;
		
		//default start position
		
	}

	public CHexagonCoordinates hexagon = new CHexagonCoordinates();
	
	//position in x,y
	
	public int playerx = 150;
	public int playery = 150;
	public int playerz = 0;
	
	public void Render()
	{
		
	}
	
	public void PlayerMoveTo(int x, int y, int z)
	{
		
	
		if (xmlData.getName().equals("WSFirstPersonPlayerCharacter"))
		{
			//update players position
			playerx = x;
			playery = y;
			playerz = z;
			//traverse graph for new hexagon
			
		
		}
	}
}
