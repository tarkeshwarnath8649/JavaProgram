package ConstructorChaningConcept;

class A{
	public A() {
		System.out.println("In Super class constructor");
	}
}

class B extends A{
	public B() {
		System.out.println("In Sub class constructor");
	}
}

public class CallToSuper1 {
	
	public static void main(String[] args) {
		B b1 = new B();
	}
	
	

}
