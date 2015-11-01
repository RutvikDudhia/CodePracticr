package Trees;

public class VerifySubtree {

	public boolean compareTree(TreeNode tree1, TreeNode tree2)
	{
		if(tree1 == null)
			return false;
		if (tree1.value == tree2.value)
			if (matchTree(tree1,tree2)){
				return true;
			}
			return( compareTree(tree1.leftNode, tree2) ||
					compareTree(tree1.rightNode,tree2) );
	
	}
	
	public boolean matchTree(TreeNode tree1, TreeNode tree2)
	{
		if(tree1 == null && tree2 == null)
			return true;
		if(tree1.value != tree2.value)
			return false;
		if(tree1 != null && tree2 == null)
			return true;
		else
			return (matchTree(tree1.leftNode,tree2.leftNode) && 
					matchTree(tree1.rightNode, tree2.rightNode));
		
	}
	
	public static void main(String[] args) {
		
		TreeClass tree1 = new TreeClass(8);
		tree1.insertNode(tree1.rootnode, 7, 0);
		tree1.insertNode(tree1.rootnode, 10, 1);
		tree1.insertNode(tree1.rootnode.leftNode, 9, 0);
		tree1.insertNode(tree1.rootnode.leftNode, 11, 1);
		tree1.insertNode(tree1.rootnode.rightNode, 12, 0);
		tree1.insertNode(tree1.rootnode.rightNode, 19, 1);
		
		
		TreeClass tree2 = new TreeClass(8);
		tree2.insertNode(tree2.rootnode, 7, 0);
		tree2.insertNode(tree2.rootnode, 10, 1);
		tree2.insertNode(tree2.rootnode.leftNode, 9, 0);
		tree2.insertNode(tree2.rootnode.leftNode, 11, 1);
		tree2.insertNode(tree2.rootnode.rightNode, 12, 0);
		tree2.insertNode(tree2.rootnode.rightNode, 13, 1);
		tree2.insertNode(tree2.rootnode.rightNode.leftNode, 16, 0);
		tree2.insertNode(tree2.rootnode.rightNode.leftNode, 18, 1);
		
		VerifySubtree st = new VerifySubtree();
		boolean result = st.compareTree(tree1.rootnode,tree2.rootnode);
		
		System.out.println("The trees is a subtree " + result);

	}

}
