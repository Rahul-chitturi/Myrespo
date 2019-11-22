package com.bridgelabz.datastrure;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;
/**
 * @author Rahul C H
 * 
 */
public class UnorderedListFile {
	
	/**
	 * main method to file read and write and taking input from user
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Unordered<String> un = new Unordered<String>();
		@SuppressWarnings("resource")
		Scanner scan =  new Scanner(System.in);
		try {
			@SuppressWarnings("resource")
			FileReader file = new FileReader("C:\\Users\\Rahul C H\\git\\BridgeLab\\BridgeLab\\src\\Unorder.txt");
			
			int i = 0;
			String sb = "";
			while((i=file.read())!=-1) {
		
				sb = sb+(char) i ;
			}
			String arr[] = sb.split(" ");
			for(int j = 0 ; j<=arr.length -1; j++) {
			
				un.add(arr[j]);
			}
			
		System.out.println("ENETR A WORD TO SEARCH");
		String word = scan.nextLine();
		if(un.search(word)) {
			un.remove(word);
			System.out.println("word removed form list");
		}else {
			un.add(word);
			System.out.println("word added to the list");
		}
		un.disp();
		int size = un.size();
		FileWriter filee = new FileWriter("C:\\Users\\Rahul C H\\git\\BridgeLab\\BridgeLab\\src\\Unorder.txt");
	for(int h= 0 ; h<=size -1; h++) {
		filee.write(un.pop(0)+" ");
	}
	filee.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
