package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtables_rows {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		for (int i = 1; i <= 20 ; i++) 
		{
			String names=d.findElement(By.xpath
					("html/..../table/tbody/tr["+i+"]/td[5]"))
					                                 .getText();
			
			System.out.println(names);
		
		}

	}

}

