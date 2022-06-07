package SeleniumPractice.SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteToPropertyFile {
	
	public static void writeToPropertyFile(String filePath, String key, String value) {
		
		try {
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		prop.setProperty(key,value);
		
		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos, "Added Key: "+key+ " and value: "+value);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public static void writeData() {
		WriteToPropertyFile.writeToPropertyFile("./resources/externalFiles/data.properties", "AutheticationType", "oAuth2");
	}

}
