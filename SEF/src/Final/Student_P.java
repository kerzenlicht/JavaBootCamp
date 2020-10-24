package Final;


public class Student_P extends Person_P {


	private int grade;
	private String school;
	

	public Student_P (){ 
		
	}
	
	public int getGrade() {
		return grade;
	}
	

	public void setGrade(int grade) {
		this.grade = grade;
	}
	

	public String getSchool() {
		return school;
	}
	

	public void setSchool(String school) {
		this.school = school;
	}
	
	public String introduce(){
		return "I study in University" + school ;
	}
		
}
