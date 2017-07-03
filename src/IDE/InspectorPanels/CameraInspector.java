package IDE.InspectorPanels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import UtilityTypes.Vec3D;
import UtilityTypes.Vec3D;

public class CameraInspector {

	
	float x_coord;
	float y_coord;
	float z_coord;
	
	Vec3D direction;
	
	
	JPanel cameraPanel = null;
	JLabel x_coordlabel = null;
	JTextField x_coordPanel = null;
	
	JLabel y_coordlabel = null;
	JTextField y_coordPanel = null;
	JLabel z_coordlabel = null;
	JTextField z_coordPanel = null;
	
	JLabel directionPanelx = null;
	JTextField directionx = null;
	
	
	JLabel directionPanely = null;
	JTextField directiony = null;
	
	JLabel directionPanelz = null;
	JTextField directionz = null;
	
	void Panel()
	{
		
		 cameraPanel = null;new JPanel();
		 x_coordlabel = null;new JLabel("X Coord: ");
		 x_coordPanel = null;new JTextField("X Coordinate:");
		
		 y_coordlabel = null;new JLabel("Y Coord: ");
		 y_coordPanel = null;new JTextField("Y Coordinate");
		 z_coordlabel = null;new JLabel("Z Coord: ");
		 z_coordPanel = null;new JTextField("Z Coordinatee");
		
		 directionPanelx = null;new JLabel("Direction X: " + direction.x);
		 directionx = null;new JTextField("Z Coordinates");
		
		
		 directionPanely = null;new JLabel("Direction Y: " + direction.y);
		 directiony = null;new JTextField("Z Coordinates");
		
		 directionPanelz = null;new JLabel("Direction Z: " + direction.z);
		 directionz = null;new JTextField("Z Coordinates");
		
		 
	}
	
}
