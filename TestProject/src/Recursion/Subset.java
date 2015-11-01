package Recursion;

import java.util.ArrayList;

public class Subset {

	public ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set,
			int index) {
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();

		if (set.size() == index) {
			allsubsets.add(new ArrayList<Integer>());
		} else {
			allsubsets = getSubset(set, index + 1);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			int item = set.get(index);
			for (ArrayList<Integer> subset : allsubsets) {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}

			allsubsets.addAll(moresubsets);
		}

		return allsubsets;

	}

	public static void main(String[] args) {

		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		Subset s = new Subset();
		ArrayList<ArrayList<Integer>> abc = s.getSubset(set, 0);
		for (ArrayList<Integer> p : abc)
			System.out.println(p.toString());

	}

}
