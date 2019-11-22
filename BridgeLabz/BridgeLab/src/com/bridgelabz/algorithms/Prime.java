package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

/********************************************************************************************
 * Purpose : to find the prime no between 0 to 1000 an if they are pallindrome
 * or anagram or not
 * 
 * @author :Rahul C H
 * @version :1.0
 * @date :14-11-2019
 * @Filename :Prime.java
 ******************************************************************************/

public class Prime {
	public static void main(String[] args) {
		System.out.println("prime between 0 to 1000");
		Utility.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		Utility.primePallindrome();
		System.out.println("prime and anagrams");
		Utility.primeAnagrams();
	}
}
