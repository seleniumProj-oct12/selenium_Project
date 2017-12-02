package day10_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_WebDriverWait {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com");
		d.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(d, 140);
		
		// click Link from dynamically changing element 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[4]/a/img"))).click();

	}

}
