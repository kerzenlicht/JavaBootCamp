package Final;

import junit.framework.TestCase;

public class Student_PTest extends TestCase {
	Student_P st = new Student_P();
	 
	public void testSetAndGetName() throws IncorrectNameException {
	        String testName = "John";
	        assertNull(st.getName());
	        st.setName(testName);
	        assertEquals(testName, st.getName());
	  }
	
	public void testSetAndGetAge() {
        int testAge = 21;
        st.setAge(testAge);
        assertEquals(testAge, st.getAge(), 0);
  }
	public void testSetAndGetGrade() {
        int testGrade = 10;
         st.setGrade(testGrade);
        assertEquals(testGrade, st.getGrade(), 0);
	}
	public void testSetAndGetSchool() {
        String testSchool = "University of Amsterdam";
        assertNull(st.getSchool());
        st.setSchool(testSchool);
        assertEquals(testSchool, st.getSchool());
  }
}
