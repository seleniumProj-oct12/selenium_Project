package day9_frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Frames_Paytm {
	
	WebDriver d;
	
	public void launch() throws Exception
	{
		d=new FirefoxDriver();
		d.get("http://paytm.com");
		d.manage().window().maximize();

		
		
	}
	
	public void frames_Handle(String un , String psd)
	{
		// login link
		d.findElement(By.xpath(".//*[@id='app']/div...../div")).click();
	
		// identify frames
	 List<WebElement>	frame=d.findElements(By.tagName("iframe"));
	 System.out.println(frame.size());
	 
	 Sleeper.sleepTightInSeconds(2);
	 
	 for (int i = 0; i < frame.size(); i++) 
	 {
		 // connect window to frame
		 d.switchTo().frame(i);
		 
		 try {

			 //username
			 d.findElement(By.id("input_0")).sendKeys(un);
			 
			 // password
			 d.findElement(By.id("input_1")).sendKeys(psd);
			 
			 // login btn
			 d.findElement(By.xpath(".//*[@id='login.....n[1]")).click();
			 
		}
		 catch (Exception e) 
		 {
			
			 System.out.println(e.getMessage());
		}
		 
	}
	 // frame to window
	 d.switchTo().defaultContent();
	 
	 // mobile number
	 d.findElement(By.xpath(".//*[@id='wallet-...l")).sendKeys("545454545");
	 
	}
	
	public static void main(String[] args) throws Exception {
		
		Frames_Paytm obj=new Frames_Paytm();
		
		obj.launch();
		obj.frames_Handle("9494949494", "ram@1234567");
		

	}

}
