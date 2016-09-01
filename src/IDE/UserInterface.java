package IDE;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.tree.DefaultMutableTreeNode;

import EngineTester.MainGameLoop;
import Listeners.BasicMenuListener;

public class UserInterface implements Runnable {
	private JTree tree;
	JPopupMenu popupmenu;
	JFrame frame = new JFrame("NecroTEK 3D Game Graphics Engine");
	public final static Canvas glcanvas = new Canvas();
	
	MenuText menuText = new MenuText();
	
	static 	JPanel mainScreen = new JPanel();
	static 	JPanel bordermainscreen = new JPanel();
	static Toolbar tb = new Toolbar();
	static JToolBar toolBar = new JToolBar("Actor Panel"); //actor floating selector
	
	public void initUI()
	{
		run();
	}
	
	public void run()
	{
		
		System.out.println("Initializing UI");
		TreeDemo();	
	

		//JFrame frame = new JFrame("NecroTek 3D Game Modeling Engine");
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setSize(200, 400);
		popupMenu.setBackground(Color.black);
		popupMenu.setForeground(Color.white);
		popupMenu.setBorder(BorderFactory.createLineBorder(Color.white));
		


		/**********MENUBAR - TOP MENU***************/

		JMenuBar menuBar = new JMenuBar();

		menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));



		FileMenu filem = new FileMenu();
		JMenu fileMenu = filem.init();

		JMenu EditMenu = new JMenu("Edit");
		EditMenu.setFont(new Font("Arial", Font.BOLD, 10));
		EditMenu.setToolTipText("Cut, Copy and Paste");

		ViewMenu vm = new ViewMenu();
		JMenu viewMenu = vm.init();

		InsertMenu insert = new InsertMenu();
		JMenu insertMenu = insert.init();
	

		FormatMenu fm = new FormatMenu();
		JMenu formatMenu = fm.init();
		
		
		JMenu helpMenu = new JMenu("Help");
		helpMenu.setFont(new Font("Arial", Font.BOLD, 10));
		
		
		ExtrasMenu xm = new ExtrasMenu();
		JMenu Extras = xm.init();
		Extras.setFont(new Font("Arial", Font.BOLD, 10));

		ExtendedAttachments extended  = new ExtendedAttachments();
		JMenu Extended = extended.init();
		

		
		
		//show animation toolbar

		/* into import menu
		 * 
		JMenuItem assets = new JMenuItem("Assets...");
		assets.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(assets);
		
		
		 */
		
		JMenu selector = new JMenu();

		  
				
		JMenuItem actors = new JMenuItem("Actors...");
		actors.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(actors);
		actors.addActionListener(new optionsMenuSelect());
		//actors.addItemListener(optionsMenuItemFirstSelect);
		
		JMenuItem primitives = new JMenuItem("Primitives...");
		primitives.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(primitives);
		
		JMenuItem affine = new JMenuItem("Affine Transforms...");
		affine.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(affine);
		
		JMenuItem AI = new JMenuItem("AI Services...");
		AI.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(AI);
		
		JMenuItem animation = new JMenuItem("Animation...");
		animation.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(animation);
		
		JMenuItem audio = new JMenuItem("Audio...");
		audio.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(audio);
		
		JMenuItem basic = new JMenuItem("Basic...");
		basic.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(basic);
		
		JMenuItem cloth = new JMenuItem("Cloth Animation...");
		cloth.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(cloth);
		
		JMenuItem collision = new JMenuItem("Collision...");
		selector.add(collision);
		collision.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem debugging = new JMenuItem("Debugging...");
		debugging.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(debugging);
		
		JMenuItem perf = new JMenuItem("Game Performance...");
		perf.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(perf);
		
		JMenuItem graphs = new JMenuItem("Graphics Performance...");
		graphs.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(graphs);
		
		JMenuItem intersect = new JMenuItem("Intersections...");
		intersect.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(intersect);
		
		JMenuItem LOD = new JMenuItem("Level of Detail...");
		LOD.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(LOD);
		
		
		JMenuItem lighting = new JMenuItem("Lighting...");
		lighting.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(lighting);
		
		JMenuItem materials = new JMenuItem("Materials...");
		materials.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(materials);
		
		JMenuItem misc = new JMenuItem("Miscellaneous...");
		misc.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(misc);
		
		JMenuItem multi = new JMenuItem("Multiplayer...");
		multi.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(multi);
		
		JMenuItem particles = new JMenuItem("Particles...");
		particles.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(particles);
		
		JMenuItem path = new JMenuItem("Path Finding...");
		path.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(path);
		
		JMenuItem points = new JMenuItem("Points...");
		points.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(points);
		
		JMenuItem ray = new JMenuItem("Raycasting...");
		ray.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(ray);
		
		JMenuItem physics = new JMenuItem("Physics...");
		selector.add(physics);
		physics.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem uibuilder = new JMenuItem("UIBuilderMenu");
		selector.add(uibuilder);
		uibuilder.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem pipeline = new JMenuItem("Rendering Pipeline...");
		pipeline.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(pipeline);
		
		JMenuItem scripting = new JMenuItem("Scripting...");
		scripting.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(scripting);
		
		JMenuItem uml = new JMenuItem("UML Based Blueprints...");
		uml.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(uml);
		
		JMenuItem sectors = new JMenuItem("Sectors...");
		sectors.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(sectors);
		
		JMenuItem shaders = new JMenuItem("Shaders...");
		shaders.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(shaders);
		
		JMenuItem fx = new JMenuItem("Special Effects...");
		fx.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(fx);
		
		JMenuItem textures = new JMenuItem("Texturing...");
		textures.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(textures);
		
		JMenuItem tools = new JMenuItem("Tools...");
		tools.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(tools);
		
		JMenuItem uui = new JMenuItem("User Interface...");
		uui.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(uui);
		
		JMenuItem volumes = new JMenuItem("Volumes...");
		volumes.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(volumes);
		
		JMenuItem world = new JMenuItem("World Generation...");
		world.setFont(new Font("Arial", Font.BOLD, 10));
		selector.add(world);
		
		JMenuItem performance = new JMenuItem("Performance...");
		
		performance.addActionListener(new PerformancDialog());
		
		selector.add(performance);
		performance.setFont(new Font("Arial", Font.BOLD, 10));
		selector.setFont(new Font("Arial", Font.BOLD, 10));
		selector.setText("Options`");
		
		AnimationMenu anim = new AnimationMenu();
		JMenu animationMenu = anim.init();
		
		


