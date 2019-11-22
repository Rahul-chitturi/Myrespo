package BasicCoreTestCases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basic.LeapYear;

class LeapYearTest {

	@Test
	public void leapTest0()
	  {
	    boolean result = LeapYear.isLeap(2000);
	    assertEquals( true, result);
	  }
	  
	  @Test
	  public void leapTest1()
	  {
	    boolean result = LeapYear.isLeap(2004);
	    assertEquals(true, result);
	  }

	  @Test
	  public void leapTest2()
	  {
	    boolean result =LeapYear.isLeap(1900);
	    assertEquals( false, result);
	  }

	  @Test
	  public void leapTest3()
	  {
	    boolean result = LeapYear.isLeap(2005);
	    assertEquals(false, result);
	  }

}
