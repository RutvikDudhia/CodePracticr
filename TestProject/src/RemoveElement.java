import java.util.Scanner;


public class RemoveElement {

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

	}

}
