package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S223411761";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "SaiPriyamvada.k";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    date.increment();
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	   
	    DateUtil date = new DateUtil(1, 1, 2024);
	    date.decrement();
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test
	public void testNextDayJune1st1994() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    date.increment();
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDayJune2nd1994() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    date.increment();
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDayJune14th1994() {
	    DateUtil date = new DateUtil(14, 6, 1994);
	    date.increment();
	    Assert.assertEquals(15, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDayJune30th1994() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testNextDayJune31st1994() {
	    DateUtil date = new DateUtil(31, 6, 1994);
	    int originalDay = date.getDay();
	    int originalMonth = date.getMonth();
	    int originalYear = date.getYear();
	    date.increment();
	    Assert.assertEquals(originalDay, date.getDay());
	    Assert.assertEquals(originalMonth, date.getMonth());
	    Assert.assertEquals(originalYear, date.getYear());
	}


	@Test
	public void testNextDayJanuary15th1994() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDayFebruary15th1994() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDayNovember15th1994() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDayDecember15th1994() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}


	@Test
	public void testNextDayJune15th1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testNextDayJune15th1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testNextDayJune15th2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testNextDayJune15th2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}



	/*
	 * Extra test case: create additional test cases for February with a leap year condition.
	 */

	@Test
	public void testLeapYearFebruary28ShouldIncrementToFebruary29() {
	   
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("LeapYearFebruary28ShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
		}

	    
	}
	

