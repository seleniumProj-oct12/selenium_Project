package day3_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenLinks_Count {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		// all links
		List<WebElement> all=d.findElements(By.tagName("a"));
		System.out.println("Total links are-----"+all.size());
		
		int count=0;
		
		for (int i = 0; i < all.size(); i++) 
		{
			// visible
			if(  ! all.get(i).getText().isEmpty())
			{
				count=count+1;   // count++;
			}
		}
		
		System.out.println("Visible links are----"+count);
		System.out.println("Hidden  links are----"+(all.size()-count));
	
	}

}
