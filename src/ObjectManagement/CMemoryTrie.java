package ObjectManagement;

import java.util.Vector;




/* Under construction */

public class CMemoryTrie <T> {

	Vector<Object> objects = new Vector<Object>();
	
	public Object getNewLargeMemory() 
	{
		TrieNode child = new TrieNode();
		root.appendChild(child);
		return child;
	}
	
	class TrieNode 
		{	
			    
			    Object content() { return mContent; }
			    void setContent(Object c) { mContent = c; }
			    boolean wordMarker() { return mMarker; }
			    void setWordMarker() { mMarker = true; }
			    TrieNode findChild(Object c) 
			    {
			    	 for ( int i = 0; i < mChildren.size(); i++ )
			    	    {
			    	        TrieNode tmp = mChildren.get(i);
			    	        if ( tmp.content() == c )
			    	        {
			    	            return tmp;
			    	        }
			    	    }

			    	    return null;
			    }
			    void appendChild(TrieNode child) { mChildren.addElement(child); }
			    Vector<TrieNode> children() { return mChildren; }

			
			    private Object mContent;
			    private boolean mMarker;
			    private Vector<TrieNode> mChildren;
			};

			
			public CMemoryTrie() { root =  new TrieNode(); }
			public void addWord(Object s)
			{
			    TrieNode current = root;

			    if (objects.isEmpty())
			    {
			        current.setWordMarker(); // an empty word
			        return;
			    }
        
			    for ( int i = 0; i < objects.size(); i++ )
			    { 
			        TrieNode child = current.findChild(objects.elementAt(i));			        
			        if ( child != null )
			        {
			            current = child;
			        }
			        else
			        {
			            TrieNode tmp = new TrieNode();
			            tmp.setContent(objects.elementAt(i));
			            current.appendChild(tmp);
			            current = tmp;
			       }
			        if ( i == s.size - 1 )
			            current.setWordMarker();
			    }

			}
			public     boolean searchWord(Object object)
			{
				   TrieNode current = root;

				    while ( current != null )
				    {
				        for ( int i = 0; i < s.length(); i++ )
				        {
				            TrieNode tmp = current.findChild(object);
				            if ( tmp == null )
				                return false;
				            current = tmp;
				        }

				        if ( current.wordMarker() )
				            return true;
				        else
				            return false;
				    }

				    return false;

			}
			
			private    TrieNode root;

			

	}
	
	
