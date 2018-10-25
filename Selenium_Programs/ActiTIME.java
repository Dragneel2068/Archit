package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActiTIME {

	public static void main(String[] args) {
		System.out.println("Launching the web Browser");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://localhost/login.do");
		System.out.println("Signing in to ActiTime");
		driver.findElement(By.xpath("//input[@id='username' and @placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//*[@id='loginButton']/div[text()='Login ']")).click();
		String expdata="actiTIME - Enter Time-Track";
		String actdata=driver.getTitle();
		Assert.assertEquals(actdata,expdata);
		System.out.println("Logging out of ActiTime");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Closing the browser");
		driver.close();
	}

}
