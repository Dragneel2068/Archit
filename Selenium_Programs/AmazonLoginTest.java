package Selenium_Programs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class AmazonLoginTest {
  public static void main(String[] args) throws Exception
  {
	  WebDriver driver=new FirefoxDriver();
	  Actions act = new Actions(driver);
	  
	  //Step 1.Navigate to Amazon Application
	  driver.get("https://amazon.co.in");
	  driver.manage().window().maximize();
	  			//Verification
	  String expectedTitle="Amazon.in";
	  String actualTitle=driver.getTitle();
	  	if(actualTitle.contains(expectedTitle))
	  		{
	  			System.out.println("Home page is displayed==>PASS");
	  		}
	  	else
	  			System.out.println("Home page is not displayed==>FAIL");
	  
	  //Step 2.Login to Application and check
	  act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello. Sign in']"))).perform();
	  driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
	  			//Verification
	  String expectedSigninPage="Amazon Sign In";
	  String actualSigninPage=driver.getTitle();
	  	if(actualSigninPage.contains(expectedSigninPage))
	  		{
	  			System.out.println("Sign page is displayed==>PASS");
	  		}
	  	else
	  			System.out.println("Sign page is not displayed==>FAIL");
	  
	  
	  //Logging in
	  		Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("dragneel2068@gmail.com");
	  driver.findElement(By.xpath("//input[@id='continue']")).click();
	  		Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Lucifer@1995");
	  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  		Thread.sleep(1000);
	  			//Verification
	  Boolean value=driver.findElement(By.xpath(".//span[text()='Hello, Dragneel']")).isDisplayed();
	  if(value)
	      System.out.println("Account Page is displayed==>PASS");
	  else
		  System.out.println("Account Page is not displayed==>FAIL");
		  
	  //Logging out
	  act.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"))).perform();
	  		Thread.sleep(1000);
	  driver.findElement(By.xpath(".//span[text()='Sign Out']")).click();
	  		   //Verification
	  Boolean attr=	driver.findElement(By.xpath("//*[@id='authportal-main-section']")).isDisplayed();	
	  		if(attr)
	  			System.out.println("Logout is successful==>PASS");
	  		else
	  			System.out.println("Logout is unsuccessful==>FAIL");
	  		
	  		driver.close();
	  
  }
}
