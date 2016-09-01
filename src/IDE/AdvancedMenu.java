package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AdvancedMenu {

	public JMenu init()
	{
		JMenu ad = new JMenu("Advanced");
		JMenuItem temp = new JMenuItem();
		MenuText menuText = new MenuText();
		//add game objects
		for (int i=0;i<menuText.advanced.length;i++)
		{
			temp = new JMenuItem(menuText.advanced[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			ad.add(temp);
		}

		return ad;
	}
}
