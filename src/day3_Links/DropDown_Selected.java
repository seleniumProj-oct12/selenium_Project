package day3_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DropDown_Selected {

	public static void main(String[] args) {
		
	    WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// drop down
		WebElement drop=driver.findElement(By.name("country"));
		
		// elements from drop down
		List<WebElement> items= drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			// link name
			String names=items.get(i).getText();
			
			items.get(i).click();
			
			// if element is selected
			if(items.get(i).isSelected())
			{
				System.out.println("Element is working-----"+names);
			}
			else
			{
				System.out.println("Element is not working----"+names);	
			}
		}
	}

}








