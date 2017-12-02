package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_Rows_Cols2 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		// loop for rows
		for (int i = 1; i <= 10 ; i++) 
		{
			// loop for columns
			for (int j = 1; j <= 5; j++) 
			{
				String path="html/body/......div[1]/table/tbody/tr[";
				String path2="]/td[";
				String path3="]";
				
				String names= d.findElement(By
						   .xpath(path+i+path2+j+path3)).getText();
				
			 System.out.print(names+"     ");
			}
			
			System.out.println();
		}

	}

}
