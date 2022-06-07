package ConstructorChaningConcept;

public class Developer extends Employee{

	String name;
	int age;
	double yoe;
	double salary;
	String lang;
	
	public Developer(String name, int age, double yoe, double salary, String lang) {
		super(name,age,yoe,salary);
		this.lang = lang;
		System.out.println(lang);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(lang);
	}
	
	
}
