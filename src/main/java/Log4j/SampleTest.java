package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleTest {

	Logger log = Logger.getLogger(SampleTest.class);
	ExtentReports extent;

	@BeforeTest
	public void extentReprot() {
		
		PropertyConfigurator.configure("log4j.properties");

		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSpark_Report.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		extent.attachReporter(spark);

	}


	@Test
	public void launchBrowser() throws InterruptedException {

		ExtentTest test = extent.createTest("Launch Google Browser").assignCategory("Smoke");

		log.info("********************** Starting the Test!!!!!!! **********************");
//		log.fatal("********************** Fatal **********************\"");
//		log.warn("********************** Warning **********************\"");
//		log.error("********************** Error **********************\"");

		System.setProperty("webdriver.chrome.driver", "/Users/tarsingh10/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		log.info("********************** Launching Google Site **********************");
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Sample search");
		driver.close();
		test.pass("Browser is launched and String is passed in the Search box");
		//test.info("Info");
		//test.fail("Fail");
		//test.warning("Warning");
		
	}
	
	@Test
	public void test2() {
		ExtentTest test = extent.createTest("Test 2").assignCategory("Regression");
	    test.fail("Failed test case");
		
	}
	
	@AfterTest
	public void endTest() {
		extent.flush();
	}

}
