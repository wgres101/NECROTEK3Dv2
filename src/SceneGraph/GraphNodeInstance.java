package SceneGraph;

import java.util.ArrayList;

import org.jdom2.Element;

public class GraphNodeInstance extends Component {
	GraphNodeInstance parent;
	ArrayList<GraphNodeInstance> children;
	Element xmlData;
	
	public GraphNodeInstance(Element e)
	{
		xmlData = e;
	}
}
