package day3_Links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class firefox_Profile {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("selenium_AM");
		
		WebDriver d=new FirefoxDriver(fp);
		d.get("http://google.com");
	}
}





