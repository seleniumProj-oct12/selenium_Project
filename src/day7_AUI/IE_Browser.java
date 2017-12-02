package day7_AUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", 
				            "D:\\Demo\\IEDriverServer.exe");
		
		WebDriver dr=new InternetExplorerDriver();
		dr.get("http://google.com");

	}

}


