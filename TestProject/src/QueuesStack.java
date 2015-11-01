public class QueuesStack {

	public NormalStack s1;
	public NormalStack s2;

	public QueuesStack() {
		s1 = new NormalStack(5);
		s2 = new NormalStack(5);
	}

	public void push(int i) {
		if (!s1.isFull())
			s1.push(i);
		else
			System.out.println("The stack is full");
	}

	public int pop() {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		if (s2.isEmpty()) {
			System.out.println("The stack is empty12");
			return -1;
		} else

			return s2.pop();

	}

	public static void main(String[] args) {

		QueuesStack qs = new QueuesStack();
		qs.push(5);
		qs.push(6);
		System.out.println("The value is " + qs.pop());
		System.out.println("The value is " + qs.pop());
		System.out.println("The value is " + qs.pop());

	}

}
