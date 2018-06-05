package MathOptimization;

//GEMS 4 Math

public class JacobianTransposeMethodForInverseKinematics {

	
	/*
	 * 
	 * for (iColumn = 0, iLinkIndex = 1; iColumn < iLevel; ++iColumn, ++iLinkIndex)
	 * {
	 * 		//Position of current node
	 * 		m_arrCurrentTM[ iLinkIndex].GetTranslation(vecLink);
	 * 		
	 *		//Vector current link -> target
	 *		
	 *		vecLinkTarget = m_)vecTargetPosition - vecLink;
	 *		
	 *		//Vector current link -> current effector position
	 *
	 *		vecLinkEnd = vecEnd - vecLink;
	 *
	 *		// Compute axis
	 *
	 *		m_arrAxis[ iColumn ] = CVector3::CrossProduct(vecLinkTarget, vecLinkEnd);
	 *
	 *		m_arrAxis[ iColumn ].Normalize();
	 *
	 *		// Compute upper part of the Jacobian entry
	 *	
	 *		vecEntry = CVector3::CrossProduct(vecLinkEnd, m_arrAxis[iColumn]);
	 *
	 *		// Set Jacobian entry
	 *
	 *		for (iRow = 0; iRow < 3; ++iRow)
	 *		{
	 *			m_arrJacobian[ iRow * iLevel + iColumn] = vecEntry[iRow];
	 *			m_arrJacobian[ (iRow + 3) * iLevel + iColumn] = m_arrAxis[iColumn][iRow];
	 *		}
	 *}
	 *
	 *		//note that the iLevel denotes the nu mber of links in the manipulator, that is, the number of entries in 
	 *		//the Jacobian
	 *		//Next of course, the Jacobian has to be transposed
	 *
	 *	for (iRow = 0; iRow < 6; ++iRow)
	 *	{
	 *		for (iColumn = 0; iColumn < iLevel; ++iColumn)
	 *		{
	 *			m_arrJacobianTransposed[ iColumn * 6 + iRow] = m_arrJacobian[ iRow * iLevel + iColumn];
	 *
	 		//The force f from Eq 2.6.7 is the distance between the effector and the target4	 		  
	 * 		//Note that this vector has a second purpose as well, as its magnitude is used as a criterion to 
	 * 		//abort the cfomputation loop
	 * 		m_arrCurrentTM[0].GetTranslation( vecEnd );
	 * 
	 * 		//what do we have to do to reach that?
	 * 		
	 * 		vecDifference = vecEnd - m_vecTargetPosition;
	 * 
	 *		//how far is that
	 *
	 *		fError = vecDifference.GetMagnitude();
	 *		// Set force vector
	 *
	 *		farrForce[0] = vecDifference.GetX();
	 *		farrForce[1] = vecDifference.GetY();
	 *		farrForce[2] = vecDifference.GetZ();
	 *		farrForce[3] = 0.0f;
	 *		farrForce[4] = 0.0f;
	 *		farrForce[5] = 0.0f;
	 *
	 *		//using equation 2.6.10 its easy to get the joint velocities
	 *
	 *		//compute q'
	 *
	 *		for (iRow = 0; iRow < iLevel; ++iRow)
	 *		{
	 *			m_arrDerivative[iRow] = 0.0f;
	 *			for ( iColumn = 0; iColumn < 6; ++iColumn)
	 *			{
	 *				m_arrDerivative[iRow] += m_arrJacobianTransposed[ iRow * 6 + iColummn] * farrForce[iColumn];
	 *
	 *			}
	 *
	 *		//integrate and apply changfes
	 *
	 *		for (iIndex=0,iLinkIndex=1;iIndex < iLevel; ++iIndex, ++LinkIndex)
	 *		{
	 *			axisAngle.SetAxis(m_arrAxis[iIndex]);
	 *			axisAngle.SetANgle( m_arrDerivative[iIndex] * 0.01f);
	 *			quatAlign.SetQuaternion(axisAngle);
	 *			quatAlign.Normalize();
	 *
	 *			//store quaternion
	 *		}
	 *}
	 *
	 
	 */
	
	
}
