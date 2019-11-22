package BasicCoreTestCases;
/******************************************************************************
 * Purpose: to check the monthly payments for given amount ,duration and rate.
 *
 * @author  RAHUL CHITTURI
 * @version 1.0
 * @since   11-11-2019
 *
 ******************************************************************************/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class MonthlyPaymentTest {

	@Test
	void test0() {
	int result = (int) Utility.monthlyPayment(10000, 2, 2);
	assertEquals(425, result);
	}
	@Test
	void test1() {
	int result = (int) Utility.monthlyPayment(20000, 4, 10);
	assertEquals(507, result);
	}
	@Test
	void test2() {
	int result = (int) Utility.monthlyPayment(2500000, 1, 9);
	assertEquals(218628, result);
	}
	
	@Test
	void test3() {
	int result = (int) Math.round( Utility.monthlyPayment(15000, 5, 10));
	assertEquals(319, result);
	}
	
	@Test
	void test4() {
	int result = (int) Utility.monthlyPayment(10000, 2, 2);
	assertEquals(425, result);
	}
	  
	@Test
	void test5() {
	int result = (int) Utility.monthlyPayment(10000, 2, 2);
	assertEquals(425, result);
	}
	
	@Test
	void test6() {
	int result = (int) Utility.monthlyPayment(10000, 2, 2);
	assertEquals(425, result);
	}

}
