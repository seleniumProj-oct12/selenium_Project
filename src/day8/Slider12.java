package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider12 {

	public static void main(String[] args) throws Exception{
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		// Slider element
		WebElement src= d.findElement(By.xpath(".//*[@id='slider']/span"));
		
		Actions obj=new Actions(d);
		
		Thread.sleep(2000);
		
		obj.dragAndDropBy(src, 200, 0).build().perform();

	}

}
