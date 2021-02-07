package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HelloWorld {
  WebDriver driver;
	@Test
  public void f() {
	  

		System.setProperty("webdriver.gecko.driver","/Users/sharmin/Documents/workspace/Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.liverpoolfc.com/");
		System.out.println("got the website++++++++++++++");
  }
  
  @AfterTest
  public void f1() {
	  System.out.println("test finishing here***************");
  }
  
}
