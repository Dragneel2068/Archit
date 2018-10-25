package Selenium_Programs;

import java.io.FileInputStream;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileReadData {

	public static void main(String[] args) throws Throwable {
		FileInputStream fs = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestCase.xlsx");
		Workbook wbk = WorkbookFactory.create(fs);
		Sheet sh = wbk.getSheet("Sheet1");
		Row rw = sh.getRow(3);
				
		String customerName = rw.getCell(2).getStringCellValue();
		String customerProject = rw.getCell(3).getStringCellValue();
		
		System.out.println("CustomerName:"+customerName);
		System.out.println("CustomerProject:"+customerProject);
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		System.out.println("\nProperties file:");
		String usr= pObj.getProperty("username");
		String pwd= pObj.getProperty("password");
		String url= pObj.getProperty("url");
		System.out.println(usr);
		System.out.println(pwd);
		System.out.println(url);
	}

}
