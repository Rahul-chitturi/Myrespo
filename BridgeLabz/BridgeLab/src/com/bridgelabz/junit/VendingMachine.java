package com.bridgelabz.junit;
/******************************************************************************
	 * Purpose:  There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can 
	 * be returned by Vending Machine. Write a Program to calculate the minimum
	 * number of Notes as well as the Notes to be returned by the Vending Machine 
	 * as a Change
     *
	  * @author RAHUL CHITTURI
      * @version 10.0
      * @since 11-11-2019
	 *
	 ******************************************************************************/


import com.bridgelabz.utility.Utility;

public class VendingMachine {

	/*
	 * static variable I is declared to change notes and Static variable TOTAL is
	 * declared to count total notes
	 */
	static int I, TOTAL;

	/*
	 * Static array to store values of notes
	 */
	static int[] NOTES = { 2000, 500, 100, 50, 10, 5, 2, 1 };

	
	static void notes1(int value) {
	int count[] = new int[NOTES.length];	
	for(int i = 0 ; i<NOTES.length ; i++) {
		if(value>=NOTES[i]) {
			count[i] = value /NOTES[i];
			value = value - (count[i]*NOTES[i]);
		}
	}
	for(int i =0 ;i<count.length ; i++) {
		System.out.println("Notes "+NOTES[i]+" " +"count "+ count[i]+" ");
	}
	}

	/**
	 * Function to find the notes and print the output
	 * 
	 * @param value the amount to which the note to d  espenced
	 */
	
	
	static void notes(int value) {
		if (value / NOTES[I] != 0) {
			TOTAL += (value / NOTES[I]);
			System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
			value = value % NOTES[I];
		}
		I++;
		if (value == 0) {
			System.out.println("total notes :" + TOTAL);
			return;
		}

		notes(value);

	}

	/**
	 * main method to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			System.out.println("enter amoumt");
			int value = Utility.scan.nextInt();
			notes1(value);
			Utility.scan.close();
		} catch (Exception e) {
			System.out.println("enter value in integer");
		}
	}
}
