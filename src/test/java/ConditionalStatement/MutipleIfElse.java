package ConditionalStatement;

public class MutipleIfElse {
	
	public static void main(String[] args) {
		int a = 20;
		double b = 20.0;
		
		if(a > b) {
			System.out.println(a+ " is greater");
		}
		else if(b > a) {
			System.out.println(b+ " is greater");
		}
		else {
			System.out.println("Both are equal");
		}
	}

}
