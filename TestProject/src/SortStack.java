public class SortStack {

	public static NormalStack sortStack(NormalStack s) {
		NormalStack temp = new NormalStack(5);
		int tempnum;
		while (!s.isEmpty()) {
			tempnum = s.pop();
			while (tempnum > temp.peek() && !temp.isEmpty()) {
				s.push(temp.pop());
			}
			temp.push(tempnum);
		}

		return temp;

	}

	public static void main(String[] args) {

		NormalStack s1 = new NormalStack(5);
		s1.push(5);
		s1.push(3);
		s1.push(4);
		s1.push(2);
		NormalStack s2 = sortStack(s1);
		System.out.println("The value is " + s2.pop());
		System.out.println("The value is " + s2.pop());
		System.out.println("The value is " + s2.pop());
		System.out.println("The value is " + s2.pop());

	}

}
