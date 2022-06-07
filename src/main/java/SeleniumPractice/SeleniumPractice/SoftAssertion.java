package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	SoftAssert softAssert;

	@Test
	public void softAssertTest1() {

		softAssert = new SoftAssert();

		System.out.println("Login");
		System.out.println("Create user");
		System.out.println("Modify user");

		softAssert.assertEquals(true, false);

		System.out.println("Create Deal");
		System.out.println("Create other modules");

	}

	@Test
	public void softAssertTest2() {

		softAssert = new SoftAssert();
		System.out.println("****************************************************");

		System.out.println("Login");
		System.out.println("Create user");
		System.out.println("Modify user");

		softAssert.assertEquals(false, true);

		System.out.println("Create Deal");
		System.out.println("Create other modules");

	}
	
	@AfterTest
	public void tearDown() {
		softAssert.assertAll();
	}

}
