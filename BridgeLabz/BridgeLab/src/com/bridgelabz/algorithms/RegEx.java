package com.bridgelabz.algorithms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		 Pattern pattern = Pattern.compile("geeks"); 
		  
	        // Search above pattern in "geeksforgeeks.org" 
	        Matcher m = pattern.matcher("geeksforgeeks.org"); 
	  
	        // Print starting and ending indexes of the pattern 
	        // in text 
	        while (m.find()) 
	            System.out.println("Pattern found from " + m.start() + 
	                               " to " + (m.end()-1)); 
	}

}
