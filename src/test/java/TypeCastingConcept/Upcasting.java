package TypeCastingConcept;

class Demo2{
	
	 int a = 10;
	 static int b = 20;
	 public void run() {
		 System.out.println("In Run Method");
	 }
}

public class Upcasting extends Demo2{
	
	int a = 20;
	static int b = 30;
	
	public void wish() {
		System.out.println("In Wish method");
	}
	
	public static void main(String[] args) {
		
		Demo2 d1 = new Upcasting();
		d1.run();
		//d1.wish(); CTE becuase Sub class properties will be hidden during Upcasting
		
		System.out.println(d1.a);
		System.out.println(b); // 30
		System.out.println(d1.b); //20
	}

}
