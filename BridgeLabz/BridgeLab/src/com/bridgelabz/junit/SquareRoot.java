package  com.bridgelabz.junit;
/******************************************************************************
	 * Purpose:  Program to find the square root of a given nos
     *
     * @author  :RAHUL CHITTURI
     * @version :1.0
     * @since   :11-11-2019
	 *
	 ******************************************************************************/

import com.bridgelabz.utility.Utility;;
public class SquareRoot {
	
/**
 * Main method to test the class
 * @param args
 * @throws Exception if input is not integer
 */
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("enter no to find square root");
			double c = Utility.scan.nextDouble();
			System.out.println("square root is " + Utility.sqrt(c));
			Utility.scan.close();
		} catch (Exception e) {
			System.out.println("enter integer value "+e.getMessage());
		}

	}
}
