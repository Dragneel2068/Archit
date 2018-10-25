package Selenium_Programs;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		
		WebElement target = driver.findElement(By.id("month"));
		act.moveToElement(target).perform();
		Select sel = new Select(target);
		Boolean stat = sel.isMultiple();
		if(stat==false)
		{
			List<WebElement> list = sel.getOptions();
			System.out.println("The number of elements is:"+list.size()+"\n");
			for(WebElement wb : list)
				System.out.println(wb.getText());
			
			System.out.println();
						
			System.out.println("Element at index 4 is:"+list.get(4)+"\n");
			
			System.out.println("Elements starting with letter 'J' are:");
			for(WebElement wb : list)
				{
						if(wb.getText().charAt(0)=='J')
								System.out.println(wb.getText());
				}
			}
		
		driver.close();
	   }
	}		

