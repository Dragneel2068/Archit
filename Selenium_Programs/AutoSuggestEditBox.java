package Selenium_Programs;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestEditBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		try {
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		element.sendKeys("Narendra Modi");
		
		Actions act = new Actions(driver);
		List<WebElement> optionstoselect=driver.findElements(By.xpath("//div[text()='narendra modi']"));
		
		System.out.println("Size of Auto-Suggest is:"+optionstoselect.size());
		System.out.println("Values are:\n");
		for(WebElement a: optionstoselect)
			System.out.println(a.getText());
		
		optionstoselect.get(2).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Operation halted..");
		}
		finally {
		driver.close();
		}
	}

}
