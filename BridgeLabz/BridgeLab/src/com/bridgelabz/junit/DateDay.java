package com.bridgelabz.junit;
/******************************************************************************
	 * 
	 * Purpose:  to read a date from user and give the on that day as out put
     *
     * @author  :RAHUL CHITTURI
     * @version :10.0
     * @since   :11-11-2019
	 *
	 ******************************************************************************/



import com.bridgelabz.utility.Utility;;
public class DateDay {
	
	
 /**
  *    main function to test the class
  */
	public static void main(String[] args) {
		try {
		int d, m, y;
		System.out.println("enter date in day month year");
		d = Utility.scan.nextInt();
		m = Utility.scan.nextInt();
		y = Utility.scan.nextInt();
		System.out.println("day is "+Utility.dayOfWeek(d, m, y));
		Utility.scan.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
