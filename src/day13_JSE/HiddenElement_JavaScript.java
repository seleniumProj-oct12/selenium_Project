package day13_JSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class HiddenElement_JavaScript {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.bing.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		// Excel Online under Office online
	WebElement src=	d.findElement(By.xpath(".//*[@id='officemenu_excel_img']"));
	
	// calander
	WebElement src2=	d.findElement(By.xpath(".//*[@id='officemenu_calendar_img']"));
	
	Sleeper.sleepTightInSeconds(2);
	
	JavascriptExecutor obj=(JavascriptExecutor)d;
	
	obj.executeScript("arguments[0].click()", src);
	
	Sleeper.sleepTightInSeconds(2);
	
	obj.executeScript("arguments[0].click()", src2);
	
	   
  }
}


