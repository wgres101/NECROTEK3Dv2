package GameMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

import DTI.DTIClass;
import Debugger.DebugManager;
import GLSampler.Main;
import IDE.MainMerged;
import IDE.SceneGraph;
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

	DTIClass dtiClass = new DTIClass("XMLAdapter", null);
	
	static ArrayList<SceneGraphNode> detachList = new ArrayList<SceneGraphNode>();
	public void adapt(String filename)
	{
		CJournal.Journal(XMLAdapter.class, "Running XML Adapter: adapt()");
		
    
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
        
       
        

        
        CJournal.Journal(XMLAdapter.class, "HasRootElement:" +  doc.hasRootElement());
        
        SceneGraphNode parent = new SceneGraphNode();

        
        //SceneGraphNode root = new SceneGraphNode();
        SceneGraphManager.root.xmlData = doc.getRootElement();
        SceneGraphManager.root.parent = null;
        //XMLSceneLoader.addToSceneGraph(SceneGraphManager.root, null);
        parent = SceneGraphManager.root;
        
        
        
        Element element = doc.getRootElement();
        List<Element> children = element.getChildren();
        
        
        for (Element elmnt : children)
        {
        	System.out.println("Parsing XML tree, element: " + elmnt.getName());
        }
        //arms here
        System.out.println("-------------------------------------------");
        
        System.out.println("Number of children:" + children.size());
        
        
       
        
        //adds the first level of children to the scenegraph
        for (Element child : children)
        
       //for (int i =0;i<children.size();i++)
        {
        	//Element child = children.get(i);
        	System.out.println("CHILD: " + child.getName());
        	SceneGraphNode node = new SceneGraphNode();
        	//Element child = children.get(i);
        	
        	//arms is not int he chilren slist
        	//System.out.println("Element child at i is" + "i:" + i + "child name + " + child.getName());
        	node.xmlData = child;
        	node.parent = SceneGraphManager.root;
        	//no arms a tthis point
        	System.out.println("R  Child Value" + child.getName());
        	System.out.println("R  Node Value" +  node.xmlData.getName());
        	
        	//missing arms
        	System.out.println("node.xmlData " + node.xmlData.getName());
        	
        	recursiveAdd(child.getChildren(), child, node);
        	detachList.add(node);
        	//arms misssing
        	//parent.children.add(node);
        	CJournal.Journal(XMLAdapter.class, "Adding node, XML Child Name is: " + child.getName());
        	CJournal.Journal(XMLAdapter.class, "Node XML Data Value is: " + node.xmlData.getName());
        	XMLSceneLoader.addToSceneGraph(node, parent);
        	
         	
        	//MainMerged.sceneGraph.add(node, SceneGraphManager.root);
        	parent = node;
         	
        	
        }
        
        //detaching node list
        for (int i=0;i<detachList.size();i++)
        {
        	SceneGraphNode node = detachList.get(i);
        	node.xmlData.detach();
        	node.xmlData.removeContent();
        }
        
        System.out.println("------------------------------------------");
        
        CJournal.Journal(XMLAdapter.class, "Final SceneGraph Structure");
        
        System.out.println("********************************");
        SceneGraphManager.output();
        System.out.println("********************************");
       
        
	}
	public void recursiveAdd(List<Element> children, Element parent, SceneGraphNode prnt)
	{
	      for (Element child : children)
		 //for (int i =0;i<children.size();i++)
	        {
	    	    SceneGraphNode node = new SceneGraphNode();
	    	    //Element child = children.get(i);
	    	    
	    	   
	    	    node.xmlData = child;
	    	    node.parent = prnt;
	    	    MainMerged.sceneGraph.add(node, node.parent);
	    	    System.out.println("node.xmlData child name" + node.xmlData.getName());
	    	    
	    	    recursiveAdd(child.getChildren(), child, node);

	        	//node.xmlData.detach();
	        	//node.xmlData.removeContent();
	        	detachList.add(node);
	        	
	    	    CJournal.Journal(XMLAdapter.class, "Recursive Function, XML Child: " + child.getName());
	    	    XMLSceneLoader.addToSceneGraph(node, node.parent);
	    	    
	    	   
	        	
	        	
	        	
	        	//prnt = node;
	        	
	        	return;
	        }
	}
	
	
	public static void Serialize()
	{
		SceneGraphNode root = SceneGraphManager.root;
		
		//Element root_element = root.xmlData;
		
		//Element root_element = new Element("LevelOne");
		
		
		
		
		Document doc = new Document();
		
		//Element root_element = doc.getRootElement().detach();
		Element root_element = root.xmlData.detach();
		
		//doc.setRootElement(root_element);
		//doc.addContent(root_element);
		//doc.setRootElement(root_element);
		//Element root_element = doc.getRootElement();
		
			
		
		CJournal.Journal(XMLAdapter.class, "Serializing root element: " + root_element.getName());
		CJournal.Journal(XMLAdapter.class, "Number of children: " + root.children.size());
		for (SceneGraphNode child: root.children)
		{
			//save xml
			CJournal.Journal(XMLAdapter.class, "Serializing element: " + child.xmlData.getName());
			child.xmlData.detach();
			
			root_element.addContent(child.xmlData);
			RecursiveSerialize(child, child.xmlData, doc);
			
		}
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream(new File("demo_output.xml"));
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch (IOException o)
		{
			o.printStackTrace();
		}
		
		
		XMLOutputter serializer = new XMLOutputter();
		try {
			serializer.output(doc, out);
		}
		catch (IOException o)
		{
			o.printStackTrace();
		}
		
	}
	
	public static void RecursiveSerialize(SceneGraphNode parent, Element eprnt, Document doc)
	{
		for (SceneGraphNode child: parent.children)
		{
			//save xml
			if (child.xmlData != null && child != null)
			{
				CJournal.Journal(XMLAdapter.class, "Recursive Serializing element: " + child.xmlData.getName());
				child.xmlData.detach();
			
				eprnt.addContent(child.xmlData);
				RecursiveSerialize(child, child.xmlData, doc);
			}
			
		}
		
		
	}
		
	public static void detachment()
	{
		for (SceneGraphNode node : SceneGraphManager.root.children)
		{
			node.xmlData.detach();
		}
	}
	
	public Element outpuNewTree(Element e) 
	{
		
		System.out.println("Tree ELement is " + e.getName());
		
		
		for (Element a : e.getChildren())
		{
			return outpuNewTree(a);
		}
		return null;
	}
}
