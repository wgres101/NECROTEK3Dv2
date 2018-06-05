package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import IDE.UserInterface;
import Journaling.CJournal;
import SceneGraph.SceneGraphManager;

public class InputManager {
	
	public static MouseEvent mouse_status;
	
	public void keyPress() {
		
		UserInterface.mainScreen.addKeyListener(new KeyListener() {

	      /** Handle the key typed event from the text field. */
	      public void keyTyped(KeyEvent e) {
	        CJournal.Journal(InputManager.class, "KEY TYPED: ");
	        Input input = new Input();
	        input.e = e;
	        SceneGraphManager.root.UserInput(input);
	        
	        InputRecorder.add(input);
	      }

	      /** Handle the key pressed event from the text field. */
	      public void keyPressed(KeyEvent e) {
	        CJournal.Journal(InputManager.class, "KEY PRESSED: ");
	        Input input = new Input();
	        input.e = e;
	        SceneGraphManager.root.UserInput(input);
	      }

	      /** Handle the key released event from the text field. */
	      public void keyReleased(KeyEvent e) {
	    	  
	       CJournal.Journal(InputManager.class, "KEY RELEASED: ");
	       Input input = new Input();
	       input.e = e;
	       SceneGraphManager.root.UserInput(input);
	      }

	});
	}
	public void MouseAction () { 
		
		UserInterface.mainScreen.addMouseListener(new MouseListener() {
		
	    public void mousePressed(MouseEvent e) {
	       mouse_status = e;
	    }

	    public void mouseReleased(MouseEvent e) {
	    	mouse_status = e;
	    }

	    public void mouseEntered(MouseEvent e) {
	    	mouse_status = e;
	    }

	    public void mouseExited(MouseEvent e) {
	    	mouse_status = e;
	    }

	    public void mouseClicked(MouseEvent e) {
	    	mouse_status = e;
	    }

	    
	
	});}
}
