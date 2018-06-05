package MathOptimization;

import UtilityTypes.Vec3f;
import UtilityTypes.MathUtils.Vector3f;


//public class SolvingAccuracyWithLargeWorldCoordinates {
/*
	class FarSegment
	{
		int x, z;
		int xz;
		
		void matFarSegment()
		{
			xz = 0;
		}
	}
	
	class FarPosition
	{
		private FarSegment	m_segment;
		private Vec3f		m_offset;
		private static final float	s_segmentSize = 10; //arbitary segment size constant

		
		public Vec3f GetApproximateVector()
		{
			Vec3f v = m_offset;
			v.x += m_segment.x * s_segmentSize;
			v.z += m_segment.z * s_segmentSize;
			return v;
		}
		
		public void SetFromVector(Vec3f vector)
		{
			m_segment.xz = 0;
			m_offset = vector;
			Normalize();
		}
		
		public void Normalize()
		{
			if ( Math.abs(m_offset.x) >= s_segmentSize)
			{
				m_segment.x += (int)(m_offset.x / s_segmentSize);
				m_offset.x = Math.floorMod((int)m_offset.x, (int)s_segmentSize);
			}
		
			if (Math.abs(m_offset.z) >= s_segmentSize)
			{
				m_segment.z += (int)(m_offset.z / s_segmentSize);
				m_offset.z = Math.floorMod((int)m_offset.z, (int)s_segmentSize);
			}
		
		}
		
		public void Translate(Vec3f vector)
		{
			/*
			m_offset += vector
			Normalize();
			
		}
		
		*/
		/*
		public Vec3f GetRelativeVector(FarSegment segment)
		{
			Vec3f r = m_offset;
			r.x += (m_segment.x - segment.x) * s_segmentSize;
			r.z += (m_segment.z - segment.z) * s_segmentSize;
			return r;
		}
		*/
		/*
		public static void differenceBetweenTwoFarPositions(FarPosition lhs, FarPosition rhs)
		{
			matVector3 r = lhs.offset - rhs.m_offset;
			r.x += (lhs.m_segment.x - rhs.m_segment.x) * s_segmentSize;
			r.z += (lhs.m_segment.z - rhs.m_segment.z) * s_segmentSize;
			
		}
		*/
		
		
		
	//}

	//Combines a local transform with a far position and a basis segment
	//the basis segment is the segment space in which the local transform exists
	/*
	class FarTransform
	{
		public void SetBasisSegment(FarSegment segment)
		{
			if (segment != m_basisSegment)
			{
				m_PositionDirty = true;
				m_basisSegment = segment;
			}
		}
		public void matTransform GetLocalTransform()
		{
			if (m_bPositionDirty)
			{
				//store position
				m_localTransform.SetPosition(m_position.GetRelativeVector(m_basisSegment);
				bPositionDirty = false;
			}
			return m_localTransform;
		}
		boolean m_bPositionDirty;
		FarSegment m_basisSegment;
		
		
	}

	public FarPosition FindAveragePosition( Vector<FarPosition> vfp)
	{
		if (positions.empty())
			return FarPosition(0);
		FarSegment segment = positions.front().GetSegment();
		Vec3f offset(0);
		for (FarPosition it : vfp)
		{
			offset += it.GetRelativeVector(segment);
		}
		
		FarPosition average;
		average.SetSegment(segment);
		average.SetOffset(offset / positions.sizes());
		average.Normalize();
		return average;
	}
	
	public void TransformRayDirection(Vec3f vDir, FarTransform transform)
	{
		//vDir is the world direction
		Transform localTransform = transform.GetLocalTransform();
		Mat4f invMatrix = localTransform.GetInverseMatrix();
		Vec3f localDir = invMatrix.TransformVector(vDir);
	}
	
	public void TransformRayOrigin(Vec3f vDir, FarTransform transform, FarPosition vOrg)
	{
		//vDir is the world direction
		Transform localTransform = transform.GetLocalTransform();
		Mat4f invMatrix = localTransform.GetInverseMatrix();
		Vec3f localDir = invMatrix.TransformVector(vDir);
	
		Vec3f relOrg = vOrg.GetRelativeVector*(transform.GetBasisSegment());
		Vec3f localOrg = invMatrix.TransformPOint(relOrg);
	}
	
	*/
//}




