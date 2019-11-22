/******************************************************************************
 * Purpose:  Program to sumofnumberaddsto0
 *
 * @author RAHUL C H
 * @version 10.0   
 * @since 11-11-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class SumOfNumberAddsTo0 {


	/**
	 * function to check sum of triplets is 0
	 * 
	 * @param n the no of elements to check for for creation of array
	 */
	static void sum0count(int n) {
		try {
		int[] arr = new int[n];
		int count = 0;
		System.out.println("enter values");
		// taking integer input for creating array
		for (int i = 0; i < n; i++) {
			arr[i] = Utility.scan.nextInt();
		}
		// checking for triplets by loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		// output
		System.out.println("total pairs are " + count);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		System.out.println("enter no of inputs");
		int n = Utility.scan.nextInt();
		sum0count(n);

	}
}
