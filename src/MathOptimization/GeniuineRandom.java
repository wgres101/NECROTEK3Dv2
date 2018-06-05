package MathOptimization;

import java.awt.Point;
import java.security.MessageDigest;
import java.util.ArrayList;

import Input.InputManager;

public class GeniuineRandom {

	static ArrayList<Integer> randInputs = new ArrayList<Integer>();
	public Integer GetRandom()
	{
		//build sample buffer
		
		
		//mix well and serve
		//MessageDigest md5 =  new MessageDigest("MD5");
		
		return null;
	}
	
	
	public void GetRandomInputs()
	{
		Integer randInt = 0;
		GetCurrTime(randInt);
		GetMousePosition(randInt);
		
	}
	
	public void GetCurrTime(Integer randInt)
	{
		randInputs.add((int)System.nanoTime());
		return;
	}
	
	
	public void GetMousePosition(Integer randInt)
	{
		Point p = InputManager.mouse_status.getLocationOnScreen();
		randInt += p.x;
		randInt += p.y;
		randInputs.add(randInt);
	}
	
}
