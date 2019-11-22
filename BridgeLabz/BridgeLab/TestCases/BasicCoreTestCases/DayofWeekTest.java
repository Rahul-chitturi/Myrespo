package BasicCoreTestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class DayofWeekTest {

	@Test
	void test0() {
	   int result =  Utility.dayOfWeek(23, 9, 1997);
	   assertEquals(2, result);
	}
	

	@Test
	void test1() {
	   int result =  Utility.dayOfWeek(11, 11, 2019);
	   assertEquals(1, result);
	}
	
	@Test
	void test3() {
	   int result =  Utility.dayOfWeek(21, 7, 1992);
	   assertEquals(2, result);
	}
	

	@Test
	void tes4() {
	   int result =  Utility.dayOfWeek(17, 9, 1991);
	   assertEquals(2, result);
	}

	@Test
	void test5() {
	   int result =  Utility.dayOfWeek(13, 9, 1994);
	   assertEquals(2, result);
	}

}
