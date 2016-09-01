package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FormatMenu {

	
	public JMenu init()
	{
		MenuText menuText = new MenuText();
		/////////////////////////////
		JMenu formatMenu = new JMenu("Format");
		formatMenu.setFont(new Font("Arial", Font.BOLD, 10));


		JMenu softwareRenderingMenu = new JMenu("Software Rendering");
		softwareRenderingMenu.setFont(new Font("Arial", Font.BOLD, 10));

		for (int i=0;i<menuText.softwareRendering.length;i++)
		{
			JMenuItem softrender = new JMenuItem(menuText.softwareRendering[i]);
			softrender.setFont(new Font("Arial", Font.BOLD, 10));
			softwareRenderingMenu.add(softrender);
		}

		formatMenu.add(softwareRenderingMenu);

		JMenu moreRenderingMenu = new JMenu("More Rendering Options");
		for (int i=0;i<menuText.moreRenderingMethods.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.moreRenderingMethods[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			moreRenderingMenu.add(temp);

		}
		moreRenderingMenu.setFont(new Font("Arial", Font.BOLD, 10));

		formatMenu.add(moreRenderingMenu);

		JMenu graphicsPipelineMenu = new JMenu("Graphics Pipeline");
		for (int i=0;i<menuText.graphicsPipeline.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.graphicsPipeline[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			graphicsPipelineMenu.add(temp);
		}

		graphicsPipelineMenu.setFont(new Font("Arial", Font.BOLD, 10));

		formatMenu.add(graphicsPipelineMenu);

		JMenu advancedLightingMenu = new JMenu("Advanced Lighting");
		for (int i=0;i<menuText.advancedLighting.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.advancedLighting[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			advancedLightingMenu.add(temp);
		}


		advancedLightingMenu.setFont(new Font("Arial", Font.BOLD, 10));


		formatMenu.add(advancedLightingMenu);

		JMenu programmingoptone = new JMenu("Programming Optimizations");
		for (int i=0;i<menuText.programmingOptimizations.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.programmingOptimizations[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			programmingoptone.add(temp);
		}

		formatMenu.add(programmingoptone);
		programmingoptone.setFont(new Font("Arial", Font.BOLD, 10));


		JMenu programmingopttwo = new JMenu("Programming Optimizations");

		programmingopttwo.setFont(new Font("Arial", Font.BOLD, 10));

		for (int i=0;i<menuText.programmingOptimizations2.length;i++)
		{
			JMenuItem temp = new JMenuItem(menuText.programmingOptimizations2[i]);
			temp.setFont(new Font("Arial", Font.BOLD, 10));
			programmingopttwo.add(temp);
		}

		formatMenu.add(programmingopttwo);

		return formatMenu;
	}
}
