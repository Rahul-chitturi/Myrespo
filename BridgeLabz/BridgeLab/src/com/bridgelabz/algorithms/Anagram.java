package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

/********************************************************************************************
 * Purpose :Program to find two Strings are anagram or not
 * 
 * @author :Rahul C H
 * @version :1.0
 * @date :14-11-2019
 * @Filename :Anagram.java
 ********************************************************************************************/

public class Anagram {

	public static void main(String[] args) {
		try {
			System.out.println("enter first String......:");
			String str1 = Utility.scan.next();
			System.out.println("enter second String.....:");
			String str2 = Utility.scan.next();
			boolean result = Utility.anagram(str1, str2);
			if(result) {
				System.out.println("strings are anagram......");
			}else {
				System.out.println("Not anagram...........");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
