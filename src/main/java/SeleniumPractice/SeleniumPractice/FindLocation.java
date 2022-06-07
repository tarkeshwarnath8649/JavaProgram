package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindLocation {
	
	@Test
	public void findLocationOfLink() {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Point p = gmailLink.getLocation();
		
		int x = p.getX();
		int y = p.getY();
		
		System.out.println(x+" "+y);
		System.out.println(gmailLink.getCssValue("font-size"));
		System.out.println(gmailLink.getCssValue("color"));
	}

}
