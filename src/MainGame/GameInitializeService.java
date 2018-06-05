package MainGame;

import org.jdom2.Element;

import Factory.WebServiceFactory;
import IDE.MainMerged;
import SceneGraph.SceneGraphManager;

public class GameInitializeService {

	
	
	
	public static void initializeService()
	{
		// load starting xml file
		MainMerged.xmlAdapter.adapt("demo.xml");
		
		Element elmnt = SceneGraphManager.root.xmlData;
		
		WebServiceFactory.launchWebServiceInstance("WSFirstPersonPlayerCharacter", null);
	}
}
