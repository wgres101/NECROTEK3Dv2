package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ExtendedAttachments {

	
	public JMenu init()
	{
		MenuText menuText = new MenuText();
		
		JMenu Extended = new JMenu("Extended Attachments");
		Extended.setFont(new Font("Arial", Font.BOLD, 10));

		JMenu extendedAI = new JMenu("AI");
		extendedAI .setFont(new Font("Arial", Font.BOLD, 10));
		JMenu extendedGraphics = new JMenu("Graphics");
		extendedGraphics.setFont(new Font("Arial", Font.BOLD, 10));

		for (int i=0;i<menuText.AIExtended.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.AIExtended[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			extendedAI.add(temp);

		}

		for (int i=0;i<menuText.GraphicsExtended.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.GraphicsExtended[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			extendedGraphics.add(temp);
		}
		JMenu extendedNetworking = new JMenu("Networking and Multiplayer");
		extendedNetworking.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu extendedScripting = new JMenu("Scripting and Data Driven Systems");
		extendedScripting.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu extendedPolygons = new JMenu("Polygonal Techniques");
		extendedPolygons.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu extendedPhysics = new JMenu("Physics");
		extendedPhysics.setFont(new Font("Arial", Font.BOLD, 10));

		Extended.add(extendedAI);
		Extended.add(extendedGraphics);
		Extended.add(extendedNetworking);
		Extended.add(extendedScripting);
		Extended.add(extendedPolygons);
		Extended.add(extendedPhysics);



		return Extended;
	}
	
}
