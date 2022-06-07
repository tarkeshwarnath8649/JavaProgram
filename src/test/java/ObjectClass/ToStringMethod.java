package ObjectClass;

public class ToStringMethod extends Object{
	
	int pages;
	String bName;
	
	public ToStringMethod(int pages, String bName) {
		this.pages = pages;
		this.bName = bName;
	}
	
	@Override
	public String toString() {
		 return this.pages+ " "+ this.bName;
	}
	
	public static void main(String[] args) {
		ToStringMethod t1 =  new ToStringMethod(100, "Java");
		System.out.println(t1);
	}

}
