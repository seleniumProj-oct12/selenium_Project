package day9_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait {

	public static void main(String[] args)  {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://paytm.com");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// login link
		d.findElement(By.xpath(".//*[@id='app']//div[3]/div")).click();

	}

}
