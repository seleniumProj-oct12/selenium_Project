package day15_Robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_MouseWheel {
  @Test
  public void f() throws AWTException, Exception {
	  
	  WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension src=Toolkit.getDefaultToolkit().getScreenSize();
		  System.out.println(src);
		
		Thread.sleep(1000);
		Robot obj=new Robot();
		
		for (int i = 0; i < src.height; i++) {
			
		obj.mouseWheel(800);
		
		//Thread.sleep(2000);
		
		obj.mouseWheel(-300);
		}
		
		}
		
	  
  }

