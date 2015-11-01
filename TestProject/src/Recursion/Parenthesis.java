package Recursion;

import java.util.ArrayList;


public class Parenthesis {
	
	public ArrayList<String> solveParenthesis(int group, int count)
	{
		ArrayList<String>set = new ArrayList<String>();
		
		if(count ==  group)
		{
			set.add("()");
		}
		else
		{
			ArrayList<String>set2 = solveParenthesis(group,count+1);
			
			for(String value : set2)
			{
				for(int i=0;i<value.length();i++)
				{
					String initial = value.substring(0, i);
					String end = value.substring(i);
					String finals =  initial + "()" + end ;
					if(!set.contains(finals))
						set.add(finals);
					
					
				}
			}
		}
		return set;
		
	}

	public static void main(String[] args) {

		Parenthesis p = new Parenthesis();
		ArrayList<String> ans = p.solveParenthesis(3,1);
		System.out.println("The ans is" + ans.toString());
		
	}

}
