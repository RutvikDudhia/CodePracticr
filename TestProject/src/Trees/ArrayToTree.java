package Trees;

public class ArrayToTree {

	static boolean verifyTree(int[] a, int start, int end) {

		if (start >= end || start == a.length) {
			return true;
		}

		int root = a[start];

		boolean isTree = true;
		boolean rightStarted = false;
		int firtPartend = 0;
		boolean part1 = true;
		boolean part2 = true;

		for (int i = start + 1; i <= end; i++) {
			if (root < a[i]) {
				rightStarted = true;
				firtPartend = i;
				break;
			}
		}

		if (rightStarted) {
			for (int i = firtPartend; i <= end; i++) {
				if (root > a[i] && rightStarted == true) {
					isTree = false;
					break;
				}
			}

		}

		if (isTree == false)
			return false;

		else {
			part1 = verifyTree(a, start + 1, end);

		}

		if (part1)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		

		int[] a = { 3,7,4};
		boolean isTree = verifyTree(a, 0, a.length - 1);
		System.out.println("The ans is " + isTree);
	}

}
