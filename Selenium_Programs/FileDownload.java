package Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		profile.setPreference("browser.download.dir", "C:\\selenium\\");
		
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.navigate().to("https://maven.apache.org/download.cgi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='apache-maven-3.5.4-bin.zip']")).click();
	}

}
