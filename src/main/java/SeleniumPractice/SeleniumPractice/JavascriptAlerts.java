package SeleniumPractice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JavascriptAlerts {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(1000);
		
		Alert at = driver.switchTo().alert();
		at.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(at.getText());
		at.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(1000);
		at.sendKeys("Test Popup");
		Thread.sleep(1000);
		at.accept();
		
		
		driver.quit();
		
		
		
	}

}
