package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartDealsoftheDay {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://flipkart.com");
		
		try{
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		String x = "//h2[text()='Deals of the Day']/../../div[1]/div[1]/span";
		String data = driver.findElement(By.xpath(x)).getText();
		System.out.println("Deals of the Day Time Left:"+data);
		}
		catch(Exception e)
		{
			System.out.println("Pop-up didn't appear");
		}
		finally {
			driver.close();
		}
	}

}
