package Selenium_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
 public static void main(String[] args) {
	WebDriver w=new FirefoxDriver();
	w.get("https://facebook.com");
	w.close();
}
}
