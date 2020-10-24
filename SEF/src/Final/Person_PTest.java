package Final;

import junit.framework.TestCase;

public class Person_PTest extends TestCase {
	Person_P person = new Person_P();
	public void testSetName() throws IncorrectNameException {
	
	try {
	person.setName("Anna23");
	
	}catch (IncorrectNameException e) {
		
	}
    }
	
	public void testSetName1() throws IncorrectNameException {
		Person_P person = new Person_P();	
		person.setName("Anna");
	}


	public void testSetAndGetAge() {
        int testAge = 21;
        assertEquals(0, 0, 0);    
        person.setAge(testAge);
        assertEquals(testAge, person.getAge(), 0);
  }
	
}
