package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelectDropdown {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		String expval="mava";
		boolean flag = false;
		//Identify dynamic Select dropdown
		WebElement element =driver.findElement(By.xpath("//select"));
		//Create an object to select class
		Select sel = new Select(element);
		//Capture all the Options WebElement from the dynamic Select dropdown
		List<WebElement> list = sel.getOptions();
		//get the count
		System.out.println(list);
		//Iterate collection & get All the Option Name
		for(WebElement a : list)
			//String actvalue = a.getText();
		
		//Check whether Expected options is available or not
		//if(actvalue.equals(expval))
			//Select the value if option is available and break the loop
			{
				sel.selectByVisibleText(expval);
					flag=true;
					break;
			}
		if(flag)
			System.out.println(expval+"==> is available ==>PASS");
		else
			System.out.println(expval+"==> is not available ==>FAIL");

	}

}
