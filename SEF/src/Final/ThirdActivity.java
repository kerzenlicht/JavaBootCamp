package Final;

import static org.junit.Assert.assertEquals;

public class ThirdActivity {

	public static void main(String args[]) {
	   
		int x = 0;
		int y = 10;
		
		try{
			int num = y/x;  
		   
		} 
	        catch(ArithmeticException ex)
		{
	        assertEquals("/ by zero", ex.getMessage());
		}
	finally {
		System.out.println("Nothing wrong with me");
	}  
	}

}


