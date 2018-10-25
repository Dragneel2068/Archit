package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTripFutureDate {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://cleartrip.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
				
		String x = "//div[@class='span span15 datePicker']/input[@id='DepartDate' and @placeholder='Pick a date']";
		WebElement e1 =driver.findElement(By.xpath(x));
		act.moveToElement(e1).click().perform();
		
		String x1="//div[@id='ui-datepicker-div']/div[2]/div/a";
		WebElement e2 = driver.findElement(By.xpath(x1));
		act.moveToElement(e2).click().perform();
		int count=12;
		while(count>0)
		{
		try {
			String web = "//div[@id='ui-datepicker-div']/div[2]//td[@data-year='2019' and @data-month='2']/a[text()='5']";
			WebElement e3 = driver.findElement(By.xpath(web));
			act.moveToElement(e3).click().perform();
		}catch(Throwable t)
		{
			act.moveToElement(driver.findElement(By.xpath("//a[@data-handler='next']"))).click().perform();
		}
		count--;
		}
		
		driver.close();

	}

}
