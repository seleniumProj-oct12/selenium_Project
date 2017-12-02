package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.google.com/");
		d.manage().window().maximize();
		
		String src=d.getPageSource();
		System.out.println(src);
		
		if (src.contains("kaif")) 
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}

	}

}
