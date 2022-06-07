package PolymorphismConcepts;

public class CompileTime {
	
	// Oveloading is must and Methods should be static
	
	public static void run() {
		System.out.println("In default Run");
	}
	
	public static void run(int a) {
		System.out.println("In parameterized Run");
	}
	
	public static void main(String[] args) {
		 run();
		 run(1);
	}

}
