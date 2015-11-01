import java.util.Scanner;

/**Find Nth Term
 * 
 * @author Rutvik
 *
 */
public class FindNthTerm {
	
	public static ListNode removenth(ListNode head,int n)
	{
		ListNode listnode = head;
		int count = 1;
		while(listnode.next != null)
		{
			listnode = listnode.next;
			count++;
		}
		
		listnode = head;
		
		for(int i=1;i<=count-n;i++)
		{
			listnode = listnode.next;
		}
		
		
		return listnode;
			
			
	}

	public static void main(String[] args)
	{
		
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

		
	
		ListNode ans = removenth(l.head, 2);
		
		System.out.println(ans.value);

		}
	}


