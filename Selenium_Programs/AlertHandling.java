package Selenium_Programs;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

    
    // Alert Message handling
                		
    driver.get("https://gmail.com");			
                        		
    FileInputStream fis = new FileInputStream("C:\\Users\\SCHOOL\\Documents\\Workspace\\Selenium\\Test\\TestData.properties");
    Properties pObj = new Properties();
	pObj.load(fis);
	String usr = pObj.getProperty("username");
	String pwd = pObj.getProperty("password");
	
    driver.get("https://accounts.google.com/signin");					
    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(usr);
	  driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	  		Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@type='password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//*[@id='passwordNext']")).click();			
    		
    // Switching to Alert        
    Alert alert = driver.switchTo().alert();		
    		
    // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println(alertMessage);
    Thread.sleep(5000);
	
    // Accepting alert		
    alert.accept();	

	}

}
