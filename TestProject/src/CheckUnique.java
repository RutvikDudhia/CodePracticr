import java.util.Scanner;


public class CheckUnique {

	private static Scanner in;
	public static int checkUnique(String s)
	{
		int flag =0;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag = 1;
					break;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		String input = in.next();
		int isRepeat = checkUnique(input);
		if(isRepeat == 0)
		{
			System.out.println("No repeat");
		}else
			System.out.println("Yes repeat");
		}
}
