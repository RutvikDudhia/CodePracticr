
public class MinStack {

	static int []array = new int [15];
	static int top = 0;
	static int min = 0;
	static int []minArray = new int[15];
	static int minTop = 0;
	
	public static void minPush(int value)
	{
		minArray[minTop++] = value;
	}
	
	public static int minPeek()
	{
		if(minTop==0)
			return 1000;
		return minArray[minTop-1];
	}
	
	public static void minPop()
	{
		
		minTop-=1;
	}
	public static void push(int value)
	{
		if(top==14)
			System.out.println("The stack is full");
		else
		{
					
			array[top++]= value;
			
			if(top == 0)
				minPush(value);
			
			else if(value<=minPeek())
			{
				minPush(value);
			}
			
		}
		
	}
	
	
	
	public static int returnMin()
	{
		if(top==0)
			return -1;
		else
			return minArray[minTop-1];
		
	}
	
	public static int pop()
	{
		
		if(top==0)
			return -1;
		else
		{
			if(array[top-1]==minPeek())
			{
			minPop();
			
			}
			return array[--top];
		}
	}
	

	public static void main(String[] args) {
		
		push(-9);
		push(2);
		push(-3);
		push(5);
		push(-8);
		pop();
		pop();
		pop();
		

		System.out.println("The min is "+returnMin());

	}

}
