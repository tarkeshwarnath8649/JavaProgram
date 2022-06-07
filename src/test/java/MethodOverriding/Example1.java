package MethodOverriding;

class A{
	 public void run() {
		 System.out.println("In Super class run method");
	 }
	 
	 public static void wish() {
		 
		 
		 System.out.println("In Super class Wish method");
	 }
}

public class Example1 extends A{
	
	@Override
	public void run() {
		System.out.println("In Sub class run method");
	}
	
	
	public static void wish() {
		 System.out.println("In Sub class Wish method");
	 }
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.run();
		
		Example1 e1 = new Example1();
		e1.run();
		e1.wish();
	}

}
