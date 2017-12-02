package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables_Rows_Cols {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		// webtable
		WebElement table=d.findElement(By.xpath("html/body/..../table"));

		// rows from webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		// loop for rows
		for (int i = 0; i < rows.size(); i++)
		{
			// columns from row
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			// loop for columns
			for (int j = 0; j < cols.size(); j++) 
			{
				System.out.print(cols.get(j).getText()+"    ");
			}    	
		}
	}

}














