
public class StackArray {
	
	static int []array = new int [15];;
	static int []topPointers = {0,0,0};
	static int []bottomPointers = {0,5,10};
	
	public static void push(int stackNumber, int value)
	{
		
		
		if(topPointers[stackNumber-1]==4)
			System.out.println("The stack is full");
		else
		{
			array[bottomPointers[(stackNumber-1)]+(topPointers[(stackNumber)-1]++)]= value;
			
		}
		
	}
	
	public static int pop(int stackNumber)
	{
		
		if(topPointers[(stackNumber)-1]==0)
			return -1;
		else
		{
			return array[bottomPointers[(stackNumber-1)]+(--topPointers[(stackNumber)-1])];
		}
	}

	
	public static void main(String[] args) {
		
		
		push(1,1);
		push(1,2);
		push(2,9);
		push(3,10);
		for(int i=0;i<15;i++)
			System.out.println("The value at "+i+" is "+array[i]);
		
		System.out.println("The popped value from 2 is "+pop(2));
		System.out.println("The popped value from 3 is "+pop(3));
		System.out.println("The popped value from 1 is "+pop(1));
		
		push(1,11);
		push(2,12);
		push(2,15);
		push(3,13);
		
		System.out.println("The popped value from 2 is "+pop(2));
		System.out.println("The popped value from 3 is "+pop(3));
		System.out.println("The popped value from 1 is "+pop(1));
		System.out.println("The popped value from 2 is "+pop(2));
		System.out.println("The popped value from 2 is "+pop(2));
	}

}
