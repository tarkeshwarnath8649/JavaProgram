package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.Test;

public class GroupsInTestNG {
	
	@Test(groups = "Smoke")
	public void smokeTest1() {
		System.out.println("Smoke Test1");
	}
	
	@Test(groups = "Smoke")
	public void smokeTest2() {
		System.out.println("Smoke Test2");
	}
	
	@Test(groups = "Regression")
	public void regressionTest1() {
		System.out.println("Regression Test1");
	}
	
	@Test(groups = "Regression")
	public void regressionTest2() {
		System.out.println("Regression Test2");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void regressionSmokeTest1() {
		System.out.println("Regression Smoke Test1");
	}

}
