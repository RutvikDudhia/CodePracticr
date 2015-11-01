package Recursion;

import java.util.ArrayList;

public class Permutations {

	public ArrayList<String> getPerms(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		if (s.length() == 0) {
			permutations.add("");
			return permutations;

		}
		String first = String.valueOf(s.charAt(0));
		String item = s.substring(1);
		ArrayList<String> words = getPerms(item);
		for (String values : words) {
			for (int i = 0; i <= values.length(); i++) {
				permutations.add(insertCharacters(i, values, first));
			}
		}
		return permutations;

	}

	public String insertCharacters(int i, String values, String item) {
		String start = values.substring(0, i);
		String end = values.substring(i);
		return start + item + end;

	}

	public static void main(String[] args) {

		Permutations perm = new Permutations();
		ArrayList<String> perms = perm.getPerms("Rutvik");
		System.out.println(perms.toString());

	}

}
