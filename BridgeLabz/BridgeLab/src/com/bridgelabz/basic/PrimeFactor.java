package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {

	/**
	 * Function to find the prime factors of given no and print it
	 * 
	 * @param n the no for which to find the prime factors
	 */
	static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (Utility.isPrime(i))
					System.out.println(i + " ");
			}
		}
	}

	/**
	 * The main function is written to test PrimeFactor class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter no to find prime factors");
		int n = Utility.scan.nextInt();
		System.out.println("prime factors are ");
		primeFactors(n);
		// System.out.println(isPrime(n));
		Utility.scan.close();
	}
}