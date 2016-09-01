package Services.WorldGenerationServices;

import java.awt.Point;

import UtilityTypes.Line;
import UtilityTypes.Point3D;
import UtilityTypes.Vec3D;

public class FractalTerrainGenerationFaultFormationService {

	
	class HeightField
	{
		int [][][] field = new int[256][256][20];
		
		
	}
	
	public static void Launch() {}
	
	public static void Init() {}
	
	public static void Update() {}
	
	public static void Destroy() {}
	
	public static void SpawnWebServiceObject() {}
	
	public static void GenerateFractal(HeightField heightField, int i, int n, float dHeight_0, float dHeight_n ) { 
		
		
		
	
		
		
		//generate random line through terrainHeightField
		//
		
		Point3D point1 = new Point3D(); //random point on border
		Point3D point2 = new Point3D(); //ranodm point on border
		
		//generate random line
		
		
		Line line = new Line(point1, point2);
		
		Vec3D vp = new Vec3D(line);
		Point3D o = new Point3D(); //point in the height field
		Vec3D vo = new Vec3D(o, point1);
		Vec3D vx = Vec3D.crossProduct(vp, vo);

		//to detect what side of a line the point is on:
				//
				//Let l be a line determiend by points p1 and p2
				//Let vp be a vector in the direction p1 to p2
				//Let o be a point in the height field
				//let vo be a vetor in the direction of o to p1
				//vx = vp cross product vo
				//if v.z > 0 the point o is on the left side of the line
				//if v.z > 0 the point o is on the right side of  the line
				//if v.z = 0 the point is on the line
		
		
		if (vx.z > 0)
		{
			//point o is on the left side of the line
			//add a value to one side of the height field
			//i'm choosing the left sidee initially
			//add value dHeight to all entries on the left
			//hand side of the line
		
		}
		
		if (vx.z < 0)
		{
			//point o is on the right side of the line
		}
		
		if (vx.z == 0)
		{
			//point o is on the line
		}
			
		
		//repeat but decrease the height this time

		for (i=0;i<n;i++)
		{

			Point3D tpoint1 = new Point3D(); //random point on border
			Point3D tpoint2 = new Point3D(); //ranodm point on border

			//generate random line


			Line tempLine = new Line(tpoint1, tpoint2);

			Vec3D tvp = new Vec3D(line);
			Point3D to = new Point3D(); //point in the height field
			Vec3D tvo = new Vec3D(to, tpoint1);
			Vec3D tvx = Vec3D.crossProduct(vp, vo);


			//to detect what side of a line the point is on:
			//
			//Let l be a line determiend by points p1 and p2
			//Let vp be a vector in the direction p1 to p2
			//Let o be a point in the height field
			//let vo be a vetor in the direction of o to p1
			//vx = vp cross product vo
			//if v.z > 0 the point o is on the left side of the line
			//if v.z > 0 the point o is on the right side of  the line
			//if v.z = 0 the point is on the line


			if (vx.z > 0)
			{
				//point o is on the left side of the line
				//subtract a value to one side of the height field
				//i'm choosing the left sidee initially
				//add value dHeight to all entries on the left
				//hand side of the line

				//subtract dHeightof to one side of the line

				//dHeighti = dHeight0 + (i/n)(dHeightn - dHeight0)

				//subtracting dHeight_i using the following formula
				//to recalculate dHeight

				//dHeight_i is the value of dHeight at iteration i
				//dHeight_n is the final value
				//dHeight_0 is the first value

				float dHeight_i = dHeight_0 + (i/n)*(dHeight_n - dHeight_0);

				//on this side of the line
				//all entries are subtracted by dHeight_i.
				


			}

			if (vx.z < 0)
			{
				//point o is on the right side of the line
			}

			if (vx.z == 0)
			{
				//point o is on the line
			}

		}




		//


		//each iteration:
		//draw a random line -add dHeight to each side of the line
		//decrease the value of dHeight using the formula below
		//rinse wash repeat
		//dHeighti = dHeight0 + (i/n)(dHeightn - dHeight0)
		//





		//Erosion
		//Pass the height field through this low-pass image filter
		//for the sequence x1,x2,x3,,xn
		//yi = ky_i-1 + 1(1-k)x_i
		//k is the filtering constant between 0 and 1
		//Low k less erosion, High k is more. 0.5 is usually ideal

	}
}
