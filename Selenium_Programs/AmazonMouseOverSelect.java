package Selenium_Programs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOverSelect {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://amazon.com");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		try {
		//Point to the drop-down Departments
		WebElement web = driver.findElement(By.xpath("//a[@id='nav-link-shopall']/span[2][text()='Departments']"));
		act.moveToElement(web).perform();
		
		//Point cursor over Handmade
		String expectedValue = "handmade";
		List<WebElement> lst = driver.findElements(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[*]"));
		for(WebElement wb : lst)
			if(wb.getText().equalsIgnoreCase(expectedValue))
			{
				act.moveToElement(wb).click().perform();
			}
		//Choose the sub-module in the Handmade list
		List<WebElement> lwt =driver.findElements(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[16]/div/a[*]"));
		for(WebElement wb1 : lwt)
			System.out.println(wb1.getText());
		
		String expctvalue = "wedding";
		for(WebElement wb1 : lwt)
			if(wb1.getText().equalsIgnoreCase(expctvalue))
			{
				act.moveToElement(wb1).click().perform();
			}
		
		System.out.println("Wedding Page opened");
		}catch(Exception e)
		{
			//System.out.println("Operation halted..");
		}
		finally {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.close();
		}
			
	}

}
