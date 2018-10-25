package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicit {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://amazon.co.in");

		//Wait for the dynamic element
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Mi A2']")));
		
		//click on the dynamic element
		driver.findElement(By.xpath("//img[@alt='Mi A2']")).click();
		driver.close();
	}

}
