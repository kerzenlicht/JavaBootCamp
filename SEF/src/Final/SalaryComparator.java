package Final;

import java.util.Comparator;

public class SalaryComparator implements Comparator{
	    
	    public int compare(Object emp1, Object emp2){
	    
	       double emp1Salary = ((Employee_P)emp1).getSalary();        
	       double emp2Salary = ((Employee_P)emp2).getSalary();
	       
	        if(emp1Salary > emp2Salary)
	            return 1;
	        else if(emp1Salary < emp2Salary)
	            return -1;
	        else
	            return 0;    
	    }
	    
	}

