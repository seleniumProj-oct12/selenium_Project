package day15_Robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Robot_DownloadFile {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		// get screen size
		Dimension src=Toolkit.getDefaultToolkit().getScreenSize();
		  System.out.println(src);
		 
		Sleeper.sleepTightInSeconds(2);
		
		// click 3.7.3 link
		driver.findElement(By.linkText("3.7.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Robot rb=new Robot();
		
		// press TAB key
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.delay(2000);
		
		// press Enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		// mouse move on downloading file
		rb.mouseMove(683, 120);
		
		Sleeper.sleepTightInSeconds(3);
		
		// press left button in mouse 
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		
  }
}










