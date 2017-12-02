package day6;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		List<WebElement> lks=d.findElements(By.tagName("a"));
		System.out.println(lks.size());
		
		for (int i = 0; i < lks.size(); i++) 
		{
			String names=lks.get(i).getText();
			
			lks.get(i).click();
			
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File
					      ("E:\\workspace_oct12\\"+names+".jpg"));
		
		d.navigate().back();
		
		lks=d.findElements(By.tagName("a"));
	
		}
	}

}
