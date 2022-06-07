package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("./resources/externalFiles/data.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty("username");
		
		System.out.println(data);
		
		//Write to Property file
		prop.setProperty("YOE", "10");
		
		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos, "Added Year of experience");
		
		
	}

}
