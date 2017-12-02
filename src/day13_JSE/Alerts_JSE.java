package day13_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Alerts_JSE {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.google.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		JavascriptExecutor obj=(JavascriptExecutor)d;
		
		// create alert
		obj.executeScript("alert('selenium')");
		
		Sleeper.sleepTightInSeconds(2);
		d.switchTo().alert().accept();  // OK button in Alert
		
		Sleeper.sleepTightInSeconds(2);
		
		d.quit();
	  
  }
}







