package Selenium_Programs;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyEmailEditBox {
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
			  	
			  	//Step2:Verify EmailEditBox
			  	WebElement element =driver.findElement(By.xpath("//input[@id='ap_email']"));
			  	element.sendKeys("dragneel2068@gmail.com");
			  	
			  //Co-ordinate  
			  	Point p=element.getLocation();
			  	System.out.println("X-coordinate position: "+p.getX());
			  	System.out.println("Y-coordinate position: "+p.getY());
			  	
			  	//Size of the Email-Editbox
			  	Dimension dem=element.getSize();
			  	System.out.println("Text-Box Height: "+dem.height);
			  	System.out.println("Text-Box Width: "+dem.width);
			  	
			  	
			  	driver.findElement(By.xpath("//input[@id='continue']")).click();
			  	Thread.sleep(2000);
			  	
			  			//Verify Data in Email-Editbox
			  	WebElement wb=driver.findElement(By.xpath("//input[@id='ap_email'][1]"));
			  	String actualinput=wb.getAttribute("value");
			  	System.out.println("The Entered positive input is: "+actualinput);
			  	Thread.sleep(2000);
			  	
			  	
			  	driver.close();		
			}
}
