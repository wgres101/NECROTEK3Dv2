package SceneGraph;

import java.util.ArrayList;

import org.jdom2.Element;

import Hierarchy.Object.CObject;

public class SceneGraphNode extends CObject implements GraphNodeInstance   {
	public SceneGraphNode parent = null;
	public ArrayList<SceneGraphNode> children = new ArrayList<SceneGraphNode>();
	public Element xmlData = null;
	

}
