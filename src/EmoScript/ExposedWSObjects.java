package EmoScript;

import UtilityTypes.Point3D;
import UtilityTypes.Vec3D;

public class ExposedWSObjects {

	/* Camera Object */
	
	// WS Camera Object
	
	public void setWSCameraObject(Point3D position, Vec3D lookPosition, int fieldOfView) { }
	
	/* Player Character Object */
	
	//WSFirstPersonPlayerCharacter
	public void setWSPlayerCharacterStart(float startx, float starty, float startz) { }
	
	public void setWSPlayerCHaracterCurrent(float currentx, float currenty, float currentz) { }

	/* WSPoint Light */
	
	public void setWSPointLight(float startx, float starty, float startz) { }
	
	/* WSBox */
	public void setWSBox(float pmin, float pmax) { }
	
	
	/* WSDaemon Arms */
	public void setWSDaemonArms(int str_requirement, int defend_chance, int defense) { }
	
	
	/* WSDaemon Bone */
	
	public void setWSDaemonBOne(int str_requirement, int defend_chance, int defense) { }
	
	/* WSDaemon Chest */
	
	public void setWSDaemonChest(int str_requirement, int defend_chance, int defense) { }
	
	/* WSDaemon Gloves */
	
	public void setWSDaemonGloves(int str_requirement, int defend_chance, int defense) { }
	
	/* WSDaemon Helm */
	
	public void setWSDaemonHelm(int str_requirement, int defend_chance, int defense) { }
	
	/* WSDaemon Legs */
	
	public void setWSDaemonLegs(int str_requirement, int defend_chance, int defense) { }
}
