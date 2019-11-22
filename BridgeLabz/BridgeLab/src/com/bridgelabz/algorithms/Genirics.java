package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class Genirics {

	public static void main(String[] args) {
		Utility<Integer> n = new Utility<Integer>();
		Integer[] arr = { 1, 3, 4, 2, 2, 4, 5, 3, 3, 4, 456, 345, 2, 4, 2, };
		n.insertionSort1(arr);
		for (int i : arr) {
			System.out.println(i);
		}

		String[] ar = { "abc", "bcd", "abc", "rah", "gfh", "gttr" };

		Utility<String> bubble = new Utility<String>();
		bubble.bubblesort(ar);
		for (String aa : ar) {
			System.out.println(aa);
		}

		Utility<Integer> ss = new Utility<Integer>();
		Integer[] a = { 2, 4, 2, 5, 345, 2344, 2334, 334 };
		ss.sort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
