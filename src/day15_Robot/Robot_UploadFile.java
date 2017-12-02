package day15_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Robot_UploadFile {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// store file path
		StringSelection src=new StringSelection("C:\\Us\\Jellyfish.jpg");
		
		// copy file path
		Toolkit.getDefaultToolkit().getSystemClipboard().
		                                   setContents(src, null);
		
		// click bRowse button
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Robot rb=new Robot();
		
		// press ctlr + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
  }
}
