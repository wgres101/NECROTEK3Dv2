package Input;

import java.util.ArrayList;

public class InputRecorder {

	//records all game input and puts it in context of debug information
	//all input is recorvded by the input functions of the scene graph nodes
	//this function holds that intput and plays it back on command

	public static ArrayList<Input> inputRecorder = new ArrayList<Input>();
	
	public static void add(Input in)
	{
		inputRecorder.add(in);
	}
}
