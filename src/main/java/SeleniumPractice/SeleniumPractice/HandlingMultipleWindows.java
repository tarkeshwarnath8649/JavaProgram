package SeleniumPractice.SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HandlingMultipleWindows {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	

}
