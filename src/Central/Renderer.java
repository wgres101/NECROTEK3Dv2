package Central;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import IDE.Main;

public class Renderer {

	// static private GL              gl;
	/// static private GLDrawable      glDrawable;
	 
	// static private GLU glu = new GLU();
	   
	static TriangleMeshes triangleObjects = new TriangleMeshes();

	static QuadMeshes quadObjects = new QuadMeshes();
	
	//Render works but load doesn'T? 
	
	public static void loadQuadMesh(String filename)
	{
		//store filename mdoel into quadmesh
		
		//line below works
		System.out.println("loadQuadMesh");
		//get a quad object
		
		
		
		//parse quad mesh file
		Scanner sc;

  	
  	  
  	  
		try {
			sc = new Scanner(new File(filename));
			int counter = 0;
			

	    	 // mesh.quads.add(quad);
	    	  
			QuadMeshes meshes = new QuadMeshes();
			QuadMesh mesh = new QuadMesh();
			
			
			
	    	  
	    	  
	    	  /////////////////////////
	    	  
	
			
			
		      while (sc.hasNextFloat()) {
		         // System.out.println("sc has next int: " + sc.nextFloat());
		    	  
		    	  
		    	  
		    	  //System.out.println(test);
		    	  
		    	  
		    	  
		    	  System.out.println("Running mesh loader");
		    	  
		    	  //color
		    	  
		    	  float r = 0.0f;
		    	  float g = 0.0f;
		    	  float b = 0.0f;
		    	  
		    	  float x = 0.0f;
		    	  float y = 0.0f;
		    	  float z = 0.0f;
		    	  
		    	  if (sc.hasNextFloat())
		    	  {
		    		   r = sc.nextFloat();
		    	  }
		    	  if (sc.hasNextFloat())
		    	  {
		    		   g = sc.nextFloat();
		    	  }
		    	  
		    	  if (sc.hasNextFloat())
		    	  {
		    		   b = sc.nextFloat();
		    	  }
		    	  
		    	  System.out.println("Colors: " + r + " " + g + " " + b);

		    	  
		    	  if (sc.hasNextFloat())
		    	  	{
		    	   x = sc.nextFloat();	
		    	  }
		    	  
		    	  if (sc.hasNextFloat())
		    	  {
		    		   y = sc.nextFloat();
		    	  }
		    	  if (sc.hasNextFloat())
		    	  {
		    		   z = sc.nextFloat();
		    	  }
		    	 
		    	  Vertex vertexa = new Vertex(x,y,z);
		    	  vertexa.print();
		    	  if (sc.hasNextFloat())
		    	  {
		    	   x = sc.nextFloat();
		    	  }
		    	   if (sc.hasNextFloat())
			       {
		    	   y = sc.nextFloat();
			       }
		    	   if (sc.hasNextFloat())
			       {
		    	   z = sc.nextFloat();
			      }
		    	   
		    	  Vertex vertexb = new Vertex(x,y,z);
		    	  vertexb.print();
		    	  if (sc.hasNextFloat())
		    	  {
		    	   x = sc.nextFloat();
		    	  }
		    	   if (sc.hasNextFloat())
			       {
		    	   y = sc.nextFloat();
			        }
		    	   if (sc.hasNextFloat())
			       {
		    	   z = sc.nextFloat();
			       }
		    	   
		    	  Vertex vertexc = new Vertex(x,y,z);
			    	 
		    	  vertexc.print();
		    	  
		    	  if (sc.hasNextFloat())
		    	  {
		    	  x = sc.nextFloat();
		    	  }
		    	  if (sc.hasNextFloat())
		    	  {
		    	  y = sc.nextFloat();
		    	  }
		    	  if (sc.hasNextFloat())
		    	  {
		    	  z = sc.nextFloat();
		    	  }
		    	  
		    	  Vertex vertexd = new Vertex(x,y,z);
		    	  vertexd.print();
		    	  
		    	  System.out.println("Colors: " + r + " " + g + " " + b);
		    	  
		    	  Quad quad = new Quad();
		    	  quad.a = vertexa;
		    	  quad.b = vertexb;
		    	  quad.c = vertexc;
		    	  quad.d = vertexd;
		    	  
		    	  quad.cr = r;
		    	  quad.cg = g;
		    	  quad.cb = b;
		    	 
		    	  mesh.quads.add(quad);
		    	  
		    	  
		    	  meshes.quadMeshes.add(mesh);
		    	  
		    	  quadObjects.quadMeshes.add(mesh);
		    	  
		      } 
		      
		      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		//quads
		//mesh.quads : QuadMesh
		//quadObjects : quadMeshes
		
		//quadObjects.objects.add(mesh);
	
		//load mesh
		//QuadMesh has quads added to it -> mesh.quads
		//QuadMeshes has a QuadMesh added to it
		//QuadObjects has QuadMeshes add to it
		
		
	}	
	
	
	public void loadTriangleMesh(String filename){
	}
	
	
	//render mesh objectes
	public static void renderToGL( )
	{
		
		loadQuadMesh("/cubeMesh.txt");
		
		
	}
		
	
}
