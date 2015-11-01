package geeksforgeeks;

public class EditDistance {
	
	public int findEditDistance(String s1,String s2)
	{
		if(s1 == s2 || s1.length()==0 || s2.length() == 0)
			return 0;
		if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1) )
		{
			return findEditDistance(s1.substring(0,s1.length()-1), s2.substring(0,s2.length()-1));
		}
		else
			return 1+ findminimum(findEditDistance(s1.substring(0,s1.length()), s2.substring(0,s2.length()-1)),
					findEditDistance(s1.substring(0,s1.length()-1), s2.substring(0,s2.length())),
					findEditDistance(s1.substring(0,s1.length()-1), s2.substring(0,s2.length()-1)));
	}
	
	
	public int findminimum(int a,int b, int c)
	{
		int temp = a;
		if(temp < b)
			temp = b;
		if(temp<c)
			temp = c;
		return temp;
		
	}
	

	public static void main(String[] args) {
		
		String s1 = "a";
		String s2 = "bdc";
		System.out.println(s1.substring(0,s1.length()));
		EditDistance e = new EditDistance();
		int value = e.findEditDistance(s1,s2);
		System.out.println("The edit distance is"+value);
	}

}
