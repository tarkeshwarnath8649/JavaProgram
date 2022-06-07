package ConstructorChaningConcept;

public class Tester extends Employee{
	
	String name;
	int age;
	double yoe;
	double salary;
	String type;
	
	public Tester(String name, int age, double yoe, double salary, String type) {
		super(name,age,yoe,salary);
		this.type = type;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(type);
	}
	

}
