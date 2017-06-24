package Toolbox;

import Hierarchy.Entities.Camera;
import MathUtils.Matrix4f;
import MathUtils.Vector3f;

public class Maths {

	
		public static Matrix4f createTransformationMatrix(Vector3f translation, float rx, float ry, 
				float rz, float scale) {
			Matrix4f matrix = new Matrix4f();
			matrix.setIdentity();
			Matrix4f.translate(translation, matrix);
			Matrix4f.rotateX((float)Math.toRadians(rx), matrix);
			Matrix4f.rotateY((float)Math.toRadians(ry), matrix);
			Matrix4f.rotateZ((float)Math.toRadians(rz), matrix);
			Matrix4f.scale(scale, scale, scale, matrix);
			
			return matrix;
		}
	
		
		public static Matrix4f createViewMatrix(Camera camera)
		{
			Matrix4f viewMatrix = new Matrix4f();
			viewMatrix.setIdentity();
			//Matrix4f.rotate((float)Math.toRadians(camera.getPitch()), new Vector3f(1,0,0), viewMatrix, viewMatrix);
			Matrix4f.rotateX((float)Math.toRadians(camera.getRoll()), viewMatrix);
			Matrix4f.rotateZ((float)Math.toRadians(camera.getYaw()), viewMatrix);
			Vector3f cameraPos = camera.getPosition();
			Vector3f negativeCameraPos = new Vector3f(-cameraPos.x, -cameraPos.y, -cameraPos.z);
			Matrix4f.translate(negativeCameraPos, viewMatrix);
			return viewMatrix;
		}
}
