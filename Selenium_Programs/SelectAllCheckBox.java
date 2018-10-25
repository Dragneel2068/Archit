package Selenium_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAllCheckBox {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("dragneel2068@gmail.com");
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

		  		
		List<WebElement> list= driver.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr[*]"));
		System.out.println(list.size());
		List<WebElement> checkbox = driver.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr[*]/td/div[@role='checkbox']"));
		System.out.println(checkbox.size());
		for(WebElement wb : checkbox)
		{
			wb.click();			
		}
		
//		//Delete all the mails
//		driver.findElement(By.xpath("//div[@aria-label='Select']//span[@role='checkbox']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Delete']//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
	}

}
