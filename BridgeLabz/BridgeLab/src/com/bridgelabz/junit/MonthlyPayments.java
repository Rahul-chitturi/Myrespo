package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
/******************************************************************************
 * Purpose: to check the monthly payments for given amount ,duration and rate.
 *
 * @author  RAHUL CHITTURI
 * @version 1.0
 * @since   11-11-2019
 *
 ******************************************************************************/

public class MonthlyPayments {
	
	public static void main(String[] args) {
	  try {
		System.out.println("enter principal ,year and rate");
		double p = Utility.scan.nextDouble();
		double y = Utility.scan.nextDouble();
		double r = Utility.scan.nextDouble();
		Utility.scan.close();
		System.out.println("mothly payment is " + Utility.monthlyPayment(p, y, r));
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}
}
