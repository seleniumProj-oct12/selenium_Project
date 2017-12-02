package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_All {

	public static void main(String[] args) {
	
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.google.com/");
		d.manage().window().maximize();
		
		
		// identify All links 
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			// get name of the link
			String names=links.get(i).getText();
			System.out.println(names);
		}	
	}
}









