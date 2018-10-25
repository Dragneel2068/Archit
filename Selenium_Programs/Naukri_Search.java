package Selenium_Programs;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Naukri_Search {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Actions act = new Actions(driver);
		
		
		driver.findElement(By.xpath("//span[text()=' Search Jobs ']")).click();
		
		act.moveToElement(driver.findElement(By.xpath("//div[@id='skill']/div/div[2]/input"))).click().sendKeys("Automation Test Engineer").build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//div[@id='location']"))).click().sendKeys("Bangalore").build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//div[@data-value='Experience']"))).click().perform();
		List<WebElement> lst = driver.findElements(By.xpath("//div[@data-value='Experience']/div[2]//ul/li"));
		for(WebElement wb : lst)
		{
			if(wb.getText().equals("4"))
				act.moveToElement(wb).click().perform();
		}
		
		driver.findElement(By.xpath("//div[@id='salary_dd']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='salary_dd']/div[2]//ul/li")); 
		for(WebElement wb1 : list)
		{
			if(wb1.getText().equals("10"))
				act.moveToElement(wb1).click().perform();
		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		driver.quit();
	}
}
