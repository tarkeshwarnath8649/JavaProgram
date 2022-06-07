package ConstructorChaningConcept;

class A1 {

	public A1() {
		System.out.println("In Super class default constructor");
	}
	
	public A1(int a) {
		this();
		System.out.println("In Super class parameterized constructor");
	}
}

class B1 extends A1{
	
	public B1() {
		super(1);
		System.out.println("In Sub class constructor");
	}
}

public class CallToSuper2 {
	
	public static void main(String[] args) {
		B1 b = new B1();
	}
	
	

}
