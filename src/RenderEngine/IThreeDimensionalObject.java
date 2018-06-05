package RenderEngine;


//a game object that is drawn using the methods from
//IRenderable and IVisualGameObject

public interface IThreeDimensionalObject extends IIRenderable, IVisualGameObject {

	public void  Render();
	
	
}