//		AssetsMenu assets = new AssetsMenu();
//		JMenu assetsMenu = assets.init();
//		assetsMenu.setFont(new Font("Arial", Font.BOLD, 10));
///*
//		CollisionMenu coll = new CollisionMenu();
//		JMenu collision = coll.init();
//		collision.setFont(new Font("Arial", Font.BOLD, 10));
//		
//		PhysicsMenu pm = new PhysicsMenu();
//		JMenu physicsMenu = pm.init();
//		collision.setFont(new Font("Arial", Font.BOLD, 10));
//		
//		UIBuilderMenu uim = new UIBuilderMenu();
//		JMenu imMenu = im.init();
//		imMenu.setFont(new Font("Arial", Font.BOLD, 10));
//		
//		ScriptWriterMenu sw = new ScriptWriterMenu();
//		JMenu scriptWriter = sw.init();
//		scriptWriter.setFont(new Font("Arial", Font.BOLD, 10));
//		
//		BlueprintsMenu bp = new BlueprintsMenu();
//		JMenu bluePrints = bp.init();
//		bluePrints.setFont(new Font("Arial", Font.BOLD, 10));
//		
//		LightingMenu lig = LightingMenu();
//		JMenu lightingmenu = lig.init():
//		lightingmenu.setFont(new FOnt("Arial", Font.BOLD, 10));
//		
//		*/
//		
//		
		
		menuBar.add(fileMenu);
		menuBar.add(EditMenu);
		menuBar.add(viewMenu);
		menuBar.add(selector); // selects the toolbar mode
		menuBar.add(helpMenu);
		
		//menuBar.add(scrollMenu);
		//menuBar.add(insertMenu);
		//menuBar.add(formatMenu);
		
		//menuBar.add(basicMenu);
		//menuBar.add(assetsMenu);
		//menuBar.add(componentsMenu);
		//menuBar.add(animationMenu);

		/*****************UNDERBAR*********************/
/*
		JMenuBar underBar = new JMenuBar();

		underBar.add(Extras);
		underBar.add(coreGraphics);
		underBar.add(coreAI);
		underBar.add(Extended);
		underBar.add(insertMenu);
		underBar.add(advancedMenu);
		underBar.add(Extras);
	*/	
		JMenuItem temp = new JMenuItem();
	



		


	

		
