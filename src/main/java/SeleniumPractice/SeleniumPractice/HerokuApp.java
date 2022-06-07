package SeleniumPractice.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class HerokuApp {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		// Handling dropdown
		
//		WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
//		dropdownLink.click();
//		
//		WebElement dropdown = driver.findElement(By.id("dropdown"));
//		
//		Select sct = new Select(dropdown);
//		sct.selectByVisibleText("Option 1");
//		driver.navigate().back();
//		Thread.sleep(1000);
		
		// Handling disappering elements
		
		WebElement disapearingLink = driver.findElement(By.linkText("Disappearing Elements"));
		disapearingLink.click();
		
		
		WebElement gallery = driver.findElement(By.linkText("Gallery"));
		
//		if(gallery.isDisplayed()) {
//			Thread.sleep(2000);
//			gallery.click();
//		}
//		else {
//		while(!gallery.isDisplayed()) {
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			Thread.sleep(2000);
//		}
//		gallery.click();
//		}
		
		
		
//		driver.findElement(By.linkText("Infinite Scroll")).click();
//		
//		WebElement myElement = driver.findElement(By.xpath("//div[@class='jscroll-inner']/div[5]"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		
//		js.executeScript("arguments[0].scrollIntoView();", myElement);
//		
//		System.out.println(myElement.getText());
//		
		driver.quit();
	}

}
