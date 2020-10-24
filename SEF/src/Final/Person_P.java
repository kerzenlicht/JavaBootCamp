package Final;
public class Person_P {


	private String name;
	private int age;
	

	public Person_P(){
			
	}
	

	public Person_P(String name, int age){
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) throws IncorrectNameException {
		this.name = name;
		char[] chars = name.toCharArray();
	     
	      for(char c : chars){
	         if(Character.isDigit(c)){
	        	 throw new IncorrectNameException(" Name cannot contain digits! ");
	         }
	      }
	
	}

	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}	
	
	public String introduce(){
		return "My name is " + name + " and I am " + age + " years old. ";
	
	}

	

}
