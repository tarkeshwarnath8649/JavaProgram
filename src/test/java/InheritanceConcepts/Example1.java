package InheritanceConcepts;


class A {
	
	static int a = 20;
	int i = 10;
	
	public static void test() {
		System.out.println("In Test");
	}
	
	public void run() {
		System.out.println("In Run");
	}
}

 class B extends A{
	
	public void wish() {
		System.out.println("In Wish");
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println(a1.i);
		a1.run();
		
		System.out.println("*****************************************");
		
		B b1 = new B();
		System.out.println(b1.i);
		b1.run();
		b1.wish();
		System.out.println(b1.a);
		b1.test();
		
	}
	
	
	

}
