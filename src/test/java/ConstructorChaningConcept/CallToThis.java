package ConstructorChaningConcept;

public class CallToThis {
	
	public CallToThis() {
		System.out.println("In default constructor");
	}
	
	public CallToThis(int a) {
		this();
		System.out.println("In Parametrized Constructor");
		
	}
	
	public static void main(String[] args) {
		CallToThis c1 = new CallToThis(2);
	}

}
