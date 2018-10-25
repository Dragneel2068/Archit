package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_dropdownMenu {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.co.in");
		
		//Step 1.Identify the dropdown Element where we need to take the mouse control
		WebElement wb=driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		//Step 2.Create an object Actions class & pass Browser Object
		Actions act=new Actions(driver);
		//Step 3.Using action class method, move the mouse cursor on the element
		act.moveToElement(wb);
		//execute Actions class controls
		act.perform();
		//Identify another dropdown Menu
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(wb1).perform();
		//click on the link
		driver.findElement(By.xpath("//span[text()='Laptops']")).click();
		
		driver.close();
		

	}

}
