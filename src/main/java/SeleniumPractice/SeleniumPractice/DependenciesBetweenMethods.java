package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.Test;

public class DependenciesBetweenMethods {
	
	@Test()
	public void createUser() {
		System.out.println("Running Create User");
	}
	
	@Test(dependsOnMethods = {"createUser","authorizeUser"})
	public void AdeleteUser() {
		System.out.println("Running Delete User");
	}
	
	@Test
	public void authorizeUser() {
		System.out.println("Running Authorize User");
	}
	
	@Test
	public void updateUser() {
		System.out.println("Running Update User");
	}

}
