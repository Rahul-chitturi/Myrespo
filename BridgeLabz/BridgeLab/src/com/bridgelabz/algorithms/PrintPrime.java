package com.bridgelabz.algorithms;

import java.io.PrintWriter;
/********************************************************************************************
 * Purpose   :Program to print PrintPrime number
 * @author   :Rahul C H
 * @version  :1.0
 * @date     :14-11-2019
 * @Filename :PrintPrime.java
 ********************************************************************************************/

import com.bridgelabz.utility.Utility;

public class PrintPrime {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("enter number in 0- 1000");
		int n = Utility.scan.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				pw.print(i + " ");
				pw.flush();
			}
		}
		Utility.scan.close();
	}

	/**
	 * to find given number is prime or not
	 * 
	 * @param n
	 * @return true if prime or else false
	 */
	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
