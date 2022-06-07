package SeleniumPractice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollFunctionality {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("File Download")).click();
		Thread.sleep(2000);
		
		//1st way using coordinates
		
		String js_command = "window.scroll(0,500)";
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript(js_command);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", myElement);
		Thread.sleep(2000);
		driver.quit();
		
		// Scroll to bottom
		
		
	}
	

}
