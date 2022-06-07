package SeleniumPractice.SeleniumPractice;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCSSProperties {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement ele = driver.findElement(By.linkText("A/B Testing"));
		Point p = new Point();
		p.getLocation();
		
		
		
	}
	

}
