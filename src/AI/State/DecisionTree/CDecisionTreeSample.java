package AI.State.DecisionTree;

//Book 5

import javax.swing.tree.TreeNode;

public class CDecisionTreeSample {

	
	/*
	 * 		DefenderVulnerable(Attack?)
	 * 
	 * 			If Yes
	 * 					Is Defender a ground unit?
	 * 					If Yes
	 * 						Is Defender a tank?
	 * 						If Yes continue on
	 * 						If No continoue on
	 * 					If No
	 * 						Is Defener an air unit?
	 * 						If Yes continue on
	 * 						If No continue on
	 * 
	 * 			If No
	 * 			Can Ally attack?
	 * 					If Yes
	 * 						Send attack directive to Ally
	 * 					If No
	 * 						Can ally regroup with Attacker?
	 * 						
	 * 
	 * 
	 * 
	 * 
	 */
	/*
	CTreeNode treeRoot = new CTreeNode();
	
	public void Query() {
		QueryBinaryTreeFirstTime(treeRoot);
		
	}
	
	public void QueryBinaryTreeFirstTime(CTreeNode currentNode)
	{
		//error checking
		AskFirstQuestion(currentNode);
	}
	
	public void QueryBinaryTree(CTreeNode currentNode)
	{
	}
	
	public void AskFirstQuestion(CTreeNode node)
	{
		if (answer == true)
		{
			QueryBinaryTree(node.YesBranch);
		}
		else if (answer == false)
		{
			QueryBinaryTree(node.NoBranch);
		}
		
		else //wrong inpuit
		{
			AskNextQuestion(node);
		}
		
		
	
	}
	
	public void AskNextQuestion(CTreeNode node)
	{
		if (answer == true)
		{
			QueryBinaryTree(node.YesBranch);
		}
		
		else if (answer == false)
		{
			QueryBinaryTree(node.NoBranch);
		}
		
		else
		{
			//Error on inpuit
			
			AskNextQuestion(node);
		}
	}
	
	*/
	
}
