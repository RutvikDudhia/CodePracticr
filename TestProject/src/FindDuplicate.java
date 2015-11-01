import java.util.Scanner;


public class FindDuplicate {
	
	public static String findDuplicate(char[] input)
	{
		int length = input.length;
		int j;
		int count = 0;
		int flag = 0;
		int i;
		input[count++] = input[0];
		for(j=1;j<input.length;j++)
		{
			flag = 0;
			System.out.println("At "+input[j]);
			
			for(i=0;i<j;i++)
			{				
				if(input[i]==input[j])
				{
					flag = 1;
					length--;
					break;
					
				}
			}
		if(flag==0)
		{ 
		
			input[count++] = input [j];
		}
	}	
		
		for(int k=0;k<length;k++)
		{
			System.out.println("The final "+input[k]);
		}
		return input.toString();
		
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String output = findDuplicate(input.toCharArray());
		System.out.println("The output is "+output);
	}

}
