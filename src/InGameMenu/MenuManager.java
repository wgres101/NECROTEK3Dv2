package InGameMenu;

import java.util.Vector;

//manages menus and menu trail

public class MenuManager {

	//initialize the menu system
	boolean init() { return false; } 
	
	//shutdown the menu system
	
	void shutdown() { }
	
	//passes down update messages to menusd
	int update(Byte keys[]) { return -1; }
	
	
	//draws the menus
	void render() { }
	
	MenuScreen popupMenu;
	
	//flag to keep track of whetehr a popup window is active
	
	boolean popupActive;
	
	//the menu trail keeps track of the menus that the user
	//has gone through. This gives the system the ability to
	//track back the path the user too through the system
	
	Vector<MenuScreen> menuTrail = new Vector<MenuScreen>();
	
	
}
