package day14_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIT_UploadFile {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// click bRowse button
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		// Autoit script for Upload file from window component 
		Runtime.getRuntime().exec("E:\\workspace_oct12\\SeleniumProj_oct12\\AutoIT\\upload.exe");
		
  }
}
