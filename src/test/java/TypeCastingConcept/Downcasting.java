package TypeCastingConcept;

class Demo3{
	
	 int a = 10;
	 static int b = 20;
	 public void run() {
		 System.out.println("In Run Method");
	 }
}

public class Downcasting extends Demo3 {
	
	int a = 20;
	static int b = 30;
	
	public void wish() {
		System.out.println("In Wish method");
	}
	
	public static void main(String[] args) {
		
		Demo3 d1 = new Downcasting();
		d1.run();
		//d1.wish(); CTE becuase Sub class properties will be hidden during Upcasting
		
		System.out.println(d1.a);
		System.out.println(b); // 30
		System.out.println(d1.b); //20
		
		Downcasting d = (Downcasting) d1;
		d.wish();
		System.out.println(d.a);
		System.out.println(d.b);
		
	}

}
