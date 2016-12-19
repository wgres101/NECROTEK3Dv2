package Entities;

import MathUtils.Keyboard;
import MathUtils.Vector3f;

public class Camera {
	private Vector3f position = new Vector3f(0,0,0);
	private float pitch;
	private float yaw;
	private float roll;
	
	public Camera()
	{
		
	}
	
	public void move() {
			if(Keyboard.isKeyDown(Keyboard.keys.KEY_W)) {
				position.z -= 0.02;
			}
			
			if (Keyboard.isKeyDown(Keyboard.keys.KEY_D)) {
				position.x += 0.02f;
			}
			
			if (Keyboard.isKeyDown(Keyboard.keys.KEY_A)) {
				position.x -= 0.02f;
			}
	}

	public Vector3f getPosition() {
		return position;
	}

	public void setPosition(Vector3f position) {
		this.position = position;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getRoll() {
		return roll;
	}

	public void setRoll(float roll) {
		this.roll = roll;
	}
	
	
	
	
	//camera
	
	public Vector3f Eyeposition;
	public float NearZ;
	public float FarZ;
	public float FOV;
	
	
	
	
	
	
	
	
	
	
	
	
}
