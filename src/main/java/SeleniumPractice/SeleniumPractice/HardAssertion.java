package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertion {
	
	@Test
	public void hardAssertTest1() {
		System.out.println("Test1 Started");
		Assert.assertEquals(true, false);
		System.out.println("Test1 Completed");
	}
	
	@Test
	public void hardAssertTest2() {
		System.out.println("Test2 Started");
		Assert.assertEquals(true, false);
		System.out.println("Test2 Completed");
	}

}
