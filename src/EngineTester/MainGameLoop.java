package EngineTester;

import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;

import Entities.Camera;
import Entities.Entity;
import RenderEngine.DisplayManager;
import RenderEngine.Loader;
import RenderEngine.Renderer;
import RenderEngine.StaticShader;
import Textures.ModelTexture;
import models.RawModel;
import models.TexturedModel;

public class MainGameLoop {

	public static void maingame() {
		// TODO Auto-generated method stub
		DisplayManager.createDisplay();
		
		
		Loader loader = new Loader();
		StaticShader shader = new StaticShader();
		
		Renderer renderer = new Renderer(shader);
		
		
		float [] vertices = {
				-0.5f, 0.5f, 0f,
				-0.5f, -0.5f, 0f,
				0.5f, -0.5f, -0f,		
				0.5f, 0.5f, 0f,
		};
		
		int [] indices = {
				0,1,3,
				3,1,2
		};
		
		float [] textureCoords = {
				0,0,
				0,1,
				1,1,
				1,0
		};
		
		RawModel model = loader.loadToVAO(vertices, textureCoords, indices);
		
		ModelTexture texture = new ModelTexture(loader.loadTexture("image"));
		

		
		TexturedModel texturedModel = new TexturedModel(model, texture);
		
		Entity entity = new Entity(texturedModel, new Vector3f(0,0,-1),0,0,0,1);
		
		Camera camera = new Camera();
		
		while (!Display.isCloseRequested()) {
			//entity.increasePosition(0, 0, -0.1f);
			//entity.increaseRotation(0, 1, 0);
			//game logic
			//render
			camera.move();
			renderer.render(texturedModel);
			//shader.start();
			//shader.loadViewMatrix(camera);
			//renderer.render(entity, shader);
			//shader.stop();
			DisplayManager.updateDIsplay();
			
		}
		shader.cleanUp();
		loader.cleanUp();
		DisplayManager.closeDIsplay();
	}

}
