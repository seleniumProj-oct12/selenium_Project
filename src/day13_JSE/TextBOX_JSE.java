package day13_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class TextBOX_JSE {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.google.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		JavascriptExecutor obj=(JavascriptExecutor)d;
		
		obj.executeScript("documents.getElementById('hfgt454').values('selenium')");
		
		obj.executeScript("documents.getElementById('').click()");
		
  }
}








