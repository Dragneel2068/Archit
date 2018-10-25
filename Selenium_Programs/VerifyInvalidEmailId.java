package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyInvalidEmailId {
  public static void main(String[] args) throws Exception
  {
	  WebDriver driver=new FirefoxDriver();
	  Actions act = new Actions(driver);
	  //Step 1:Navigate to Amazon Application
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
		  	
	  //Step2:Enter Invalid Credentials
		  			Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("wef");
			  driver.findElement(By.xpath("//input[@id='continue']")).click();
			  		Thread.sleep(1000);
			  		String expMsg="There was a problem";
			  	WebElement element=	driver.findElement(By.xpath("//*[@class='a-alert-heading']"));	
			  	
			  		//System.out.println(element.getCssValue("color"));
			  		String expcolor="rgba(196, 0, 0, 1)";
			  		String acttext=element.getText();
			  		System.out.println(acttext);
			  		if(acttext.contains(expMsg))
			  			System.out.println("Error Message is verified==>PASS");
			  		else
			  			System.out.println("Error Message is not verified==>FAIL");
			  		
			  		String actcolor=element.getCssValue("color");
			  		if(expcolor.equalsIgnoreCase(actcolor))
			  			System.out.println("Color is Red==>PASS");
			  		else
			  			System.out.println("Color is not Red==>FAIL");
			  		
			  		driver.close();
			  		
  }
}
