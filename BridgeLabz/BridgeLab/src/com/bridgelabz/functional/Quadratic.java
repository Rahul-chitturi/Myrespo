package com.bridgelabz.functional;
/******************************************************************************
 * Purpose: to to find the roots of the equation a*x*x + b*x + c. 
 *
 * @author RAHUL CHITTURI
 * @version 10.0
 * @since 11-11-2019
 *
 ******************************************************************************/

import com.bridgelabz.utility.Utility;

public class Quadratic {

	/**
	 * Function to find the roots of equation and print it
	 * 
	 * @param a value of a
	 * @param b value of b
	 * @param c value of c
	 */
	static void roots(int a, int b, int c) {
		// calculating delta value
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);

	}

	/**
	 * Main method to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("enter a ");
			int a = Utility.scan.nextInt();
			System.out.println("enter b");
			int b = Utility.scan.nextInt();
			System.out.println("enter c");
			int c = Utility.scan.nextInt();
			roots(a, b, c);
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
		Utility.scan.close();
	}
}
