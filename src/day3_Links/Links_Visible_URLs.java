package day3_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Visible_URLs {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		// identify links
		List<WebElement> lks=d.findElements(By.tagName("a"));
		System.out.println(lks.size());
		
		for (int i = 0; i < lks.size(); i++) 
		{
			// if link name is not empty (VISIBLE)
			if(  ! lks.get(i).getText().isEmpty())
			{
			lks.get(i).click();
			
			String urls=d.getCurrentUrl();
			System.out.println(urls);
			
			d.navigate().back();
			
			lks=d.findElements(By.tagName("a"));
			
			}
			else
			{
				System.out.println("Invisible links are---"+i);
			}
		}
		

	}

}
