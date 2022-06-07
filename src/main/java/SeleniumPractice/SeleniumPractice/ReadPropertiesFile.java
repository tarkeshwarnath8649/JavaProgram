package SeleniumPractice.SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertiesFile {
	

	public String getDataFromPropertyFile(String filePath, String key) {
		String data = null;

		try {
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);

			Properties prop = new Properties();
			prop.load(fis);

			data = prop.getProperty(key).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	@Test
	public static void fetchData() {
		ReadPropertiesFile r1 = new ReadPropertiesFile();
		String userName = r1.getDataFromPropertyFile("./resources/externalFiles/data.properties", "username");
		String password = r1.getDataFromPropertyFile("./resources/externalFiles/data.properties", "password");
		
		System.out.println(userName);
		System.out.println(password);
		
	}

}
