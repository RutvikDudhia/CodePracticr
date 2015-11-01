package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class TreeToLinkedList {

	Stack<TreeNode> s = new Stack<TreeNode>();
	ArrayList<TreeNode> a = new ArrayList<TreeNode>();
	LinkedList<TreeNode> list = new LinkedList<TreeNode>();
	ArrayList<LinkedList<TreeNode>> la = new ArrayList<LinkedList<TreeNode>>();

	public void traverse(TreeClass tc) {

		s.push(tc.rootnode);
		LinkedList<TreeNode> l1 = new LinkedList<TreeNode>();
		LinkedList<TreeNode> current = l1;
		int level = 0;
		while (true) {
			if (a.isEmpty() && s.isEmpty()) {
				break;
			} else {

				TreeNode tn1 = s.pop();

				current.add(tn1);
				System.out.println("Inserted " + tn1.value + " at " + level);

				if (tn1.leftNode != null) {
					a.add(tn1.leftNode);

				}
				if (tn1.rightNode != null) {
					a.add(tn1.rightNode);

				}
				if (s.isEmpty()) {

					LinkedList<TreeNode> l2 = new LinkedList<TreeNode>();
					current = l2;
					for (TreeNode tn : a) {
						s.push(tn);

					}
					a.clear();
					la.add(current);
					level++;

				}

			}

		}
	}

	public static void main(String[] args) {

		int i = 7;
		TreeClass tree = new TreeClass(7);
		tree.insertNode(tree, 5);
		tree.insertNode(tree, 4);
		tree.insertNode(tree, 8);
		tree.insertNode(tree, 9);
		tree.insertNode(tree, 6);
		tree.insertNode(tree, 3);
		tree.insertNode(tree, 2);
		tree.insertNode(tree, 1);
		TreeToLinkedList t = new TreeToLinkedList();
		t.traverse(tree);

	}

}
