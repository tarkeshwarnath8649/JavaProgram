package StringClass;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1 = "Java";
		
		System.out.println(s1.charAt(2)); 
		
		System.out.println(s1.concat(" Developer"));
		
		System.out.println(s1.length());
		
		String s2 = "  Java  ";
		String s3 = "JAVA";
		System.out.println(s2.trim());
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.startsWith("Ja"));
	}
	
	
	

}
