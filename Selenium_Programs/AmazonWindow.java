package Selenium_Programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class AmazonWindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		  driver.navigate().to("https://amazon.co.in");
		
		WebElement element=driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"));
		  act.moveToElement(element).doubleClick().perform();
		  act.moveToElement(element).sendKeys("iphone x").perform();
		  act.sendKeys(Keys.ENTER).perform();
		  		Thread.sleep(1000);
		  System.out.println("IphoneX found");
		  
		  driver.findElement(By.xpath("//h2[text()='Apple iPhone X (Space Grey, 64GB)']")).click();
		  Set<String> winhandle = driver.getWindowHandles();
		  
		  for(String win : driver.getWindowHandles())
		  driver.switchTo().window(win);
		  driver.findElement(By.xpath("//span[text()='Buy Now']/../input")).click();
	}

}
