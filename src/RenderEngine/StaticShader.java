package RenderEngine;

import org.lwjgl.util.vector.Matrix4f;

import Entities.Camera;
import Toolbox.Maths;

public class StaticShader extends ShaderProgram{

	private static final String VERTEX_FILE = "vertexshader";
	private static final String FRAGMENT_FILE = "fragmentshader";
	
	private int location_transformationMatrix;
	private int location_projectionMatrix;
	private int location_viewMatrix;
	
	
	public StaticShader()
	{
		super(VERTEX_FILE, FRAGMENT_FILE);
	}

	protected void bindAttributes() {
		super.bindAttribute(0, "position");
		super.bindAttribute(1, "textureCoords");
	}
	


	@Override
	protected void getALlUniformLocations() {
		// TODO Auto-generated method stub
		location_transformationMatrix = super.getUnifromLocation("transformationMatrix");
		location_projectionMatrix = super.getUnifromLocation("projectionMatrix");
		location_viewMatrix = super.getUnifromLocation(("viewMatrix"));
	
	}
	
	public void loadTransformationMatrix(Matrix4f matrix)
	{
		super.loadMatrix(location_transformationMatrix, matrix);
	}
	
	public void loadViewMatrix(Camera camera)
	{
		Matrix4f viewMatrix = Maths.createViewMatrix(camera);
		super.loadMatrix(location_viewMatrix,viewMatrix);
	}
	
	
	public void loadProjectionMatrix(Matrix4f projection)
	{
		super.loadMatrix(location_projectionMatrix, projection);
	}
}
	
