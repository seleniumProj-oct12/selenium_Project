package day16_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_Login_POI {
  @Test
  public void f() throws IOException {
	  
	  String path="E:\\workspace_oct12\\SeleniumProj_oct12\\Excels\\testdata.xlsx";
		 
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet ws=wb.getSheet("Sheet1");
	   
	// Launch App
		  
		  WebDriver driver;
			
			driver=new FirefoxDriver();
			driver.get(ws.getRow(1).getCell(2).getStringCellValue());
			driver.manage().window().maximize();
			
			// login App
			
			driver.findElement(By.id("twsgwfsgwfse")).sendKeys
			                         (ws.getRow(1).getCell(0).getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys
			                            (ws.getRow(1).getCell(1).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
	  
	
			ws.getRow(1).createCell(3).setCellValue("Passsss");
			
			FileOutputStream fos=new FileOutputStream("E:\\workspace_oct12\\SeleniumProj_oct12\\Excels\\oooppp.xlsx");
			
			wb.write(fos);
			
			
			
			
  }
}
