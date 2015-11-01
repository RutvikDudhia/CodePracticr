package Trees;

import java.util.ArrayList;

public class VerifySum {

	public void findPaths(ArrayList<Integer> numbers, int level, TreeNode node,
			int sum) {
		int totalSum = sum;
		
		if (node == null)
			return;
		else
			System.out.println("Traversing node "+node.value);
		numbers.add(node.value);
		for (int i = level; i >= 0; i--)
		{
			totalSum = totalSum - numbers.get(i);
		if (totalSum == 0)
			printNodes(numbers, level);
		}

		ArrayList<Integer> c1 = (ArrayList<Integer>) numbers.clone();
		ArrayList<Integer> c2 = (ArrayList<Integer>) numbers.clone();
		findPaths(c1, level + 1, node.leftNode, sum);
		findPaths(c1, level + 1, node.rightNode, sum);

	}

	public void printNodes(ArrayList<Integer> values, int level) {
		System.out.println("The path is");
		for (int i = 0; i <= level; i++) {
			System.out.print(values.get(i));
		}

		System.out.println("");
	}

	public static void main(String[] args) {

		TreeClass tree = new TreeClass(7);
		tree.insertNode(tree, 3);
		tree.insertNode(tree, 4);
		tree.traverseInOrder(tree.rootnode);
		VerifySum verify = new VerifySum();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int level = 0;
		verify.findPaths(numbers, level, tree.rootnode, 14);

	}

}
