package GeneralPrograms;

public class SampleTest {
	
	public static void main(String[] args) {
		String str = "aaaabbbbcccc";

		String s1= str.substring(str.indexOf("a"), str.indexOf("b"));
		System.out.println(s1);
		
		String s2= str.substring(str.indexOf("b"), str.indexOf("c"));
		System.out.println(s2);
		
		String s3= str.substring(str.indexOf("c"), str.length());
		System.out.println(s3);
	}

}
