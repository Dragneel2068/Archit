package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDynamic {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		try {
		driver.navigate().to("https://amazon.co.in");
		
		WebElement element=driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"));
		  act.moveToElement(element).doubleClick().perform();
		  act.moveToElement(element).sendKeys("iphone x").perform();
		  act.sendKeys(Keys.ENTER).perform();
		  		Thread.sleep(1000);
		  System.out.println("IphoneX found");
		
		String x="//h2[text()='Apple iPhone X (Space Grey, 256GB)']/../../../../div[2]/div[1]/div[1]/a/span[2]";
		String data = driver.findElement(By.xpath(x)).getText();
		System.out.println("Price of Apple iPhone X (Space Grey, 256GB):"+data);
		}
		catch(Exception e)
		{
			System.out.println("Operation halted..");
		}
		
		finally {
		driver.close();
		}

	}

}