//		
//		underBar.add(physicsMenu);


		

		

		//create UI
		//1. Create the frame.
		//JFrame frame = new JFrame("FrameDemo");
		//frame.add(fxPanel);
  

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("NECRO-TEK 3D WORLD EDITOR"); 
		frame.setSize(300,250);
		//This will center the JFrame in the middle of the screen 
		frame.setLocationRelativeTo(null);


		//Container pane = frame.getContentPane();

		JPanel u = new JPanel();


		/***************ICON BAR***************/

		IconBar ic = new IconBar();
		JPanel bottomMenu = ic.init();

		//topMenu.add(mainDropDown);

		/*********LEFT, RIGHT, MAIN SCREEN AND BOTTOM PANELS************/

		mainScreen.setBorder(BorderFactory.createLineBorder(Color.white));
		mainScreen.setLayout(new FlowLayout());
		mainScreen.setBackground(Color.black);

		mainScreen.add(bordermainscreen, BorderLayout.CENTER);
		
		mainScreen.add(menuBar);
		///bottom isn't menuText.Showing up corretly
		//mainScreen.add(bottomMenu, BorderLayout.NORTH);
		//mainScreen.add(underBar);


		JPanel left = new JPanel();
		left.setBorder(BorderFactory.createLineBorder(Color.white));
		left.setLayout(new FlowLayout());
		left.setBackground(Color.black);
		JPanel right = new JPanel();
		right.setBorder(BorderFactory.createLineBorder(Color.white));
		right.setBackground(Color.black);
		right.setLayout(new FlowLayout());
		JSplitPane leftSplitPanel = new JSplitPane();
		
		JPanel bottom = new JPanel();
		bottom.setBorder(BorderFactory.createLineBorder(Color.white));
		bottom.setBackground(Color.black);





		mainScreen.setPreferredSize(new Dimension(1000,1000));
		left.setPreferredSize(new Dimension(200, 700));
		right.setPreferredSize(new Dimension(200, 700));
		bottom.setPreferredSize(new Dimension(1000, 300));

		/*************SCENE GRAPH WINDOW/PANEL**************/

		JPanel leftPane = new JPanel();
		JPanel sgPane = new JPanel();
		JLabel sglabel = new JLabel("Scene Graph");

		JPanel leftMiddlePane = new JPanel();
		JLabel lmplabel = new JLabel("Add Services");
		
		ImageIcon icon = createImageIcon("/tree2.png",
				"a pretty but meaningless splat");

		JLabel treeIcon = new JLabel(icon);
		treeIcon.setSize(new Dimension(5,5));


		sglabel.setForeground(Color.WHITE);
		sglabel.setBackground(Color.BLACK);
		left.setBackground(Color.black);
		sgPane.add(treeIcon, BorderLayout.PAGE_START);
		sgPane.add(sglabel, BorderLayout.PAGE_START);
		sgPane.setToolTipText("A hiearchy of objects in the current scene");
		sgPane.setBackground(Color.BLACK);
		sgPane.setForeground(Color.WHITE);






		//leftPane.add(tree, BorderLayout.PAGE_START);
		JPanel treePane = new JPanel();
		treePane.add(tree, BorderLayout.NORTH);
		treePane.setBackground(Color.black);
		treePane.setForeground(Color.white);

		JScrollPane scrollPane = new JScrollPane(treePane);
		scrollPane.createVerticalScrollBar();
		scrollPane.createHorizontalScrollBar();
		scrollPane.setPreferredSize(new Dimension(200, 400));

		leftPane.add(scrollPane, BorderLayout.PAGE_START);
		leftPane.setMinimumSize(new Dimension(200, 400));

		//add(treePane, BorderLayout.CENTER);


		leftMiddlePane.add(lmplabel);
		leftMiddlePane.setSize(new Dimension(200,400));
		
		
		left.add(leftMiddlePane, BorderLayout.NORTH);
		
		
		leftPane.setBackground(Color.BLACK);
		leftPane.setForeground(Color.WHITE);
		leftPane.setBorder(BorderFactory.createLineBorder(Color.white));
		left.add(sgPane, BorderLayout.NORTH);
		
		left.add(leftPane, BorderLayout.NORTH);

		/*****************INSPECTOR WINDOW*************/

		ImageIcon inspectoricon = createImageIcon("/inspector.png",
				"a pretty but meaningless splat");


		JLabel inspector = new JLabel(inspectoricon);

		inspector.setForeground(Color.WHITE);
		inspector.setBackground(Color.BLACK);

		inspector.setToolTipText("Enter settings and add attachments");

		//inspector.setIcon(inspectoricon);
		JLabel topinspector = new JLabel("Inspector");
		topinspector.setForeground(Color.white);
		topinspector.setBackground(Color.BLACK);

		right.add(inspector,  new FlowLayout(FlowLayout.LEFT));
		right.add(topinspector, new FlowLayout(FlowLayout.RIGHT));


		//mainScreen.add(bottomMenu, BorderLayout.SOUTH);

		bottomMenu.setLayout(new FlowLayout());

		JPanel consolePanel = new JPanel();
		JPanel consoleButtons = new JPanel();

		JPanel consoleTabbedPanel = new JPanel();
		consoleTabbedPanel.setFont(new Font("Arial", Font.BOLD, 10));
		JPanel resourcesTabbedPanel = new JPanel();
		resourcesTabbedPanel.setFont(new Font("Arial", Font.BOLD, 10));
		JPanel problemsTabbedPanel = new JPanel();
		problemsTabbedPanel.setFont(new Font("Arial", Font.BOLD, 10));
		JPanel loggingTabbedPanel = new JPanel();
		loggingTabbedPanel.setFont(new Font("Arial", Font.BOLD, 10));
		JPanel debuggingTabbedPanel = new JPanel();
		debuggingTabbedPanel.setFont(new Font("Arial", Font.BOLD, 10));
		//consoleButtons.add(new JButton("Console"), BorderLayout.PAGE_START);

		//consoleButtons.add(new JButton("Resources"), BorderLayout.PAGE_START);
		//consoleButtons.add(new JButton("Problems"), BorderLayout.PAGE_START);
		//consoleButtons.add(new JButton("Logging"), BorderLayout.PAGE_START);
		consoleButtons.setBackground(Color.black);
		consoleButtons.setForeground(Color.white);

		JTextArea textArea = new JTextArea("Ready>");
		JScrollPane scrollArea = new JScrollPane(textArea); 
		textArea.setEditable(false);
		scrollArea.setPreferredSize(new Dimension(800, 175));

		//console.add(scrollArea, BorderLayout.PAGE_START);

		consoleTabbedPanel.add(scrollArea);

		JTabbedPane tabbedPane = new JTabbedPane();

		tabbedPane.addTab("Console", consoleTabbedPanel);
		tabbedPane.addTab("Resources", resourcesTabbedPanel);
		tabbedPane.addTab("Problems", problemsTabbedPanel);
		tabbedPane.addTab("Debug" , debuggingTabbedPanel);
		tabbedPane.addTab("Logging", loggingTabbedPanel);


