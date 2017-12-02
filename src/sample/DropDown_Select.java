package sample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

	public static void main(String[] args) {
		
		
		WebDriver d=new FirefoxDriver();
		
	
		d.navigate().to("http://spicejet.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// one way
		d.findElement(By.id("un")).click();
		
		// 
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		Sleeper.sleepTightInSeconds(1);
		
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		Sleeper.sleepTightInSeconds(1);
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		Sleeper.sleepTightInSeconds(1);
		d.findElement(By.linkText("28")).click();
		
		
		Sleeper.sleepTightInSeconds(2);
		new Select(d.findElement( By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
		
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByIndex(3);
		
		Sleeper.sleepTightInSeconds(2);
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	}

}






