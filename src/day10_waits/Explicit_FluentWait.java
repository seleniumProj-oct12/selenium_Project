package day10_waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Explicit_FluentWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "D:\\Demo\\chromedriver.exe");

		
		WebDriver d=new ChromeDriver();
		d.get("https://www.24hourfitness.com/");
		//d.manage().window().maximize();
		
		FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(d)
				
				.withTimeout(80, TimeUnit.SECONDS)
				//.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-content']/div[1]/div[2]/div/div[2]/div[1]/div/a"))).click();
		
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[5]/a/img"))).click();
		
		System.out.println("Tc Done");

	}

}



