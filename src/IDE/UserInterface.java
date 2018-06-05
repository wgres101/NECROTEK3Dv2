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


import Listeners.BasicMenuListener;
import SceneGraph.SceneGraphNode;

public class UserInterface  extends Thread {
	private JTree tree;
	JPopupMenu popupmenu;
	JFrame frame = new JFrame("NecroTEK 3D Game Graphics Engine");
	public final static Canvas glcanvas = new Canvas();
	
	MenuText menuText = new MenuText();
	
	public static 	JPanel mainScreen = new JPanel();
	static 	JPanel bordermainscreen = new JPanel();
	static Toolbar tb = new Toolbar();
	static JToolBar toolBar = new JToolBar("Actor Panel"); //actor floating selector
	
	public void initUI()
	{
		run();
	}
	
	public void run()
	{
			TreeDemo();
			System.out.println("UI");
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
			
			

			
			JMenu miscellaneousMenu = new JMenu("Miscellaneous");
			
			miscellaneousMenu.setFont(new Font("Arial", Font.BOLD, 10));
			
			menuBar.add(fileMenu);
			menuBar.add(EditMenu);
			menuBar.add(viewMenu);
			menuBar.add(selector); // selects the toolbar mode
			menuBar.add(miscellaneousMenu);
			menuBar.add(helpMenu);
		
			
			JMenuItem temp = new JMenuItem();
		
			//2. Optional: What happens when the frame closes?
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("NECRO-TEK 3D WORLD EDITOR"); 
			frame.setSize(800,600);
			//This will center the JFrame in the middle of the screen 
			frame.setLocationRelativeTo(null);

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





			mainScreen.setPreferredSize(new Dimension(2000,2000));
			left.setPreferredSize(new Dimension(400, 700));
			right.setPreferredSize(new Dimension(400, 700));
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


			System.out.println("SGNPANE");

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

			
			bottom.add(tabbedPane, BorderLayout.CENTER);

			
			JToolBar toolbar = tb.init(this.frame);
			
			right.add(toolbar, BorderLayout.SOUTH);

			mainScreen.add(bottomMenu);

			
			System.out.println("SGBDRAGGABLE");
			
			/***************DRAGGABLE TOOLBAR ***************/
		
	}
		
		
	public void backuprun()
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
		
		

		
		JMenu miscellaneousMenu = new JMenu("Miscellaneous");
		
		miscellaneousMenu.setFont(new Font("Arial", Font.BOLD, 10));
		
		menuBar.add(fileMenu);
		menuBar.add(EditMenu);
		menuBar.add(viewMenu);
		menuBar.add(selector); // selects the toolbar mode
		menuBar.add(miscellaneousMenu);
		menuBar.add(helpMenu);
	
		
		JMenuItem temp = new JMenuItem();
	
		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("NECRO-TEK 3D WORLD EDITOR"); 
		frame.setSize(800,600);
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





		mainScreen.setPreferredSize(new Dimension(2000,2000));
		left.setPreferredSize(new Dimension(400, 700));
		right.setPreferredSize(new Dimension(400, 700));
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


		System.out.println("SGNPANE");



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

		
		bottom.add(tabbedPane, BorderLayout.CENTER);

		
		JToolBar toolbar = tb.init(this.frame);
		
		right.add(toolbar, BorderLayout.SOUTH);

		mainScreen.add(bottomMenu);

		
		System.out.println("SGBDRAGGABLE");
		
		/***************DRAGGABLE TOOLBAR ***************/
		

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
		
        
    
       System.out.println("POPUP MENU ");
    
		
		/********************POPUPMENU***************/
		//PopupActionListener popupListener = new PopupActionListener();
		
	    EditMenu EditS = new EditMenu();
	    JMenu editMenu = EditS.init();
	    

	    /****************FRAME STUFF************/
	
		/**********************/

	    
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    double width = screenSize.getWidth();
	    double height = screenSize.getHeight();

	    frame.setBounds(0, 0, (int)width, (int)height);
		frame.setPreferredSize(new Dimension((int)width,(int)height));
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

 		System.out.println("SGNFRAMESTUFF");
		
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
						
						/*************OPENGL STUFF******************/

						frame.getContentPane().add(glcanvas);
						
						
						/*****************************************/
						
			
						
						frame.add(mainScreen, BorderLayout.CENTER);
						frame.add(left, BorderLayout.LINE_START);
						frame.add(rightsidePanel, BorderLayout.LINE_END);
						frame.add(bottom, BorderLayout.PAGE_END);
						
						frame.setBackground(Color.black);
						
						frame.setSize(frame.getContentPane().getPreferredSize());
						frame.setTitle("Necro-Tek 3D World Editor");
						

	

						frame.pack();

						//5. menuText.Show it.
						frame.setVisible(true);
						//glcanvas.requestFocus();
						//System.out.println("Frame Set Visible");
						System.out.println("Built UI");
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

		
			private void createNodeGraph(DefaultMutableTreeNode top) {
				
				DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root Node");
				
				createNode(MainMerged.sceneGraph.root, root);
				top.add(root);
				
			}
			
			private void createNode(SceneGraphNode parent, DefaultMutableTreeNode mutable)
			{
				
				for (SceneGraphNode child : parent.children)
				{
					if (child != null && child.xmlData != null ) { createNode(child, mutable);
					DefaultMutableTreeNode item = new DefaultMutableTreeNode(child.xmlData.getName());
					mutable.add((item));
					}
					///createNodeRecursive( parent,  mutable);
					
				}
			
			}
			
			private void createNodeRecursive(SceneGraphNode parent, DefaultMutableTreeNode mutable)
			{
				for (SceneGraphNode child : parent.children)
				{
					createNode(child, mutable);
					DefaultMutableTreeNode item = new DefaultMutableTreeNode(child.xmlData.getName());
					mutable.add(item);
					createNodeRecursive(child, mutable);
				}
			}
			
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
						new DefaultMutableTreeNode("Scene Graph");
				///createNodes(top);
				createNodeGraph(top);
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

				popupmenu.setLabel("Context");
				popupmenu.setBorder(new BevelBorder(BevelBorder.RAISED));
				popupmenu.addPopupMenuListener(new PopupPrintListener());

				frame.addMouseListener(new MousePopupListener());
				
				//MainGameLoop.maingame();
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