//		ImageIcon necro = createImageIcon("/necrodude.png",
//				"a pretty but meaningless splat");
//
//		JLabel necroIcon = new JLabel(necro);
//		necroIcon.setBounds(0,0,10,10);
//
//		bottom.add(necroIcon, BorderLayout.WEST);
//		
		//ImageIcon necro = createBufferedImageIcon("/necrodude.png", "A damn tree", 60, 60, 0, 0);
		
		//JLabel necroIcon = new JLabel(necro);
		//necroIcon.setBounds(0, 0, 10, 10);
		
		//bottom.add(necroIcon, BorderLayout.WEST);
		
		bottom.add(tabbedPane, BorderLayout.CENTER);
		//bottom.add(consoleButtons, BorderLayout.LINE_START);
		//bottom.add(scrollArea,  BorderLayout.LINE_END);

		
		JToolBar toolbar = tb.init(this.frame);
		
		right.add(toolbar, BorderLayout.SOUTH);

		mainScreen.add(bottomMenu);

		
		/***************DRAGGABLE TOOLBAR ***************/
		
		//JPanel toolbarOnePanel = new JPanel();
		//addButtons(toolBarOnePanel);
		
        //toolbarOnePanel.setPreferredSize(new Dimension(450, 130));
		

		ActionListener  closeSelectorOne = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//bordermainscreen.remove(toolBar);
				bordermainscreen.remove(toolBar);
				mainScreen.remove(bordermainscreen);
				mainScreen.repaint();
			}
		};  
		
				
		ImageIcon closeTool = createImageIcon("/x-red.png",
				"a pretty but meaningless splat");
		JButton closeButton  = new JButton(closeTool);
		toolBar.add(closeButton);
		closeButton.setToolTipText("Close toolbar.");
		closeButton.addActionListener(closeSelectorOne);
		  


		
		
		ImageIcon pawnTool = createImageIcon("/pawn.png",
				"a pretty but meaningless splat");
		JButton pawnButton  = new JButton(pawnTool);
		toolBar.add(pawnButton);
		pawnButton.setToolTipText("Create a pawn");
		
		
		ImageIcon characterTool = createImageIcon("/character.png",
				"a pretty but meaningless splat");
		JButton characterButton  = new JButton(characterTool);
		toolBar.add(characterButton);
		characterButton.setToolTipText("Create a character");

		ImageIcon childTool = createImageIcon("/childActor.png",
				"a pretty but meaningless splat");
		JButton childButton  = new JButton(childTool);
		toolBar.add(childButton);
		characterButton.setToolTipText("Create a child character");

		ImageIcon emptyTool = createImageIcon("/emptyCharacter.png",
				"a pretty but meaningless splat");
		JButton emptyButton  = new JButton(emptyTool);
		toolBar.add(emptyButton);
		characterButton.setToolTipText("Create an emoty actor");


		ImageIcon solidTool = createImageIcon("/solidgeometry.png",
				"a pretty but meaningless splat");
		JButton solidButton  = new JButton(solidTool);
		toolBar.add(solidButton);
		solidButton.setToolTipText("Solid Modeling Grammar");
		
		
		
		ImageIcon lightTool = createImageIcon("/lightActor.png",
				"a pretty but meaningless splat");
		JButton lightButton  = new JButton(lightTool);
		toolBar.add(lightButton);
		characterButton.setToolTipText("Create a point light");
		
		ImageIcon lightmassTool = createImageIcon("/lightMass.png",
				"a pretty but meaningless splat");
		JButton lightmassButton  = new JButton(lightmassTool);
		toolBar.add(lightmassButton);
		characterButton.setToolTipText("Light Mass");
				
		ImageIcon lightimportanceTool = createImageIcon("/lightmassimportance.png",
				"a pretty but meaningless splat");
		JButton lightimportanceButton  = new JButton(lightimportanceTool);
		toolBar.add(lightimportanceButton);
		lightimportanceButton.setToolTipText("Light Mass Importance");
		
		toolBar.setBackground(Color.BLACK);
		toolBar.setForeground(Color.WHITE);
		toolBar.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		bordermainscreen.add(toolBar, BorderLayout.CENTER);
		mainScreen.add(bordermainscreen, BorderLayout.CENTER);
		
		//bordermainscreen.remove(toolBar);
        //mainScreen.add(toolBar, BorderLayout.PAGE_START);
        //mainScreen.add(toolBar, new FlowLayout());
		//toolBar.setPreferredSize(new Dimension(600, 40));
        //mainScreen.add(toolbarOnePanel);
        
    
       
    
		
		/********************POPUPMENU***************/
		//PopupActionListener popupListener = new PopupActionListener();
		
	    EditMenu EditS = new EditMenu();
	    JMenu editMenu = EditS.init();
	    

	    /****************FRAME STUFF************/
	
		/**********************/

		frame.setBounds(0, 0, 640, 480);
		frame.setPreferredSize(new Dimension(1200,800));
		frame.setResizable(false);
		frame.setVisible( true );



		mainScreen.setLayout(new FlowLayout());
		left.setLayout(new FlowLayout());
		right.setLayout(new FlowLayout());
		bottom.setLayout(new FlowLayout());

		JPanel toolPanel = new JPanel();
 		toolPanel.setLayout(new FlowLayout());
 		toolPanel.add(toolbar);


 		JPanel rightsidePanel = new JPanel();
 		rightsidePanel.add(right);
 		rightsidePanel.add(toolPanel);

 		
		
        /**************DIALOGUES*************/

						frame.getContentPane().addMouseListener(
			         new MouseAdapter() {
			            public void mousePressed( MouseEvent e )
			               { checkForTriggerEvent( e ); } 
			 
			            public void mouseReleased( MouseEvent e )
			               { checkForTriggerEvent( e ); } 
			 
			            private void checkForTriggerEvent( MouseEvent e )
			            {
			               if ( e.isPopupTrigger() ) 
			            	   popupMenu.show( e.getComponent(),
			                                  e.getX(), e.getY() );               
			            }
			         }
			      );    
						//GLProfile glprofile = GLProfile.getDefault();
						//GLCapabilities glcapabilities = new GLCapabilities( glprofile );
						//final GLCanvas glcanvas = new GLCanvas( glcapabilities );
						//glcanvas.setMinimumSize(new Dimension(100,100));
						//glcanvas.setMaximumSize(new Dimension(100,100));
						// int z = 300;
						// int h = 300;

						// frame.getContentPane().add(glcanvas);
						
						/*************OPENGL STUFF******************/

						frame.getContentPane().add(glcanvas);
						
						
						/*****************************************/
						
			
						
						frame.add(mainScreen, BorderLayout.CENTER);
						frame.add(left, BorderLayout.LINE_START);
						frame.add(rightsidePanel, BorderLayout.LINE_END);
						frame.add(bottom, BorderLayout.PAGE_END);
						
						//leftSplitPanel.add((bottom), BorderLayout.PAGE_END);
						///leftSplitPanel.add(mainScreen, BorderLayout.LINE_START);
						//leftSplitPanel.setOrientation(JSplitPane.VERTICAL_SPLIT );
						//frame.add(leftSplitPanel, BorderLayout.PAGE_END);
						
						//frame.setBackground(Color.RED);
						frame.setBackground(Color.black);
						
						frame.setSize(frame.getContentPane().getPreferredSize());
						frame.setTitle("Necro-Tek 3D World Editor");
						

	

						frame.pack();

						//5. menuText.Show it.
						frame.setVisible(true);
						//glcanvas.requestFocus();
						//System.out.println("Frame Set Visible");
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


	

		//============================================//
			public void centerWindow(JFrame frame) {
				Dimension screenSize =
						Toolkit.getDefaultToolkit().getScreenSize();
				Dimension frameSize = frame.getSize();
				if (frameSize.width > screenSize.width )
					frameSize.width = screenSize.width;	
				if (frameSize.height > screenSize.height)
					frameSize.height = screenSize.height;
				frame.setLocation (
						(screenSize.width - frameSize.width ) >> 1,
						(screenSize.height - frameSize.height) >> 1
						);
			}

			//===========================================//
					//scene graph demo

		
			private void createNodes(DefaultMutableTreeNode top) {
				DefaultMutableTreeNode category = null;
				DefaultMutableTreeNode book = null;


				DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root Node");

				DefaultMutableTreeNode itemone = new DefaultMutableTreeNode("Root");
				DefaultMutableTreeNode itemtwo = new DefaultMutableTreeNode("Ambient Light");
				DefaultMutableTreeNode itemthree = new DefaultMutableTreeNode("Fractal Terrain");
				DefaultMutableTreeNode itemfour = new DefaultMutableTreeNode("Procedural Story");
				DefaultMutableTreeNode itemfive = new DefaultMutableTreeNode("World");
				DefaultMutableTreeNode itemsix = new DefaultMutableTreeNode("Skybox");
				DefaultMutableTreeNode itemseven = new DefaultMutableTreeNode("HeightMap");
				DefaultMutableTreeNode itemeight = new DefaultMutableTreeNode("Procedural Terrain Texturing");
				DefaultMutableTreeNode itemnine = new DefaultMutableTreeNode("Hexagrams");
				DefaultMutableTreeNode itemten= new DefaultMutableTreeNode("Sectors");
				DefaultMutableTreeNode itemeleven = new DefaultMutableTreeNode("Portals");
				DefaultMutableTreeNode itemtwelve = new DefaultMutableTreeNode("Dynamic BSP");
				DefaultMutableTreeNode itemthirteen = new DefaultMutableTreeNode("Player Character");
				DefaultMutableTreeNode itemfourteen = new DefaultMutableTreeNode("Camera");
				DefaultMutableTreeNode itemfifteen = new DefaultMutableTreeNode("Torso Mesh");
				DefaultMutableTreeNode itemsixteen = new DefaultMutableTreeNode("Head Joint");
				DefaultMutableTreeNode itemseventeen = new DefaultMutableTreeNode("Head Mesh");
				DefaultMutableTreeNode itemeighteen = new DefaultMutableTreeNode("Arm Joint Left");
				DefaultMutableTreeNode itemnineteen = new DefaultMutableTreeNode("Arm");
				DefaultMutableTreeNode itemtwenty = new DefaultMutableTreeNode("Arm Joint Right");
				DefaultMutableTreeNode itemtwentyone = new DefaultMutableTreeNode("Arm");
				DefaultMutableTreeNode itemtwentytwo = new DefaultMutableTreeNode("Leg Joint Left");
				DefaultMutableTreeNode itemtwentythree = new DefaultMutableTreeNode("Leg Mesh");
				DefaultMutableTreeNode itemtwentyfour = new DefaultMutableTreeNode("Right Joint Leg");
				DefaultMutableTreeNode itemtwentyfive = new DefaultMutableTreeNode("Leg Mesh");
				DefaultMutableTreeNode itemtwentysix = new DefaultMutableTreeNode("Clothing Mesh");
				DefaultMutableTreeNode itemtwentyseven = new DefaultMutableTreeNode("Skin Texture");	
				DefaultMutableTreeNode itemtwentyeight = new DefaultMutableTreeNode("Create Deformable");
				DefaultMutableTreeNode itemtwentynine = new DefaultMutableTreeNode("Constructive Geometry");


				itemtwentyfour.add(itemtwentyfive);

				itemtwentytwo.add(itemtwentythree);

				itemtwenty.add(itemtwentyone);

				itemeighteen.add(itemnineteen);	

				itemsixteen.add(itemseventeen);



				itemthirteen.add(itemfourteen);
				itemthirteen.add(itemfifteen);
				itemthirteen.add(itemsixteen);



				itemfive.add(itemsix);
				itemfive.add(itemseven);
				itemfive.add(itemeight);
				itemfive.add(itemnine);
				itemfive.add(itemten);
				itemfive.add(itemeleven);
				itemfive.add(itemtwelve);
				itemfive.add(itemthirteen);

				itemfive.add(itemtwentysix);
				itemfive.add(itemtwentyseven);
				itemfive.add(itemtwentyeight);
				itemfive.add(itemtwentynine);



				root.add(itemone);
				root.add(itemtwo);
				root.add(itemthree);
				root.add(itemfour);
				root.add(itemfive);

				top.add(root);

			}

			public void TreeDemo() {

				DefaultMutableTreeNode top =
						new DefaultMutableTreeNode("Root Node");
				createNodes(top);
				tree = new JTree(top);

				JScrollPane treeView = new JScrollPane(tree);



			}







			public void PopupMenuExample() {
				ActionListener menuListener = new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						System.out.println("Popup menu item ["
								+ event.getActionCommand() + "] was pressed.");
					}
				};




				popupmenu.setBackground(Color.black);
				popupmenu.setForeground(Color.white);
				popupmenu.setPreferredSize(new Dimension(40,100));
				popupmenu.add(new JMenuItem("----------"));

