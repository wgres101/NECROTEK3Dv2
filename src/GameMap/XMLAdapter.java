package GameMap;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Content;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import Debugger.DebugManager;
import Journaling.CJournal;
import SceneGraph.GraphNodeInstance;
import SceneGraph.SceneGraphManager;
import SceneGraph.SceneGraphNode;

//all level data is stored and modified through XML

//this is an XML implementation of the scene graph essentially

//SERVICES

//<servicename parameter=value parameter=value and so on>
//<WSObjectname initialparameters=value etc..>


//below is the API for the XML adapter

//============================================

//Actors
//--------
//WSCharacter
//WSChild
//WSFirstPlayerActor
//WSThirdPersonPlayerActor
//WSPlayerCharacter
//WSEmptyActor
//WSLightActor
//WSLightMapImportance
//WSLightMassCharacter
//WSPawn
//WSSolidModellingGrammar

//AdvancedPrimitives
//------------------
//WSPaths
//WSSplines
//WSUniformCurves
//WSVoxels
//WSBezierCurves
//WSCircle
//WSConstructiveSolidGeometry
//WSCurves
//WSLevelSetCurves
//WSMetaBalls
//WSNonUniformSPlines
//WSNURBSCurve


//Lighting
//-----------
//WSGroundPlaneShadows
//WSPointLight
//WSRealTimeShadows
//WSSpotLight

//Miscellaneous
//----------------
//WSHeatAndHazePostProcessing
//

//Primitives
//------------------
//WSHexTile
//WSAnimatedCamera
//WSBox
//WSCameraControlTechniques
//WSCameraObject
//WSFog
//WSSphereStaticMesh
//WSVectorCamera
//


//WorldGeneration
//-----------------
//WSFractalTerrainGenerationFaultFormation






public class XMLAdapter {

	
	public void adapt()
	{
		CJournal.Journal(XMLAdapter.class, "Running XML Adapter: adapt()");
		String filename = "demo.xml";
    
        // Build the document with SAX and Xerces, no validation
        SAXBuilder builder = new SAXBuilder();
        // Create the document
        File file = new File(filename);
        Document doc = null;
		try {
			doc = (Document) builder.build(file);
		} catch (JDOMException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        
        
        
        
        DocType docType = doc.getDocType();
        
       // Element levelRoot = doc.getRootElement();
       
        //Element root = new Element("LevelRoot");
        
        //doc.setRootElement(root);
        
        Element element = doc.getRootElement();
       

        CJournal.Journal(XMLAdapter.class, "Document Root Element is: " + doc.getRootElement().getName());
        
        
        CJournal.Journal(XMLAdapter.class, "Output");
        // Output the document, use standard formatter
        XMLOutputter fmt = new XMLOutputter();
        try {
			fmt.output(doc, System.out);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        List<Element> children = element.getChildren();
        
        System.out.println("Number of children:" + children.size());
        
        
        
      
        //doc has no content for some reason
        try {
			fmt.output(doc, System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     // Get a List of all direct children as Element objects
        //List allChildren = element.getChildren();
        //System.out.println("First kid: " + ((Element)allChildren.get(0)).getName());
        // Get a list of all direct children with a given name
        //List namedChildren = element.getChildren("WSFirstPersonPlayerCharacter");
        // Get a list of the first kid with a given name
        Element kid = element.getChild("FirstPersonPlayerCharacterService");

        //wrong - has no text to output
       // CJournal.Journal(XMLAdapter.class, "KID" + kid.getText());
        
        
        
        DebugManager.Debug("XMLAdapter", "HasRootElement:" +  doc.hasRootElement());
        
        SceneGraphNode parent = new SceneGraphNode();

        //SceneGraphNode root = new SceneGraphNode();
        SceneGraphManager.root.xmlData = doc.getRootElement();
        SceneGraphManager.root.parent = null;
        XMLSceneLoader.addToSceneGraph(SceneGraphManager.root, null);
        parent = SceneGraphManager.root;
        
        //adds the first level of children to the scenegraph
        for (Element child : children)
        {
        	SceneGraphNode node = new SceneGraphNode();
        	node.xmlData = child;
        	node.parent = parent;
        	parent.children.add(node);
        	CJournal.Journal(XMLAdapter.class, "Initial Function, XML Child: " + child.getName());
        	
         	XMLSceneLoader.addToSceneGraph(node, parent);
        	//SceneGraph.SceneGraphManager.add(node, null);
        	parent = node;
         	recursiveAdd(child.getChildren(), child, parent);
        	
        }
        
        
	}
	public void recursiveAdd(List<Element> children, Element parent, SceneGraphNode prnt)
	{
	      for (Element child : children)
	        {
	    	    SceneGraphNode node = new SceneGraphNode();
	    	    node.xmlData = child;
	    	    node.parent = prnt;
	    	    CJournal.Journal(XMLAdapter.class, "Recursive Function, XML Child: " + child.getName());
	        	
	        	
	        	//SceneGraph.SceneGraphManager.add(node, null);
	        	XMLSceneLoader.addToSceneGraph(node, node.parent);
	        	
	        	prnt = node;
	        	recursiveAdd(child.getChildren(), null, prnt);
	        	return;
	        }
	}
}
