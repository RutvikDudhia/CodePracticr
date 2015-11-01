package Trees;

public class CheckBalancedTree {

	public int findMax(TreeNode node) {
		if (node == null)
			return 0;
		else
			return (1 + Math.max(findMax(node.rightNode),
					findMax(node.leftNode)));
	}

	public int findMin(TreeNode node) {
		if (node == null)
			return 0;
		else
			return (1 + Math.min(findMin(node.rightNode),
					findMin(node.leftNode)));
	}

	public static void main(String[] args) {

		TreeClass tree = new TreeClass(5);
		TreeNode root = tree.rootnode;
		TreeNode node1 = new TreeNode();
		node1.value = 3;
		root.setLeftNode(node1);

		TreeNode node2 = new TreeNode(7);
		root.setRightNode(node2);

		TreeNode node3 = new TreeNode(9);
		node2.setRightNode(node3);

		TreeNode node4 = new TreeNode(15);
		node3.setRightNode(node4);

		CheckBalancedTree bt = new CheckBalancedTree();

		int difference = bt.findMax(root) - bt.findMin(root);

		System.out.print("the difference is " + String.valueOf(difference));

	}

}
