package IDE;

import javax.swing.tree.DefaultMutableTreeNode;

public class SceneGraph {
	//scene graph
	DefaultMutableTreeNode root = new DefaultMutableTreeNode();
	DefaultMutableTreeNode bottom  = new DefaultMutableTreeNode();
	
	public void Update(SceneGraph scg)
	{
		descend(root);
	
	}

	
	public void descend(DefaultMutableTreeNode node)
	{
		while (node.children().hasMoreElements())
		{
			descend(node.getNextNode());
		}
	}
	
	
	public void Alive(DefaultMutableTreeNode node)
	{
		return;
	}
	
	public void add(Object obj)
	{
		DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("Box");
		root.add(newNode);
	}
}
