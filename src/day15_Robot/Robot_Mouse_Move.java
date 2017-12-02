package day15_Robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Robot_Mouse_Move {
  @Test
  public void f() throws AWTException {
	  
	  Robot obj=new Robot();
	  
	  Dimension src=Toolkit.getDefaultToolkit().getScreenSize();
	  System.out.println(src);
	  
	  Sleeper.sleepTightInSeconds(3);
	  
	  obj.mouseMove(15, 580);
	  
	  obj.mousePress(InputEvent.BUTTON1_MASK);
	  obj.mouseRelease(InputEvent.BUTTON1_MASK);
	  
	  
  }
}






