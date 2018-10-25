package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginTest {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		Actions act = new Actions(driver);
		
		//Step 1.Navigate to Gmail Application
		driver.get("http://gmail.com");
		//driver.manage().window().maximize();
				 //Verification
		String expectedTitle="Gmail";
		String actualTitle=driver.getTitle();
		if(actualTitle.contains(expectedTitle))
  			 System.out.println("Sign in page is displayed==>PASS");
  			
		else
  			 System.out.println("Sign in page is not displayed==>FAIL");
		
		
		//Step 2.Login to Application and check
		  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dragneel2068@gmail.com");
		  driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		  		Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Zeref@1995");
		  driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		  WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='gb_Wa']")));
		  	
		  		//Verification
		  		String expectedPage="Inbox";
			  	String actualPage=driver.getTitle();
		  	if(actualPage.contains(expectedPage))
		  	 System.out.println("Logging in successful==>PASS");
		  	
		  	//Logging out
		  		act.moveToElement(driver.findElement(By.xpath("//*[@class='gb_9a gbii']"))).click().perform();
		  		act.moveToElement(driver.findElement(By.xpath("//a[text()='Sign out']"))).click().perform();	  		
		  		
		  		
		  	   //Verification
		  		boolean attr=driver.findElement(By.xpath("//div[@class='xkfVF']")).isDisplayed();
		  		Thread.sleep(3000);
		  		if(attr)
		  			System.out.println("Logout successful==>PASS");
		  		else
		  			System.out.println("Logout unsuccessful==>FAIL");
		  		
		  		driver.close();
	}
}
