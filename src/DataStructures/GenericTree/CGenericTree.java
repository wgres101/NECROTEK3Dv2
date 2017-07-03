package DataStructures.GenericTree;

public class CGenericTree {
/*
	
	public void insert_subtree(TreeT child, TreeT next);
	public void remove_subtree(TreeT child);
	
	public void push_back(TreeT subtree);
	public void push_front(TreeT subtree);
	public void pop_back():
	public void pop_front();
	public void clear();
	
	
	
	
	class GTreeNode<T>
	{
		T value;
		GTreeNode parent; // NULL for root
		GTreeNode prev_sibling; //previous sibling
		GTreeNode next_sibling; //next in pre-order
		GTreeNode last_descendent; //leaf points to itself
		
		public GTreeNode prev()
		{
			GTreeNode prev = null;
			if (parent != null)
			{
				if (parent.next_sibling == this)
				{
					prev = this;
				}
				else
					prev = prev_sibling.last_descendent;
				
			}
			return prev;
		}
		
		public GTreeNode first_child()
		{
			GTreeNode child = null;
			if (next_sibling && (next_sibling.parent) == this)
			{
				child = next_sibling;
			}
			return child;
		}
		
		public GTreeNode last_child()
		{
			GTreeNode child = first_child();
			if (child != null )
			{
				child = child.prev_sibling;
				
			}
			return child;
			
		
		}
	
		public GTreeNode next_sibling()
		{
			GTreeNode sib = last_descendent.next_sibling;
			if (sib && (sib.parent != parent))
			{
				sib = null;
			}
			
			return sib;
			
			
		}

		
		public GTreeNode prev_sibling()
		{
			GTreeNode sib = null;
			if (parent && (parent.next_sibling != this))
			{
				sib = prev_sibling;
			}
			return sib;
			
		}
	}
	
	
	 */
}
