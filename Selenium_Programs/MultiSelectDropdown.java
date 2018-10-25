package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) 
	{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("file:///C:/Users/SCHOOL/Desktop/def.html");
	WebElement element = driver.findElement(By.id("country"));
	Select sel = new Select(element);
	Boolean stat = sel.isMultiple();
	
	if(stat)
	{
		System.out.println("Dropdown is Multiple");
		System.out.println("Select multiple values from dropdown");
		List<WebElement> list = driver.findElements(By.id("country"));
		
		for(int i=0;i<=list.size()-1;i++)
		{
			sel.selectByIndex(i);
		}
	}
		else
			System.out.println("Dropdown is single select");
	
	//Deselect all values
	sel.deselectAll();
	
	driver.close();
	}

}
