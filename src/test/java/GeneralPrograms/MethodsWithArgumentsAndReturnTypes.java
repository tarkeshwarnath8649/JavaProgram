package GeneralPrograms;

public class MethodsWithArgumentsAndReturnTypes {
	
	public static void run(int i) {
		System.out.println(i);
	}
	
	public void area(int i,int j) {
		System.out.println("Area is "+(i*j));
		
	}
	
	public  double rateOfInt(int a) {
		return a *.25;
	}
	
	public static void main(String[] args) {
		MethodsWithArgumentsAndReturnTypes m1 = new MethodsWithArgumentsAndReturnTypes();
		
		m1.area(10, 20);
		
		MethodsWithArgumentsAndReturnTypes.run(8);
		double roi = m1.rateOfInt(10);
		System.out.println("Roi is "+roi);
		
	}

}
