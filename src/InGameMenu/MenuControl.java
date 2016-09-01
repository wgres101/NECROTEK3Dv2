package InGameMenu;


//a control in a menu

public class MenuControl {

	static enum controlType {
		NONE, BUTTON, STATIC, SLIDER, LIST
	}
	
	static enum controlState {
		ACTIVE, DISABLED
	}
	static enum controlView {
		VISIBLE, HIDDEN
	}
	
	void menuControl() { }
	
	void render() {}
	
	void setControlXY (int X, int Y) {}
	
	int getType() { return type; }
	
	void activateControl() { state = controlState.ACTIVE; }
	
	void disableControl() { state = controlState.DISABLED; }
	
	controlState getControlState() { return state;}
	
	void showControl() { view = controlView.VISIBLE; }
	
	void hideControl() { view = controlView.HIDDEN; }
	
	controlView getControlView() { return view; }
	
	protected int type; //the type of control
	
	protected int locx; //control x location 
	
	protected int locy; //control y location
	
	controlState state; //whether the control is active
	
	controlView view; //whether the control is visible
	
	
}
