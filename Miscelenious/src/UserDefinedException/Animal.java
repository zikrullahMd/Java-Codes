package UserDefinedException;

public class Animal {

	static String name;
	static int age;
	//constructor
	
	public Animal(String name, int age) throws AgeException{
		if(age<0) {
			throw new AgeException("Age cannot be negative");
		}else {
			age = this.age;
			name = this.name;
		}
	}
	
}
