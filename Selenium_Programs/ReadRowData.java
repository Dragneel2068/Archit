package Selenium_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadRowData {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestCase.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		int num = sh.getLastRowNum();
		for(int i=0; i<=num; i++)
		{
			Row rw = sh.getRow(i);
			Cell cl = rw.getCell(2);
			System.out.println(cl.getStringCellValue());
		}
	}

}
