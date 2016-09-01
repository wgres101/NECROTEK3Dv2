package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AnimationMenu {

	
	public JMenu init()
	{

		JMenu animationMenu = new JMenu("Animation");
		animationMenu.setFont(new Font("Arial", Font.BOLD, 10));

		JMenu rigidbodyanimation = new JMenu("RigidBodyAnimatino");
		rigidbodyanimation.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem interpolateorkey = new JMenuItem("Interpolation or Keyframing");
		interpolateorkey.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem explicitscripting = new JMenuItem("Explicit Scripting");
		explicitscripting.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem interpolationrotation = new JMenuItem("Interpolation of Rotation");
		interpolationrotation.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem usingquaternionsforrot = new JMenuItem("Using quaternions for rotation");
		usingquaternionsforrot.setFont(new Font("Arial", Font.BOLD, 10));
		rigidbodyanimation.add(interpolateorkey);
		rigidbodyanimation.add(explicitscripting);
		rigidbodyanimation.add(interpolationrotation);
		rigidbodyanimation.add(usingquaternionsforrot);
		animationMenu.add(rigidbodyanimation);


		JMenu relationshipquattorot = new JMenu("Relationship of QUaternions to Rotationse");
		relationshipquattorot.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem conversionbetweeangleaxisandrot = new JMenuItem("Use conversion between angle-axis and rotation matrix");
		conversionbetweeangleaxisandrot.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem conversionquatandangleaxis = new JMenuItem("Use conversion between quaternion and rotation matrix");

		conversionquatandangleaxis.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu eulerangles = new JMenu("Euler Angles");
		eulerangles.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem factorrotmatrix = new JMenuItem("Use factored  Rotation Matrices");
		factorrotmatrix.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem factorproductof = new JMenuItem("Use FactorProduct of Two");
		eulerangles.add(factorrotmatrix);
		eulerangles.add(factorproductof);
		relationshipquattorot.add(conversionbetweeangleaxisandrot);
		relationshipquattorot.add(conversionquatandangleaxis);
		relationshipquattorot.add(eulerangles);
		animationMenu.add(	relationshipquattorot);


		JMenu quaternionalgebra = new JMenu("Quaternion Algebra");
		quaternionalgebra.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem interpolatedquaternions = new JMenuItem("Interpolating Quaternions");
		interpolatedquaternions.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem ameraanimated = new JMenuItem("The camera as an animated object");
		ameraanimated.setFont(new Font("Arial", Font.BOLD, 10));
		quaternionalgebra.add(interpolatedquaternions);
		quaternionalgebra.add(ameraanimated);
		animationMenu.add(quaternionalgebra);



		JMenu structureandhierarch = new JMenu("Linked Structures and Hiearchical Motion");
		structureandhierarch.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem inversekin = new JMenuItem("Kinematics Problem");
		inversekin.setFont(new Font("Arial", Font.BOLD, 10));
		structureandhierarch.add(inversekin);

		animationMenu.add(structureandhierarch);

		JMenuItem basicRigidBodyParticles = new JMenuItem("Basic rigidboy and particles");
		basicRigidBodyParticles.setFont(new Font("Arial", Font.BOLD, 10));
		animationMenu.add(basicRigidBodyParticles);

		JMenuItem rigidbodyextend = new JMenuItem("Rigid Bodies and Heavy Masses");
		rigidbodyextend.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem dynamics = new JMenuItem("Dynamics");
		dynamics.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem lumpmass = new JMenuItem("Lumped Mass");
		lumpmass.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem spacetime = new JMenuItem("SpaceTime Constraints");
		spacetime.setFont(new Font("Arial", Font.BOLD, 10));
		animationMenu.add(rigidbodyextend);
		animationMenu.add(dynamics);
		animationMenu.add(lumpmass);
		animationMenu.add(spacetime);

		JMenu coldetect = new JMenu("Collision Detection");
		coldetect.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem phase = new JMenuItem("BRoad phase/narrow phase algorithm");
		phase.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem broad = new JMenu("Broad Phase Collision Detection with OBBS");

		broad.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem narrowphase = new JMenuItem("Pairs of convex polyhedra, exact collision detection ");
		narrowphase.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem singlephase = new JMenuItem("Single Phase algorithm - object hierarchies");
		singlephase.setFont(new Font("Arial", Font.BOLD, 10));
		coldetect.add(phase);
		coldetect.add(broad);
		coldetect.add(narrowphase);
		coldetect.add(narrowphase);
		coldetect.add(singlephase);
		animationMenu.add(coldetect);


		JMenuItem collisionresponse = new JMenuItem("Collision Response");
		collisionresponse.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem particleanim = new JMenuItem("Particle Animation");
		particleanim.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem behavioralanimation = new JMenuItem("Behavioral Animation");

		behavioralanimation.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem keyframeanim = new JMenuItem("Keyframe Animation");
		keyframeanim.setFont(new Font("Arial", Font.BOLD, 10));

		animationMenu.add(collisionresponse);
		animationMenu.add(particleanim);
		animationMenu.add(behavioralanimation);
		animationMenu.add(keyframeanim);


		JMenu compression = new JMenu("Keyframe Compression");
		compression.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem quaternnional = new JMenuItem("Use Quaternion Calculus");
		quaternnional.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem sphreical = new JMenuItem("Use Sphereical Linear Interpolation");
		sphreical.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem sphereicalcub  = new JMenuItem("Use SPhereial Cubical Interpolation");
		sphereicalcub.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem splineinter = new JMenuItem("Use spline interpolation of quaternions");
		splineinter.setFont(new Font("Arial", Font.BOLD, 10));	
		JMenuItem keyframenode = new JMenuItem("Update keyframe nodes");
		keyframenode.setFont(new Font("Arial", Font.BOLD, 10));
		compression.add(quaternnional);
		compression.add(sphreical);
		compression.add(sphereicalcub);
		compression.add(splineinter);
		compression.add(splineinter);
		compression.add(keyframenode);
		animationMenu.add(compression);

		JMenu inversekinem = new JMenu("Inverse Kinematics");

		inversekinem.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem jacob = new JMenuItem("Use Jacobian Methods");
		jacob.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem nonlin = new JMenu("Use Nonlinear Kinematics");
		nonlin.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cyclic = new JMenu("Use CYclic Coordinate Descent");
		cyclic.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem skinning = new JMenu("Use skinning and kinematics");
		skinning.setFont(new Font("Arial", Font.BOLD, 10));
		inversekinem.add(jacob);
		inversekinem.add(nonlin);
		inversekinem.add(cyclic);
		inversekinem.add(skinning);
		animationMenu.add(inversekinem);	

		JMenu vertexmorph = new JMenu("Use Vertex Morphing");

		vertexmorph.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem fillinggaps = new JMenu("Use stitchinga and skinning");
		fillinggaps.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem interpolate3d = new JMenu("Use interpolated 3D Keyframe animator");
		interpolate3d.setFont(new Font("Arial", Font.BOLD, 10));

		vertexmorph.add(fillinggaps);
		vertexmorph.add(interpolate3d);

		animationMenu.add(vertexmorph);
		
		return animationMenu;
	}
	
}
