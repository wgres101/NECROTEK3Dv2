package SpecialEffects;

//book 1 sec 2.6

public class CSimulateWater {

	public CSimulateWater() {
		// TODO Auto-generated constructor stub
	}
	
	public void generateWater(int [][] z1, int [][] z, float c, float dt, float h, int N, int [][] d)
	{
		/*
		float A = (c*dt/h)*(c*dt/h);
		float B = 2-4*A;
		int i, j;
		
		//edges are unchanged
		for (i=1;i<N-1;i++)
		{
			for (j=1;j<N-1;j++)
			{
				//integrate, replacing z[n-1] with z[n+1] in place
				z1[i][j] = (int) (A*( z[i-1][j] - z[i+1][j] + z[i][j-1] + z[i][j+1] )
						+ B*z[i][j] - z1[i][j]);
				//apply damping coeffcients
				z1[i][j] *= d[i][j];
			}
		}
		
		//swap pointers
		Swap(z.pData, z1.pData);
		*/
	}

}
