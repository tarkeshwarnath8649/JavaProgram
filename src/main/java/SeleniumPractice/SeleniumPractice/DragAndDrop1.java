package SeleniumPractice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop1 {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Drag and Drop")).click();
		
		WebElement a = driver.findElement(By.id("column-a"));
		
		WebElement b = driver.findElement(By.id("column-b"));
		
		Actions act = new Actions(driver);
		 // 1st way to handle
		//act.dragAndDrop(a, b).build().perform();
		
		
		
		//2nd way
		act.moveToElement(a).clickAndHold().moveToElement(b).release().build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
