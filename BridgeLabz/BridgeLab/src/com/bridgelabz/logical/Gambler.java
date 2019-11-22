package com.bridgelabz.logical;
/******************************************************************************
 * Purpose: Simulates a gambler who start with $stake and place fair $1 bets 
 *  until he/she goes broke (i.e. has no money) or reach $goal.
 *  Keeps track of the number of times he/she wins and the number of bets he/she makes.
 *  Run the experiment N times, averages the results, and prints them out.
 *
 * @author RAHUL CHITTURI
 * @version 10.0
 * @since 11-11-2019
 *
 ******************************************************************************/
import java.util.Scanner;

public class Gambler {

	/**
	 * Function to simulate gamble
	 * 
	 * @param n      the value of no of times to bet
	 * @param $stack the amount which you have
	 * @param $goal  the value which to reach to win the gamble (not the bet)
	 */
	static void gamble(int noOfTimes, int $Stack, int $Goal) {
		int bets = 0; // total number of bets made
		int wins = 0; // total number of games won

		// repeat number of times
		for (int i = 0; i < noOfTimes; i++) {
			int cash = $Stack;

			while (cash > 0 && cash < $Goal) {
				bets++;

				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == $Goal)
				wins++; // to find no. of wins
		}

		// print results
		System.out.println();
		System.out.println(wins + " wins out of of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Percent of games lost = " + 100.0 * (noOfTimes - wins) / noOfTimes);
		System.out.println("Total bets in " + noOfTimes + " games = " + bets);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, $stack, $goal;
		System.out.println("enter stack amount");
		$stack = s.nextInt();
		System.out.println("enter goal amount");
		$goal = s.nextInt();
		System.out.println("enter no of times to gamble");
		n = s.nextInt();
		s.close();
		gamble(n, $stack, $goal);

	}
}
