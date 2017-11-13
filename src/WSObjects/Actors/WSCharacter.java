package WSObjects.Actors;

import java.util.ArrayList;

import org.jdom2.Element;

import WSObjects.WSObject;

public class WSCharacter extends WSObject {

	
	public WSCharacter(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
		e = new Element("CharacterInstance");
	}
	
	int lives;
	int health;
	ArrayList<String> weapons = new ArrayList<String>();
	ArrayList<String> spells = new ArrayList<String>();
	int state;
	
}
