package Final;

import java.util.Arrays;

public class FirstActivity  {

	public static void main(String[] args) throws IncorrectNameException {
		Employee_P employeeArray[] = new Employee_P[4];
		
		
		employeeArray[0] = new Employee_P();
		employeeArray[0].setName("Sarah Johnson");
		employeeArray[0].setAge(21);
		employeeArray[0].setSalary(500);
		employeeArray[0].setTitle("Shop assistant");
		employeeArray[0].setCompany("'Ikea'");
			
		employeeArray[1] = new Employee_P();
		employeeArray[1].setName("Anna Smith");
		employeeArray[1].setAge(34);
		employeeArray[1].setSalary(2000);
		employeeArray[1].setTitle("Administrator");
		employeeArray[1].setCompany("'Boring Office'");
		
		employeeArray[2] = new Employee_P();
		employeeArray[2].setName("Jon Dagger");
		employeeArray[2].setAge(37);
		employeeArray[2].setSalary(20500);
		employeeArray[2].setTitle("Killer");
		employeeArray[2].setCompany("'Leon'");
			
		employeeArray[3] = new Employee_P();
		employeeArray[3].setName("James Jones");
		employeeArray[3].setAge(40);
		employeeArray[3].setSalary(3500);
		employeeArray[3].setTitle("Project Manager");
		employeeArray[3].setCompany("'Google Inc'");
		 
		System.out.println("Order of employees before sorting: ");
		
		for(int i=0; i < employeeArray.length; i++){
	            System.out.println( "Employee " + (i+1) + " - Name: " + employeeArray[i].getName() + ", Age: " + employeeArray[i].getAge() 
	            		+ ", Company: " + employeeArray[i].getCompany() + ", Salary: " + employeeArray[i].getSalary());
	    }
		
		Arrays.sort(employeeArray, new SalaryComparator());
        System.out.println("\n\nOrder of employees after sorting by salary is: ");
		
        for(int i=0; i < employeeArray.length; i++){
            System.out.println( "Employee " + (i+1) + " - Name: " + employeeArray[i].getName() + ", Age: " + employeeArray[i].getAge() 
            		+ ", Company: " + employeeArray[i].getCompany() + ", Salary: " + employeeArray[i].getSalary());
        }
        
        System.out.println("\n\n");
        for(int i=0; i < employeeArray.length; i++){
            System.out.println( "Employee " + (i+1) + " - Introduction: " + employeeArray[i].introduce());
        }
		
}


}
	
	


