package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class GuessGame {
	/**
	 * function to fine the number
	 * 
	 * @return low
	 */
	static int find() {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = Utility.scan.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {

		System.out.println("guess a no between 0 to 127 ");
		Utility.scan.next();
		try {
			System.out.println("guessed no is " + find());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}
