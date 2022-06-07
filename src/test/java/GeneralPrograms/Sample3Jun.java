package GeneralPrograms;

public class Sample3Jun {
	
	public static void main(String[] args) {
		
		String s1 = " PID 41780 | ";
		
		s1=s1.substring(s1.indexOf("4"), s1.indexOf("|")).trim();
		System.out.println(s1);
	}

}
