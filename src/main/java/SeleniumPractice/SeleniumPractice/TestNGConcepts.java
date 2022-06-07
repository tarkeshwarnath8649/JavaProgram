package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.Test;

public class TestNGConcepts {

	@Test
	public void testB() {
		System.out.println("In Test B");
	}
	
	@Test(enabled=false)
	public void testA() {
		System.out.println("In Test A");
	}
	
	@Test
	public void testC() {
		System.out.println("In Test A");
	}
}
