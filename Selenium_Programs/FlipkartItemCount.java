package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartItemCount {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try{
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone 10",Keys.ENTER);
			System.out.println("Iphone 10 searching....");
			
			String data = driver.findElement(By.xpath("//span[@class='_2yAnYN']")).getText();
			String[] s = data.split(" ");
			
			System.out.println("Iphone 10 stock limits to "+s[5]);
		}
		catch(Exception e)
		{
			System.out.println("Operation halted");
		}
		finally {
			driver.close();;
		}
		

	}

}
