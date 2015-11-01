package Trees;

public class CreateBalancedTree {

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

	public void insertBalanced(TreeClass tc, int[] values, int first1, int last1) {
		System.out.println("First= " + first1);
		System.out.println("Last= " + last1);
		if (first1 < last1) {

			int mid = (last1 + first1) / 2;
			insertNode(tc, values[mid]);
			insertBalanced(tc, values, first1, mid);
		}
	}

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int first = 0;
		int last = values.length - 1;
		int mid = (last + first) / 2;
		TreeNode node = new TreeNode(values[mid]);
		TreeClass tc = new TreeClass(values[mid]);
		CreateBalancedTree tree = new CreateBalancedTree();
		tree.insertBalanced(tc, values, 0, mid - 1);
		tree.insertBalanced(tc, values, mid + 1, last);

	}

}
