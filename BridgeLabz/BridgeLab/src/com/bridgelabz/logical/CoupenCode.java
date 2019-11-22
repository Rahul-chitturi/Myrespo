package com.bridgelabz.logical;
/******************************************************************************
 * Purpose: Program to find the coupen code which are unique
 *
 * @author RAHUL CHITTURI
 * @version 10.0
 * @since 11-11-2019
 *
 ******************************************************************************/

public class CoupenCode {
	public static void main(String[] args) {
		/*
		 * char array to get characters for coupen
		 */
		char[] chars = "abcdefghijklmnop135654535".toCharArray();
		/*
		 * length of coupen
		 */
		int max = 100000000;
		/*
		 * random value
		 */
		double d = Math.random();
		int random = (int) (d * max);
		String sb = "";
		System.out.println("random double " + d + " random at start " + random);

		while (random > 0) {
			sb = sb + (chars[random % chars.length]);
			random /= chars.length;
			System.out.println(random + "  " + random % chars.length + " sb is " + sb);
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}
}
