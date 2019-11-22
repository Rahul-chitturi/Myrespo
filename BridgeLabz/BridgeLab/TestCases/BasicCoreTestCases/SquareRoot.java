package BasicCoreTestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class SquareRoot {

	@Test
	void test0() {
	double result =  Utility.sqrt(25);
	double expected = 5.0;
	assertEquals(expected, result);
	}

}
