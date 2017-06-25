package UtilityTypes.MathUtils;

public class Matrix4f {

	float [][] mat = new float[4][];
	
	
	
	
	public Matrix4f ()
	{
		for (int i=0;i<4;i++)
		{
			mat[i] = new float[4];
		}
	}
	
	public void set(int u, int v, float value)
	{
		mat[u][v] = value;
		
	}
	
	public void set(int u, int v, double value)
	{
		mat[u][v] = (float)value;
		
	}
	
	//identity matrix
	
	 public void setIdentity() {                            
	      for (int j = 0 ; j < 4 ; j++)
	      for (int i = 0 ; i < 4 ; i++)
	         set(i, j, (i == j ? 1 : 0));		//sets this matrix to the  to identity matrix
	   }


	
	
	//translation is a vector 3
	
	//matrix parameter is to be multiplied by the followingi transform
	public static void translate(Vector3f translation, Matrix4f matrix)
	{
		
		  Matrix4f tmp = new Matrix4f();

	      tmp.set(0,3, translation.x);
	      tmp.set(1,3, translation.y);
	      tmp.set(2,3, translation.z);

	      //premultiply original matrixs by tmp transform matrix
	      preMultiply(tmp);
		
	}
	//matrix parameter is to be multiplied by the followingi transform
	
	public static void rotateX(double theta, Matrix4f matrix)
	{
		  Matrix4f tmp = new Matrix4f();
	      double c = Math.cos(theta);
	      double s = Math.sin(theta);

	      tmp.set(1,1, c);
	      tmp.set(1,2,-s);
	      tmp.set(2,1, s);
	      tmp.set(2,2, c);

	      //premultiply original matrix by tmp transform matrixc
	      
	      preMultiply(tmp);

	}
	
	//matrix parameter is to be multiplied by the followingi transform

	 public static void rotateY(double theta, Matrix4f matrix) { // rotate transformation about the Y axis

	      Matrix4f tmp = new Matrix4f();
	      double c = Math.cos(theta);
	      double s = Math.sin(theta);

	      tmp.set(2,2, c);
	      tmp.set(2,0,-s);
	      tmp.set(0,2, s);
	      tmp.set(0,0, c);

	      preMultiply(tmp);
	   }
	 
	//matrix parameter is to be multiplied by the followingi transform
	   public  static void rotateZ(double theta, Matrix4f matrix) { // rotate transformation about the Z axis

	      Matrix4f tmp = new Matrix4f();
	      double c = Math.cos(theta);
	      double s = Math.sin(theta);

	      tmp.set(0,0, c);
	      tmp.set(0,1,-s);
	      tmp.set(1,0, s);
	      tmp.set(1,1, c);

	      preMultiply(tmp);
	   }

	 //matrix parameter is to be multiplied by the followingi transform
	   
	   public static void scale(double s, Matrix4f matrix) { // scale uniformly

		      Matrix4f tmp = new Matrix4f();

		      tmp.set(0,0, s);
		      tmp.set(1,1, s);
		      tmp.set(2,2, s);

		      preMultiply(tmp);
	    }

	 //matrix parameter is to be multiplied by the followingi transform
	   public static void scale(double r, double s, double t, Matrix4f matrix) { // scale non-uniformly

		      Matrix4f tmp = new Matrix4f();

		      tmp.set(0,0, r);
		      tmp.set(1,1, s);
		      tmp.set(2,2, t);

		      preMultiply(tmp);
		   }

	
	

	public static void preMultiply(Matrix4f tmp)
	{
		//multiplies this matrix by the incoming matrix - premultiply. ZREturns the result. 
	}
	
}
