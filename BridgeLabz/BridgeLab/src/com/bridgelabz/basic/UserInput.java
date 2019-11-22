/********************************************************************************************
 * Purpose   :To read the User Input and Replace String Template �Hello <<UserName>>, How are you?� 
 * @author   :Rahul C H
 * @version  :1.0
 * @date     :14-11-2019
 * @Filename :UserInput.java
 ********************************************************************************************/
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class UserInput {
	/*
	 * The main function is written to test UserInput class
	 */
	public static void main(String[] args) {
		try {
			int FLAG = 1;
			String USER_NAME = "";
			System.out.println("Enter User Name:");
			while (FLAG != 0) {
				USER_NAME = Utility.scan.next();
				if (USER_NAME.length() < 4) {
					System.out.println("enter valid user name");
				} else {
					FLAG = 0;
				}
			}
			String str = "HELLO USER, How are you?";
			System.out.println(str.replace("USER", USER_NAME));
			Utility.scan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
