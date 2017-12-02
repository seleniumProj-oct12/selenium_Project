package day12_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest121 {
 
	@Test(priority=0)
  public void f() {
	  System.out.println("f method");
  }
  
  @Test(priority=2, enabled=false)
  public void a() {
	  System.out.println("c method");
  }
  
  @Test(priority=1)
  public void z() {
	  System.out.println("z method");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("First");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("LAST");
  }

}
