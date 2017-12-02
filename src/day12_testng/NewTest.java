package day12_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class NewTest {
 
	
	
	@Test
  public void f() {
		System.out.println("c/a");
  }
	
	@Test
	  public void z() {
			System.out.println("Logout");
	  }
  
  @Test
  public void a()
  {
	  System.out.println("login");  
  }
  
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("launch");
  }
  
  @AfterMethod
  public void afterTest() {
	  System.out.println("close");
  }
  
  @BeforeClass
  public void beforec() {
	  System.out.println("First");
  }
  
  @AfterClass
  public void afterC() {
	  System.out.println("Last");
  }
  
}




