package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FileMenu {

	
	public JMenu init()
	{
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setFont(new Font("Arial", Font.BOLD, 10));


		fileMenu.setToolTipText("Load and Save Projects and Scenes");

		JMenuItem temp = new JMenuItem("New File From Template");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Recover Lost Files");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Open Recent");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);


		temp = new JMenuItem("New Scene");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Open Scene");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);


		temp = new JMenuItem("Save Scene As...");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("New Project");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Open Project");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Save Projet");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Close Window");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Close All");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);


		temp = new JMenuItem("Save as Template");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Import");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);

		temp = new JMenuItem("Export");
		temp.setFont(new Font("Arial", Font.BOLD, 10));
		fileMenu.add(temp);
		
		return fileMenu;

	}
}
