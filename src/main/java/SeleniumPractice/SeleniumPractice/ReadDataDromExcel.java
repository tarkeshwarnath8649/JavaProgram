package SeleniumPractice.SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataDromExcel {
	
	public static String getDataFromExcel(String filePath, String sheetName,int row, int cellNo) {
		String data = null;
		try {
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			
			Row r = s.getRow(row);
			Cell c = r.getCell(cellNo);
			
			data = c.toString();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	@Test
	public static void readData() {
		String data = getDataFromExcel("./resources/externalFiles/Issues Count_New PubAdmin.xlsx", "Sheet1", 0, 0);
		System.out.println(data);
	}

}
