package Final;

public class Employee_P extends Person_P {

	
	private double salary;
	private String title;
	private String company;
	
    public Employee_P (){ 
		
	}
	
	public double getSalary() {
		return salary;
	}
	

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
    public String introduce () {
		return "I work as a " + title + " in " + company;
	}
	
	}

	
