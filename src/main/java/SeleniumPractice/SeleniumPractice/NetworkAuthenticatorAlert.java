package SeleniumPractice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetworkAuthenticatorAlert {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String modifiedUrl = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		
		driver.get(modifiedUrl);
	}
	
}
