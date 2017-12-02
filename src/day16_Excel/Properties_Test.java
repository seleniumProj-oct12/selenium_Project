package day16_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Properties_Test {
  @Test
  public void f() throws IOException {
	  
	  FileInputStream fisP=new FileInputStream("E:\\workspace_oct12\\SeleniumProj_oct12\\prop.properties");
	  
	  Properties pr=new Properties();
	  pr.load(fisP);
	  
	  
	  // Excel File
	  
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
		
		driver.findElement(By.id(pr.getProperty("un"))).sendKeys
		                         (ws.getRow(1).getCell(0).getStringCellValue());
		
		driver.findElement(By.id(pr.getProperty("psd"))).sendKeys
		                            (ws.getRow(1).getCell(1).getStringCellValue());
		
		driver.findElement(By.id(pr.getProperty("logbtn"))).click();
 
  }
}
