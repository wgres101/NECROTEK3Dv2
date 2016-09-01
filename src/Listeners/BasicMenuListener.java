package Listeners;

import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import IDE.Manager;

public class BasicMenuListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("itemStateChanged");
	    System.out.println("BasicMenuListenrFired");
	       
	    if (e.getActionCommand().equals("Box"))	
	    	
	        {
	        	System.out.println("Selected Box");
	        	Manager.getBoxPrimitive();
	        	
	        }
	    	
	    	//label.setVisible(true);
	    if (e.getActionCommand().equals("Camera"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
	    if (e.getActionCommand().equals("Visual"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
	    if (e.getActionCommand().equals("Fog"))	
	    	
        {
        	System.out.println("Capture Scene for Reflection");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Decal Component");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Meshes");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Box");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Cone");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Cylinder");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Curved Stairs");
        }
	    if (e.getActionCommand().equals("Box"))	
	    	
        {
        	System.out.println("Linear Stairs");
        }
	    if (e.getActionCommand().equals("SPiral Staires"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
	    
	    
	    if (e.getActionCommand().equals("Sphere"))	
	    	
        {
        	System.out.println("Paint Vertices");
        }

	    if (e.getActionCommand().equals("Empty Actor"))	
	    	
        {
        	System.out.println("Blocking Volume");
        }

	    if (e.getActionCommand().equals("Camera Blocking Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Cull Distance Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("KillZVolume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Level Streaming Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Lightmass Character"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Lightmass Importance"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Nav Mesh Bounds Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Nav Modifier Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("Pain Causing VOlume "))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Physics Volume "))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Post Process Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Precomputed Visibility"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Trigger Volume"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Character"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Sprite"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Point Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Spawn Point"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Cube Static Mesh"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Sphere Static Mesh"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Cone Static Mesh"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("A box shaped Trigger"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("A sphere shaped Trigger"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Directional"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("Light Actor"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Point Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Spawn Point"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Point Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Spot Ligh "))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Sky Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Create Empty"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Create EmptyChild"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Capsule"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("Cylinder"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Plane"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Quad"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Ragdoll"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Terrain"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Trees"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Windzone"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Force Field"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("  "))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("UI Panel  "))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Button"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Text"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Image"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Raw Image "))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("UI Slider"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Scrollbar"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Toggle"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Input Field"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Canvas"))	
	    	
        {
	    	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("UI Event System"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Direction  Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Point Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	

	    if (e.getActionCommand().equals("Spot Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Point Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Area Light"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Light Probe Group"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Audio Source"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Audio Reverb Zone"))	
	    	
        {
        	System.out.println("Clicked Box");
        }

	    if (e.getActionCommand().equals("Particle System"))	
	    	
        {
        	System.out.println("Clicked Box");
        }
    	
    	
	}	
	
	


}


