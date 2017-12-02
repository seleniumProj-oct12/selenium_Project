package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		// Gmail link
		WebElement src=d.findElement(By.linkText("Gmail"));
		
		Actions dc=new Actions(d);
		
		dc.doubleClick(src).perform();
		
		dc.clickAndHold(src).perform();
		dc.release(src).perform();
	}

}
