package ArraysConcept;

public class ArrayDefining {
	
	public static void main(String[] args) {
		
		int a[] = new int[2];
		a[0] = 1;
		a[1]=2;
		
		int[] b= {1,2,3,4};
		
		
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("*****************************");
		
		for(int i:b) {
			System.out.println(i);
		}
	}

}
