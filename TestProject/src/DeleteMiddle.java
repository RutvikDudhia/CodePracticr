import java.util.Scanner;

public class DeleteMiddle {

	public static void removeMiddle(ListNode n)
	{
		if(n.next != null)
		{
			n.value = n.next.value;
			n.next = n.next.next;
		}
	
	}
	public static void main(String[] args) {
		
		System.out.println("Insert the values\n");
		String s;
		Scanner in = new Scanner(System.in);
		LinkList l = new LinkList();
		
		s=in.nextLine();
		l.setFirst(s);
	
		while(true)
		{
			s=in.nextLine();
			if(s.equals("bye"))
				break;
			else
			l.setNext(s);
			
		}
		
		System.out.println("Out of loop");

		removeMiddle(l.head.next.next);
		
		for(ListNode a=l.head;a!=null;a=a.next)
			
			System.out.println(a.value);

		
	}

	
}


