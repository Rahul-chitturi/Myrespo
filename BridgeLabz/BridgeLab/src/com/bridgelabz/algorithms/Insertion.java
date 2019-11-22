package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;;

/********************************************************************************************
 * Purpose :To insertionsort the given array
 * 
 * @author :Rahul C H
 * @version :1.0
 * @date :14-11-2019
 * @Filename :insertion.java
 ********************************************************************************************/
public class Insertion {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 6, 3, 2, 4 };
		int sorted[] = Utility.insertionSort(arr);
		for (int k : sorted) {
			System.out.println(k);
		}
	}

}
