package ConstructorChaningConcept;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Developer d = new Developer("Tarkeshwar", 30, 10, 50000, "Angular");
		d.display();
		
		System.out.println("********************************************************************");
		
		Tester t = new Tester("Rahul",32,9,10000,"Automation");
		t.display();
	}

}
