
public class Tower {

	int index;
	int disks[] = {0,0,0,0,0,0};
	int top =0;
	public Tower(int i)
	{
		index = 0;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	public void push(int value)
	{
		if(top==5)
			System.out.println("The stack is full");
		else
		disks[top++] = value;
	}
	
	public int pop()
	{
		if(top==0)
			return -1;
		else
			return disks[--top];
	}
	
	public void moveTopTo(int i,Tower t)
	
	{
		int topDisk= pop();
		if(topDisk==-1)
			System.out.println("There is no disk to move");
		else
			t.push(i);
	}
	
//	public void moveDisks(int i,Tower destination, Tower buffer)
//	
//	{
//		int topDisk= pop();
//		if(topDisk==-1)
//			System.out.println("There is no disk to move");
//		else
//			t.push(i);
//	}
	

}
