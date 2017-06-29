package Hierarchy.Entities;




import MathUtils.Vector3f;


//Book 3 Section 4.1


public class CThirdPersonCamera {
/*I
	float PI = 3.14f;
	//spherical coordinates to rectangular
	
	public void getX(float rho, float theta, float phi)
	{
		float x = rho*cos(theta)sin(phi + PI/2);
	}
	
	public void getY(float rho, float theta, float phi)
	{
		float y = rho*sin(theta)sin(phi + PI/2);
		
	}
	
	public void getZ(float rho, float theta, float phi)
	{
		float z = rho*cos(phi + PI/2);
	}
	
	//convert cartesian to spherical
	
	public void rho(float x, float y, float z)
	{
		float rho = sqrt(x*x + y*y + z*z);
	}
	
	public void theta(float x, y)
	{
		theta = inverse_tangent(y/x);
	}

	public void phi(float z, float rho)
	{
		/*
		inverse_cosine(z/rho)- PI/2;
		*//*
	}
	
	
	
	class ChaseCamera
	{
		Vector3f m_vPosition;
		Vector3f m_vVelocity;
		Vector3f m_vTargetPos;
		Vector3f m_vIdealSpherical;
		Mat4 m_mView;
		
		void Update(float fTime)
		{
			//azimuth control
			//Calculate the azimuth acceleration from user input and damping
			float fAzimuthAccel = (GetUserInput(kINPUT_AZIMUTH) * m_fAzDriveK) - (m_fAzimuthVel * m_fAzDampingK);
			
			//Update the camera's azimuthal velocity
			m_fAzimuthVel += fAzimuthAccel * fTime;
			//APply it to the camera's position
			
			Vector3f vCurSpherical = CartesianToSpherical(m_vPosition - m_vTargetPos);
			Vector3f vCurSpherical.y = NormalizeAngle(vCurSpherical.y + m_fAzimuthVel * fTime);
			m_vPosition = SphericalToCartesian(vCurSpherical);
			
			//Update the ideal azimuth based on the camera's
			//current position with respect to target
			m_vIdealSpherical.y = atan2f(m_vPosition.y - m_vTargetPos.y, m_vPosition.x - m_vTargetPos.x);
			
			//Calculate the cameras ideal position in world space
			Vector3f vIdealPos = m_vTargetPos + SphericalToCartesian(m_vIdealSpherical);
			
			//Calculate this spring acceleration toward the ideal location
			
			Vector3f vDisplace = m_vPosition - vIdealPos;
			Vector3f vSpringAccel = (-m_fSpring * vDisplace) - (m_fDampingK * m_vVelocity);
			
			//Use Euler integration to update the camera's velocity and position
			m_vVelocity += vSpringAccel * fTime;
			m_vPosition += m_vVelocity * fTime;
			
			//Build the view matrix
			m_mView = MatrixLookAt(m_vPosition, vTargetPos, GetWorldUpVector());
		}
	}
*/
	
}
