package AbstractionConcept;

public class Son extends Father{
	
	public void house2() {
		System.out.println("House 2 Completed");
	}
	
	public static void main(String[] args) {
		
		Son s1 = new Son();
		s1.house1();
		s1.house2();
	}

}
