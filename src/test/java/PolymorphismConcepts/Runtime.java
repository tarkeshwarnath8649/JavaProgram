package PolymorphismConcepts;

//Methods should be non static
// Inheritance should be there
// Upcasting should be there

interface Bank {
	double rateOfInt();
}

class ICICI implements Bank {
	public double rateOfInt() {
		return 6.8;
	}
}

class HDFC implements Bank {
	public double rateOfInt() {
		return 6.9;
	}
}

class SBI implements Bank {
	public double rateOfInt() {
		return 6.5;
	}
}

public class Runtime {
	
	public static void main(String[] args) {
		Bank b1 = new ICICI();
		System.out.println(b1.rateOfInt());
		
		Bank b2 = new HDFC();
		System.out.println(b2.rateOfInt());
		
		Bank b3 = new SBI();
		System.out.println(b3.rateOfInt());
	}
	
	

}
