package Selenium_Programs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Mouse_Keyboard {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		  Actions act = new Actions(driver);
		  
		  //Step 1.Navigate to Amazon Application
		  driver.get("https://amazon.co.in");
		  //driver.manage().window().maximize();
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
		  driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		  			//Verification
		  String expectedSigninPage="Amazon Sign In";
		  String actualSigninPage=driver.getTitle();
		  	if(actualSigninPage.contains(expectedSigninPage))
		  		{
		  			System.out.println("Sign page is displayed==>PASS");
		  		}
		  	else
		  			System.out.println("Sign page is not displayed==>FAIL");
		  
		  
		  //Step 3.Logging in
		  		Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("dragneel2068@gmail.com");
		  driver.findElement(By.xpath("//input[@id='continue']")).click();
		  		Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Lucifer@1995");
		  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		  		Thread.sleep(1000);
		  			//Verification
		  Boolean value=driver.findElement(By.xpath("//span[text()='Hello, Dragneel']")).isDisplayed();
		  if(value)
		      System.out.println("Account Page is displayed==>PASS");
		  else
			  System.out.println("Account Page is not displayed==>FAIL");
		  
		  System.out.println("\n Checklists:");
		  
		  //Step 4.Search IphoneX
		  WebElement element=driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"));
		  act.moveToElement(element).doubleClick().perform();
		  act.moveToElement(element).sendKeys("iPhoneX").perform();
		  act.sendKeys(Keys.ENTER).perform();
		  		Thread.sleep(1000);
		  System.out.println("IphoneX found");
		  
		  //Search Amazon Prime Checkbox Select it
		  Boolean CheckboxStatus=driver.findElement(By.xpath("//input[contains(@name,'10440599031')]")).isSelected();
		  if(CheckboxStatus==false)
			  driver.findElement(By.xpath("//*[contains(@name,'10440599031')]")).click();
		  		Thread.sleep(1000);
		  		System.out.println("Amazon Prime Enabled");
		  
		  /*
		  waitForNumberofWindowsToEqual(2);
		  Set handles = driver.getWindowHandles();
		  String firstWindowHandle = driver.getWindowHandle(); 
		  handles.remove(firstWindowHandle);
		  
		  Object winHandle=handles.iterator().next();
		  
		  if (winHandle!=firstWindowHandle)
		  {
			  Object secondWinHandle = winHandle;
			  driver.switchTo().window((String) secondWinHandle);
		  }*/
		  
		  
		  /*String handle=driver.getWindowHandle();
		  Set handle1 = driver.getWindowHandles();
		  
	        System.out.println(handle1);

	        // Pass the window handle to the other window

	        for (String handle2 : driver.getWindowHandles()) {

	        	System.out.println(handle2);

	        	driver.switchTo().window(handle2).findElement(By.xpath("//input[[@name='submit.add-to-cart']")).click();
	        	}*/
		  
		  String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		  driver.findElement(By.xpath(".//*[contains(text(),'Apple iPhone X (Space Grey, 256GB)')]")).click();
		  Thread.sleep(1000);
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}
		System.out.println("New window opened");
		// Perform the actions on new window
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		Thread.sleep(1000);
		Boolean check=driver.findElement(By.xpath("//*[contains(text(),'Added to Cart')]")).isDisplayed();
		if(check)
			{
			System.out.println("iPhone X added to the cart");
			}
		driver.close();
		
		
		//Switch to the previous window
		driver.switchTo().window(winHandleBefore);
		WebElement cart=driver.findElement(By.xpath("//a[@id='nav-cart']"));
		act.moveToElement(cart).click().perform();
		System.out.println("Navigating to My Cart");
		Boolean item=driver.findElement(By.xpath("//img[@alt='Apple iPhone X (Space Grey, 256GB)']")).isDisplayed();
		System.out.println();
		if(item)
			System.out.println("Item has been successfully added to the cart==>PASS");
		
		
			driver.close();
	}

	//private static void waitForNumberofWindowsToEqual(int i) {}
		
		
	

}

