package ObjectClass;

public class EqualsMethod {
	
	int pages;
	String bName;
	
	public EqualsMethod(int pages, String bName) {
		this.pages = pages;
		this.bName = bName;
	}
	
	@Override
	public boolean equals(Object o1) {
		
		EqualsMethod e2 = (EqualsMethod) o1;
		return this.bName == e2.bName && this.pages == e2.pages;
	}
	
	
	public static void main(String[] args) {
		EqualsMethod e1 =  new EqualsMethod(100, "Java");
		EqualsMethod e2 =  new EqualsMethod(200, "Java");
		System.out.println(e1.equals(e2));
	}

}
