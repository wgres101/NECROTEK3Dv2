package RenderEngine;

import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

import IDE.UserInterface;


public class DisplayManager {

	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final int FPS_CAP = 120;
	
	public static void createDisplay()
	{
		try {	
			//ContextAttribs attribs = new ContextAttribs(4, 2).withForwardCompatible(true).withProfileCore(true);
		
			ContextAttribs attribs = new ContextAttribs(3,2).withForwardCompatible(true).withProfileCore(true);
			
			
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.create(new PixelFormat(), attribs);
			Display.setTitle("Necro Tek Alpha");
			Display.setParent(UserInterface.glcanvas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
		
		
	}
	
	public static void updateDIsplay() { 
		
		Display.sync(FPS_CAP);
		Display.update();
		
	}
	public static void closeDIsplay() { 
		Display.destroy();
	}
	
}
