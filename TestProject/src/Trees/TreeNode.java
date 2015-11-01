package Trees;

public class TreeNode {

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	TreeNode leftNode;
	TreeNode rightNode;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode(TreeNode left, TreeNode right) {
		leftNode = left;
		rightNode = right;
	}
	
	public TreeNode() {
		leftNode = null;
		rightNode = null;
	}

	public TreeNode(int value) {

		this.value = value;
	}


}