//				JMenu threeMenu = new JMenu("3D Primitives");
//				threeMenu.setFont(new Font("Arial", Font.BOLD, 10));
//				threeMenu.addActionListener(menuListener);
//
//
//				for (int i=0;i<menuText.basicPrimitives.length;i++)
//				{
//					JMenuItem tmp = new JMenuItem(menuText.basicPrimitives[i]);
//					tmp.setFont(new Font("Arial", Font.BOLD, 10));
//					tmp.addActionListener(menuListener);
//					threeMenu.add(tmp);
//
//
//				}
//
//
//
//
//
//				popupmenu.add(threeMenu);
//
//				JMenu twodee = new JMenu("2D Primitives");
//				twodee.addActionListener(menuListener);
//				JMenuItem circle = new JMenuItem("Circle");
//				circle.addActionListener(menuListener);
//				circle.setFont(new Font("Arial", Font.BOLD, 10));
//
//				JMenuItem square = new JMenuItem("Square");
//				square.addActionListener(menuListener);
//				square.setFont(new Font("Arial", Font.BOLD, 10));
//
//				JMenuItem rectangle = new JMenuItem("Rectangle");
//				rectangle.addActionListener(menuListener);
//				rectangle.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem trapezoid = new JMenuItem("Trapezoid");
//				trapezoid.addActionListener(menuListener);
//				trapezoid.setFont(new Font("Arial", Font.BOLD, 10));
//
//				JMenuItem parallelogram = new JMenuItem("Parallelogram");
//				parallelogram.addActionListener(menuListener);
//				parallelogram.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem triangle = new JMenuItem("Triangle");
//				triangle.addActionListener(menuListener);
//				triangle.setFont(new Font("Arial", Font.BOLD, 10));
//				twodee.addActionListener(menuListener);
//				popupmenu.add(twodee, BorderLayout.NORTH);
//
//
//				JMenu lights = new JMenu("Lights");
//				lights.addActionListener(menuListener);
//				lights.setFont(new Font("Arial", Font.BOLD, 10));
//				for (int i=0;i<menuText.basicLighting.length; i++)
//				{
//					JMenuItem term = new JMenuItem(menuText.basicLighting[i]);
//					term.setFont(new Font("Arial", Font.BOLD, 10));
//					term.addActionListener(menuListener);
//					lights.add(term);
//				}
//
//				popupmenu.add(lights);
//
//				JMenu uis = new JMenu("User Interface");
//				uis.addActionListener(menuListener);
//				uis.setFont(new Font("Arial", Font.BOLD, 10));
//
//
//
//				for (int i=0; i<menuText.basicUI.length;i++)
//				{
//
//					JMenuItem term = new JMenuItem(menuText.basicUI[i]);
//					term.setFont(new Font("Arial", Font.BOLD, 10));
//					term.addActionListener(menuListener);
//					uis.add(term);
//
//				}
//
//				popupmenu.add(uis);
//
//				JMenuItem partsystem = new JMenuItem("Particle System");
//				partsystem.setFont(new Font("Arial", Font.BOLD, 10));
//				partsystem.addActionListener(menuListener);
//
//				JMenuItem camerasys = new JMenuItem("Camera Controls");
//				camerasys.setFont(new Font("Arial", Font.BOLD, 10));
//				camerasys.addActionListener(menuListener);
//
//				JMenuItem findbrowser = new JMenuItem("Find in content browser");
//				findbrowser.setFont(new Font("Arial", Font.BOLD, 10));
//				findbrowser.addActionListener(menuListener);
//
//				JMenuItem editobject = new JMenuItem("Edit Object");
//				editobject.setFont(new Font("Arial", Font.BOLD, 10));
//				editobject.addActionListener(menuListener);
//
//				JMenuItem addAttachment = new JMenuItem("Add Attachment");
//				addAttachment.setFont(new Font("Arial", Font.BOLD, 10));
//				addAttachment.addActionListener(menuListener);
//				JMenuItem focusonselected = new JMenuItem("Focus on Selected");
//
//				focusonselected.setFont(new Font("Arial", Font.BOLD, 10));
//				focusonselected.addActionListener(menuListener);
//
//				popupmenu.add(partsystem);
//				popupmenu.add(camerasys);
//				popupmenu.add(findbrowser);
//				popupmenu.add(editobject);
//				popupmenu.add(addAttachment);
//				popupmenu.add(focusonselected);
//
//
//
//				JMenu select = new JMenu("Select");
//				select.addActionListener(menuListener);
//				select.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem selectitem = new JMenuItem("Select");
//				selectitem.addActionListener(menuListener);
//				selectitem.setFont(new Font("Arial", Font.BOLD, 10));
//
//				JMenuItem selectall = new JMenuItem("Select All");
//				selectall.setFont(new Font("Arial", Font.BOLD, 10));
//				selectall.addActionListener(menuListener);
//				JMenuItem invertselect = new JMenuItem("Invert Selection");
//				invertselect.addActionListener(menuListener);
//				invertselect.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem selectallactors = new JMenuItem("Selet all actor meshes");
//				selectallactors.addActionListener(menuListener);
//				selectallactors.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem additivebrushes = new JMenuItem("Additive Brushes");
//				additivebrushes.addActionListener(menuListener);
//				additivebrushes.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem subtractivebrushes = new JMenuItem("Subtractive Brushes");
//				subtractivebrushes.addActionListener(menuListener);
//				subtractivebrushes.setFont(new Font("Arial", Font.BOLD, 10));
//
//				JMenuItem selectallsurfaces = new JMenuItem("Select all surfaces");
//				selectallsurfaces.addActionListener(menuListener);
//				selectallsurfaces.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem selectrelevantlights = new JMenuItem("Select all relevant lights");
//				selectrelevantlights.addActionListener(menuListener);
//				selectrelevantlights.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem selectallwithmaterial = new JMenuItem("Select all with same material");
//				selectallwithmaterial.setFont(new Font("Arial", Font.BOLD, 10));
//				selectallwithmaterial.addActionListener(menuListener);
//
//				select.add(selectitem);
//				select.add(selectall);
//				select.add(invertselect);
//				select.add(selectallactors);
//				select.add(additivebrushes);
//				select.add(subtractivebrushes);
//				select.add(selectallsurfaces);
//				select.add(selectrelevantlights);
//				select.add(selectallwithmaterial);
//
//				popupmenu.add(select);
//
//
//
//				JMenu visibility = new JMenu("Visibility");
//				visibility.addActionListener(menuListener);
//				visibility.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem hideselected = new JMenuItem("Hide Selected");
//				hideselected.addActionListener(menuListener);
//				hideselected.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem Showonlyselected = new JMenuItem("menuText.Show Only Selected");
//				Showonlyselected.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem allactors = new JMenuItem("menuText.Show All Actors");
//				allactors.addActionListener(menuListener);
//				allactors.setFont(new Font("Arial", Font.BOLD, 10));
//
//				JMenuItem allstartup = new JMenuItem("menuText.Show ALL at Startup");
//				allstartup.addActionListener(menuListener);
//				allstartup.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem Showselected = new JMenuItem("menuText.Show Selected at Startup");
//				Showselected.addActionListener(menuListener);
//				Showselected.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem hideselectedstartup = new JMenuItem("Hide Selected at Startup");
//				hideselectedstartup.addActionListener(menuListener);
//				hideselectedstartup.setFont(new Font("Arial", Font.BOLD, 10));
//
//				visibility.add(hideselected);
//				visibility.add(Showonlyselected);
//				visibility.add(allactors);
//				visibility.add(allstartup);
//				visibility.add(hideselectedstartup);
//
//
//				popupmenu.add(visibility);
//
//				JMenu placeActorMenu = new JMenu("Place Actor");
//				placeActorMenu.addActionListener(menuListener);
//				placeActorMenu.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem directionallight = new JMenuItem("Directional Light");
//				directionallight.addActionListener(menuListener);
//				directionallight.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem spotlight = new JMenuItem("Spot Light");
//				spotlight.addActionListener(menuListener);
//				spotlight.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem pointlight = new JMenuItem("Point Light");
//				pointlight.addActionListener(menuListener);
//				pointlight.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem playeractor = new JMenuItem("Player Actor");
//				playeractor.addActionListener(menuListener);
//				playeractor.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem camerastart = new JMenuItem("Camera Start");
//				camerastart.addActionListener(menuListener);
//				camerastart.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem blockingvolume = new JMenuItem("Blocking Volume");
//				blockingvolume.addActionListener(menuListener);
//				blockingvolume.setFont(new Font("Arial", Font.BOLD, 10));
//				JMenuItem trigger = new JMenuItem("Trigger");
//				trigger.addActionListener(menuListener);
//				trigger.setFont(new Font("Arial", Font.BOLD, 10));
//
//
//				JMenu replaceActors = new JMenu("Replace Selected Actors");
//				replaceActors.addActionListener(menuListener);
//				replaceActors.add(directionallight);
//				replaceActors.add(spotlight);
//				replaceActors.add(pointlight);
//				replaceActors.add(playeractor);
//				replaceActors.add(camerastart);
//				replaceActors.add(blockingvolume);
//				replaceActors.add(trigger);
//
//				popupmenu.add(replaceActors);



				/**************/
				//	
				//	);
				//	item.setHorizontalTextPosition(JMenuItem.RIGHT);
				//	item.addActionListener(menuListener);
				//	popup.add(item = new JMenuItem("Center", new ImageIcon("2.gif")));
				//	item.setHorizontalTextPosition(JMenuItem.RIGHT);
				//	item.addActionListener(menuListener);
				//	popup.add(item = new JMenuItem("Right", new ImageIcon("3.gif")));
				//	item.setHorizontalTextPosition(JMenuItem.RIGHT);
				//	item.addActionListener(menuListener);
				//	popup.add(item = new JMenuItem("Full", new ImageIcon("4.gif")));
				//	item.setHorizontalTextPosition(JMenuItem.RIGHT);
				//	item.addActionListener(menuListener);
				//	popup.addSeparator();
				//	popup.add(item = new JMenuItem("Settings . . ."));
				//	item.addActionListener(menuListener);

				popupmenu.setLabel("Context");
				popupmenu.setBorder(new BevelBorder(BevelBorder.RAISED));
				popupmenu.addPopupMenuListener(new PopupPrintListener());

				frame.addMouseListener(new MousePopupListener());
				
				MainGameLoop.maingame();
			}
			

			
			/**************/
			// An inner class to check whether mouse events are the popup trigger
			class MousePopupListener extends MouseAdapter {
				public void mousePressed(MouseEvent e) {
					checkPopup(e);
				}

				public void mouseClicked(MouseEvent e) {
					checkPopup(e);
				}

				public void mouseReleased(MouseEvent e) {
					checkPopup(e);
				}

				private void checkPopup(MouseEvent e) {
					if (e.isPopupTrigger()) {
						popupmenu.show(popupmenu, e.getX(), e.getY());
					}
				}
			}


			// An inner class to menuText.Show when popup events occur
			class PopupPrintListener implements PopupMenuListener {
				public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
					System.out.println("Popup menu will be visible!");
				}

				public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
					System.out.println("Popup menu will be invisible!");
				}

				public void popupMenuCanceled(PopupMenuEvent e) {
					System.out.println("Popup menu is hidden!");
				}
			}

			class optionsMenuSelect implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					bordermainscreen.add(toolBar);
					mainScreen.add(bordermainscreen);
					mainScreen.repaint();
				}
				
			}
		
			
}

