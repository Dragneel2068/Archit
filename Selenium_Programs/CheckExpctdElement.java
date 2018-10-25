package Selenium_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CheckExpctdElement {

	public static void main(String[] args) throws Throwable {
		/* Check if the expected element is present int the row and print its attributes */ 
		FileInputStream fis = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestCase.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		String expctedvalue="tc_03";
		int rowsize = sh.getLastRowNum();
		boolean flag = false;
		int p=0;
		for(int i=0; i<=rowsize; i++)
		{
			if(expctedvalue.equalsIgnoreCase(sh.getRow(i).getCell(0).getStringCellValue()))
			{
				flag=true;
				p=i;
			}
		}
		Row newrow = sh.getRow(p);
		int colsize=newrow.getLastCellNum();
		
		for(int i=0; i<=colsize-1; i++)
		{
			String clvalues = newrow.getCell(i).getStringCellValue();
			System.out.print(clvalues+"\t");
		}
	}

}
