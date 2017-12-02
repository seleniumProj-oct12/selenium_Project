package sample;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;





public class Drop_Down {

	public static void main(String[] args) {
		
      WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// drop down
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		Sleeper.sleepTightInSeconds(2);
		
		// search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		driver.findElement(By.className("nav-input")).click();

	}

}


