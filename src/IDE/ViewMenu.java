package IDE;

import java.awt.Font;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ViewMenu {

	MenuText menuText = new MenuText();
	public JMenu init()
	{
		JMenu ViewMenu = new JMenu("View");
		ViewMenu.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem clear = new JMenuItem("Clear");
		clear.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem fullscreen = new JMenuItem("Fullscreen");
		fullscreen.setFont(new Font("Arial", Font.BOLD, 10));
		JMenu imagemode = new JMenu("Image Mode");
		imagemode.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem bitmap = new JMenuItem("Bitmap");
		bitmap.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem greyscale = new JMenuItem("Greyscale");
		greyscale.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem rgbcolor = new JMenuItem("RGB Color");
		rgbcolor.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cmykcolor = new JMenuItem("CMYK Color");
		cmykcolor.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem eightbitchannel = new JMenuItem("8 bit channel");
		eightbitchannel.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem sixteenbitchannel = new JMenuItem("16 bit channel");
		sixteenbitchannel.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem thirtytwobitchannel = new JMenuItem("32 bit channel");
		thirtytwobitchannel.setFont(new Font("Arial", Font.BOLD, 10));
		imagemode.add(bitmap);
		imagemode.add(greyscale);
		imagemode.add(rgbcolor);
		imagemode.add(cmykcolor);
		imagemode.add(eightbitchannel);
		imagemode.add(sixteenbitchannel);
		imagemode.add(thirtytwobitchannel);
		ViewMenu.add(imagemode);

		JMenu shadingMenu = new JMenu("Shading");
		shadingMenu.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem smooth = new JMenuItem("Smooth");
		smooth.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem flat = new JMenuItem("Flat");
		flat.setFont(new Font("Arial", Font.BOLD, 10));
		shadingMenu.add(smooth );
		smooth.setFont(new Font("Arial", Font.BOLD, 10));
		shadingMenu.add(flat );
		ViewMenu.add(shadingMenu);

		JMenuItem renderpresets = new JMenuItem("Render Presets");
		renderpresets.setFont(new Font("Arial", Font.BOLD, 10));
		ViewMenu.add(renderpresets);

		JMenu performance = new JMenu("Performance");
		performance.setFont(new Font("Arial", Font.BOLD, 10));

		JMenu mathperformance = new JMenu("Math");
		mathperformance.setFont(new Font("Arial", Font.BOLD, 10));

		for (int i=0;i<menuText.mathPerformanceStrings.length;i++)
		{
			JCheckBoxMenuItem item = new JCheckBoxMenuItem(menuText.mathPerformanceStrings[i]);
			item.setFont(new Font("Arial", Font.BOLD, 10));
			mathperformance.add(item);
		}

		JMenu graphicsperformance = new JMenu("Graphics");
		graphicsperformance.setFont(new Font("Arial", Font.BOLD, 10));


		for (int i=0;i<menuText.graphicsPerformanceStrings.length;i++)
		{
			JCheckBoxMenuItem item = new JCheckBoxMenuItem(menuText.graphicsPerformanceStrings[i]);
			item.setFont(new Font("Arial", Font.BOLD, 10));
			graphicsperformance.add(item);
		}

		JMenu aiperformance = new JMenu("AI");
		aiperformance.setFont(new Font("Arial", Font.BOLD, 10));


		for (int i=0;i<menuText.AIPerformanceStrings.length;i++)
		{
			JCheckBoxMenuItem item = new JCheckBoxMenuItem(menuText.AIPerformanceStrings[i]);
			item.setFont(new Font("Arial", Font.BOLD, 10));
			aiperformance.add(item);
		}

		JMenu codeperformance = new JMenu("Code");
		codeperformance.setFont(new Font("Arial", Font.BOLD, 10));


		for (int i=0;i<menuText.CodePerformanceStringse.length;i++)
		{
			JCheckBoxMenuItem item = new JCheckBoxMenuItem(menuText.CodePerformanceStringse[i]);
			item.setFont(new Font("A, Arial", Font.BOLD, 10));
			codeperformance.add(item);
		}

		performance.add(mathperformance);
		performance.add(graphicsperformance);
		performance.add(aiperformance);
		performance.add(codeperformance);


		ViewMenu.add(performance);

		JMenuItem objectmode = new JMenuItem("Object Mode");
		objectmode.setFont(new Font("Arial", Font.BOLD, 10));
		ViewMenu.add(objectmode);

		JMenuItem editmode = new JMenuItem("Edit Mode");
		editmode.setFont(new Font("Arial", Font.BOLD, 10));
		ViewMenu.add(editmode);

		JMenuItem objectmenuText = new JMenuItem("Object menuText.Show/Object Hide");
		objectmenuText.setFont(new Font("Arial", Font.BOLD, 10));
		ViewMenu.add(objectmenuText);

		JMenu snap = new JMenu("Snap");
		snap.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem selectiontogrid = new JMenuItem("Selection to Grid");
		selectiontogrid.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem selectiontocursor = new JMenuItem("Selection to Cursor");
		selectiontocursor.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cursortoselected = new JMenuItem("Cursor to Selected");
		cursortoselected.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cursortocenter = new JMenuItem("Cursor to Center");
		cursortocenter.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cursortogrid = new JMenuItem("Cursor to Grid");
		cursortogrid.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cursortoactive = new JMenuItem("Cursor to Active");
		cursortoactive.setFont(new Font("Arial", Font.BOLD, 10));
		snap.add(selectiontogrid);
		snap.add(selectiontocursor);
		snap.add(cursortoselected);
		snap.add(cursortocenter);
		snap.add(cursortogrid);
		snap.add(cursortoactive);
		ViewMenu.add(snap);

		JMenu viewportShading = new JMenu("Viewport Shading");
		viewportShading.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem rendered = new JMenuItem("Rendered");
		rendered.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem material = new JMenuItem("Material");
		material.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem texturemap = new JMenuItem("Texture Mapping");
		texturemap.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem solid = new JMenuItem("Solid");
		solid.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem wireframe = new JMenuItem("Bounding Box");
		wireframe.setFont(new Font("Arial", Font.BOLD, 10));
		viewportShading.add(rendered);
		viewportShading.add(material);
		viewportShading.add(texturemap);
		viewportShading.add(solid);
		viewportShading.add(wireframe);
		ViewMenu.add(viewportShading);

		return ViewMenu;
	}
	
}
