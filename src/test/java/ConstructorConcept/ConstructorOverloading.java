package ConstructorConcept;

public class ConstructorOverloading {
	
	int l,b;
	String color;
	
	public ConstructorOverloading(int l, int b) {
		this.l=l;
		this.b = b;
		this.display();
		
	}
	
	public ConstructorOverloading(int l, int b,String color) {
		this.l=l;
		this.b = b;
		this.color = color;
		this.display();
		
	}
	
	public void display() {
		System.out.println(l);
		System.out.println(b);
		
		if(color!=null) {
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
	
		ConstructorOverloading c1 = new ConstructorOverloading(10,20);
		ConstructorOverloading c2 = new ConstructorOverloading(10,20,"Blue");
	
	}
	

}
