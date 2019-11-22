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

public class WindChill {

	/**
	 * Function to calculate windchill
	 * 
	 * @param f  the double value oftemperature in fahreinheit
	 * @param ws the double value of windspeed in mile per hour
	 */
	static void windChill(double f, double ws) {

		double w = 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
		System.out.println(w);
	}

	public static void main(String[] args) {
		try {
			System.out.println("enter temperature in fahrenheit");
			double f = Utility.scan.nextDouble();
			System.out.println("enter wind speed in miles per hour");
			double ws = Utility.scan.nextDouble();
			if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
				System.out.println("enter correct input");
			} else {
				windChill(f, ws);
			}
		} catch (Exception e) {
			System.out.println("enter proper input");
		}
		Utility.scan.close();
	}
}
