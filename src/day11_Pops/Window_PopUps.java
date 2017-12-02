package day11_Pops;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Window_PopUps {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.onlinesbi.com/");
		d.manage().window().maximize();
		
		// single window id
		 String src=d.getWindowHandle();
		 System.out.println(src);
		
         Sleeper.sleepTightInSeconds(2);
		 // SBI Bonanza link
		 d.findElement(By.xpath("html/body/...../a")).click();
	
		// multiple window ids
	  Set<String> ids=d.getWindowHandles();
	  System.out.println(ids);
	
	  // returns values from set
	Object pops[]= ids.toArray();  // pops[0]-- main window id
									// pops[1]-- popup window id
	
	//popup window object to string
	 String str= pops[1].toString();
	
	// connect main window to popup window
	d.switchTo().window(str);
	
	Sleeper.sleepTightInSeconds(2);
	// search box in popup window
	d.findElement(By.id("txtsearch")).sendKeys("loan");
	
	Sleeper.sleepTightInSeconds(2);
	d.close();  // close popup
	
	// connect popup window to main window
	d.switchTo().window(pops[0].toString());
	
	Sleeper.sleepTightInSeconds(2);
	// click mCash link in main window
	d.findElement(By.xpath("html/body/div[1]...../a")).click();
	
	Sleeper.sleepTightInSeconds(2);
	d.quit();   // close all
	
	}

}
