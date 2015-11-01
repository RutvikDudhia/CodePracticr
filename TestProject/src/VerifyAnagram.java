

import java.util.Scanner;

public class VerifyAnagram {
	
	public static void sort(char[] string1)
	{
		int min=0;
		char temp;
	//	int first = 0;
		for (int i=string1.length-1;i>0;i--)
		{
			min =0;
			for(int j=0;j<=i;j++)
			{
				if(string1[j]>string1[min])
				{
					min = j;
				}
				
				temp = string1[i];
				string1[i] = string1[min];
				string1[min]=temp;
			}
		}
		
		for(int i=0;i<string1.length;i++)
		{
			System.out.println("The character is "+string1[i]);
		}
		//return string1;
	}
	
	public static boolean verifyAnagram(char[] string1,char[] string2)
	{
		if(string1.length != string2.length)
			return false;
		else
		{
			sort(string1);
		//	sort(string2);
		}	
		return true;
		
	}
	
	public static void main(String[] agrs)
	{
		Scanner in = new Scanner (System.in);
		String string1 = in.next();
		String string2 = in.next();
		boolean result = verifyAnagram(string1.toCharArray(),string2.toCharArray());
		
	}

}
