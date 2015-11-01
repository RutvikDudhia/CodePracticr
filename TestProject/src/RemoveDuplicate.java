
import java.util.Scanner;

/**Remove Duplicates from a string**/
public class RemoveDuplicate {

	public static void removeDuplicate(LinkList s)
	
	{
		ListNode previous = LinkList.head;
		ListNode runner = LinkList.head.next;
		ListNode current = LinkList.head.next;
		
		if(previous.value.equals(current.value))
		{
			previous.next = current.next;
		}
		while(current != null)
		{
			previous = LinkList.head;
			
			for(runner=LinkList.head.next;runner!=current;runner=runner.next)
			{
				if(runner==null)
					break;
				if(runner.value.equals(current.value))
				{
					previous.next = runner.next;
				}
				
				previous = previous.next;
			}
			
			current = current.next;
			
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
		
		removeDuplicate(l);
		
		for(ListNode n= LinkList.head;n!=null;n=n.next)
		{
			System.out.println(n.value);
		}
	}

}
