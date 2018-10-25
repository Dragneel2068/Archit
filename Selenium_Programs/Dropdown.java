package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		/*	Select
		 * SelectByVisibleText()		}
		 * Select ByValue()				}		Operational			
		 * Select ByIndex()				}		Method
		 * deSelectAll()				}
		 * deSelectByVisibleText()		)
		 * deSelectByIndex()			)	Verification Method
		 * isMultiple()					)
		 * GetOptions()					]
		 * GetAllSelectedOptions()		]	Data Capture Method	
		 * GetFirstSelectedOption()		]
		 *///select[@id='day']
		
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.navigate().to("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		act.moveToElement(element).perform();
		Select sel = new Select(element);
		sel.selectByVisibleText("5");
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
		act.moveToElement(element1).perform();
		Select sel1 = new Select(element1);
		sel1.selectByVisibleText("Mar");
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='year']"));
		act.moveToElement(element2).perform();
		Select sel2 = new Select(element2);
		sel2.selectByVisibleText("1995");
		
		System.out.println("Date set to 05/03/1995");
		
		driver.close();
	}

}
