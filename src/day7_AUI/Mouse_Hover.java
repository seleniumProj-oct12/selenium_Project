package day7_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", 
              //  "D:\\Demo\\geckodriver.exe");

		WebDriver d=new FirefoxDriver();
		d.get("http://emirates.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// EXPERIENCE element
		WebElement exp=d.findElement(By.xpath(".//*[@id='gnav-experience']/a"));

		// LOYALTY element
		WebElement loyalti=d.findElement(By.xpath(".//*[@id='gnav-loyalty']/a"));

	
		Actions mo=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		mo.moveToElement(exp).moveToElement(loyalti).build().perform();
		
		//Sleeper.sleepTightInSeconds(2);    // (or)
		//mo.moveToElement(loyalti).perform();
		
		
	}

}






