package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before all the tests in the Class");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before running any test in the class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before each and every test methods");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 method");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 Method");
	}
	
	@AfterMethod()
		public void afterMethod() {
			System.out.println("After each and every test methods");
		}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After all the methods in the class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After all tests in the method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
}
