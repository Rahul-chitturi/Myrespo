/********************************************************************************************
 * Purpose   :Flip Coin and print percentage of Heads and Tails
 * @author   :Rahul C H
 * @version  :1.0
 * @date     :14-11-2019
 * @Filename :Flip.java
 ********************************************************************************************/
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class Flip {
	/*
	 * The main function is written to test Flip class
	 */
	public static void main(String[] args) {
		try {
			System.out.println("enter postive integer");
			int n = Utility.scan.nextInt();
			int HEAD = 0;
			while (n < 0) {
				System.out.println("error enetr positive");
				n = Utility.scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				double RAN = Math.random();
				if (RAN < 0.5) {
					HEAD++;
				}
			}
			System.out.println("HEADS:" + (100 / n) * HEAD);
			System.out.println("TAILS:" + (100 - ((100 / n) * HEAD)));
			Utility.scan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
