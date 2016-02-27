package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertTrue(1==1);
		
		MyInteger testOne   = new MyInteger(7);
		MyInteger testTwo   = new MyInteger(2);
		MyInteger testThree = new MyInteger(465);
		MyInteger testFour  = new MyInteger(6);
		MyInteger testFive  = new MyInteger(100);
		MyInteger testSix   = new MyInteger(4);
		
		boolean testResultOne, testResultTwo, testResultThree,
				testResultFour, testResultFive, testResultSix;
		
		testResultOne = testOne.isEven();
		assertEquals(false, testResultOne);
		
		testResultTwo = testTwo.isPrime();
		assertEquals(true, testResultTwo);
		
		testResultThree = testThree.isOdd();
		assertEquals(true, testResultThree);
		
		testResultFour = testFour.isEven();
		assertEquals(true, testResultFour);
		
		testResultFive = testFive.isPrime();
		assertEquals(false, testResultFive);
		
		testResultSix = testSix.isOdd();
		assertEquals(false, testResultSix);
		
	}

}
