package SeleniumPractice.SeleniumPractice;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadFromPDF {

    
    @Test
    public void testPdfContent() throws IOException{
    	
//    	System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver2");
//		WebDriver driver = new ChromeDriver();
    	
    	URL url = new URL("file:///Users/tarsingh10/eclipse-workspace/SeleniumPractice/resources/externalFiles/India%20Promotions%20List_Congratulations.pdf");
    	
    	InputStream is = url.openStream();
    	
    	BufferedInputStream bis = new BufferedInputStream(is);
    	
    	
    	PDDocument pdDoc = PDDocument.load(bis);
    	
    	PDFTextStripper strip = new PDFTextStripper();
    	String data = strip.getText(pdDoc);
    	
    	System.out.println(data);
    	Assert.assertTrue(data.contains("Tarkeshwar"));
    	
        
    }
}
