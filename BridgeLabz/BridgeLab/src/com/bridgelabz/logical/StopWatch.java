package com.bridgelabz.logical;
/******************************************************************************
 * Purpose:  for measuring the time that elapses between the start and end clicks 
 *
 * @author RAHUL CHITTURI
 * @version 10.0
 * @since 11-11-2019
 *
 ******************************************************************************/
import java.util.Scanner;

public class StopWatch {
	/*
	 * static variables for storing start and end time
	 */
	static double start = 0, stop = 0;

	/**
	 * Function to put start time and print it
	 */
	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}

	/**
	 * function to put stop time and print it
	 */
	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("stopped at " + stop);
	}

	/**
	 * function to calculate elapsed time and print it
	 */
	static void elapsedTime() {
		System.out.println("elapsed time is " + (stop - start) / 1000);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 to start");
		s.next();
		startTime();
		System.out.println("enter to stop");
		s.next();
		s.close();
		stopTime();
		elapsedTime();
	}
}
