package IDE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

public class Toolbar {

	public JToolBar init(JFrame frame)
	{
		/********FLOATING TOOLBAR********/

		MenuText menuText = new MenuText();
		
		JToolBar toolbar = new JToolBar(JToolBar.VERTICAL);
		toolbar.setLayout(new FlowLayout());
		toolbar.setBorder(BorderFactory.createLineBorder(Color.white));
		toolbar.setBackground(Color.black);
		toolbar.setName("Tool Panel");

		ImageIcon marqueetool = createImageIcon("/marquee.png",
				"a pretty but meaningless splat");

		JPopupMenu marqueeMenu = new JPopupMenu();
		
		
		
		JButton marqueeButton = new JButton();

		marqueeMenu.add(new JMenuItem("Rectangle Marquee"));
		marqueeMenu.add(new JMenuItem("Elliptical Marque"));
		marqueeMenu.add(new JMenuItem("Lasso Tool"));
		marqueeMenu.add(new JMenuItem("Polygonal Lasso Tool"));
		marqueeMenu.add(new JMenuItem("Magnetic Lasso Tool"));
		marqueeMenu.add(new JMenuItem("Quick Selection Tool"));
		marqueeMenu.add(new JMenuItem("Magic Wand Tool"));
		marqueeMenu.add(new JMenuItem("Foreground Select"));
		marqueeMenu.add(new JMenuItem("Path Selection Tool"));
		//marqueeButton.addActionListener(handler);
		
		//marqueeButton.add(marqueeMenuBar);
		//marqueeButton.add(marqueeMenu);
		marqueeButton.setIcon(marqueetool);
		
		marqueeButton.setToolTipText("Marquee and Selection Tools");
		toolbar.add(marqueeButton);

		ImageIcon eyedroppertool = createImageIcon("/eyedropper.png",
				"a pretty but meaningless splat");
		JButton eyedropperButton  = new JButton(eyedroppertool);
		toolbar.add(eyedropperButton);
		eyedropperButton.setToolTipText("Eyedroppper tool for color selection");

		JPopupMenu jEyeDropMenu = new JPopupMenu();
		JMenuItem eyedrop = new JMenuItem("Eyedrop");
		JMenuItem colorsampler = new JMenuItem("Color Sampler");
		JMenuItem rulertool = new JMenuItem("Ruler Tool");
		JMenuItem notetool = new JMenuItem("Note Tool");
		JMenuItem counttool = new JMenuItem("Count Tool");
		JMenuItem spotheal = new JMenuItem("Spot Healing Brush");
		JMenuItem patchtool = new JMenuItem("Patch Tool");
		JMenuItem contentaware = new JMenuItem("Content Aware Tool");
		
		jEyeDropMenu.add(eyedrop);
		jEyeDropMenu.add(colorsampler);
		jEyeDropMenu.add(rulertool);
		jEyeDropMenu.add(notetool);
		jEyeDropMenu.add(counttool);
		jEyeDropMenu.add(spotheal);
		jEyeDropMenu.add(patchtool);
		jEyeDropMenu.add(contentaware);
		
		ImageIcon paintbrushtool = createImageIcon("/paintbrush.png",
				"a pretty but meaningless splat");
		JButton paintbrushButton  = new JButton(paintbrushtool);
		JPopupMenu paintBrushMenu = new JPopupMenu();
		paintbrushButton.setIcon(paintbrushtool);
		toolbar.add(paintbrushButton);
		paintBrushMenu.setToolTipText("Various methods of drawing");
		JMenuItem brush = new JMenuItem("Brush");
		JMenuItem pencil = new JMenuItem("Pencil");
		JMenuItem airbrush = new JMenuItem("Airbrush");
		JMenuItem colorreplace = new JMenuItem("Color Replacement Tool");
		JMenuItem mixerbrush = new JMenuItem("Mixer Brush");
		JMenuItem historybrush = new JMenuItem("History Brush");
		JMenuItem arthistorybrush = new JMenuItem("Art History Brush");
		JMenuItem pentool = new JMenuItem("Pen Tool");
		JMenuItem freeformpen = new JMenuItem("Freeform Pen Tool");
		JMenuItem addanchor =  new JMenuItem("Add Anchor Point Tool");
		JMenuItem deleteanchor = new JMenuItem("Delete Anchor Point Tool");
		JMenuItem convertpaint = new JMenuItem("Convert Point Tool");
		paintBrushMenu.add(brush);
		paintBrushMenu.add(pencil);
		paintBrushMenu.add(airbrush);
		paintBrushMenu.add(colorreplace);
		paintBrushMenu.add(mixerbrush);
		paintBrushMenu.add(historybrush);
		paintBrushMenu.add(arthistorybrush);
		paintBrushMenu.add(pentool);
		paintBrushMenu.add(freeformpen);
		paintBrushMenu.add(addanchor);
		paintBrushMenu.add(convertpaint);
		
		
		ImageIcon paintbuckettool = createImageIcon("/paintbucket.png",
				"a pretty but meaningless splat");
		JButton paintBucketButton  = new JButton(paintbuckettool);
		JPopupMenu paintBucketMenu = new JPopupMenu();
		paintBucketButton.setIcon(paintbuckettool);
		JMenuItem fillbucket = new JMenuItem("Paint Fill");
		JMenuItem paintbucket = new JMenuItem("Paint Bucket");
		JMenuItem threedmaterial = new JMenuItem("3D Material Drop Tool");
		paintBucketMenu.add(fillbucket);
		paintBucketMenu.add(paintbucket);
		paintBucketMenu.add(threedmaterial);
		
		
		toolbar.add(paintBucketButton);
		paintBucketMenu.setToolTipText("Fill a plane with color or textures");

		ImageIcon extrudetool = createImageIcon("/extrude.png",
				"a pretty but meaningless splat");
		JButton extrudeButton  = new JButton(extrudetool);
		JPopupMenu extrudeMenu = new JPopupMenu();
		extrudeButton.setIcon(extrudetool);
		toolbar.add(extrudeButton);
		extrudeButton.setToolTipText("Take a 2D object and extrude it into 3D");
		JMenuItem extrude = new JMenuItem("Extrude Freeform");
		JMenuItem extrudeX = new JMenuItem("Extrude X Direction");
		JMenuItem extrudeY = new JMenuItem("Extrude Y Direction");
		JMenuItem extrudeZ = new JMenuItem("Extrude Z Direction");
		JMenuItem extrudeDialog = new JMenuItem("Extrude...");
		extrudeMenu.add(extrude);
		extrudeMenu.add(extrudeX);
		extrudeMenu.add(extrudeY);
		extrudeMenu.add(extrudeZ);
		extrudeMenu.add(extrudeDialog);
		
		
		
		ImageIcon sculptingtool = createImageIcon("/sculpt.png",
				"a pretty but meaningless splat");
		JButton sculptingtoolButtton  = new JButton(sculptingtool);
		toolbar.add(sculptingtoolButtton);
		sculptingtoolButtton.setToolTipText("Opens the sculpting dialogue");
		JPopupMenu scultpop = new JPopupMenu();
		
		for (int i=0;i<menuText.sculptingText.length;i++)
		{
			
			JMenuItem tmp = new JMenuItem(menuText.sculptingText[i]);
			scultpop.add(tmp);
			
			
		}
		

		ImageIcon tooltiptool = createImageIcon("/tooltip.png",
				"a pretty but meaningless splat");
		JButton tooltipButton  = new JButton(tooltiptool);
		toolbar.add(tooltipButton);
		tooltipButton.setToolTipText("Tag objects with notes");

		ImageIcon layerstool = createImageIcon("/layers.png",
				"a pretty but meaningless splat");
		JButton layersButton  = new JButton(layerstool);
		//JMenu layersmenu = new JMenu();
		//layersmenu.setIcon(layerstool);
		layersButton.setIcon(layerstool);
		//layersButton.addActionListener(new layerlistener());
		toolbar.add(layersButton);
		layersButton.setToolTipText("Open the layers dialogue");


		//


		//


		//Need to download icons for below
		ImageIcon filterstool = createImageIcon("/filters.png",
				"a pretty but meaningless splat");
		JButton filtersButton  = new JButton(filterstool);
		//JButton filtersMenu = new JButton();
		filtersButton.setIcon(filterstool);
		toolbar.add(filtersButton);
		filtersButton.setToolTipText("Open the filters dialogue");

		ImageIcon clonetool = createImageIcon("/clone.png",
				"a pretty but meaningless splat");
		JButton cloneButton  = new JButton(clonetool);
		toolbar.add(cloneButton);
		cloneButton.setToolTipText("Clone an object");
		JPopupMenu clonePopUpMenu = new JPopupMenu("Clone");
		JMenuItem  clone = new JMenuItem("Clone");
		JMenuItem  clonemultiple = new JMenuItem("Clone Multiple Objects");
		JMenuItem  cloneXtimes = new JMenuItem("Clone x number of times");
		clonePopUpMenu.add(clone);
		clonePopUpMenu.add(clonemultiple);
		clonePopUpMenu.add(cloneXtimes);
		

		ImageIcon stamptool = createImageIcon("/stamp.png",
				"a pretty but meaningless splat");
		JButton stampButton  = new JButton(stamptool);
		stampButton.setToolTipText("Copy into a stamp and past objects");
		toolbar.add(stampButton);
		JPopupMenu stampPopUpMenu = new JPopupMenu();
		JMenuItem stampTool = new JMenuItem("Clone Stamp Tool");
		JMenuItem patternStampTool = new JMenuItem("Pattern Stamp Tool");
		JMenuItem reverseStampTool = new JMenuItem("Reverse Stamp Tool");
		JMenuItem dragAndDropStampTool = new JMenuItem("Drag and Drop Stamp Tool");
		JMenuItem copyStampForSculpting = new JMenuItem("Copy Stamp for Sculpting");
		stampPopUpMenu.add(stampTool);
		stampPopUpMenu.add(patternStampTool);
		stampPopUpMenu.add(reverseStampTool);
		stampPopUpMenu.add(dragAndDropStampTool);
		stampPopUpMenu.add(copyStampForSculpting);



		ImageIcon erasertool = createImageIcon("/eraser.png",
				"a pretty but meaningless splat");
		JButton eraserButton  = new JButton(erasertool);
		
		
		JPopupMenu eraserPopUpMenu = new JPopupMenu("Eraser");

		eraserButton.setIcon(erasertool);
		eraserButton.setToolTipText("Free Hand Erasing Tools");
		toolbar.add(eraserButton);
		JMenuItem eraserTool = new JMenuItem("Eraser Tool");
		JMenuItem backgrndTool = new JMenuItem("Background Eraser Tool");
		JMenuItem magiceraser = new JMenuItem("Magic Eraser Tool");
		JMenuItem threedsurfaceeraser = new JMenuItem("3D Eraser Tool");
		JMenuItem croptool = new JMenuItem("Crop Tool");
		JMenuItem exacto = new JMenuItem("Exacto Knife");
		eraserPopUpMenu.add(eraserTool);
		eraserPopUpMenu.add(backgrndTool);
		eraserPopUpMenu.add(magiceraser);
		eraserPopUpMenu.add(threedsurfaceeraser);
		eraserPopUpMenu.add(croptool);
		eraserPopUpMenu.add(exacto);
		
		ImageIcon shapestool = createImageIcon("/shapes.png",
				"a pretty but meaningless splat");
		JButton shapesButton  = new JButton(shapestool);
		JPopupMenu shapesMenu = new JPopupMenu();
		shapesButton.setIcon(shapestool);
		shapesButton.setToolTipText("Create primitive 2D shapes");
		toolbar.add(shapesButton);
		JMenuItem rectangleTool = new JMenuItem("Rectangle Tool");
		JMenuItem roundedRectanagle = new JMenuItem("Rounded Rectangle Tool");
		JMenuItem ellipseTool = new JMenuItem("Ellipse Tool");
		JMenuItem triangleTool = new JMenuItem("Triangle Tool");
		JMenuItem polygonTool = new JMenuItem("Polygon Tool");
		JMenuItem linetool = new JMenuItem("Line Tool");
		JMenuItem rhombus = new JMenuItem("Rhombus");
		JMenuItem diamond = new JMenuItem("Diamond");
		JMenuItem templateTool = new JMenuItem("Load Templater");
		JMenuItem customshape = new JMenuItem("Custom Shape Tool");
		shapesMenu.add(rectangleTool);
		shapesMenu.add(roundedRectanagle);
		shapesMenu.add(ellipseTool);
		shapesMenu.add(triangleTool);
		shapesMenu.add(polygonTool);
		shapesMenu.add(linetool);
		shapesMenu.add(rhombus);
		shapesMenu.add(diamond);
		shapesMenu.add(templateTool);
		shapesMenu.add(customshape);
		
		
		
		
		

		ImageIcon blurtool = createImageIcon("/blur.png",
				"a pretty but meaningless splat");
		JButton blurButton  = new JButton(blurtool);
		JPopupMenu blurMenu = new JPopupMenu();
		blurButton.setIcon(blurtool);
		blurButton.setToolTipText("Blur colors and shapes");
		toolbar.add(blurButton);
		JMenuItem blurring = new JMenuItem("Blur Tool");
		JMenuItem sharpentool = new JMenuItem("Sharpen Tool");
		JMenuItem smudgetool = new JMenuItem("Smudge Tool");
		JMenuItem streaktool = new JMenuItem("Streak Tool");
		JMenuItem blendtool = new JMenuItem("Blend Tool");
		JMenuItem motiontool = new JMenuItem("Motion Blur Tool");
		JMenuItem windtool = new JMenuItem("Wind Blur Tool");
		blurMenu.add(blurring);
		blurMenu.add(sharpentool);
		blurMenu.add(smudgetool);
		blurMenu.add(streaktool);
		blurMenu.add(blendtool);
		blurMenu.add(motiontool);
		blurMenu.add(windtool);

		ImageIcon dodgetool = createImageIcon("/dodge.png",
				"a pretty but meaningless splat");
		JButton dodgeButton  = new JButton(dodgetool);
		JPopupMenu dodgeMenu = new JPopupMenu();
		dodgeButton.setIcon(dodgetool);
		dodgeButton.setToolTipText("Dodge Tool");
		toolbar.add(dodgeButton);
		JMenuItem dodgeTool = new JMenuItem("Dodge Tool");
		JMenuItem burnTool	= new JMenuItem("Burn Tool");
		JMenuItem spongeTool = new JMenuItem("Sponge Tool");
		JMenuItem tearTool = new JMenuItem("Tear Tool");
		dodgeMenu.add(dodgeTool);
		dodgeMenu.add(burnTool);
		dodgeMenu.add(spongeTool);
		dodgeMenu.add(tearTool);
		
		

		ImageIcon texttool = createImageIcon("/text.png",
				"a pretty but meaningless splat");
		JButton textButton  = new JButton(texttool);
		textButton.setToolTipText("Add 2D text to the scene");
		JPopupMenu textMenu = new JPopupMenu();
		toolbar.add(textButton);
		JMenuItem horizontaltype = new JMenuItem("Horizontal Type Tool");
		JMenuItem verticaltype = new JMenuItem("Vertical Type Tool");
		JMenuItem horizontalmask = new JMenuItem("Horizontal Type Mask");
		JMenuItem verticalmask = new JMenuItem("Vertical Type Mask");
		textMenu.add(horizontaltype);
		textMenu.add(verticaltype);
		textMenu.add(horizontalmask);
		textMenu.add(verticalmask);


		ImageIcon primitivestool = createImageIcon("/2dprimitives.png",
				"a pretty but meaningless splat");
		JButton primitivesButton  = new JButton(primitivestool);
		JButton primitivesMenu = new JButton();
		primitivesMenu.setIcon(primitivestool);
		primitivesMenu.setToolTipText("Add 2D Primitives to the Scene");
		toolbar.add(primitivesMenu);

		/*********************GAME MENU*******************/
		
		JPopupMenu gamePopupMenu = new JPopupMenu("Game");
		JButton gamingButton = new JButton();
		ImageIcon gamingIcon = createImageIcon("/gaming.png",
				"a pretty but meaningless splat");
		for (int i=0;i<menuText.actionMenu.length;i++)
		{
			JMenuItem tmp = new JMenuItem(menuText.actionMenu[i]);
			gamePopupMenu.add(tmp);
		}
		gamingButton.setIcon(gamingIcon);
		toolbar.add(gamingButton);
		


		toolbar.setPreferredSize(new Dimension(150, 650));
		toolbar.setBackground(Color.black);
		toolbar.setForeground(Color.white);

		
		
		marqueeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					marqueeMenu.show(marqueeButton, marqueeButton.getX(), marqueeButton.getY());
			}

		});

		blurButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					blurMenu.show(blurButton, blurButton.getX(), blurButton.getY()-230);
			}

		});		
		
		eyedropperButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jEyeDropMenu.show(eyedropperButton, eyedropperButton.getX(), eyedropperButton.getY());
			}

		});
		gamingButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gamePopupMenu.show(eyedropperButton, eyedropperButton.getX(), eyedropperButton.getY());
			}

		});			
		
		layersButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JPanel testPanel = new JPanel();
				testPanel.setLayout(new GridLayout(20,20));

				JLabel title = new JLabel("Select layer");
				testPanel.add(title);
				for (int i=0;i<40;i++)
				{
					JButton newbutton = new JButton(" ");
					newbutton.setSize(new Dimension(10,10));
					newbutton.setLayout(new FlowLayout());
					testPanel.add(newbutton);
				}



				JOptionPane.showMessageDialog(frame, testPanel);

			}

		});

		//filters
		filtersButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JPanel testPanel = new JPanel();
				testPanel.setLayout(new GridLayout(20,20));

				JLabel title = new JLabel("Select layer");
				testPanel.add(title);





				JOptionPane.showMessageDialog(frame, testPanel);

			}

		});
		
		
		
		
		
