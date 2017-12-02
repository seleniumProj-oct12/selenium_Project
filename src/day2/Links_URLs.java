package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_URLs {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		// identify links
		List<WebElement> lks=d.findElements(By.tagName("a"));
		System.out.println(lks.size());
		
		for (int i = 0; i < lks.size(); i++) 
		{
			lks.get(i).click();
			
			String urls=d.getCurrentUrl();
			System.out.println(urls);
			
			d.navigate().back();
			
			lks=d.findElements(By.tagName("a"));
		}
		

	}

}












