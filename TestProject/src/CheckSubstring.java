import java.util.Scanner;


public class CheckSubstring {

	public static boolean verifyRotate(String string1,String string2)
	{
		String s1 = string1;
		String s2 = string2;
		String s1s2 = string1+string1;
		if(s1s2.contains(s2))
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
			
		boolean result = verifyRotate(input1,input2);
		
		if(input1.length()!=input2.length())
			System.out.println("They are not rotation");
		
		else if(result==true)
		{
			System.out.println("The strings are rotation");
		}
		else
		{
			System.out.println("The strings are not rotated");
		}
		
		}
		
		

	}


