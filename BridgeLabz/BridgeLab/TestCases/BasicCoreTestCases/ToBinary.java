package BasicCoreTestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class ToBinary {

	@Test
	void test0() {
		int arr[] = Utility.toBinary(12);
		int ar[] = { 1, 1, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			assertEquals(ar[i], arr[i]);
		}
	}

	@Test
	void test1() {
		int arr[] = Utility.toBinary(16);
		int ar[] = { 0, 0, 0, 1, 0, 0, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			assertEquals(ar[i], arr[i]);
		}
	}

	@Test
	void test2() {
		int arr[] = Utility.toBinary(32);
		int ar[] = { 0, 0, 1, 0, 0, 0, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			assertEquals(ar[i], arr[i]);
		}
	}
}
