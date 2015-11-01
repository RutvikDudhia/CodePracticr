public class NormalStack {

	int top = 0;
	int[] stackArray;

	public NormalStack(int size) {
		stackArray = new int[5];

	}

	public void push(int i) {
		if (top == 5)
			System.out.println("The stack is full cannot insert");
		else
			stackArray[top++] = i;
	}

	public int peek() {
		if (top == 0)
			return -1;
		else
			return stackArray[top - 1];
	}

	public boolean isEmpty() {
		if (top == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == 5)
			return true;
		else
			return false;
	}

	public int pop() {
		if (top == 0) {
			System.out.println("The stack is empty");
			return -1;
		}

		else
			return stackArray[--top];

	}

}
