package ConstructorChaningConcept;

public class Employee {
	
	String name;
	int age;
	double yoe;
	double salary;
	
	public Employee(String name, int age, double yoe, double salary) {
		this.name = name;
		this.age = age;
		this.yoe = yoe;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(yoe);
		System.out.println(salary);
	}

}
