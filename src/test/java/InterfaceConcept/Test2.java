package InterfaceConcept;

interface SampleTest1{
	void run();
}

interface SampleTest2 extends SampleTest1{
	void wish();
}

class Demo1 implements SampleTest2{
	 public void run() {
		 System.out.println("In Demo class Run method");
	 }
	 
	 public void wish() {
		 System.out.println("In Demo class wish method");
	 }
}

public class Test2 {
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.run();
		d1.wish();
	}

}
