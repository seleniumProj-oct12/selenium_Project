package day16_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Login_JXL {
  @Test
  public void f() throws BiffException, IOException {
	  
	  String path="E:\\workspace_oct12\\Excels\\test.xls";
	 
	  FileInputStream fis=new FileInputStream(path);
	  Workbook wb=Workbook.getWorkbook(fis);
	   Sheet ws= wb.getSheet("Sheet1");
	  
	  
	  // Launch App
	  
	  WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get(ws.getCell(2, 1).getContents());
		driver.manage().window().maximize();
		
		// login App
		
		driver.findElement(By.id("txtUsername")).sendKeys
		                         (ws.getCell(0, 1).getContents());
		driver.findElement(By.id("txtPassword")).sendKeys
		                            (ws.getCell(1, 1).getContents());
		driver.findElement(By.id("btnLogin")).click();
	  
	  
  }
}



