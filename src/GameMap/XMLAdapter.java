package GameMap;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Content;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import Debugger.DebugManager;
import SceneGraph.GraphNodeInstance;

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
//WSAnimatedCamera
//WSBox
//WSCameraControlTechniques
//WSCameraObject
//WSFog
//WSSphereStaticMesh
//WSVectorCamera


//WorldGeneration
//-----------------
//WSFractalTerrainGenerationFaultFormation






public class XMLAdapter {

	public void adapt()
	{
		DebugManager.Debug("XMLAdapter", "Loading XML Level");
		String filename = "demo.xml";
    
        // Build the document with SAX and Xerces, no validation
        SAXBuilder builder = new SAXBuilder();
        // Create the document
        File file = new File(filename);
        Document doc = new Document();
        
        
        
        
        DocType docType = doc.getDocType();
        
       // Element levelRoot = doc.getRootElement();
       
        Element root = new Element("LevelRoot");
        
        doc.setRootElement(root);
        
        Element element = doc.getRootElement();
       
        

        DebugManager.Debug("XMLAdapter", "Outputting document");
        // Output the document, use standard formatter
        XMLOutputter fmt = new XMLOutputter();
        try {
			fmt.output(doc, System.out);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        List<Element> children = root.getChildren();
        
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
        Element kid = element.getChild("WSFirstPersonPlayerCharacter");

        DebugManager.Debug("XMLAdapter", "KID:" + kid.getText());
        
        
        DebugManager.Debug("XMLAdapter", "HasRootElement:" +  doc.hasRootElement());
       
      
      

        //adds the first level of children to the scenegraph
        for (Element child : children)
        {
        	GraphNodeInstance node = new GraphNodeInstance(child);
        	DebugManager.Debug("XMLAdapter", "XML Child:" + child.getName());
         	XMLSceneLoader.addToSceneGraph(node, null);
        	SceneGraph.SceneGraphManager.add(node, null);
        	recursiveAdd(child.getChildren(), child);
        }
        
        
	}
	public void recursiveAdd(List<Element> children, Element parent)
	{
	      for (Element child : children)
	        {
	        	GraphNodeInstance node = new GraphNodeInstance(child);
	        	DebugManager.Debug("XMLAdapter:Recursive", "XML Child:" + child.getName());
	        	//SceneGraph.SceneGraphManager.add(node, null);
	        	XMLSceneLoader.addToSceneGraph(node, null);
	        	
	        	recursiveAdd(child.getChildren(), child);
	        }
	}
}
