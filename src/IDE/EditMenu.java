package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu {

	
public JMenu init()
{
	JMenu EditMenu = new JMenu("Edit");



	EditMenu.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem cut = new JMenuItem("Cut");
	//cut.addActionListener(handler);
	cut.setFont(new Font("Arial", Font.BOLD, 10));

	JMenuItem copy = new JMenuItem("Copy");
	//copy.addActionListener(handler);
	copy.setFont(new Font("Arial", Font.BOLD, 10));


	JMenuItem paste = new JMenuItem("Paste");
	//paste.addActionListener(handler);
	paste.setFont(new Font("Arial", Font.BOLD, 10));

	JMenuItem pastehere = new JMenuItem("Paste Here");
	pastehere.setFont(new Font("Arial", Font.BOLD, 10));


	JMenuItem temp = new JMenuItem();
	temp = new JMenuItem("SVN Team");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	
	temp = new JMenuItem("CVS Team");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	
	EditMenu.addSeparator();
	

	
	
	temp = new JMenuItem("Scene Wizard...");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Duplicate");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Duplicate Linked");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Join");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	JMenu imagesettings = new JMenu ("Image Settings");
	imagesettings.setFont(new Font("Arial", Font.BOLD, 10));
	
	
	
	
	
	
	temp = new JMenuItem("Image Size");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	imagesettings.add(temp);

	temp = new JMenuItem("Canvas Size");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	imagesettings.add(temp);
	
	temp = new JMenuItem("Adjust Opacity");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	imagesettings.add(temp);


	EditMenu.add(imagesettings);

	JMenu rotateMenu = new JMenu("Rotate");
	rotateMenu.setFont(new Font("Arial", Font.BOLD, 10));

	temp = new JMenuItem("Rotate 180 degrees");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	rotateMenu.add(temp);

	temp = new JMenuItem("Rotate 90 degrees clockwise");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	rotateMenu.add(temp);

	temp = new JMenuItem("Rotate 90 degrees counterclockwise");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	rotateMenu.add(temp);
	
	temp = new JMenuItem("Flip Horizontally");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	rotateMenu.add(temp);

	temp = new JMenuItem("Flip Vertically");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	rotateMenu.add(temp);

	
	EditMenu.add(rotateMenu);


	temp = new JMenuItem("Crop");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Trim");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	


	JMenuItem rename = new JMenuItem("Rename");
	rename.setFont(new Font("Arial", Font.BOLD, 10));


	JMenuItem duplicate = new JMenuItem("Duplicate");
	duplicate.setFont(new Font("Arial", Font.BOLD, 10));


	JMenuItem delete = new JMenuItem("Delete");
	delete.setFont(new Font("Arial", Font.BOLD, 10));


	JMenuItem selectprefab = new JMenuItem("Select Prefab");
	selectprefab.setFont(new Font("Arial", Font.BOLD, 10));


	JMenuItem createempty = new JMenuItem("Create Empty");
	createempty.setFont(new Font("Arial", Font.BOLD, 10));

	EditMenu.add(cut);
	EditMenu.add(copy);
	EditMenu.add(paste);
	EditMenu.add(duplicate);
	EditMenu.add(delete);
	EditMenu.add(selectprefab);
	EditMenu.add(createempty);
	EditMenu.add(pastehere);
	EditMenu.add(rename);

	temp = new JMenuItem("Undo Typing");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Redo Typing");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Step Forward");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Step Backward");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Cut");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Copy");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Copy Merged");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	
	temp = new JMenuItem("Copy Visible");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Paste");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Paste Special...");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Duplicate");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Delete");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	JMenu selections = new JMenu("Selections");
	selections.setFont(new Font("Arial", Font.BOLD, 10));

	
	temp = new JMenuItem("Select All");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	selections.add(temp);

	temp = new JMenuItem("Deselect All");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	selections.add(temp);

	temp = new JMenuItem("Select");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	selections.add(temp);

	temp = new JMenuItem("Deselect");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	selections.add(temp);

	temp = new JMenuItem("Select by Color");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	selections.add(temp);

	EditMenu.add(selections);
	

	temp = new JMenuItem("Measure Distances and Angles");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	
	temp = new JMenuItem("Deform with Cage Tool");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	
	EditMenu.addSeparator();
	JMenu gitMEnu = new JMenu("Git Team");
	gitMEnu.setFont(new Font("Arial", Font.BOLD, 10));
	
	JMenuItem commit = new JMenuItem("Commit");
	commit.setFont(new Font("Arial", Font.BOLD, 10));
	
	
	JMenuItem commitandpush = new JMenuItem("Commit and Push");
	commitandpush.setFont(new Font("Arial", Font.BOLD, 10));
	
	gitMEnu.add(commit);
	gitMEnu.add(commitandpush);
	
	gitMEnu.addSeparator();
	
	JMenuItem pushToUpStream = new JMenuItem("Push Upstream");
	pushToUpStream.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem fetchFromUpStream = new JMenuItem("Fetch from Upstream");
	fetchFromUpStream.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem pushBranchMaster = new JMenuItem("Push Branch Master");
	pushBranchMaster.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem pull = new JMenuItem("Pull");
	pull.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem push = new JMenuItem("Push");
	push.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem switchbranches = new JMenuItem("Switch Branches");
	
	
	JMenuItem assumeunchanged = new JMenuItem("Assume Unchanged");
	assumeunchanged.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem dontassumeunchanged = new JMenuItem("Don't assume unchanged.");
	dontassumeunchanged.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem untracked = new JMenuItem("Untracked");
	untracked.setFont(new Font("Arial", Font.BOLD, 10));
	
	
	
	JMenuItem mergetool = new JMenuItem("Merge Tool");
	mergetool.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem Showlocalhistory = new JMenuItem("menuText.Show Local History");
	Showlocalhistory.setFont(new Font("Arial", Font.BOLD, 10));
	gitMEnu.addSeparator();
	
	JMenuItem createpatch = new JMenuItem("Create Patch");
	createpatch.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem applypatch = new JMenuItem("Apply Patch");
	applypatch.setFont(new Font("Arial", Font.BOLD, 10));
	
	
	JMenuItem addtoIndex = new JMenuItem("Add to Index");
	addtoIndex.setFont(new Font("Arial", Font.BOLD, 10));
	JMenuItem removefromIndex = new JMenuItem("Remove from index");
	removefromIndex.setFont(new Font("Arial", Font.BOLD, 10));
	
	JMenuItem ignore = new JMenuItem("Ignore");
	ignore.setFont(new Font("Arial", Font.BOLD, 10));
	
	
	gitMEnu.add(commit);
	gitMEnu.add(push);
	gitMEnu.add(commitandpush);
	gitMEnu.add(pull);
	gitMEnu.addSeparator();

	gitMEnu.add(pushToUpStream);
	gitMEnu.add(fetchFromUpStream);
	gitMEnu.add(pushBranchMaster);
	gitMEnu.addSeparator();

	gitMEnu.add(assumeunchanged);
	gitMEnu.add(dontassumeunchanged);
	gitMEnu.add(untracked);
	gitMEnu.add(mergetool);
	gitMEnu.add(Showlocalhistory);
	gitMEnu.addSeparator();

	gitMEnu.add(createpatch);
	gitMEnu.add(applypatch);
	gitMEnu.add(addtoIndex);
	gitMEnu.add(removefromIndex);
	gitMEnu.add(ignore);
	
	EditMenu.add(gitMEnu);
	


	JMenu setorigin = new JMenu("Set Origin");
	setorigin.setFont(new Font("Arial", Font.BOLD, 10));
	
	
	temp = new JMenuItem("Geometry to Origin");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	setorigin.add(temp);

	temp = new JMenuItem("Origin to Geometry");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	setorigin.add(temp);

	temp = new JMenuItem("Origin to 3D Cursor");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	setorigin.add(temp);

	temp = new JMenuItem("Origin to Center of Mass");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	setorigin.add(temp);

	EditMenu.add(setorigin);

	
	temp = new JMenuItem("Frame Selected");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Locked View Selected");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	
	temp = new JMenuItem("Play");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);
	temp = new JMenuItem("Pause");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Stop");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Network Emulation");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);

	temp = new JMenuItem("Snap Settings");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	EditMenu.add(temp);



	JMenu menuProjectSettings = new JMenu("Project Settings");
	menuProjectSettings.setFont(new Font("Arial", Font.BOLD, 10));

	temp = new JMenuItem("Input");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Tags and Layers");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Audio");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Time");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Layers");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);


	temp = new JMenuItem("Physics");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Physics2D");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Quality");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Graphics");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Network");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Editor");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Script Exectioni Order");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);

	temp = new JMenuItem("Input");
	temp.setFont(new Font("Arial", Font.BOLD, 10));
	menuProjectSettings.add(temp);



	EditMenu.add(menuProjectSettings);

	
	
	return EditMenu;

}
	
}
