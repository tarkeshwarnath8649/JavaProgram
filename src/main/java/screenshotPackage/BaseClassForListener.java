package screenshotPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassForListener {
	
	public static WebDriver driver;
	
	
	public  void setDriver() {
		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
	}
	
	public void getScreenshot(String methodName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("resources/screenshots/"+methodName+".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
