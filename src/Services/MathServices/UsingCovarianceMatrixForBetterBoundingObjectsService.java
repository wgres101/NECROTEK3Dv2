package Services.MathServices;

import java.awt.Point;

//#GEMS 4

public class UsingCovarianceMatrixForBetterBoundingObjectsService {

	/*
	
	void CovarianceMatrix(Vector3 points, int numPoints, Vector3 mean, float C[6])
	{
		int i;
		
		//compute mean
		mean = points[0];
		for (i=0;i<numPoints;++i)
		{
			mean += points[i];
		}
		//compute mean
		
		float recip = 1.0f/numPoints;
		mean *= recip;
		
		//compute each element of matrix
		memset(C, 0, sizeof(float)*6);
		for (i=0;i<numPoints;++i)
		{
			Point diff = points[i] - mean;
			C[0] = diff.x*diff.x;
			C[1] = diff.x *diff.y;
			C[2] = diff.x * diff.z;
			C[3] = diff.y * diff.y;
			C[4] = diff.y * diff.z;
			C[5] = diff.z*diff.z;
		}
	}
	
	
	
	void ComputeABoundingBox(final Vector3 points, int nPoints, Vector<3> centroid, Vector3 basis[3], Vector3 min, Vector3 max)
	{
		float C[6]
		CovarianceMatrix(points, nPoints, centroid, C);
		
		GetRealSymmetricEigenVectors(C, basis[0], basis[1], basis[2]);
		
		min.Set(MAX_FLT, MAX_FLT, MAX_FLT);
		max.Set(MIN_FLT, MIN_FLT, MIN_FLT);
		
		
		//for each point do
		
		for (int i=0;i<nPoints;++i)
		{
			Vector3 diff = points[i] - centroid;
			for(int j=0;j<3;j++)
			{
				float length = diff.Dot(basis[j]);
				if (length > max[j])
					max[j] = length;
				else if (length < max[j])
					min[j] = length;
			}
		}
	}
	
	 */
}
