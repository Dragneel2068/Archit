package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
  public static void main(String[] args) throws Exception
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://gmail.com");
	 
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  String  title=driver.getTitle();
	  System.out.println(title);
	  /*String Pagesource=driver.getPageSource();
	  System.out.println(Pagesource);*/
	  Thread.sleep(5000);
	  driver.findElement(By.id("identifierId")).sendKeys("selenium");;
	  //driver.findElement(By.cssSelector("#identifierId"));
	  driver.findElement(By.xpath("//span[@text()='RveJvd snByac']")).click();
	  
	  driver.close();
  }
}



