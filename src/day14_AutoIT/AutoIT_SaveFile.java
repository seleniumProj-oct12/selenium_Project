package day14_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIT_SaveFile {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// click 3.7.3 link
		driver.findElement(By.linkText("3.7.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		// autoiT code foe download file
		Runtime.getRuntime().exec
		             ("E:\\workspace_oct12\\AutoIT\\savefile.exe");
		
		
		
		
	  
  }
}
