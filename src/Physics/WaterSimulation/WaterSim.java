package Physics.WaterSimulation;

import java.util.zip.ZipEntry;

public class WaterSim {

	
	
	//z_i,j+1 is the north point
	//z_i,j is the center point
	//z_i-1,j is the left point
	//z_i+1, j is the right point
	//z_i,j-1 is the bottom point
	
	//precalculate coefficients
	
	public void waterSimulation()
	{
		//c is the speed the waves move across the surface
		//dt is the amount of time sampling
		//h is the height of the waves??
		//N is the size of the grid
		
		
		float N = 20;      //parameter depends on the body of water
		float c = 1.0f;		//parameter depends on the body of water
		float dt = 1.0f;      //parameter is the sampling time depends on body of water
		float h = 20; 		//the height of the body of water
		
		final float A = (c*dt/h)*(c*dt/h);
		final float B = 2-4*A;
		
		int i, j;
		
		float [][] z = new float[20][20]; 	//the height field for the body of water
		float [][] d = new float[20][20];   //dampening field for the water
		float [][] z1 = new float[20][20];  //??
		//edges are unchanged
		
		for (i=1; i<N-1;i++)
		{
			for (j=1;j<N-1;j++)
			{
				//integrate, replacing z[n-1] with z[n+1] in place
				z1[i][j] = A*(z[i-1][j] + z[i+1][j] + z[i][j-1] + z[i][j+1]) + 
				B*z[i][j] - z[i][j];
				//apply damping coeffcients
				z1[i][j] *= d[i][j];
			}
		}
		
		//swap pointers
		//how do i swap pointers in java???
		//Swap (z.pData, z1.pData);
			
			
		}
	}
	
	
	

	
