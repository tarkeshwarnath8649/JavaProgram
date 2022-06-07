package SeleniumPractice.SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadAllDataFromExcel {

	public static void getDataFromExcel(String filePath, String sheetName) {

		String data = null;

		try {
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);

			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);

			int rowCount = s.getPhysicalNumberOfRows();
			int cellCount = s.getRow(0).getPhysicalNumberOfCells();

			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < cellCount; j++) {
					data = s.getRow(i).getCell(j).toString();
					System.out.print(data + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public static void readData() {
		ReadAllDataFromExcel.getDataFromExcel("./resources/externalFiles/Issues Count_New PubAdmin.xlsx", "Sheet1");
	}

}
