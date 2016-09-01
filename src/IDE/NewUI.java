package IDE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class NewUI implements Runnable {
	
	public void initNewUI()
	{
		JFrame frame = new JFrame();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("NECRO-TEK 3D WORLD EDITOR"); 
		frame.setSize(300,250);
		//This will center the JFrame in the middle of the screen 
		frame.setLocationRelativeTo(null);
		
		frame.setBounds(0, 0, 640, 480);
		frame.setPreferredSize(new Dimension(1200,800));
		frame.setResizable(false);
		frame.setVisible( true );



		
		JPanel masterPanel = new JPanel();		
		
		
		JPanel textWindow = new JPanel();
		
		
		JScrollPane textWindowScroll = new JScrollPane();
	
		//popupMenu.setSize(200, 400);
		textWindowScroll.setBackground(Color.black);
		textWindowScroll.setForeground(Color.white);
		textWindowScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		textWindowScroll.add(textWindow);
		
		JPanel leftToolBar = new JPanel();
		
		JScrollPane leftToolScroll = new JScrollPane();

		leftToolScroll.setBackground(Color.black);
		leftToolScroll.setForeground(Color.white);
		leftToolScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		
		leftToolScroll.add(leftToolBar);
		
		JPanel sceneGraphTree = new JPanel();
		
		JScrollPane sceneGraphScroll = new JScrollPane();
		
		sceneGraphScroll.setBackground(Color.black);
		sceneGraphScroll.setForeground(Color.white);
		sceneGraphScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		sceneGraphScroll.add(sceneGraphTree);
		
		JPanel rightInspector = new JPanel();
		
		JScrollPane rightInspectorScroll = new JScrollPane();
		
		rightInspectorScroll.setBackground(Color.black);
		rightInspectorScroll.setForeground(Color.white);
		rightInspectorScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		rightInspectorScroll.add(rightInspector);
		
		JPanel rightFloatingToolbox = new JPanel();
		
		JScrollPane rightFloatingToolboxScroll = new JScrollPane();
		
		rightFloatingToolboxScroll.setBackground(Color.black);
		rightFloatingToolboxScroll.setForeground(Color.white);
		rightFloatingToolboxScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		rightFloatingToolboxScroll.add(rightFloatingToolbox);
		
		JPanel menu = new JPanel();
		
		JScrollPane menuScroll = new JScrollPane();
		
		menuScroll.add(menu);
		
		menuScroll.setBackground(Color.black);
		menuScroll.setForeground(Color.white);
		menuScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		JPanel viewportControls = new JPanel();
		
		JScrollPane viewportControlsScroll = new JScrollPane();
			
		viewportControlsScroll.setBackground(Color.black);
		viewportControlsScroll.setForeground(Color.white);
		viewportControlsScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		viewportControlsScroll.add(viewportControls);
		
		JPanel swappableToolbar = new JPanel();
		
		
		JScrollPane swapableToolbarScroll = new JScrollPane();
		
		swapableToolbarScroll.setBackground(Color.black);
		swapableToolbarScroll.setForeground(Color.white);
		swapableToolbarScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		swapableToolbarScroll.add(swappableToolbar);
		
		JPanel viewportScreen = new JPanel();
		
		JScrollPane viewportScreenScroll = new JScrollPane();
		
		viewportScreenScroll.add(viewportScreen);
		viewportScreenScroll.setBackground(Color.black);
		viewportScreenScroll.setForeground(Color.white);
		viewportScreenScroll.setBorder(BorderFactory.createLineBorder(Color.white));
	
		
		
		JSplitPane upperlowerLeftBarPanel = new JSplitPane();
		
		upperlowerLeftBarPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				sceneGraphScroll, leftToolScroll);
		
		JSplitPane upperlowerrightBarPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				rightInspectorScroll, rightFloatingToolboxScroll);
		
		JSplitPane leftbarPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				upperlowerLeftBarPanel, viewportScreenScroll);
		
		
		JSplitPane rightbarPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				upperlowerrightBarPanel, viewportScreenScroll);
		
		JSplitPane viewportPanelx = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				viewportScreen, textWindowScroll);
		
		masterPanel.add(leftbarPanel, BorderLayout.WEST);
		masterPanel.add(rightbarPanel, BorderLayout.EAST);
		masterPanel.add(viewportPanelx, BorderLayout.CENTER);
		
		frame.add(masterPanel);
		
		frame.setBackground(Color.black);
		
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setTitle("Necro-Tek 3D World Editor");
		



		frame.pack();

		//5. menuText.Show it.
		frame.setVisible(true);

		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
