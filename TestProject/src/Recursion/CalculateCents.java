package Recursion;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class CalculateCents {
	
	ArrayList<Integer> currentDenomination = new ArrayList<Integer>();
	
	public enum Cents{
		
		Quarters,Nickels,Dimes;
		
	}
	
	public ArrayList <Integer>  getCentCombinations(int n)
	{
		int leftAmount = n;
		
	//	ArrayList<Integer> currentDenomination = new ArrayList<Integer>();
		
		//ArrayList < ArrayList <Integer>> allDenominatons = new ArrayList<ArrayList<Integer>>();
		
		ArrayList < ArrayList <Integer>> temp = new ArrayList<ArrayList<Integer>>();
		
		if(leftAmount < 5)
			return currentDenomination;
		
		else
		{
			currentDenomination.add(5);
			temp.add(currentDenomination);
		
			
		
		
		
		}
					
		
		return currentDenomination;
	}
	
	
	public void applyCents(int x, int leftAmount)
	{
		
	}
	
	public static void main(String[] args) {

		CalculateCents c = new CalculateCents();
		ArrayList <Integer> den = c.getCentCombinations(100);
		System.out.println(den.toString());

	}

}
