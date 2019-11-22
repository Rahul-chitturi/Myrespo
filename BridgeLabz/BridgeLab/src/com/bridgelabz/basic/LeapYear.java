package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;
public class LeapYear {
	/**
	 * Function to check if year is leap year or not
	 * 
	 * @param year the value of year to check
	 * @return true if it is leap year or false if its not
	 */

	public static boolean isLeap(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	/*   
	 * The main function is written to test LeapYear class
	 */
	public static void main(String[] args) {
		try {
			System.out.println("enter year in 4 digit");
			int year = Utility.scan.nextInt();
			/*
			 * ensures the value is 4 digit
			 */
			while (year < 999 || year > 9999) {
				System.out.println("wrong input");
				System.out.println("enter year in 4 digit");
				year = Utility.scan.nextInt();
			}
			if (isLeap(year)) {
				System.out.println(year + " is a leap year");
			} else
				System.out.println(year + " is not a leap year");

			Utility.scan.close();  
		} catch (Exception e) {
			System.out.println(e + " Enter valid input");
		}
	}
}
