package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class Guru99{
	
	@Test
	public void launchBrowser() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/tarsingh10/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		Thread.sleep(5000);
		List<WebElement> headings = driver.findElements(By.xpath("//h4/b"));
		
		String linkXpath1 = "(((//h4/b)[";
		String linkXpath2 = "]/../following-sibling::ul)[1]//a)[3]";
		
	    int headingSize = headings.size();
	    
	    for(int i = 0;i<headingSize;i++) {
	    	
	    	String xpath3rdElement = linkXpath1+(i+1)+linkXpath2;
	    	driver.findElement(By.xpath(xpath3rdElement)).click();
	    	Thread.sleep(2000);
	    	
	    	
	    }
	    driver.quit();
		
		
	}
}
