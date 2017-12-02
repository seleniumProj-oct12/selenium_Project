package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Header_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.bing.com/");
		d.manage().window().maximize();
		
		// identify header
		WebElement block=d.findElement(By.id("sc_hdu"));
		
		// identify  links from geader 
		List<WebElement>	lks=block.findElements(By.tagName("a"));
		int count=lks.size();

	 System.out.println(count);
	
	for (int i = 0; i < count ; i++)
	{
		System.out.println(lks.get(i).getText());
	}

	}

}










