package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args)throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		WebElement src=d.findElement(By.linkText("Gmail"));
		
		Actions rc= new Actions(d);

		Thread.sleep(2000);
		
		rc.contextClick(src).sendKeys(Keys.ARROW_DOWN)
		           .sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		// or
		
		rc.contextClick(src).sendKeys("W").build().perform();
		
	}

}
