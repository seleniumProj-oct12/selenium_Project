package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException   {
		
		WebDriver d;
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://google.com");
		
		// take screen shot
		File  src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\morningAm.png"));
		
		

	}

}
