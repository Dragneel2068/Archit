package Selenium_Programs;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverOperation {

	public static void main(String[] args) 
	{
		File file = new File("C:\\selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriverOperation();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.navigate().to("https://google.com");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		element.sendKeys("Narendra Modi");
		
		Actions act = new Actions(driver);
		List<WebElement> optionstoselect=driver.findElements(By.xpath("//div[text()='narendra modi'][1]"));
		
		System.out.println("Size of Auto-Suggest is:"+optionstoselect.size());
		
		for(WebElement a: optionstoselect)
			System.out.println("Values are:"+a.getText());
		
		optionstoselect.get(3).click();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.close();
	}

}
