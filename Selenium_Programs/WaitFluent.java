package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFluent {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
			driver.get("https://amazon.co.in");

			//Wait for the dynamic element using Fluent wait
			FluentWait wait = new FluentWait(driver);
			wait.pollingEvery(10, TimeUnit.SECONDS);
			wait.withTimeout(1, TimeUnit.MINUTES);
						
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Crack UPSC MAINS']")));
			
			//click on the dynamic element
			driver.findElement(By.xpath("//img[@alt='Crack UPSC MAINS']")).click();
			driver.close();
	}

}
