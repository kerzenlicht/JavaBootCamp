package Final;

import junit.framework.TestCase;
import Final.SecondActivity;

public class SecondActivityTest extends TestCase {

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	public void testGetSum() {
		
		int a = 10;
		int b = 20;			
	
		assertEquals(30, (theCalculator.getSum(a,b)));
		assertEquals(30, (theCalculator.getSum(b,a)));		

		a = -10;		
		b =  20;		
	
		assertEquals(10, (theCalculator.getSum(a,b)));
		assertEquals(10, (theCalculator.getSum(b,a)));
		
		a = -10;		
		b = -20;		
		
		assertEquals(-30, (theCalculator.getSum(a,b)));
		assertEquals(-30, (theCalculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 5;
		int b = 4;		
	
		assertEquals(1, (theCalculator.getDifference(a,b)));		
		assertEquals(-1, (theCalculator.getDifference(b,a)));

		a = 5;
		b = -4;
	
		assertEquals(9, (theCalculator.getDifference(a,b)));		
		assertEquals(-9, (theCalculator.getDifference(b,a)));	
	
		a = -20;
		b = -10;
	
		assertEquals(-10, (theCalculator.getDifference(a,b)));		
		assertEquals(10, (theCalculator.getDifference(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 10;
		double b = 20;			
		
		assertEquals(200, (theCalculator.getProduct(a,b)),0);
		assertEquals(200, (theCalculator.getProduct(b,a)),0);		

		a = -10;		
		b = 20;		
		
		assertEquals(-200, (theCalculator.getProduct(a,b)),0);
		assertEquals(-200, (theCalculator.getProduct(b,a)),0);
		
		a = -2;		
		b = -10;		
		assertEquals(20, (theCalculator.getProduct(a,b)),0);
		assertEquals(20, (theCalculator.getProduct(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 20;	double b = 10;		
		
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		assertEquals(-3, (theCalculator.getQuotient(a,b)),0);		
		assertEquals(-0.33, (theCalculator.getQuotient(b,a)),0.007);	
	
		a = -10;	b = -5;
		
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);			
		}
		
		
		}
	


