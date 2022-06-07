package PatternPrograms;

public class Pattern23 {
	
	public static void main(String[] args) {
		
		int space = 2;
		int number=1;
		int value = 1;
		for(int i = 1;i<=3;i++) {
			for(int k = 1;k<=space;k++) {
				System.out.print(" ");
				
			}
			for(int j = 1;j<=number;j++) {
				System.out.print(i);
			}
			space--;
			number++;
			System.out.println();
		}
	}

}
