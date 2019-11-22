package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

/******************************************************************************
 * Purpose: takes two integer command-line arguments x and y and prints the
 * Euclidean distance from the point (x, y) to the origin (0, 0)
 *
 * @author  :RAHUL CHITTURI
 * @version :1.0
 * @since   :11-11-2019
 *
 ******************************************************************************/
public class Distance {

	/**
	 * Function to calculate the value of distance
	 * 
	 * @param x value of x axis
	 * @param y value of y axis
	 */
	static void calculate(int x, int y) {
		System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
	}

	public static void main(String[] args) {
		try {
			System.out.println("enter value for x");
			int x = Utility.scan.nextInt();
			System.out.println("enter value for y ");
			int y = Utility.scan.nextInt();
			calculate(x, y);
			Utility.scan.close();
		} catch (Exception e) {
			System.out.println("enter integer only");
		}
	}
}
