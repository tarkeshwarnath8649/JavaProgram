package SeleniumPractice.SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchingBetweenWindows {
    WebDriver driver;
    
    @Test
    public void testSwitchingWindows1() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
      
         // Switch to windows
        Set<String> s = driver.getWindowHandles();
        
        Iterator<String> it = s.iterator();
        String parentWindow = it.next(); // switches from browser to first/parent window id
        String secondChildWindow = it.next(); // second window id
        String thirdChildWindow = it.next();  // third window id
        Thread.sleep(2000);

        // switiching to child window
        driver.switchTo().window(thirdChildWindow);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
    }
    
    
//    Note: If you have to switch between tabs then also you have to use the same approach.
    
    
    
    
    
//    second way
    public void testSwitchingWindows2() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", ".\\resources\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
        
         // Switch to windows
        String parentWindow= driver.getWindowHandle();
        
        Set<String> s = driver.getWindowHandles();
        
        for(String childWindow: s){
            if(!childWindow.equals(parentWindow)){
                driver.switchTo().window(childWindow);
                Thread.sleep(1000);
                System.out.println(driver.getTitle());
            }
        }

        
    }

}
