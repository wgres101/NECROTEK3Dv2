//package IDE;
//
//import com.jogamp.opengl.GL;
//import com.jogamp.opengl.GLDrawable;
//import com.jogamp.opengl.glu.GLU;
//
//
///*
//public class SecondGLEventListener {
//	/**
//	    * Take care of initialization here.
//	    
//	   public void init(GLDrawable gld) {
//	      GL gl = (GL)gld.getGL();
//	      GLU glu = (GLU)gld.getGLU();
//	      gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
//	      gl.glViewport(0, 0, 500, 300);
//	      gl.glMatrixMode(GL.GL_PROJECTION);
//	      gl.glLoadIdentity();
//	      glu.gluOrtho2D(0.0, 500.0, 0.0, 300.0);
//	   }
//	   *//**
//	    * Take care of drawing here.
//	    *//*
//	   public void display(GLDrawable drawable) {
//	      float red = 0.0f;
//	      float green = 0.0f;
//	      float blue = 0.0f;
//	      GL gl = drawable.getGL();
//	      gl.glClear(GL.GL_COLOR_BUFFER_BIT);
//	      gl.glPointSize(5.0f);
//	      for (int i=0; i<50; i++) {
//	         red -= .09f;
//	         green -= .12f;
//	         blue -= .15f;
//	      if (red < 0.15) red = 1.0f;
//	      if (green < 0.15) green = 1.0f;
//	      if (blue < 0.15) blue = 1.0f;
//	      gl.glColor3f(red, green, blue);
//	      gl.glBegin(GL.GL_POINTS);
//	         gl.glVertex2i((i*10), 150);
//	      gl.glEnd();
//	   }
//	}
//	public void reshape(
//	                     GLDrawable drawable,
//	                     int x,
//	                     int y,
//	                     int width,
//	                     int height
//	                   ) {}
//	public void displayChanged(
//	                            GLDrawable drawable,
//	                            boolean modeChanged,
//	                            boolean deviceChanged
//	                          ) {}
//	
//	
//}
