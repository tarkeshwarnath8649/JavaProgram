package GeneralPrograms;

public class ObJCanBeCreatedInNonStaticMethod {
	
	int a = 10;
	
	public void testObjCreation1() {
		ObJCanBeCreatedInNonStaticMethod o2 = new ObJCanBeCreatedInNonStaticMethod();
		System.out.println(o2.a);
	}
	
	public static void testObjCreation2() {
		ObJCanBeCreatedInNonStaticMethod o1 = new ObJCanBeCreatedInNonStaticMethod();
		System.out.println(o1.a);
	}
	
	public static void main(String[] args) {
		testObjCreation2();
	ObJCanBeCreatedInNonStaticMethod o3 = new ObJCanBeCreatedInNonStaticMethod();
	o3.testObjCreation1();
	}

}
