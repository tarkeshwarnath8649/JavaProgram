package ConstructorConcept;

public class Example1 {
	
	String fName;
	
	public Example1() {
		System.out.println("Default constructor");
	}
	
	public Example1(String name) {
		fName = name;
		System.out.println(fName);
	}
	
	public static void main(String[] args) {
		
		Example1 e1 = new Example1("Rose");
		Example1 e2 = new Example1("Lilly");
		Example1 e3 = new Example1();
		
	}

}
