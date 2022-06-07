package screenshotPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(CustomListener.class)
public class ListenersConceptInTestNG extends BaseClassForListener{
	
	WebDriver driver;
	
	@BeforeMethod
	public void startDriver() {
		setDriver();
	}
	
	@Test
	public void launchBrowser() throws InterruptedException {
		
		
		List<WebElement> headings = driver.findElements(By.xpath("//h4/b"));
		
		String linkXpath1 = "((//h4/b[text() = '";
		String linkXpath2 = "']/../following-sibling::ul)[1]//a)";
		
	    int headingSize = headings.size();
	    
	    for(int i = 0;i<headingSize;i++) {
	    	
	    	String headingText = headings.get(i).getText();
	    	String expectedText = "SAP1";
	    	Assert.assertEquals(false, true);
	    	
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
