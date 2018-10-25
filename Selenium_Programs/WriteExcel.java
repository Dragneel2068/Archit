package Selenium_Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fs = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestCase.xlsx");
		Workbook wbk = WorkbookFactory.create(fs);
		Sheet sh = wbk.getSheet("Sheet1");
		Row rw = sh.getRow(2);
		Cell cl = rw.getCell(2);
		System.out.println("Previous value:"+cl.getStringCellValue());
		cl.setCellValue("ORACLE");
		System.out.println("After value:"+cl.getStringCellValue());
		
		
		System.out.println("Previous value:"+sh.getRow(2).getCell(3).getStringCellValue());
		sh.getRow(2).getCell(3).setCellValue("SOFTWARE");
		System.out.println("After value:"+sh.getRow(2).getCell(3).getStringCellValue());
		
		
		//Writing the data into the file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestCase.xlsx");
		wbk.write(fos);
		wbk.close();
	}

}
