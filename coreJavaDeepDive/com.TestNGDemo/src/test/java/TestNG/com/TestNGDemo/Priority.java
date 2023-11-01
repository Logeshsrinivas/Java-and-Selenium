package TestNG.com.TestNGDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
  @Test
  public void a() {
	  
	  System.out.println("one");
  }
  @Ignore

  @Test(priority=0)
  public void b() {
	  System.out.println("two");

  }

  @Test
  public void c() {
	  System.out.println("three");

  }

}
