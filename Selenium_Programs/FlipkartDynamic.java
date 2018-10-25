package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartDynamic {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		try{
		driver.navigate().to("https://flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone x",Keys.ENTER);
		String x="//div[text()='Apple iPhone X (Space Gray, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]";
		String data = driver.findElement(By.xpath(x)).getText();
		System.out.println("Price of Apple iPhone X (Space Gray, 64 GB):"+data);
		}
		catch(Exception e)
		{
			System.out.println("Operation halted");
		}
		finally {
		driver.close();
		}
	}

}