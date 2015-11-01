package udacity;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SRangaHW2 {
	public static void main(String[] args) {
		int n = 5;
		String temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play with Strings!");
		System.out.println("Enter five names: \n");
		String names[] = new String[n];
		Scanner input1 = new Scanner(System.in);
		int p = 0;

		while (p < n) {
			System.out.println("Enter name:");
			String temp1 = input1.nextLine();
			if (temp1.trim().isEmpty()) {
				System.out
						.println("You have entered blank space please try again");

			} else {
				names[p++] = temp1.trim();
			}

		}

		System.out.println("\n");
		Arrays.sort(names);

		System.out.println("The names sorted in ascending order");
		for (int i = 0; i < n - 1; i++) {
			System.out.println(names[i]);
		}
		System.out.println(names[n - 1]);

		System.out.println("\n");
		int x = 5;
		int temp1;
		Scanner inputt = new Scanner(System.in);
		System.out.println("Let's play with some intergers now!");
		System.out.println("Enter five integers: \n");
		int integers[] = new int[x];
		Scanner inputt1 = new Scanner(System.in);
		int k = 0;
		String s;
		while (k < n) {
			try {
				System.out.println("Enter integer:");
				String temp2 = input.nextLine();
				integers[k] = Integer.parseInt(temp2);
				k++;
			} catch (NumberFormatException e) {
				System.out.println("Please enter integer and try again");
			}
		}

		System.out.println("\n");
		System.out.println(" The numbers you entered:");
		for (int i = 0; i < x; i++) {
			System.out.print(integers[i]);
			System.out.print(",");
		}

		Arrays.sort(integers);
		for (int i = 0; i < integers.length / 2; ++i) {
			temp1 = integers[i];
			integers[i] = integers[integers.length - i - 1];
			integers[integers.length - i - 1] = temp1;
		}

		System.out.println("\n");
		System.out.println(" The numbers sorted in descending order: \n");
		for (int i = 0; i < x - 1; i++) {
			System.out.print(integers[i]);
			System.out.print(",");
		}
		System.out.print(integers[x - 1]);
	}
}