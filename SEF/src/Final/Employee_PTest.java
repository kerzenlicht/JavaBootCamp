package Final;

import junit.framework.TestCase;

public class Employee_PTest extends TestCase {
	  Employee_P emp = new Employee_P();
	 
	  public void testSetAndGetName() throws IncorrectNameException {
	        String testName = "Lola";
	        assertNull(emp.getName());
	        emp.setName(testName);
	        assertEquals(testName, emp.getName());
	  }
	  public void testSetAndGetAge() {
	        int testAge = 45;
	           emp.setAge(testAge);
	        assertEquals(testAge, emp.getAge(), 0);
	  }
	  public void testSetAndGetSalary() {
	        double testSalary = 500;
	        emp.setSalary(testSalary);
	        assertEquals(testSalary, emp.getSalary(), 0);
	  }
	  public void testSetAndGetCompany() {
	        String testCompany = "Microsoft Inc";
	        assertNull(emp.getCompany());
	        emp.setCompany(testCompany);
	        assertEquals(testCompany, emp.getCompany());
	  }

}
