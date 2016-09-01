package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ExtrasMenu {

	public JMenu init()
	{
		JMenu extras = new JMenu("Extras");
		MenuText menuText = new MenuText();
		
		JMenuBar basicMenuBar = new JMenuBar();
		basicMenuBar.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu primitivesSubMenu = new JMenu("Primitives");
		primitivesSubMenu.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu lightingSubMenu = new JMenu("Lighting");
		lightingSubMenu.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu basicUIsubMenu = new JMenu("User Interface");
		basicUIsubMenu.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu misc = new JMenu("Miscellaneous");
		misc.setFont(new Font("Arial", Font.BOLD, 10));

		JMenu SpecialEffects = new JMenu("Special Effects");
		SpecialEffects.setFont(new Font("Arial", Font.BOLD, 10));

		for (int i=0;i<menuText.SpecialEffects.length;i++)
		{
			JMenuItem term = new JMenuItem(menuText.SpecialEffects[i]);
			term.setFont(new Font("Arial", Font.BOLD, 10));
			SpecialEffects.add(term);
		}

		JMenuItem temp = new JMenuItem();
		
		//add menuText.Extras
		for (int i=0;i<menuText.Extras.length;i++)
		{
			temp = new JMenuItem(menuText.Extras[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			extras.add(temp);

		}
		extras.add(SpecialEffects);

		return extras;

	}
}
