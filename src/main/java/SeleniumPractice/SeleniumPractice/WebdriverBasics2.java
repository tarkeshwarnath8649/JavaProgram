/**
 * 
 */
package SeleniumPractice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class WebdriverBasics2 {

    /**
     * this pg is to show all the selenium methods available and how to use them.
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub


        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); // to del all the cache from browser
        Thread.sleep(2000);
        driver.get("https://www.flipkart.com/");

        //Dynamic waits
        
/* selenium should wait for the page to be loaded. If page load happens in 5 seconds then rest of the time
   will be ignored.*/
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        
/* selenium/driver should wait for another 30sec(specified time) after the page load so that all webelements
 * gets fully loaded or appears in the page.    */
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

}
