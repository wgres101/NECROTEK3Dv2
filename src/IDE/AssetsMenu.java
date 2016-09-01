package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AssetsMenu {

	public JMenu init()
	{
		JMenu assetsMenu = new JMenu("Assets");
		MenuText menuText = new MenuText();
		//add assets
		JMenuItem temp = new JMenuItem();
		for (int i=0;i<menuText.assetsList.length;i++)
		{
			temp = new JMenuItem(menuText.assetsList[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			assetsMenu.add(temp);
		}
		return assetsMenu;
	}
}
