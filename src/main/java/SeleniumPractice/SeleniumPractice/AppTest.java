package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class AppTest{
	
	@Test
	public void launchBrowser() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		Thread.sleep(5000);
		List<WebElement> headings = driver.findElements(By.xpath("//h4/b"));
		
		String linkXpath1 = "((//h4/b[text() = '";
		String linkXpath2 = "']/../following-sibling::ul)[1]//a)";
		
	    int headingSize = headings.size();
	    
	    for(int i = 0;i<headingSize;i++) {
	    	
	    	String headingText = headings.get(i).getText();
	    	String expectedText = "SAP";
	    	
	    	if(headingText.equalsIgnoreCase(expectedText)) {
	    		
	    		String xpath3rdElement = linkXpath1+headingText+linkXpath2+"[3]";
	    		System.out.println(xpath3rdElement);
	    		driver.findElement(By.xpath(xpath3rdElement)).click();
	    		driver.navigate().back();
	    		
	    	}
	    	
	    }
	    driver.quit();
		
		
	}
}
