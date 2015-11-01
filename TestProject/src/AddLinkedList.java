import java.util.Scanner;


public class AddLinkedList {

	public static ListNode addLinkedList(ListNode head1, ListNode head2)
	{
		ListNode node1 = head1;
		LinkList addition = new LinkList();
		ListNode node2 = head2;
		int value1,value2;
		int carry=0;
		int ans = 0;
		int counter=0;
		int sum=0;
		while(node1!=null||node2!=null)
		{
			if(node1==null)
				value1 = 0;
			else
			value1 = Integer.parseInt(node1.value);
			
			if (node2==null)
				value2 = 0;
			else
			value2 = Integer.parseInt(node2.value);
			
			sum = value1+value2+carry;
			ans = (sum)%10;
			carry = (sum)/10;
			if(counter==0)
				addition.setFirst(String.valueOf(ans));
			else
				addition.setNext(String.valueOf(ans));
			
			counter++;
			node1= node1.next;
			node2 = node2.next;
					
		}
		if(carry>0)
			addition.setNext(String.valueOf(carry));
		
		return addition.head;
		
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
		
		System.out.println("First loop exited");
		
		LinkList l1 = new LinkList();
		
		s=in.nextLine();
		l1.setFirst(s);
	
		while(true)
		{
			s=in.nextLine();
			if(s.equals("bye"))
				break;
			else
			l1.setNext(s);
			
		}
		
		ListNode ans = addLinkedList(l.head, l1.head);
		
		for(ListNode a=ans;a!=null;a=a.next)
			
			System.out.println(a.value);
	}

}
