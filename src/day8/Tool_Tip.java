package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip {


	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://demoqa.com/tooltip/");
		d.manage().window().maximize();
		
		// Text box
		WebElement src=d.findElement(By.id("age"));
		
		Actions obj=new Actions(d);
		
		obj.moveToElement(src).perform();
		
		// tool tip
		String name=d.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(name);

	}

}







