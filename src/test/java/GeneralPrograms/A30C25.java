package GeneralPrograms;

public class A30C25 {
	
	public static void main(String[] args) {
		
		int a = 30;
		
		for(char ch = 'A'; ch <= 'K'; ch+=2) {
			System.out.println(ch+" "+a);
			a-=5;
		}
	}

}
