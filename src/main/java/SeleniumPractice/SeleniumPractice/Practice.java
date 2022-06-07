/**
 * 
 */
package SeleniumPractice.SeleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * to test random concepts
 */
public class Practice{

@Test
public void testcase(){
    System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    
    Actions act = new Actions(driver);
    WebElement element= driver.findElement(By.id("id"));
   act.doubleClick(element).perform();// double click()
   act.contextClick(element).perform();//right click
    
}
}
