/********************************************************************************************
 * Purpose   :Program to find the Power of Two given no 
 * @author   :Rahul C H
 * @version  :1.0
 * @date     :14-11-2019
 * @Filename :PowerOfTwo.java
 ********************************************************************************************/
package com.bridgelabz.basic;

public class PowerOfTwo {
	/*
	 * The main function is written to test PowerOfTwo class
	 */
	public static void main(String[] args) {
		try {
			System.out.println("ENTER A NUMBER WITH IN 31");
			int n = 0;
			// read in one command-line argument
			n = Integer.parseInt(args[0]);
			if (n > 30) {
				System.err.println("enter value with in 31 run again with valid input");
			} else {
				int i = 0; // count from 0 to N
				int POWER = 1; // the ith power of two

				// repeat until i equals n
				while (i <= n) {
					System.out.println(i + " " + POWER); // print out the power of two
					POWER = 2 * POWER; // double to get the next one
					i = i + 1;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
