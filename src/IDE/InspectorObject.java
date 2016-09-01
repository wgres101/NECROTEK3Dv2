package IDE;

import java.util.ArrayList;

public class InspectorObject {

	private ArrayList<InspectorPanel> panels = new ArrayList<InspectorPanel>();
	
	public void add(InspectorPanel panel)
	{
		panels.add(panel);
	}
}