/*
		sculptingtoolButtton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JPanel testPanel = new JPanel();
				testPanel.setLayout(new GridLayout(20,20));

				JLabel title = new JLabel("Select layer");
				testPanel.add(title);
				for (int i=0;i<40;i++)
				{
					JButton newbutton = new JButton(" ");
					newbutton.setSize(new Dimension(10,10));
					newbutton.setLayout(new FlowLayout());
					testPanel.add(newbutton);
				}



				JOptionPane.menuText.ShowMessageDialog(frame, testPanel);

			}

		});
*/

		paintbrushButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				paintBrushMenu.show(paintbrushButton, paintbrushButton.getX(), paintbrushButton.getY());
			}

		});
		
		paintBucketButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				paintBucketMenu.show(paintBucketButton, paintbrushButton.getX(), paintbrushButton.getY());
			}

		});
		
		sculptingtoolButtton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				scultpop.show(sculptingtoolButtton, sculptingtoolButtton.getX(), sculptingtoolButtton.getY());
			}

		});
		
		stampButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				stampPopUpMenu.show(stampButton, stampButton.getX(), stampButton.getY()-200);
			}

		});
		

		cloneButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clonePopUpMenu.show(cloneButton, cloneButton.getX(), cloneButton.getY()-200);
			}

		});
		
		eraserButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				eraserPopUpMenu.show(eraserButton, eraserButton.getX(), eraserButton.getY()-200);
			}

		});
		
		shapesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shapesMenu.show(shapesButton,  shapesButton.getX(), shapesButton.getY()-200);
			}

		});
		
		dodgeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dodgeMenu.show(dodgeButton,  dodgeButton.getX(), dodgeButton.getY()-250);
			}

		});
		
		textButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textMenu.show(textButton,  textButton.getX(), textButton.getY()-250);
			}

		});
		

		
		
		
		return toolbar;
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
