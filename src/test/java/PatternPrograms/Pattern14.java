package PatternPrograms;

public class Pattern14 {
	
	public static void main(String[] args) {
		int a = 9;
		char ch = 'A';
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(ch+""+a+" ");
				a--;
				ch++;
			}
			System.out.println();
		}
	}

}

//A9 B8 C7 
//D6 E5 F4 
//G3 H2 I1