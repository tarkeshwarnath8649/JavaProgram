package ConstructorChaningConcept;

public class CallToThis2 {
	
	int l,b;
	String color;
	
	public CallToThis2(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	public CallToThis2(int l, int b, String color) {
		this(l,b);
		this.color = color;
	}
	
	public void display() {
		System.out.println(l);
		System.out.println(b);
		if(color!=null) {
			System.out.println(color);
		}
		
	}
	
	public static void main(String[] args) {
		CallToThis2 c1 = new CallToThis2(8,9);
		c1.display();
		CallToThis2 c2 = new CallToThis2(8,9,"Red");
		c2.display();
	}

}
