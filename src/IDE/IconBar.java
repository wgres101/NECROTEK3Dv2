package IDE;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class IconBar {
	public JPanel init()
	{
		MenuText menuText = new MenuText();
		JPanel bottomMenu = new JPanel();
		bottomMenu.setBorder(BorderFactory.createLineBorder(Color.white));
		bottomMenu.setBackground(Color.black);
		ImageIcon zoomicon = createImageIcon("/zoom.png", "useless");

		JButton zoomButton = new JButton(zoomicon);
		zoomButton.setToolTipText("Zoom Tool");

		bottomMenu.add(zoomButton);


		ImageIcon handicon = createImageIcon("/hand.png",
				"a pretty but meaningless splat");

		JButton handButton = new JButton(handicon);
		handButton.setToolTipText("Panning Hand Tool");
		//handIcon.setSize(new Dimension(5,5));

		bottomMenu.add(handButton);


		ImageIcon grabmoveicon = createImageIcon("/grab.png",
				"a pretty but meaningless splat");

		JButton grabmove = new JButton(grabmoveicon);
		handButton.setToolTipText("Grab Object and Move It");
		//handIcon.setSize(new Dimension(5,5));

		bottomMenu.add(grabmove);



		ImageIcon rotateicon = createImageIcon("/rotate.png",
				"a pretty but meaningless splat");

		JButton rotateButton = new JButton(rotateicon);
		rotateButton.setToolTipText("Rotate Tool");
		//handIcon.setSize(new Dimension(5,5));

		bottomMenu.add(rotateButton);

		ImageIcon scaleicon = createImageIcon("/scale.png",
				"a pretty but meaningless splat");


		JButton scaleButton = new JButton(scaleicon);
		scaleButton.setToolTipText("Scale Tool");

		//handIcon.setSize(new Dimension(5,5));

		bottomMenu.add(scaleButton);


		ImageIcon translateicon = createImageIcon("/translate.png",
				"a pretty but meaningless splat");

		JButton translateButton = new JButton(translateicon);

		translateButton.setToolTipText("Translate Tool");
		//handIcon.setSize(new Dimension(5,5));

		bottomMenu.add(translateButton);


		//bottomMenu.add(new JButton("Rotate"));
		//bottomMenu.add(new JButton("Scale"));
		//bottomMenu.add(new JButton("Translate"));

		JMenuBar perspectiveMenu = new JMenuBar();
		JMenu perspective = new JMenu();
		JMenuItem top_item = new JMenuItem("Top");
		JMenuItem bottom_item = new JMenuItem("Bottom");
		JMenuItem left_item = new JMenuItem("Left"); 
		JMenuItem right_item = new JMenuItem("Right");
		JMenuItem orthonormal = new JMenuItem("Orthonormal");
		JMenuItem orthographic = new JMenuItem("Orthographic");

		perspective.add(top_item);
		perspective.add(bottom_item);
		perspective.add(left_item);
		perspective.add(right_item);
		perspective.add(orthonormal);
		perspective.add(orthographic);
		perspectiveMenu.add(perspective);

		ImageIcon perspectiveicon = createImageIcon("/perspective.png",
				"a pretty but meaningless splat");

		perspective.setIcon(perspectiveicon);

		perspective.setToolTipText("Perspective Menu");

		ImageIcon magichaticon = createImageIcon("/magichat.png",
				"a pretty but meaningless splat");

		JButton magicbutton = new JButton(magichaticon);

		magicbutton.setToolTipText("Magic Object Picker");

		bottomMenu.add(magicbutton);


		JMenuBar renderingOptions = new JMenuBar();



		//JMenu viewMenu = new JMenu("menuText.Views");
		JMenu view = new JMenu();
		ImageIcon Viewsperspective = createImageIcon("/window.png",
				"a pretty but meaningless splat");

		view.setToolTipText("menuText.Views Menu");

		view.setIcon(Viewsperspective);
		JMenu ShowMenu = new JMenu();  //menuText.Show

		ImageIcon Showsperspective = createImageIcon("/show.png",
				"a pretty but meaningless splat");
		ShowMenu.setIcon(Showsperspective);

		ShowMenu.setToolTipText("menuText.Show Menu");

		for (int i=0;i<menuText.Views.length;i++)
		{
			view.add(new JMenuItem(menuText.Views[i]));
		}

		for (int i=0;i<menuText.Show.length;i++)
		{
			ShowMenu.add(new JMenuItem(menuText.Show[i]));
		}


		renderingOptions.add(view);
		renderingOptions.add(ShowMenu);
		bottomMenu.add(perspectiveMenu);
		bottomMenu.add(renderingOptions);

		
		return bottomMenu;
	}
	 protected ImageIcon createImageIcon(String path, String description) {
			java.net.URL imgURL = getClass().getResource(path);
			if (imgURL != null) {
				return new ImageIcon(imgURL, description);
			} else {
				System.err.println("Couldn't find file: " + path);
				return null;

			}
		}
		public ImageIcon createBufferedImageIcon(String path, String description, int w, int h, int x, int y)
		{
			int imageW = w;
			int imageH = h;
			ImageIcon myIcon2 = createImageIcon(path, description);
			Image img = myIcon2.getImage();
			BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
			Graphics g = bi.createGraphics();
			g.drawImage(img, 0, 0, w, h, null, null);
			ImageIcon newIcon = new ImageIcon(bi);
			return newIcon;
		}


}
