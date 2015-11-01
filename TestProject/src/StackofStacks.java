import java.util.ArrayList;


public class StackofStacks {
	
	static int currentStack=0;
	static ArrayList<StackObjectClass>arraylist ;
	
	public StackofStacks()
	
	{
		StackObjectClass stackObjectClass = new StackObjectClass(5);		 
		arraylist = new ArrayList<StackObjectClass>();
		arraylist.add(stackObjectClass);
		
	}
		
	public static void push(int i)
	{
		StackObjectClass stackclass= arraylist.get(currentStack);
		if(stackclass.top == 4)
		{
			StackObjectClass stacknewClass = new StackObjectClass(5);
			stacknewClass.array[stacknewClass.top++] = i;
			arraylist.add(stacknewClass);
			currentStack++;
		 
		}
	else
		{
			stackclass.array[stackclass.top++] = i;
			
		}
		
	}
	
	public static int pop()
	{
		StackObjectClass stackclass= arraylist.get(currentStack);
		if(stackclass.top == 0 && currentStack!=0)
		{
		 StackObjectClass stacknewClass = arraylist.get(--currentStack);
		  return stacknewClass.array[--stacknewClass.top];
				 
		}
		else if (stackclass.top == 0 && currentStack==0)
			return -1;
		else 
		{
			StackObjectClass stacknewClass = arraylist.get(currentStack);
			return stacknewClass.array[--stacknewClass.top];
		}
	}
	
	public static void main(String[] args) 
	{
		
		StackofStacks s = new StackofStacks();
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(9);
		s.push(8);
		s.push(10);
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		s.push(9);
		s.push(8);
		s.push(10);
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
		System.out.println("The popped value is "+s.pop());
	

	}

}
