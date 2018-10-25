package Selenium_Programs;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTendingNews {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://yahoo.com");
		
		//Point to the trending news
		try{
		String x = "//li[@data-category='trending news']/ul/li[*]";
		
		List<WebElement> lst = driver.findElements(By.xpath(x));
		/*for(WebElement wb : lst)
			System.out.println(wb.getText());*/
		
		
		//Select and display top !0 Trending Menu from Yahoo News
		for(int i=0; i<10; i++)
			System.out.println(lst.get(i).getText());
		}
		catch(Exception e)
		{
			System.out.println("operation halted..");
		}
		finally {
		driver.close();
		}
	}
		

}
