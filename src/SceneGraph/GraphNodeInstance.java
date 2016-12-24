package SceneGraph;

import java.util.ArrayList;

import javax.jws.WebService;

import org.jdom2.Element;


@WebService
public class GraphNodeInstance extends Component {
	
	
	GraphNodeInstance parent;
	ArrayList<GraphNodeInstance> children;
	Element xmlData;
	
	
	
	
	public GraphNodeInstance(Element e)
	{
		xmlData = e;
	}
}
