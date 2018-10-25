package Selenium_Programs;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class JavaFileUtils {
	
	static File fs = new File("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestCase.xlsx"); 
	
	public Properties getProperties() throws Throwable
	{
		FileInputStream f = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestData.properties");
		Properties pObj = new Properties();
		pObj.load(f);
		String usr = pObj.getProperty("username");
		String pwd = pObj.getProperty("password");
		String url = pObj.getProperty("url");
		
		return pObj;
		
	}
	public String getExcelData(String SheetName,int rowNum,int colNum) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(fs);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(rowNum);
		Cell cl = rw.getCell(colNum);
		String data = cl.getStringCellValue();
		return data;
	}
	public String setExcelData(String SheetName,int rowNum,int colNum,String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(fs);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(rowNum);
		Cell cl = rw.createCell(colNum);
		cl.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(fs);
		wb.write(fos);
		wb.close();
		return data;
    }
}
		

