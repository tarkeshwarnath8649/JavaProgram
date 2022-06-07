package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.Test;

public class TestNGPriorityConcept {
	
	@Test(priority=1)
	public void a() {
		System.out.println("A");
	}
	
	@Test
	public void b() {
		System.out.println("B");
	}
	
	@Test(priority=-1)
	public void c() {
		System.out.println("C");
	}
	
	@Test(priority=0)
	public void d() {
		System.out.println("D");
	}
	
	

}
