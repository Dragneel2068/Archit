package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MakeMyTrip {
    @Test
    public void operate()
	 {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		
		driver.navigate().to("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count = 0;
		act.moveToElement(driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']"))).click().perform();
		while(count<12)
		try {
		String x="//div[@class='dateFilter hasDatepicker']//td[@data-year='2019' and @data-month='2']/a[text()='5']";
		driver.findElement(By.xpath(x)).click();
		   break;
		}catch(Throwable t)
		{
			driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[2]/div/a/span")).click();
		}

	}

}
