package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PhysicsMenu {

	public JMenu init()
	{

		JMenu physicsMenu = new JMenu("Physics");
		physicsMenu.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem  particleSystems = new JMenuItem("Particle Systems");
		particleSystems.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu masspringsystem = new JMenu("Mass-SPring System");
		masspringsystem.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem curvemasses = new JMenuItem("Curve Masses");
		curvemasses.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem surfacemases = new JMenuItem("Surface Masses");
		surfacemases.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem volumemasses = new JMenuItem("Volume Masses");
		volumemasses.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem arbitrary = new JMenuItem("Arbitrary Configuration");
		arbitrary.setFont(new Font("Arial", Font.BOLD, 10));
		masspringsystem.add(curvemasses);
		masspringsystem.add(surfacemases);
		masspringsystem.add(volumemasses);
		masspringsystem.add(arbitrary);
		JMenuItem deformable = new JMenuItem("Deformable Bodies");
		deformable.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu rigidBodies = new JMenu("Rigid Body Class");
		rigidBodies.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem rigidbody = new JMenu("Rigid Body Class");
		rigidbody.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem computingint = new JMenu("Compute Inertia Tensor");
		computingint.setFont(new Font("Arial", Font.BOLD, 10));
		rigidBodies.add(rigidbody);
		rigidBodies.add(computingint);
		physicsMenu.add(particleSystems);
		physicsMenu.add(masspringsystem);
		physicsMenu.add(masspringsystem);
		physicsMenu.add(deformable);
		physicsMenu.add(rigidBodies);
		physicsMenu.add(computingint);
		return physicsMenu;
	}
}
