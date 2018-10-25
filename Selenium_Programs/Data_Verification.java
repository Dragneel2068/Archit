package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Data_Verification {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		  Actions act = new Actions(driver);
		  Boolean radioButtonStatus1=true;
		  Boolean radioButtonStatus2=true;
		  
		  //Step 1:Navigate to Facebook Application
		  driver.get("https:facebook.com");
		  driver.manage().window().maximize();
		  			//Verification
		  String expectedTitle="Facebook";
		  String actualTitle=driver.getTitle();
		  	if(actualTitle.contains(expectedTitle))
		  		{
		  			System.out.println("Home page is displayed==>PASS");
		  		}
		  	else
		  			System.out.println("Home page is not displayed==>FAIL");
		  	
		  	//Check the Global Image
		  	WebElement element=driver.findElement(By.xpath(".//*[contains(@src,'.png')]"));
		  	if(element.isDisplayed())
		  		System.out.println("Global Image is displayable==>PASS");
		  	else
		  		System.out.println("Global Image is not displayable==>FAIL");
		  	
		  	//Validate the functionality of radio buttons
		  	act.moveToElement(driver.findElement(By.xpath("//input[@value='1']"))).perform();
		  	driver.findElement(By.xpath("//input[@value='1']")).click();
		  	
		  	System.out.println("Radio Button Female clicked: ");
		   	if(driver.findElement(By.xpath("//input[@value='1']")).isSelected())
		  		radioButtonStatus1=true;
		  	if(driver.findElement(By.xpath("//input[@value='2']")).isSelected()==true)
		  		radioButtonStatus2=false;
		  	else
		  		radioButtonStatus2=true;
		  	
		  	if(radioButtonStatus1 && radioButtonStatus2)
		  		System.out.println("Radio Buttons for female & male is functional==>PASS");
		  	else
		  		System.out.println("Radio Buttons for female & male is not functional==>FAIL");
		  	
		  	act.moveToElement(driver.findElement(By.xpath("//input[@value='2']"))).perform();
		  	driver.findElement(By.xpath("//input[@value='2']")).click();
		  	
		  	System.out.println("Radio Button Male clicked: ");
		  	if(driver.findElement(By.xpath("//input[@value='2']")).isSelected())
		  		radioButtonStatus1=true;
		  	if(driver.findElement(By.xpath("//input[@value='1']")).isSelected()==true)
		  		radioButtonStatus2=false;
		  	else
		  		radioButtonStatus2=true;
		  	if(radioButtonStatus1 && radioButtonStatus2)
		  		System.out.println("Radio Buttons for female & male is functional==>PASS");
		  	else
		  		System.out.println("Radio Buttons for female & male is not functional==>FAIL");
		  	
		  	//SIGN UP Button Status Check
		  	Boolean StatusCheck=driver.findElement(By.xpath(".//*[@name='websubmit']")).isEnabled();
		  	if(StatusCheck)
		  		System.out.println("Sign Up button is enabled");
		  	else
		  		System.out.println("Sign Up button is disabled");
		  	
		  	driver.close();
		  	
		  		
	}

}
