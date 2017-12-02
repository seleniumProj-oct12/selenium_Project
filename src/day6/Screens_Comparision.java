package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screens_Comparision {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		d.get("http://google.com/");
		File src2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		if (FileUtils.contentEquals(src, src2)) 
		{
			System.out.println("Screes are same");
		}
		else
		{
			System.out.println("Screes are not same");
		}
	}
}
