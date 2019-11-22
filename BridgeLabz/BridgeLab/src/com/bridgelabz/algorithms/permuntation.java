package com.bridgelabz.algorithms;

/********************************************************************************************
 * @purpose  :program to print all permutaions of string
 * @author   :Rahul C H
 * @version  :1.0
 * @date     :14-11-2019
 * @Filename :Permutaion.java
 ********************************************************************************************/
import java.util.*;

import com.bridgelabz.utility.Utility;

public class permuntation {
	static ArrayList<String> arl = new ArrayList<>();
	static ArrayList<String> arr = new ArrayList<String>();

	/**
	 * Method to swap a string
	 * 
	 * @param a String
	 * @param i index of string
	 * @param j index of string
	 * @return swapped string
	 */
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	/**
	 * Method to generate permutations using recursion
	 * 
	 * @param str
	 * @param start
	 * @param end
	 */
	public static void generatePermutation(String str, int start, int end) {
		// Prints the permutations
		if (start == end - 1) {
			arl.add(str);
		} else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end);
				// Backtracking and swapping the characters again.
				str = swapString(str, start, i);
			}
		}
	}

	/**
	 * method to generate permutations using iterative method
	 * 
	 * @param s string
	 */
	public static void permutations(String s) {

		arr.add(String.valueOf(s.charAt(0)));

		for (int i = 1; i < s.length(); i++) {

			for (int j = arr.size() - 1; j >= 0; j--) {
				String str = arr.remove(j);

				for (int k = 0; k <= str.length(); k++) {
					arr.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println("eneter a String");
			String name = Utility.scan.nextLine();
			Utility.scan.close();
			permutations(name);
			generatePermutation(name, 0, name.length());
			Collections.sort(arr);
			Collections.sort(arl);
			int i = 0;
			for (; i < arr.size(); i++) {
				System.out.println(arr.get(i) + " " + arl.get(i));
			}

			if (arr.equals(arl)) {
				System.out.println("both are same" + "and the number of permutations are " + i);
			} else {
				System.out.println("wrong");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
