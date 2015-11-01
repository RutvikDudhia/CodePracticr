
public class LinkList {

	public static ListNode head;
	
	
	
	public LinkList()
	{
		head = new ListNode();
		
	}
	
	public void setFirst(String value)
	{
		head.value = value;
	}
	
	public void setNext(String value)
	{
		ListNode node = this.head;
		while(node.next != null)
		{
			node = node.next;
		}
		
		node.next = new ListNode();
		node.next.value = value;
	}
	
	

}
