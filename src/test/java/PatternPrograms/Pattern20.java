package PatternPrograms;

public class Pattern20 {
	public static void main(String[] args) {

		int a = 10;
		for(int i = 1;i<=3;i++) {
			for(int j = 3;j>=i;j--) {
				System.out.print(a+" ");
				a+=5;
			}
			System.out.println();
		}
	}

}
