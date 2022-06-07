package InterfaceConcept;

interface I1{
	void run();
}

interface I2{
	void run();
}

class C1{
	public void wish() {
		System.out.println("In Super class Wish");
	}
}
public class MultipleInheritance extends C1 implements I1,I2 {
	
	public void run() {
		System.out.println("In Run method");
	}
	
	@Override
	public void wish() {
		System.out.println("In Sub class Wish");
	}
	
	public static void main(String[] args) {
		 MultipleInheritance m1 = new MultipleInheritance();
		 m1.run();
		 m1.wish();
	}

}
