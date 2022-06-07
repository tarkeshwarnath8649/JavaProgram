package SeleniumPractice.SeleniumPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	@DataProvider
	public Object[][] setData(){
		
		// It is 2 dimensional as we get the test data in form of rows and columns
		// First dimension decides the no of times the test will and 2nd dimension contain an array of Objects
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Data1";
		data[0][1] = "Data2";
		
		data[1][0] = "Data3";
		data[1][1] = "Data4";
		
		return data;
	}
	
	@Test(dataProvider = "setData")
	public void getData(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("***************************************");
		
	}

}
