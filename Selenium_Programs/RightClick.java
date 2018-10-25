package Selenium_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		Actions act = new Actions(driver);
		act.moveToElement(textbox).doubleClick().perform();
		act.sendKeys("Narendra Modi").perform();
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Search Successful");
				
		WebElement link = driver.findElement(By.xpath("//a[text()='Narendra Modi - Wikipedia']"));
		act.moveToElement(link).perform();
		act.contextClick().sendKeys("W").perform();
		
		
		System.out.println("New Tab is opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String firstwindow = driver.getWindowHandle();
		
		for(String window : driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		driver.close();
		
		System.out.println("Successfully closed all windows");
	}

}
