package Trees;

public class TreeClass {

	public TreeNode rootnode;

	public TreeClass(int value) {
		rootnode = new TreeNode(null, null);
		rootnode.setValue(value);
	}

	/** 0 means left and 1 means right **/
	public void insertNode(TreeNode parent, int value, int type) {
		TreeNode newNode = new TreeNode();
		newNode.value = value;
		if(type == 0)
			parent.setLeftNode(newNode);
		else
			parent.setRightNode(newNode);
		}
	
	public void insertNode(TreeClass t, int i) {
		TreeNode n = new TreeNode(i);
		TreeNode traverser = t.rootnode;
		while (true) {
			if (i < traverser.value && traverser.leftNode != null) {
				traverser = traverser.leftNode;
			} else if (i > traverser.value && traverser.rightNode != null) {
				traverser = traverser.rightNode;
			} else
				break;
		}

		if (i < traverser.value) {
			System.out.println("Inserted " + n.value + " to the left of "
					+ traverser.value);
			traverser.leftNode = n;
		} else {
			System.out.println("Inserted " + n.value + " to the right of "
					+ traverser.value);
			traverser.rightNode = n;
		}
	}
	
	public void traverseInOrder(TreeNode rootNode)
	{
		if(rootNode != null)
		{
			traverseInOrder(rootNode.leftNode);
			System.out.println(rootNode.value);
			traverseInOrder(rootNode.rightNode);
		}
	}
}
