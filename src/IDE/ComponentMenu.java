package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ComponentMenu {
	public JMenu init()
	{
		JMenu componentsMenu = new JMenu("Components");
		MenuText menuText = new MenuText();
		//add menuText.componentStrings
		JMenuItem temp = new JMenuItem();
				for (int i=0;i<menuText.componentStrings.length;i++)
				{
					temp= new JMenuItem(menuText.componentStrings[i]);
					temp.setFont(new Font("Arial", Font.BOLD, 10));
					componentsMenu.add(temp);
				}
		return componentsMenu;
	}
}
