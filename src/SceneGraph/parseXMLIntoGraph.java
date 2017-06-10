package SceneGraph;

import java.io.File;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class parseXMLIntoGraph {

	public void readLevelBasic() throws JDOMException, IOException 
	{
		// the SAXBuilder is the easiest way to create the JDOM2 objects.
		SAXBuilder jdomBuilder = new SAXBuilder();
	
		// jdomDocument is the JDOM2 Object
	    Document jdomDocument = jdomBuilder.build(new File("demo2.xml"));
	    
	    // The root element is the root of the document. we print its name
	    System.out.println(jdomDocument.getRootElement().getName()); //prints "LevelRoot"
	}
	
}
