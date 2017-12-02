package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Alerts12 {

	public static void main(String[] args) throws Exception {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("selenium_AM");
		
		WebDriver d=new FirefoxDriver(fp);
		d.get("https://www.irctc.co.in");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// login button
		d.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(1000);
		
		// connection to Alert
		String src=d.switchTo().alert().getText();
		System.out.println(src);
		
		Thread.sleep(2000);
		
		// click OK button in ALert
		d.switchTo().alert().accept();
	}

}
