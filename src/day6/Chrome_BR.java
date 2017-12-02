package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_BR {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , 
				                "D:\\Demo\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("http://google.com");
		
	}

}



