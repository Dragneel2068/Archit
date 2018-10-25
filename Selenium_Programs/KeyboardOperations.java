package Selenium_Programs;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperations {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		element.sendKeys("admin");
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		driver.close();
		
	}

}
