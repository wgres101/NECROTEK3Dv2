package InGameMenu;

import SaveGame.Resources.ResourceFileModule;

public class MenuScreen {

	//the update method will return one of these codes to inform
	//the menumanager of its status
	//NONE: no action, continue showing menu
	//NEXT: current menu should end and go to the next menu
	//PREV: current menu should end, go to the prev menu
	//POPUP: the current menu wants a popup to be displayed
	//END: This is the last menu and menus are done
	
	
	public static enum menuReturn { NONE, NEXT, PREV, POPUP, END };
	
	public MenuScreen() {}
	
	//load all the resources needed for this menu
	public boolean init() {
		return false;}
	
	//called each frame to update the menu
	public int update(Byte keys[]) {
		return 0;}
	
	//called each frame to render the menu
	public void render() {}
	
	//returns a string of the next menu
	String getNextMenu() {
		return nextMenu;}
	
	//loads the background image
	protected boolean loadBackground(String imageName) {
		return false;}
	
	//all menus have a background image associated with them
	protected ResourceFileModule backgroundImage;
	
	//the name of the next menu
	protected String nextMenu;
	
	
	
	
	
}
