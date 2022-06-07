package InterfaceConcept;

interface Sample1{
	 void run();
}

class A implements Sample1{
	
	public void run() {
		System.out.println("Overridden method");
	}
}

public class Test {
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.run();
	}
	
	
	

}
