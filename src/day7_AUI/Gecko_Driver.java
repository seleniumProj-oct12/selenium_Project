package day7_AUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				                  "D:\\Demo\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");

	}

}



