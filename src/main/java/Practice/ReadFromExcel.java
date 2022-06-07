package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f = new File("./resources/externalFiles/Issues Count_New PubAdmin.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet s = wb.getSheet("Sheet1");
		
		Row r = s.getRow(2);
		//Cell c = r.getCell(2);
		Cell c = r.createCell(2);
		c.setCellValue("12");
		
//		int rowNo = s.getPhysicalNumberOfRows();
//		int cellNo = s.getRow(0).getPhysicalNumberOfCells();
//		
//		for(int i = 0;i<rowNo;i++) {
//			for(int j = 0;j<cellNo;j++) {
//				System.out.print(s.getRow(i).getCell(j).toString()+" ");
//			}
//			System.out.println();
//		}
		
		
		
	}

}
