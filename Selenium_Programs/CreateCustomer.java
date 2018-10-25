package Selenium_Programs;

import java.util.Properties;

public class CreateCustomer {

	public static void main(String[] args) throws Throwable {
		JavaFileUtils jvf = new JavaFileUtils();
		Properties p = jvf.getProperties();
		String getExcelData = jvf.getExcelData("Sheet1", 4, 1);
		System.out.println(getExcelData);
		String setExcelData = jvf.setExcelData("Sheet1", 4, 1, "Donkey");
		System.out.println(p);
		System.out.println(jvf.getExcelData("Sheet1", 4, 1));
		
	}

}
